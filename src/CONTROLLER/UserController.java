package CONTROLLER;

import BO.UserBO;
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
}
