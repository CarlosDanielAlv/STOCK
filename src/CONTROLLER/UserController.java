package CONTROLLER;

import BO.UserBO;
import MODEL.UserModel;
import VIEW.Login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Carlos
 */
public class UserController {

    UserBO ubo = new UserBO();
    UserModel um;

    // FUNÇÃO PARA REALIZAR LOGIN
    public boolean logarUser(String txtNomeUsuario, String txtSenha) throws SQLException {
        UserBO ubo = new UserBO();

        try { // Fazer login

            if (ubo.logarUser(txtNomeUsuario, txtSenha)) {
                return true; // Retorno verdadeiro.
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao efetuar o login: " + ex.getMessage());
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    // ADICIONAR NOVO USUÁRIO / EDITAR
    public boolean manterUsuario(int idUser, String nome, String perfil, String login, String senha) throws SQLException {

        try {
            // Adicionar novo usuário
            if (idUser == 0) {
                ubo.addUser(new UserModel(nome, perfil, login, senha));
                return true;
            } else {
                // Editar usuário.
                ubo.UpdateUser(new UserModel(idUser, nome, perfil, login, senha));
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na inserção de dados: " + e.getMessage());
            return false;
        }
    }

    // BUSCAR USUÁRIO
    public UserModel getUser(String nomeUser) throws SQLException {
        try {
            return ubo.getUser(nomeUser);
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar user> " + e.getMessage());
        }
        return ubo.getUser(nomeUser);
    }

    // DELETAR USER
    public boolean DeleteUser(int idUser) {

        try {
            // Excluindo usuário
            ubo.DeleteUser(idUser);
            return true;
        } catch (Exception e) {
            System.out.println("ERRO ao excluir: " + e.getMessage());
            return false;
        }
    }

}
