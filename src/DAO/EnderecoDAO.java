package DAO;

import MODEL.EnderecoModel;
import VIEW.ClientView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author Carlo
 */
public class EnderecoDAO {

    private Connection connection;
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;

    public EnderecoDAO() {
        connection = new ConnectionFactory().geConnection();
    }

    // ADICIONAR ENDEREÇO
    public boolean addEnd(EnderecoModel em) throws SQLException {
        String SQL = "INSERT INTO TBENDERECO(CEP, BAIRRO, RUA, UF, CIDADE, COMPLEMENTO) VALUES(?, ?, ?, ?, ?, ?)";
        long id = -1L;

        try {
            ps = connection.prepareStatement(SQL, ps.RETURN_GENERATED_KEYS);
            ps.setString(1, em.getCep());
            ps.setString(2, em.getBairro());
            ps.setString(3, em.getRua());
            ps.setString(4, em.getUf());
            ps.setString(5, em.getCidade());
            ps.setString(6, em.getComplemento());

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getLong(1);
                ClientView.txtIdEndereco.setText(""+id);
                System.out.println("ID: " + id);
            }
            
            System.out.println("Endereço Salvo Com Sucesso!!!");
            return true;
        } catch (SQLException error) {
            System.out.println("Erro ao inserir: " + error.getMessage());
            return false;
        } finally {
            connection.close();
        }
    }

    // EDITAR ENDEREÇO
    public boolean UpdateEnd(EnderecoModel em) throws SQLException {
        String SQL = "UPDATE TBENDERECO SET CEP=?, BAIRRO=?, RUA=?, UF=?, CIDADE=?, COMPLEMENTO=? WHERE ENDERECO_ID=?";
        try {
            ps = connection.prepareStatement(SQL);

            ps.setString(1, em.getCep());
            ps.setString(2, em.getBairro());
            ps.setString(3, em.getRua());
            ps.setString(4, em.getUf());
            ps.setString(5, em.getCidade());
            ps.setString(6, em.getComplemento());
            ps.setInt(7, Integer.parseInt(ClientView.txtIdEndereco.getText()));

            ps.executeUpdate();
            System.out.println("Endereço Alterado Com Sucesso!!!");
            return true;
        } catch (SQLException error) {
            System.out.println("Erro ao Alterar: " + error.getMessage());
            return false;
        } finally {
            connection.close();
        }
    }

    // DELETAR ENDEREÇO
    public boolean DeleteEnd(int idEnd) throws SQLException {
        String SQL = "DELETE FROM TBENDERECO WHERE ENDERECO_ID = ?";

        try {
            ps = connection.prepareStatement(SQL);
            ps.setInt(1, idEnd);
            ps.executeUpdate();
            System.out.println("Endereço Excluido Com Sucesso!!!");
            return true;
        } catch (SQLException error) {
            System.out.println("Erro ao Excluir: " + error.getMessage());
            return false;
        } finally {
            connection.close();
        }
    }

    // BUSCAR ENDEREÇO
    public EnderecoModel getEnd(String name) throws SQLException {
        String sql = "SELECT * FROM TBENDERECO WHERE LOGIN LIKE ?";
        EnderecoModel em = new EnderecoModel();
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, name + "%");
            rs = ps.executeQuery();

            if (rs.next()) {
                ClientView.txtIdEndereco.setText(rs.getString(1));
                em.setCep(rs.getString(2));
                em.setBairro(rs.getString(3));
                em.setRua(rs.getString(4));
                em.setUf(rs.getString(5));
                em.setCidade(rs.getString(6));
                em.setComplemento(rs.getString(7));

                JOptionPane.showMessageDialog(null, "Busca realizada com sucesso!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Usuário Não Encontrado....");
            }
        } catch (Exception error) {
            System.out.println("Erro ao getUser: " + error.getMessage());
        } finally {
            connection.close();
        }
        return em;
    }

}
