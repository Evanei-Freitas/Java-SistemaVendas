package view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Programador Evanei Freitas.
 */
public class FrmMenu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;

    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de Vendas - Versão 1.0");

        //Os codigos abaixo, configura o fundo do sistema com o JDesktopPane.
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();

        int largura = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int altura = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, largura, (altura - 110));
        this.add(jDesktopPane_menu);
        
    }

    //Método para colocar um icone no projeto.
//    @Override
//    public Image getIconImage() {
//        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/ventas.png"));
//        return retValue;
//    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_novoUsuario = new javax.swing.JMenuItem();
        jMenuItem_gerenciarUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_novoProduto = new javax.swing.JMenuItem();
        jMenuItem_gerenciarProduto = new javax.swing.JMenuItem();
        jMenuItem_atualizarEstoque = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_novoCliente = new javax.swing.JMenuItem();
        jMenuItem_gerenciarClientes = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_novaCategoria = new javax.swing.JMenuItem();
        jMenuItem_gerenciarCategoria = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_novaVenda = new javax.swing.JMenuItem();
        jMenuItem_gerenciarVendas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem_relatorioCliente = new javax.swing.JMenuItem();
        jMenuItem_relatorioCategoria = new javax.swing.JMenuItem();
        jMenuItem_relatorioProdutos = new javax.swing.JMenuItem();
        jMenuItem_relatorioVendas = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem_verRegistro = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem_sairSistema = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu1.setText("Usuário");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_novoUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_novoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem_novoUsuario.setText("Novo Usuario");
        jMenuItem_novoUsuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_novoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_novoUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_novoUsuario);

        jMenuItem_gerenciarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gerenciarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem_gerenciarUsuario.setText("Gerenciar Usuarios");
        jMenuItem_gerenciarUsuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_gerenciarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gerenciarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_gerenciarUsuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu2.setText("Produto");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_novoProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_novoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        jMenuItem_novoProduto.setText("Novo Produto");
        jMenuItem_novoProduto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_novoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_novoProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_novoProduto);

        jMenuItem_gerenciarProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gerenciarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenuItem_gerenciarProduto.setText("Gerenciar Produtos");
        jMenuItem_gerenciarProduto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gerenciarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gerenciarProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_gerenciarProduto);

        jMenuItem_atualizarEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_atualizarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_atualizarEstoque.setText("Atualizar Estoque");
        jMenuItem_atualizarEstoque.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_atualizarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_atualizarEstoqueActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_atualizarEstoque);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu4.setText("Cliente");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_novoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_novoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem_novoCliente.setText("Novo Cliente");
        jMenuItem_novoCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_novoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_novoClienteActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_novoCliente);

        jMenuItem_gerenciarClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gerenciarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenuItem_gerenciarClientes.setText("Gerenciar Clientes");
        jMenuItem_gerenciarClientes.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_gerenciarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gerenciarClientesActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_gerenciarClientes);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenu5.setText("Categoria");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_novaCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_novaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_novaCategoria.setText("Nova Categoria");
        jMenuItem_novaCategoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_novaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_novaCategoriaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_novaCategoria);

        jMenuItem_gerenciarCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gerenciarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenuItem_gerenciarCategoria.setText("Gerenciar Categorias");
        jMenuItem_gerenciarCategoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gerenciarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gerenciarCategoriaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_gerenciarCategoria);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        jMenu6.setText("Faturar");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_novaVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_novaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jMenuItem_novaVenda.setText("Nova Venda");
        jMenuItem_novaVenda.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu6.add(jMenuItem_novaVenda);

        jMenuItem_gerenciarVendas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gerenciarVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem_gerenciarVendas.setText("Gerenciar Vendas");
        jMenuItem_gerenciarVendas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu6.add(jMenuItem_gerenciarVendas);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenu7.setText("Relatorios");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_relatorioCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_relatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_relatorioCliente.setText("Relatorio Clientes");
        jMenuItem_relatorioCliente.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu7.add(jMenuItem_relatorioCliente);

        jMenuItem_relatorioCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_relatorioCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_relatorioCategoria.setText("Relatorio Categorias");
        jMenuItem_relatorioCategoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu7.add(jMenuItem_relatorioCategoria);

        jMenuItem_relatorioProdutos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_relatorioProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_relatorioProdutos.setText("Relatorio Produtos");
        jMenuItem_relatorioProdutos.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu7.add(jMenuItem_relatorioProdutos);

        jMenuItem_relatorioVendas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_relatorioVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_relatorioVendas.setText("Relatorio Vendas");
        jMenuItem_relatorioVendas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu7.add(jMenuItem_relatorioVendas);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenu8.setText("Registro");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_verRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_verRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenuItem_verRegistro.setText("Ver Registros");
        jMenuItem_verRegistro.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_verRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_verRegistroActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem_verRegistro);

        jMenuBar1.add(jMenu8);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu9.setText("Sair");
        jMenu9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu9.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem_sairSistema.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_sairSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenuItem_sairSistema.setText("Sair do Sistema");
        jMenuItem_sairSistema.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem_sairSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_sairSistemaActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem_sairSistema);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_gerenciarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gerenciarClientesActionPerformed
        //Código para Chamar Formulário Gerenciamento de Clientes.
        FrmInterGerenciarClientes frmGerenciarClientes = new FrmInterGerenciarClientes();
        jDesktopPane_menu.add(frmGerenciarClientes);
        frmGerenciarClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gerenciarClientesActionPerformed

    private void jMenuItem_verRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_verRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_verRegistroActionPerformed

    private void jMenuItem_sairSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_sairSistemaActionPerformed
        //Código para sair do sistema - Exibe uma caixa de diálogo de confirmação.
        //System.exit(0);
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do sistema?", "Atenção",
                JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem_sairSistemaActionPerformed

    private void jMenuItem_novaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_novaCategoriaActionPerformed
        // Codigo para chamar o formulario categorias.
        FrmInterCategoria frminterCategoria = new FrmInterCategoria();
        jDesktopPane_menu.add(frminterCategoria);
        frminterCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_novaCategoriaActionPerformed

    private void jMenuItem_gerenciarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gerenciarCategoriaActionPerformed
        // Código para chamar formulario Gerenciar Categorias.
        FrmInterGerenciarCategorias frmgerenciarCategorias = new FrmInterGerenciarCategorias();
        jDesktopPane_menu.add(frmgerenciarCategorias);
        frmgerenciarCategorias.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gerenciarCategoriaActionPerformed

    private void jMenuItem_novoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_novoProdutoActionPerformed
        // Código para chamar o Formulário de Produtos.
        FrmInterProdutos frmInterProdutos = new FrmInterProdutos();
        jDesktopPane_menu.add(frmInterProdutos);
        frmInterProdutos.setVisible(true);
    }//GEN-LAST:event_jMenuItem_novoProdutoActionPerformed

    private void jMenuItem_gerenciarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gerenciarProdutoActionPerformed
        // Código para chamar o Formulário de Gerenciamento de Produtos
        FrmInterGerenciarProdutos frmGerenciamentoProdutos = new FrmInterGerenciarProdutos();
        jDesktopPane_menu.add(frmGerenciamentoProdutos);
        frmGerenciamentoProdutos.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gerenciarProdutoActionPerformed

    private void jMenuItem_novoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_novoClienteActionPerformed
        // Código para chamar o Formulario de Novo Cliente.
        FrmInterCliente frmNovoCliente = new FrmInterCliente();
        jDesktopPane_menu.add(frmNovoCliente);
        frmNovoCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_novoClienteActionPerformed

    private void jMenuItem_atualizarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_atualizarEstoqueActionPerformed
        //Código para Chamar o Formulário Atualizar Estoque.
        FrmInterAtualizarEstoque frmatualizarEstoque = new FrmInterAtualizarEstoque();
        jDesktopPane_menu.add(frmatualizarEstoque);
        frmatualizarEstoque.setVisible(true);
    }//GEN-LAST:event_jMenuItem_atualizarEstoqueActionPerformed

    private void jMenuItem_gerenciarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gerenciarUsuarioActionPerformed
        //Código para Chamar o Formulário Gerenciamento de Usuario.
        FrmInterGerenciarUsuarios frmgerenciarUsuario = new FrmInterGerenciarUsuarios();
        jDesktopPane_menu.add(frmgerenciarUsuario);
        frmgerenciarUsuario.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem_gerenciarUsuarioActionPerformed

    private void jMenuItem_novoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_novoUsuarioActionPerformed
        //Código para Chamar o Formulário de Usuário.
        FrmInterUsuario frmUsuario = new FrmInterUsuario();
        jDesktopPane_menu.add(frmUsuario);
        frmUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_novoUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_atualizarEstoque;
    private javax.swing.JMenuItem jMenuItem_gerenciarCategoria;
    private javax.swing.JMenuItem jMenuItem_gerenciarClientes;
    private javax.swing.JMenuItem jMenuItem_gerenciarProduto;
    private javax.swing.JMenuItem jMenuItem_gerenciarUsuario;
    private javax.swing.JMenuItem jMenuItem_gerenciarVendas;
    private javax.swing.JMenuItem jMenuItem_novaCategoria;
    private javax.swing.JMenuItem jMenuItem_novaVenda;
    private javax.swing.JMenuItem jMenuItem_novoCliente;
    private javax.swing.JMenuItem jMenuItem_novoProduto;
    private javax.swing.JMenuItem jMenuItem_novoUsuario;
    private javax.swing.JMenuItem jMenuItem_relatorioCategoria;
    private javax.swing.JMenuItem jMenuItem_relatorioCliente;
    private javax.swing.JMenuItem jMenuItem_relatorioProdutos;
    private javax.swing.JMenuItem jMenuItem_relatorioVendas;
    private javax.swing.JMenuItem jMenuItem_sairSistema;
    private javax.swing.JMenuItem jMenuItem_verRegistro;
    // End of variables declaration//GEN-END:variables

}
