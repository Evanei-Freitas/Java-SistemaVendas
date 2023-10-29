package controller;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author Programador Evanei Freitas.
 */
public class Controller_Produto {

    /**
     * **********************************************************************
     * Método para Gravar(Salvar) O Produto no Banco de Dados.
     * **********************************************************************
     */
    public boolean SalvarProduto(Produto objeto) {
        boolean resposta = false;
        Connection cn = Conexao.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("Insert Into tb_produto Values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id(Auto_Incremmento pela BD)
            consulta.setString(2, objeto.getNome());
            consulta.setInt(3, objeto.getQuantidade());
            consulta.setDouble(4, objeto.getPreco());
            consulta.setString(5, objeto.getDescricao());
            consulta.setInt(6, objeto.getPorcentagemIva());
            consulta.setInt(7, objeto.getIdCategoria());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                resposta = true;
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar Salvar o Produto no Banco de Dados!" + e);
        }

        return resposta;

    }

    /**
     * *
     * ***********************************************************************
     * Metodo para Verificar se Existe o Produto Salvo no Banco de Dados.
     * ***********************************************************************
     */
    public boolean existeProduto(String produto) {
        boolean resposta = false;
        String sql = "Select nome from tb_produto Where nome = '" + produto + "'";
        Statement stm;

        try {

            Connection cn = Conexao.conectar();
            stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                resposta = true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar se o produto"
                    + "já se encontra cadastrado no Banco de Dados!" + e);
        }

        return resposta;

    }

    /**
     * *
     * **********************************************************************
     * Método para Atualizar Produtos no Banco de Dados.
     * **********************************************************************
     */
    public boolean atualizarProduto(Produto objeto, int idProduto) {
        boolean resposta = false;
        Connection cn = Conexao.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("Update tb_produto set nome = ?, quantidade = ?, preco = ?, descricao = ?, porcentagemIva = ?, idCategoria = ?,estado = ? Where idProduto='" + idProduto + "'");
            consulta.setString(1, objeto.getNome());
            consulta.setInt(2, objeto.getQuantidade());
            consulta.setDouble(3, objeto.getPreco());
            consulta.setString(4, objeto.getDescricao());
            consulta.setInt(5, objeto.getPorcentagemIva());
            consulta.setInt(6, objeto.getIdCategoria());
            consulta.setInt(7, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                resposta = true;
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar Atualizar Produto no Banco de Dados!" + e);
        }
        return resposta;
    }

    /**
     * *
     * **********************************************************************
     * Método para Excluir Produto.
     * **********************************************************************
     */
    public boolean excluirProduto(int idProduto) {
        boolean resposta = false;
        Connection cn = Conexao.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete From tb_produto Where idProduto='" + idProduto + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                resposta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Erro ao tentar Excluir Produto no Banco de Dados!" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao tentar Excluir Produto no Banco de Dados!" + e.getMessage());
        }

        return resposta;

    }

    /**
     * *
     * **********************************************************************
     * Método para Atualizar Estoque de Produtos.
     * **********************************************************************
     */
    public boolean almentarEstoqueProduto(Produto objeto, int idProduto) {
        boolean resposta = false;
        Connection cn = Conexao.conectar();
        try {
            PreparedStatement pst = cn.prepareStatement("Update tb_produto Set quantidade = ?"
                    + " Where idProduto='" + idProduto + "'");
            pst.setInt(1, objeto.getQuantidade());

            if (pst.executeUpdate() > 0) {
                resposta = true;
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar Atualizar a quantidade de Produto "
                    + "no Banco de Dados!" + e.getMessage());
        }

        return resposta;

    }
    
    
    
        /**
     * *
     * **********************************************************************
     * Método para Atualizar Estoque de Produtos.
     * **********************************************************************
     */
    public boolean diminuirEstoqueProduto(Produto objeto, int idProduto) {
        boolean resposta = false;
        Connection cn = Conexao.conectar();
        try {
            PreparedStatement pst = cn.prepareStatement("Update tb_produto Set quantidade = ?"
                    + " Where idProduto='" + idProduto + "'");
            pst.setInt(1, objeto.getQuantidade());

            if (pst.executeUpdate() > 0) {
                resposta = true;
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar Atualizar a quantidade de Produto "
                    + "no Banco de Dados!" + e.getMessage());
        }

        return resposta;

    }
    
    

}
