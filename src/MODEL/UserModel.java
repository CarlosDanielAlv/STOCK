package MODEL;

import DAO.UsuarioDAO;
import VIEW.UserView;

/**
 * @author Carlos
 */
public class UserModel {
    private int idUser;
    private String nome;
    private String perfil;
    private String login;
    private String senha;

    // Edit
    public UserModel(int idUser, String nome, String perfil, String login, String senha) {
        this.idUser = idUser;
        this.nome = nome;
        this.perfil = perfil;
        this.login = login;
        this.senha = senha;
    }
    
    //ADD
    public UserModel(String nome, String perfil, String login, String senha) {
        this.nome = nome;
        this.perfil = perfil;
        this.login = login;
        this.senha = senha;
    }

    // Construtor;
    public UserModel() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    
    
    
}
