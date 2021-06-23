package BO;

import DAO.ClientDAO;
import MODEL.ClientModel;
import java.sql.SQLException;

/**
 * @author Carlos Daniel
 */
public class ClientBO {

    // ADICIONAR CLIENTE
    public boolean addCli(ClientModel cm) throws SQLException {
        ClientDAO cdao = new ClientDAO();
        
        return cdao.addCli(cm);
    }
    
    // BUSCAR CLIENTE
    public ClientModel getCli(String name) throws SQLException {
        ClientDAO cdao = new ClientDAO();
        return cdao.getCli(name);
    }
    
    // ALTERAR CLIENTE
    public boolean UpdateCli(ClientModel cm) throws SQLException {
        ClientDAO cdao = new ClientDAO();
        
        return cdao.UpdateCli(cm);
    }
    
    // DELETAR USUÁRIO
    public boolean DeleteCli(int idCli) throws SQLException {
        ClientDAO cdao = new ClientDAO();
        
        return cdao.DeleteCli(idCli);
    }
    
    
}
