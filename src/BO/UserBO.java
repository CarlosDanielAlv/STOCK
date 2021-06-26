package BO;

import DAO.UsuarioDAO;
import MODEL.UserModel;
import java.sql.SQLException;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Carlo
 */
public class UserBO {
    
    // ADICIONAR NOVO USUÁRIO
    public boolean addUser(UserModel uM) throws SQLException {
        UsuarioDAO udao = new UsuarioDAO();
        
        return udao.addUser(uM);
    }
    
    // EDITAR USUÁRIO
    public boolean UpdateUser(UserModel uM) throws SQLException {
        UsuarioDAO udao = new UsuarioDAO();
        
        return udao.UpdateUser(uM);
    }
    
    // DELETAR USUÁRIO
    public boolean DeleteUser(int idUser) throws SQLException {
        UsuarioDAO udao = new UsuarioDAO();
        
        return udao.DeleteUser(idUser);
    }
    
    // EFETUAR LOGIN USUÁRIO
    public boolean logarUser(String txtNomeUsuario, String txtSenha) throws SQLException {
        UsuarioDAO udao = new UsuarioDAO();
        
        return udao.logarUser(txtNomeUsuario, txtSenha);
    }
    
    // STATUS CONEXÃO
    public void statusConect() {
        UsuarioDAO udao = new UsuarioDAO();
        
        udao.statusConect();
    }
    
    // BUSCAR USUÁRIO
    public UserModel getUser(String name) throws SQLException {
        UsuarioDAO udao = new UsuarioDAO();
        
        return udao.getUser(name);
    }
    
    // VERIFICAR SE USUÁRIO JÁ EXISTE NA BASE DE DADOS
    public boolean verUser(String name) {
        UsuarioDAO udao = new UsuarioDAO();
        
        return udao.verUser(name);
    }

}
