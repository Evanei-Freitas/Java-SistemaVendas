package model;

/**
 *
 * @author Programador Evanei Freitas.
 */
public class Produto {

    //Declarando os Atributos da Classe.
    private int idProduto;
    private String nome;
    private int quantidade;
    private double preco;
    private String descricao;
    private int porcentagemIva;
    private int idCategoria;
    private int estado;

    //Construtor da Classe e Inicializo as variaveis.
    public Produto() {
        this.idCategoria = 0;
        this.nome = "";
        this.quantidade = 0;
        this.preco = 0.0;
        this.descricao = "";
        this.porcentagemIva = 0;
        this.idCategoria = 0;
        this.estado = 0;

    }

    //Construtor da Classe SobreCarregado
    public Produto(int idProduto, String nome, int quantidade, double preco, String descricao, int porcentagemIva, int idCategoria, int estado) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.descricao = descricao;
        this.porcentagemIva = porcentagemIva;
        this.idCategoria = idCategoria;
        this.estado = estado;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPorcentagemIva() {
        return porcentagemIva;
    }

    public void setPorcentagemIva(int porcentagemIva) {
        this.porcentagemIva = porcentagemIva;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
