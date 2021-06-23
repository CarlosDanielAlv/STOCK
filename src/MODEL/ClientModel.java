package MODEL;

/**
 * @author Carlo
 */
public class ClientModel {
    
    private int cliente_id;
    private String nomeCli;
    private String telCli;
    private String emailCli;
    private EnderecoModel endereco;

    public ClientModel() {
        
    }
    
    // ADD
    public ClientModel(String nomeCli, String telCli, String emailCli) {
        this.nomeCli = nomeCli;
        this.telCli = telCli;
        this.emailCli = emailCli;
        this.endereco = endereco;
    }

    // UPDATE
    public ClientModel(int cliente_id, String nomeCli, String telCli, String emailCli) {
        this.cliente_id = cliente_id;
        this.nomeCli = nomeCli;
        this.telCli = telCli;
        this.emailCli = emailCli;
        this.endereco = endereco;
    }
    
    //GET AND SET

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getTelCli() {
        return telCli;
    }

    public void setTelCli(String telCli) {
        this.telCli = telCli;
    }

    public String getEmailCli() {
        return emailCli;
    }

    public void setEmailCli(String emailCli) {
        this.emailCli = emailCli;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }
    
    
    
    
}
