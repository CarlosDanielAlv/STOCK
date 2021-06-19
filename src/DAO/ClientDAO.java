package DAO;

import MODEL.ClientModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Carlo
 */
public class ClientDAO {
    
    private Connection connection;
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;
    
    public ClientDAO(){
        connection = new ConnectionFactory().geConnection();
    }
       
    
}
