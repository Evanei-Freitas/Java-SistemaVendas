package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Programador Evanei Freitas.
 */
public class Conexao {

    //Método Conexao Local
    public static Connection conectar() {
        try {

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistema_vendas", "root", "");
            return cn;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Não foi possível conectar com o banco de dados!\n"
                    + "Verifique se o Banco de dados foi iniciado ou, se a senha e o login de conexão\n"
                    + "estão corretos!");
            //System.out.println("Erro na conexão local:" + e);
        }
        return null;
    }
}
