package controller;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author Programador Evanei Freitas.
 */
public class Controller_Usuario {

    //Método para inicializar a sessão.
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

}
