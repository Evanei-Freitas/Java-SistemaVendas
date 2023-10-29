package controller;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Usuario;

/**
 *
 * @author Programador Evanei Freitas.
 */
public class Controller_Usuario {

    /**
     * **********************************************************************
     * Método para Gravar(Salvar) Usuario no Banco de Dados.
     * **********************************************************************
     */
    public boolean SalvarUsuario(Usuario objeto) {
        boolean resposta = false;
        Connection cn = Conexao.conectar();
        try {
            PreparedStatement pst = cn.prepareStatement("Insert Into tb_usuario Values(?,?,?,?,?,?,?,?)");
            pst.setInt(1, 0);//id(Auto_Incremmento pela BD)
            pst.setString(2, objeto.getNome());
            pst.setString(3, objeto.getCpf());
            pst.setString(4, objeto.getApelido());
            pst.setString(5, objeto.getUsuario());
            pst.setString(6, objeto.getPassword());
            pst.setString(7, objeto.getTelefone());
            pst.setInt(8, objeto.getEstado());

            if (pst.executeUpdate() > 0) {
                resposta = true;
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar Salvar o Usuario no sistema!" + e);
        }
        return resposta;
    }

    /**
     * *
     * ***********************************************************************
     * Metodo para Verificar se Existe o Usuário Salvo no Banco de Dados.
     * ***********************************************************************
     */
    public boolean existeUsuario(String cpf) {
        boolean resposta = false;
        String sql = "Select cpf from tb_usuario Where cpf = '" + cpf + "'";
        Statement stm;
        try {
            Connection cn = Conexao.conectar();
            stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                resposta = true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cpf já cadastrado no sistema!");
        }
        return resposta;
    }

    /**
     * *
     ***************************************************************************
     * Método para Login inicializar a sessão.
     * *************************************************************************
     */
    public boolean loginUser(Usuario objeto) {
        boolean resposta = false;
        Connection cn = Conexao.conectar();
        String sql = "select usuario, password from tb_usuario where usuario = '"
                + objeto.getUsuario() + "' and password = '" + objeto.getPassword() + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                resposta = true;
            }

        } catch (SQLException e) {
            //System.out.println("Erro! erro ao tentar inicializar o sessão" + e);
            JOptionPane.showMessageDialog(null, "Erro ao inicializar a sessão." + e);
        }

        return resposta;
    }

    /**
     * *
     * **********************************************************************
     * Método para Atualizar Cliente no Banco de Dados.
     * **********************************************************************
     */
    public boolean atualizarUsuario(Usuario objeto, int idUsuario) {
        boolean resposta = false;
        Connection cn = Conexao.conectar();
        try {
            PreparedStatement pst = cn.prepareStatement("Update tb_usuario set nome = ?, cpf = ?, apelido = ?, "
                    + "usuario = ?, password = ?, telefone = ? Where idUsuario ='" + idUsuario + "'");
            pst.setString(1, objeto.getNome());
            pst.setString(2, objeto.getCpf());
            pst.setString(3, objeto.getApelido());
            pst.setString(4, objeto.getUsuario());
            pst.setString(5, objeto.getPassword());
            pst.setString(6, objeto.getTelefone());
            

            if (pst.executeUpdate() > 0) {
                resposta = true;
            }
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar Atualizar Usuário no Sistema!" + e.getMessage());
        }
        return resposta;
    }

    /**
     * *
     * **********************************************************************
     * Método para Excluir Cliente.
     * **********************************************************************
     */
    public boolean excluirUsuario(int idUsuario) {
        boolean resposta = false;
        Connection cn = Conexao.conectar();
        try {
            PreparedStatement pst = cn.prepareStatement(
                    "delete From tb_usuario Where idUsuario='" + idUsuario + "'");
            pst.executeUpdate();
            if (pst.executeUpdate() > 0) {
                resposta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao tentar Excluir Usuário no Sistema!" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao tentar Excluir Usuário no Sistema!" + e.getMessage());
        }
        return resposta;
    }

}
