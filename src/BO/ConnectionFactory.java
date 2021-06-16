package BO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Carlos
 */
public class ConnectionFactory {
    
    private String url = "jdbc:mysql://127.0.0.1:3306/dbstock";
    private String user = "root";
    private String password = "root";
    
    public Connection geConnection(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (Exception error) {
            throw new RuntimeException("Erro na connection factory: " + error.getMessage());
        }
    }
    
}