package BO;

import DAO.EnderecoDAO;
import MODEL.EnderecoModel;
import java.sql.SQLException;

/**
 *
 * @author Carlo
 */
public class EnderecoBO {
    
     // ADICIONAR ENDEREÇO
    public boolean addEnd(EnderecoModel em) throws SQLException {
        EnderecoDAO edao = new EnderecoDAO();
        
        return edao.addEnd(em);
    }
    
    //  EDITAR
    public boolean UpdateEnd(EnderecoModel em) throws SQLException {
        EnderecoDAO edao = new EnderecoDAO();
        
        return edao.UpdateEnd(em);
    }
    
    // DELETAR ENDEREÇO
    public boolean DeleteEnd(int idEnd) throws SQLException {
        EnderecoDAO edao = new EnderecoDAO();
        
        return edao.DeleteEnd(idEnd);
    }
    
}
