package model;

/**
 *
 * @author Programador Evanei Freitas.
 */
public class Usuario {

    //Atributos
    private int idUsuario;
    private String nome;
    private String cpf;
    private String apelido;
    private String usuario;
    private String password;
    private String telefone;
    private int estado;

    //Construtor da Classe
    public Usuario() {
        this.idUsuario = 0;
        this.nome = "";
        this.cpf = "";
        this.apelido = "";
        this.usuario = "";
        this.password = "";
        this.telefone = "";
        this.estado = 0;
    }

    public Usuario(int idUsuario, String nome, String cpf, String apelido, String usuario, String password, String telefone, int estado) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.apelido = apelido;
        this.usuario = usuario;
        this.password = password;
        this.telefone = telefone;
        this.estado = estado;
    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
