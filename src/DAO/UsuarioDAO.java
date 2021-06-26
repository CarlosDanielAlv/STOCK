package DAO;

import MODEL.UserModel;
import VIEW.TelaPrincipal;
import VIEW.UserView;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author Carlos
 */
public class UsuarioDAO {

    private Connection connection;
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;

    public UsuarioDAO() {
        connection = new ConnectionFactory().geConnection();
    }

    public void statusConect() {
        if (connection.equals(null)) {
            System.out.println("OFF");
        } else {
            System.out.println("ON");
        }
    }

    // ADICIONAR NOVO USUÁRIO
    public boolean addUser(UserModel uM) throws SQLException {
        String SQL = "INSERT INTO TBUSUARIO(NOME, PERFIL, LOGIN, SENHA) VALUES(?, ?, ?, ?)";

        try {
            ps = connection.prepareStatement(SQL);
            ps.setString(1, uM.getNome());
            ps.setString(2, uM.getPerfil());
            ps.setString(3, uM.getLogin());
            ps.setString(4, uM.getSenha());

            ps.execute();
            System.out.println("Cadastrado Com Sucesso!!!");
            return true;
        } catch (SQLException error) {
            System.out.println("Erro ao inserir: " + error.getMessage());
            return false;
        } finally {
            connection.close();
        }
    }

    // EDITAR USUÁRIO
    public boolean UpdateUser(UserModel uM) throws SQLException {
        String SQL = "UPDATE TBUSUARIO SET NOME=?, PERFIL=?, LOGIN=?, SENHA=? WHERE USUARIO_ID=?";
        try {
            ps = connection.prepareStatement(SQL);

            ps.setString(1, uM.getNome());
            ps.setString(2, uM.getPerfil());
            ps.setString(3, uM.getLogin());
            ps.setString(4, uM.getSenha());
            ps.setInt(5, Integer.parseInt(UserView.txtIdUser.getText()));

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
    public boolean DeleteUser(int idUser) throws SQLException {
        String SQL = "DELETE FROM TBUSUARIO WHERE USUARIO_ID = ?";

        try {
            ps = connection.prepareStatement(SQL);
            ps.setInt(1, idUser);
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

    //  FAZER LOGIN
    public boolean logarUser(String name, String password) throws SQLException {
        String sql = "SELECT * FROM TBUSUARIO WHERE LOGIN = ? AND SENHA = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, password);
            rs = ps.executeQuery();

            if (rs.next()) {
                TelaPrincipal principal = new TelaPrincipal();
                // A linha abaixo obtem o conteudo do campo perfil da tabela tbusuario
                String perfil = rs.getString(3); // Pega os dados na tabela na posição 3

                // A estrutra a baixo faz o tratamento do perfil do usuário.
                if (perfil.equals("Admin")) {
                    Color azulPadrao = new Color(23, 222, 253); // Azul padrão
                    TelaPrincipal.menCadUser.setEnabled(true);
                    TelaPrincipal.menuRelatorio.setEnabled(true);
                    TelaPrincipal.lbl_user.setForeground(azulPadrao);
                }
                // A linha abaixo chama a tela principal
                TelaPrincipal.idUser.setText(rs.getString(1));
                TelaPrincipal.lbl_user.setText(rs.getString(2));
                principal.setVisible(true);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido(s)");
                return false;
            }
        } catch (Exception error) {
            System.out.println("Erro ao logar: " + error.getMessage());
            return false;
        } finally {
            connection.close();
        }
    }

    // BUSCAR USUÁRIO
    public UserModel getUser(String name) throws SQLException {
        String sql = "SELECT * FROM TBUSUARIO WHERE LOGIN LIKE ?";
        UserModel uM = new UserModel();
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, name + "%");
            rs = ps.executeQuery();

            if (rs.next()) {
                UserView.txtIdUser.setText(rs.getString(1)); // ID
                uM.setNome(rs.getString(2)); // NOME
                uM.setPerfil(rs.getString(3)); // PERFIL
                uM.setLogin(rs.getString(4)); // LOGIN
                uM.setSenha(rs.getString(5)); // SENHA
            } else {
                JOptionPane.showMessageDialog(null, "Usuário Não Encontrado....");
            }
        } catch (Exception error) {
            System.out.println("Erro ao getUser: " + error.getMessage());
        } finally {
            connection.close();
        }
        return uM;
    }

    // VERIFICAR SE USUÁRIO JÁ EXISTE NA BASE DE DADOS
    public boolean verUser(String name) {
        String sql = "SELECT * FROM TBUSUARIO WHERE LOGIN LIKE ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, name + "%");
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Houve um erro na validação do cliente: " + e.getMessage());
            return false;
        }
    }
}
