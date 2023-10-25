package controller;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author Programador Evanei Freitas.
 */
public class Controller_Cliente {

    /**
     * **********************************************************************
     * Método para Gravar(Salvar) O Cliente no Banco de Dados.
     * **********************************************************************
     */
    public boolean SalvarCliente(Cliente objeto) {
        boolean resposta = false;
        Connection cn = Conexao.conectar();
        try {
            PreparedStatement pst = cn.prepareStatement("Insert Into tb_cliente Values(?,?,?,?,?,?,?,?)");
            pst.setInt(1, 0);//id(Auto_Incremmento pela BD)
            pst.setString(2, objeto.getNome());
            pst.setString(3, objeto.getApelido());
            pst.setString(4, objeto.getCpf());
            pst.setString(5, objeto.getTelefone());
            pst.setString(6, objeto.getCelular());
            pst.setString(7, objeto.getEndereco());
            pst.setInt(8, objeto.getEstado());

            if (pst.executeUpdate() > 0) {
                resposta = true;
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar Salvar o Cliente no Banco de Dados!" + e);
        }
        return resposta;
    }

    /**
     * *
     * ***********************************************************************
     * Metodo para Verificar se Existe o Cliente Salvo no Banco de Dados.
     * ***********************************************************************
     */
    public boolean existeCliente(String cpf) {
        boolean resposta = false;
        String sql = "Select cpf from tb_cliente Where cpf = '" + cpf + "'";
        Statement stm;
        try {
            Connection cn = Conexao.conectar();
            stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                resposta = true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar se o Cliente"
                    + "já se encontra cadastrado no Banco de Dados!" + e);
        }
        return resposta;
    }

    /**
     * *
     * **********************************************************************
     * Método para Atualizar Cliente no Banco de Dados.
     * **********************************************************************
     */
    public boolean atualizarCliente(Cliente objeto, int idCliente) {
        boolean resposta = false;
        Connection cn = Conexao.conectar();
        try {
            PreparedStatement pst = cn.prepareStatement("Update tb_cliente set nome = ?, apelido = ?, "
                    + "cpf = ?, telefone = ?,celular = ?,endereco = ? ,estado = ? Where idCliente='" + idCliente + "'");
            pst.setString(1, objeto.getNome());
            pst.setString(2, objeto.getApelido());
            pst.setString(3, objeto.getCpf());
            pst.setString(4, objeto.getTelefone());
            pst.setString(5, objeto.getCelular());
            pst.setString(6, objeto.getEndereco());
            pst.setInt(7, objeto.getEstado());

            if (pst.executeUpdate() > 0) {
                resposta = true;
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar Atualizar Clientes no Banco de Dados!" + e);
        }
        return resposta;
    }

    /**
     * *
     * **********************************************************************
     * Método para Excluir Cliente.
     * **********************************************************************
     */
    public boolean excluirCliente(int idCliente) {
        boolean resposta = false;
        Connection cn = Conexao.conectar();
        try {
            PreparedStatement pst = cn.prepareStatement(
                    "delete From tb_cliente Where idCliente='" + idCliente + "'");
            pst.executeUpdate();
            if (pst.executeUpdate() > 0) {
                resposta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao tentar Excluir Cliente no Banco de Dados!" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao tentar Excluir Cliente no Banco de Dados!" + e.getMessage());
        }
        return resposta;
    }

}
