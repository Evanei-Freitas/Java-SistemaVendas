package model;

/**
 *
 * @author Programador Evanei Freitas.
 */
public class Model_Usuario {

    //Atributos
    private int idUsuario;
    private String nome;
    private String apelido;
    private String usuario;
    private String password;
    private String telefone;
    private int estado;

    //Construtor da Classe
    public Model_Usuario() {
        this.idUsuario = 0;
        this.nome = "";
        this.apelido = "";
        this.usuario = "";
        this.password = "";
        this.telefone = "";
        this.estado = 0;
    }

    //Sets e Geters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
