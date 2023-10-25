package controller;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Categoria;

/**
 *
 * @author Programador Evanei Freitas.
 */
public class Controller_Categoria {

    /**
     * *
     * **********************************************************************
     * Método para Gravar(Salvar) no Banco de Dados as Categorias.
     * **********************************************************************
     */
    public boolean guardar(Categoria objeto) {
        boolean resposta = false;
        Connection cn = Conexao.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("Insert Into tb_categoria Values(?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescricao());
            consulta.setInt(3, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                resposta = true;
            }

            cn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar Salvar Categoria no Banco de Dados!" + e);
        }

        return resposta;

    }

    /**
     * *
     * ***********************************************************************
     * Metodo para Verificar se o Registro a ser Gravado, Já Existe no Banco de
     * Dados.
     * ***********************************************************************
     */
    public boolean existeCategoria(String categoria) {
        boolean resposta = false;
        String sql = "Select descricao from tb_categoria Where descricao = '" + categoria + "'";
        Statement st;

        try {

            Connection cn = Conexao.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                resposta = true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar Categoria" + e);
        }

        return resposta;

    }

    /**
     * *
     * **********************************************************************
     * Método para Atualizar dados no Banco de Dados as Categorias.
     * **********************************************************************
     */
    public boolean atualizarDados(Categoria objeto, int idCategoria) {
        boolean resposta = false;
        Connection cn = Conexao.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("Update tb_categoria Set descricao = ? Where idCategoria='" + idCategoria + "'");
            consulta.setString(1, objeto.getDescricao());

            if (consulta.executeUpdate() > 0) {
                resposta = true;
            }

            cn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar Atualizar Categoria no Banco de Dados!" + e);
        }

        return resposta;

    }

    /**
     * *
     * **********************************************************************
     * Método para Excluir dados no Banco de Dados as Categorias.
     * **********************************************************************
     */
    public boolean excluirDados(int idCategoria) {
        boolean resposta = false;
        Connection cn = Conexao.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("delete From tb_categoria Where idCategoria='" + idCategoria + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                resposta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Erro ao tentar Excluir Categoria no Banco de Dados!" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao tentar Excluir Categoria no Banco de Dados!" + e.getMessage());
        }

        return resposta;

    }

}
