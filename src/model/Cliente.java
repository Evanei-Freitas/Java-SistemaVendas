package model;

/**
 *
 * @author Programador Evanei Freitas.
 */
public class Cliente {

    /**
     * *
     ******************************************************************
     * Atributos da Classe.
     * *****************************************************************
     */
    private int idCliente;
    private String nome;
    private String apelido;
    private String cpf;
    private String telefone;
    private String celular;
    private String endereco;
    private int estado;

    /**
     * *
     ******************************************************************
     * Construtor da Classe - Vazio e Inicializado.
     * *****************************************************************
     */
    public Cliente() {
        this.idCliente = 0;
        this.nome = "";
        this.apelido = "";
        this.cpf = "";
        this.telefone = "";
        this.celular = "";
        this.endereco = "";
        this.estado = 0;
    }

    /**
     * *
     ******************************************************************
     * Construtor da Classe Sobrecarregado.
     * *****************************************************************
     */
    public Cliente(int idCliente, String nome, String apelido, String cpf, String telefone, String celular, String endereco, int estado) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.apelido = apelido;
        this.cpf = cpf;
        this.telefone = telefone;
        this.celular = celular;
        this.endereco = endereco;
        this.estado = estado;
    }

    /**
     * *
     ******************************************************************
     * Emcapsulamento com Gets e Sets.
     * *****************************************************************
     */
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
