package MODEL;

/**
 * @author Carlo
 */
public class EnderecoModel {
    
    private int endereco_id;
    private String cep;
    private String bairro;
    private String rua;
    private String uf;
    private String cidade;
    private String complemento;

    public EnderecoModel() {
    }
    
    //ADD
    public EnderecoModel(String cep, String bairro, String rua, String uf, String cidade, String complemento) {
        this.cep = cep;
        this.bairro = bairro;
        this.rua = rua;
        this.uf = uf;
        this.cidade = cidade;
        this.complemento = complemento;
    }

    // EDITAR
    public EnderecoModel(int endereco_id, String cep, String bairro, String rua, String uf, String cidade, String complemento) {
        this.endereco_id = endereco_id;
        this.cep = cep;
        this.bairro = bairro;
        this.rua = rua;
        this.uf = uf;
        this.cidade = cidade;
        this.complemento = complemento;
    }
    
    // GET AND SET >>

    public int getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(int endereco_id) {
        this.endereco_id = endereco_id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
    
    
}
