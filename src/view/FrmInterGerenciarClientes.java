package view;

import conexao.Conexao;
import controller.Controller_Cliente;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

/**
 *
 * @author Programador Evanei Freitas.
 */
public class FrmInterGerenciarClientes extends javax.swing.JInternalFrame {

    private int idCliente;

    public FrmInterGerenciarClientes() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("Gerenciar Clientes");
        this.carregarTabelaCliente();

        //Inserir imagem de fundo(Backgraund)no Formulário 
        ImageIcon wallpaper = new ImageIcon("src/img/fondo3.jpg");
        Icon icone = new ImageIcon(wallpaper.getImage().getScaledInstance(900, 500, WIDTH));
        jLabel_walppaperCliente.setIcon(icone);
        this.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_jTable_Clientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Clientes = new javax.swing.JTable();
        jPanel_BotoesAtualizarExcluir = new javax.swing.JPanel();
        jButton_AtualizarCliente = new javax.swing.JButton();
        jButton_ExcluirCliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel_Nome = new javax.swing.JLabel();
        txt_Celular = new javax.swing.JTextField();
        jLabel_Apelido = new javax.swing.JLabel();
        jLabel_Endereco = new javax.swing.JLabel();
        txt_Apelido = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        jLabel_Cpf = new javax.swing.JLabel();
        jLabel_Celular = new javax.swing.JLabel();
        txt_Cpf = new javax.swing.JTextField();
        txt_Endereco = new javax.swing.JTextField();
        jLabel_Telefone = new javax.swing.JLabel();
        txt_Telefone = new javax.swing.JTextField();
        jLabel_AdministrarClientes = new javax.swing.JLabel();
        jLabel_walppaperCliente = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_jTable_Clientes.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_jTable_Clientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_jTable_Clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTable_Clientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_Clientes);

        jPanel_jTable_Clientes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 250));

        getContentPane().add(jPanel_jTable_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 730, 270));

        jPanel_BotoesAtualizarExcluir.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_BotoesAtualizarExcluir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_BotoesAtualizarExcluir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_AtualizarCliente.setBackground(new java.awt.Color(51, 204, 0));
        jButton_AtualizarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_AtualizarCliente.setText("Atualizar");
        jButton_AtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AtualizarClienteActionPerformed(evt);
            }
        });
        jPanel_BotoesAtualizarExcluir.add(jButton_AtualizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 10, 130, 40));

        jButton_ExcluirCliente.setBackground(new java.awt.Color(255, 51, 51));
        jButton_ExcluirCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_ExcluirCliente.setText("Excluir");
        jButton_ExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirClienteActionPerformed(evt);
            }
        });
        jPanel_BotoesAtualizarExcluir.add(jButton_ExcluirCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 53, 130, 40));

        getContentPane().add(jPanel_BotoesAtualizarExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 140, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Nome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Nome.setText("Nome:");
        jPanel3.add(jLabel_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 60, -1));

        txt_Celular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txt_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 200, -1));

        jLabel_Apelido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Apelido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Apelido.setText("Apelido:");
        jPanel3.add(jLabel_Apelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, -1));

        jLabel_Endereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Endereco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Endereco.setText("Endereço:");
        jPanel3.add(jLabel_Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 90, -1));

        txt_Apelido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txt_Apelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 200, -1));

        txt_nome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 200, -1));

        jLabel_Cpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Cpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Cpf.setText("CPF:");
        jPanel3.add(jLabel_Cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, -1));

        jLabel_Celular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Celular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Celular.setText("Celular:");
        jPanel3.add(jLabel_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 80, -1));

        txt_Cpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txt_Cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 200, -1));

        txt_Endereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txt_Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 440, 30));

        jLabel_Telefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Telefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Telefone.setText("Telefone:");
        jPanel3.add(jLabel_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 90, -1));

        txt_Telefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txt_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 200, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 870, 130));

        jLabel_AdministrarClientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_AdministrarClientes.setText("Administrar Clientes");
        getContentPane().add(jLabel_AdministrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));
        getContentPane().add(jLabel_walppaperCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AtualizarClienteActionPerformed
        //Código do botão para atualizar Cliente.

        //Validando os Campos.
        if (txt_nome.getText().isEmpty() && txt_Apelido.getText().isEmpty() && txt_Cpf.getText().isEmpty()
                && txt_Telefone.getText().isEmpty() && txt_Celular.getText().isEmpty() && txt_Endereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha Todos os Campos.");
        } else {
            //Aqui Instâncio as duas Camadas(Model e Controller)Para poder usa-las.
            Cliente cliente = new Cliente();
            Controller_Cliente controllerCliente = new Controller_Cliente();

            /**
             * *
             * Aqui Seto os Dados que serão preenchodos nos Campos de Textos do
             * Formulário para ser atualizados - (FrmInterClientes).
             */
            cliente.setNome(txt_nome.getText().trim());
            cliente.setApelido(txt_Apelido.getText().trim());
            cliente.setCpf(txt_Cpf.getText().trim());
            cliente.setTelefone(txt_Telefone.getText().trim());
            cliente.setCelular(txt_Celular.getText().trim());
            cliente.setEndereco(txt_Endereco.getText().trim());

            //Aqui chamo o Método atualizarCliente que esta no(controllerCliente). 
            if (controllerCliente.atualizarCliente(cliente, idCliente)) {
                JOptionPane.showMessageDialog(null, "Cliente Atualizado com Sucesso!");
                this.carregarTabelaCliente();
                this.limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao Tentar Atualizar os Dados do Cliente!");
            }

        }

    }//GEN-LAST:event_jButton_AtualizarClienteActionPerformed

    private void jButton_ExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirClienteActionPerformed
        //Código do botão para Excluir Cliente.
        Controller_Cliente controllerCliente = new Controller_Cliente();
        if (idCliente == 0) {
            JOptionPane.showMessageDialog(null, "Selecione o Cliente para ser Excluido!");
        } else {

            //Excluindo Clinete.
            int excluir = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir o Cliente"
                    + "?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (excluir == JOptionPane.YES_OPTION) {
                if (!controllerCliente.excluirCliente(idCliente)) {
                    JOptionPane.showMessageDialog(null, "Cliente Excluido com Sucesso!");
                    this.carregarTabelaCliente();
                    this.limpar();
                } else {
                    //JOptionPane.showMessageDialog(null, "Você Cancelou a opção de Excluir o Cliente");
                }
            }
        }

    }//GEN-LAST:event_jButton_ExcluirClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AtualizarCliente;
    private javax.swing.JButton jButton_ExcluirCliente;
    private javax.swing.JLabel jLabel_AdministrarClientes;
    private javax.swing.JLabel jLabel_Apelido;
    private javax.swing.JLabel jLabel_Celular;
    private javax.swing.JLabel jLabel_Cpf;
    private javax.swing.JLabel jLabel_Endereco;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JLabel jLabel_Telefone;
    private javax.swing.JLabel jLabel_walppaperCliente;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_BotoesAtualizarExcluir;
    private javax.swing.JPanel jPanel_jTable_Clientes;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_Clientes;
    private javax.swing.JTextField txt_Apelido;
    private javax.swing.JTextField txt_Celular;
    private javax.swing.JTextField txt_Cpf;
    private javax.swing.JTextField txt_Endereco;
    private javax.swing.JTextField txt_Telefone;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables

    /**
     ************************************************************************
     * Método para Limpar
     * ***********************************************************************
     */
    private void limpar() {
        txt_nome.setText("");
        txt_Apelido.setText("");
        txt_Cpf.setText("");
        txt_Telefone.setText("");
        txt_Celular.setText("");
        txt_Endereco.setText("");
    }

    /**
     ************************************************************************
     * Método para mostrar todos os Clientes Salvos no Banco de Dados.
     * ***********************************************************************
     */
    private void carregarTabelaCliente() {

        Connection con = Conexao.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "Select * From tb_cliente";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            FrmInterGerenciarClientes.jTable_Clientes = new JTable(model);
            FrmInterGerenciarClientes.jScrollPane1.setViewportView(FrmInterGerenciarClientes.jTable_Clientes);

            model.addColumn("Nº");//ID
            model.addColumn("nome");
            model.addColumn("apelido");
            model.addColumn("cpf");
            model.addColumn("telefone");
            model.addColumn("celular");
            model.addColumn("endereco");
            model.addColumn("estado");

            while (rs.next()) {
                Object fila[] = new Object[8];
                for (int i = 0; i < 8; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar carregar a Tabela de Clientes :" + e);
        }

        jTable_Clientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_Clientes.rowAtPoint(e.getPoint());
                int coluna_point = 0;

                if (fila_point > -1) {
                    idCliente = (int) model.getValueAt(fila_point, coluna_point);
                    EnviarDadosClienteSelecionado(idCliente);
                }
            }
        });
    }

    /**
     ***************************************************************************
     * Método para quando clicar com o mouse no nome da categoria ela preencha
     * automaticamente o txt_Descricao.
     * **************************************************************************
     */
    private void EnviarDadosClienteSelecionado(int idCliente) {

        try {
            Connection con = Conexao.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "Select * From tb_cliente Where idCliente = '" + idCliente + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_nome.setText(rs.getString("nome"));
                txt_Apelido.setText(rs.getString("apelido"));
                txt_Cpf.setText(rs.getString("cpf"));
                txt_Telefone.setText(rs.getString("telefone"));
                txt_Celular.setText(rs.getString("celular"));
                txt_Endereco.setText(rs.getString("endereco"));
            }
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Selecionar o Cliente!" + e);
        }
    }

}
