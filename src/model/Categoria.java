package model;

/**
 *
 * @author Programador Evanei Freitas.
 */
public class Categoria {

    //Atributos
    private int idCategoria;
    private String descricao;
    private int estado;

    //Construtor da Classe e Inicializo as variaveis.
    public Categoria() {
        this.idCategoria = 0;
        this.descricao = "";
        this.estado = 0;
    }

    //Construtor da Classe SobreCarregado
    public Categoria(int idCategoria, String descricao, int estado) {
        this.idCategoria = idCategoria;
        this.descricao = descricao;
        this.estado = estado;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
