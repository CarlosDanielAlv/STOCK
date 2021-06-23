package CONTROLLER;

import BO.EnderecoBO;
import DAO.EnderecoDAO;
import MODEL.EnderecoModel;
import br.com.parg.viacep.ViaCEP;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Carlos
 */
public class EnderecoController {

    EnderecoBO ebo = new EnderecoBO();

    // Método para preencher endereço via CEP
    public EnderecoModel retornaCep(String cep, String comp) {
        ViaCEP viaCep = new ViaCEP();
        EnderecoModel em = new EnderecoModel();

        try {
            viaCep.buscar(cep);
            em.setBairro(viaCep.getBairro());
            em.setRua(viaCep.getLogradouro());
            em.setUf(viaCep.getUf());
            em.setCidade(viaCep.getLocalidade());
            em.setComplemento(comp);
        } catch (Exception e) {
            System.out.println("Erro ao buscar CEP: " + e.getMessage());
        }
        return em;
    }

    // MÉTODO PARA SALVAR ENDEREÇO
    public boolean addEnd(int idEnd, String cep, String bairro, String rua, String uf, String cidade, String complemento) throws SQLException {
        EnderecoModel em;

        try {
            // Adicionar novo usuário
            if (idEnd == 0) {
                ebo.addEnd(new EnderecoModel(cep, bairro, rua, uf, cidade, complemento));
                return true;
            } else {
                // Editar usuário.
                ebo.UpdateEnd(new EnderecoModel(cep, bairro, rua, uf, cidade, complemento));
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao manter o Endereço: " + e.getMessage());
            return false;
        }
    }
    
    // DELETAR ENDEREÇO
    public boolean DeleteEnd(int idEnd) throws SQLException {
        
        try {
            ebo.DeleteEnd(idEnd);
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao excluir o endereço");
            return false;
        }
    }

}
