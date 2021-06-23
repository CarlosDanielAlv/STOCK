package DAO;

import MODEL.ClientModel;
import MODEL.EnderecoModel;
import MODEL.UserModel;
import VIEW.ClientView;
import VIEW.UserView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Carlo
 */
public class ClientDAO {

    private Connection connection;
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;

    public ClientDAO() {
        connection = new ConnectionFactory().geConnection();
    }

    // ADICIONAR CLIENTE
    public boolean addCli(ClientModel cm) throws SQLException {
        String SQL = "INSERT INTO TBCLIENTE(NOMECLI, TELCLI, EMAILCLI, ENDERECO_ID) VALUES(?, ?, ?, ?)";

        try {
            ps = connection.prepareStatement(SQL);
            ps.setString(1, cm.getNomeCli());
            ps.setString(2, cm.getTelCli());
            ps.setString(3, cm.getEmailCli());
            ps.setInt(4, Integer.parseInt(ClientView.txtIdEndereco.getText()));

            ps.execute();
            System.out.println("Cliente Cadastrado Com Sucesso!!!");
            return true;
        } catch (SQLException error) {
            System.out.println("Erro ao Cadastradar: " + error.getMessage());
            return false;
        } finally {
            connection.close();
        }
    }

    // EDITAR USUÁRIO
    public boolean UpdateCli(ClientModel cm) throws SQLException {
        String SQL = "UPDATE TBCLIENTE SET NOMECLI=?, TELCLI=?, EMAILCLI=? WHERE CLIENTE_ID=?";
        try {
            ps = connection.prepareStatement(SQL);

            ps.setString(1, cm.getNomeCli());
            ps.setString(2, cm.getTelCli());
            ps.setString(3, cm.getEmailCli());
            ps.setInt(4, Integer.parseInt(ClientView.txtIdCli.getText()));

            ps.executeUpdate();
            System.out.println("Alterado Com Sucesso!!!");
            return true;
        } catch (SQLException error) {
            System.out.println("Erro ao Alterar: " + error.getMessage());
            return false;
        } finally {
            connection.close();
        }
    }

    // DELETAR USUÁRIO
    public boolean DeleteCli(int idCli) throws SQLException {
        String SQL = "DELETE FROM TBCLIENTE WHERE CLIENTE_ID = ?";

        try {
            ps = connection.prepareStatement(SQL);
            ps.setInt(1, idCli);
            ps.executeUpdate();
            System.out.println("Excluido Com Sucesso!!!");
            return true;
        } catch (SQLException error) {
            System.out.println("Erro ao Excluir: " + error.getMessage());
            return false;
        } finally {
            connection.close();
        }
    }

    // BUSCAR USUÁRIO
    public ClientModel getCli(String name) throws SQLException {
        String sql = "SELECT "
                + "C.CLIENTE_ID, NOMECLI, TELCLI, EMAILCLI, "
                + "E.ENDERECO_ID, CEP, BAIRRO, RUA, UF, CIDADE, COMPLEMENTO "
                + "FROM TBCLIENTE AS C "
                + "INNER JOIN TBENDERECO AS E "
                + "ON (C.endereco_id = E.endereco_id) "
                + "WHERE TELCLI LIKE ?";

        ClientModel cm = new ClientModel();
        EnderecoModel em = new EnderecoModel();
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, name + "%");
            rs = ps.executeQuery();

            if (rs.next()) {
                ClientView.txtIdCli.setText(rs.getString(1));       // ID
                cm.setNomeCli(rs.getString(2));                     // NOMECLI
                cm.setTelCli(rs.getString(3));                      // TELCLI
                cm.setEmailCli(rs.getString(4));                    // EMAILCLI
                ClientView.txtIdEndereco.setText(rs.getString(5));  // ID ENDERECO
                em.setCep(rs.getString(6));                         // CEP
                em.setBairro(rs.getString(7));                      // BAIRRO
                em.setRua(rs.getString(8));                         // RUA
                em.setUf(rs.getString(9));                          // UF
                em.setCidade(rs.getString(10));                     // CIDADE
                em.setComplemento(rs.getString(11));                // COMPLEMENTO
                cm.setEndereco(em);                                 // ENDEREÇO.
                JOptionPane.showMessageDialog(null, "Busca realizada com sucesso!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Usuário Não Encontrado....");
            }

        } catch (Exception error) {
            System.out.println("Erro ao getUser: " + error.getMessage());
        }
        return cm;
    }
    // BUSCAR USUÁRIO E PREENCHER DADOS NA LISTA
    /*
    public void getCli(String name) throws SQLException {
        String sql = "SELECT "
                + "C.CLIENTE_ID, NOMECLI, TELCLI, EMAILCLI, "
                + "E.ENDERECO_ID, CEP, BAIRRO, RUA, UF, CIDADE, COMPLEMENTO "
                + "FROM TBCLIENTE AS C "
                + "INNER JOIN TBENDERECO AS E "
                + "ON (C.endereco_id = E.endereco_id) "
                + "WHERE NOMECLI LIKE ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, name + "%");
            rs = ps.executeQuery();

            ClientView.tbCli.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception error) {
            System.out.println("Erro ao buscar o cliente: " + error.getMessage());
        }
    }
     */
}
