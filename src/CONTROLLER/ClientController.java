package CONTROLLER;

import BO.ClientBO;
import MODEL.ClientModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlo
 */
public class ClientController {

    // VERIFICAR SE CLIENTE JÁ EXISTE NA BASE DE DADOS
    public boolean verCli(String name) {
        ClientBO cbo = new ClientBO();

        if (cbo.verCli(name)) {
            System.out.println("Cliente já existe");
            return true;
        }else{
            return false;
        }
    }

    // ADICIONAR CLIENTE
    public boolean addCli(int cliente_id, String nomeCli, String telCli, String emailCli) throws SQLException {
        ClientBO cbo = new ClientBO();

        try {
            // Adicionar novo usuário
            if (cliente_id == 0) {
                cbo.addCli(new ClientModel(nomeCli, telCli, emailCli));
                return true;
            } else {
                // Editar usuário.
                cbo.UpdateCli(new ClientModel(cliente_id, nomeCli, telCli, emailCli));
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao manter o cliente: " + e.getMessage());
            return false;
        }
    }

    // BUSCAR CLIENTE
    public ClientModel getCli(String name) throws SQLException {
        ClientBO cbo = new ClientBO();
        return cbo.getCli(name);
    }

    // DELETAR USUÁRIO
    public boolean DeleteCli(int idCli) throws SQLException {
        ClientBO cbo = new ClientBO();

        try {
            cbo.DeleteCli(idCli);
            return true;
        } catch (Exception e) {
            System.out.println("ERRO ao excluir: " + e.getMessage());
            return false;
        }
    }

}
