package DAO;

import MODEL.ClientModel;
import MODEL.UserModel;
import VIEW.Login;
import VIEW.TelaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
            ps.setString(4, uM.getLogin());
            ps.setString(5, uM.getSenha());

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
        String SQL = "UPDATE TBUSUARIO SET NOME=?, PERFIL=?, LOGIN=?, SENHA=?, WHERE USUARIO_ID=?";

        try {
            ps = connection.prepareStatement(SQL);
            ps.setString(1, uM.getNome());
            ps.setString(2, uM.getPerfil());
            ps.setString(4, uM.getLogin());
            ps.setString(5, uM.getSenha());

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

    // EFETUAR LOGIN USUÁRIO
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
                String perfil = rs.getString(3); // Pega os dados na tabela na posição 6

                // A estrutra a baixo faz o tratamento do perfil do usuário.
                if (perfil.equals("Admin")) {
                    //principal.btnNovoUser.setEnabled(true);
                    //principal.lblUsuario.setForeground(Color.red);
                }
                // A linha abaixo chama a tela principal
                //principal.lblIdUser.setText(rs.getString(1));
                //principal.lblUsuario.setText(rs.getString(2));
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
}
