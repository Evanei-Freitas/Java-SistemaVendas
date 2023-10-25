package view;

import conexao.Conexao;
import controller.Controller_Produto;
import java.awt.Dimension;
import java.awt.HeadlessException;
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
import model.Produto;

/**
 *
 * @author Programador Evanei Freitas.
 */
public class FrmInterGerenciarProdutos extends javax.swing.JInternalFrame {

    private int idProduto;
    int obterIdCategoriaCombo = 0;

    public FrmInterGerenciarProdutos() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("Gerenciar Produtos");
        this.carregarTabelaProdutos();
        this.carregarComboCategorias();

        //Inserir imagem de fundo(Backgraund)no Formulário 
        ImageIcon wallpaper = new ImageIcon("src/img/fondo3.jpg");
        Icon icone = new ImageIcon(wallpaper.getImage().getScaledInstance(900, 500, WIDTH));
        jLabel_walppaper.setIcon(icone);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_produtos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton_Atualizar = new javax.swing.JButton();
        jButton_Excluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_descricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_quantidade = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_preco = new javax.swing.JTextField();
        jComboBox_iva = new javax.swing.JComboBox<>();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel_walppaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTable_produtos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable_produtos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_produtos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 730, 270));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Atualizar.setBackground(new java.awt.Color(51, 204, 0));
        jButton_Atualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Atualizar.setText("Atualizar");
        jButton_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AtualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 10, 130, 40));

        jButton_Excluir.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Excluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Excluir.setText("Excluir");
        jButton_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 53, 130, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 140, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        txt_descricao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txt_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 430, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Quantidade:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Juros:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 60, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Categoria:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 110, -1));

        txt_quantidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_quantidade.setEnabled(false);
        jPanel3.add(txt_quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 200, -1));

        txt_nome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 200, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Preço:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 60, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Descrição:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 90, -1));

        txt_preco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txt_preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 170, -1));

        jComboBox_iva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_iva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Juros", "No grava iva", "12% ", "14%", "10%", "20%" }));
        jPanel3.add(jComboBox_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 180, -1));

        jComboBox_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Categoria :", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 180, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 870, 130));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Administrar Produtos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));
        getContentPane().add(jLabel_walppaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AtualizarActionPerformed
        //Código do botão para atualizar Produto.

        Produto produto = new Produto();
        Controller_Produto controllerProduto = new Controller_Produto();
        String porcentagemIVA = "";
        String categoria = "";

        porcentagemIVA = jComboBox_iva.getSelectedItem().toString().trim();
        categoria = jComboBox_categoria.getSelectedItem().toString().trim();

        //Validação dos Campos.
        if (txt_nome.getText().isEmpty() || txt_quantidade.getText().isEmpty()
                || txt_preco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!");
        } else {

            //Crio uma consulta para ver se o produto já se encontra registrado.
            if (porcentagemIVA.equalsIgnoreCase("Selecione Iva:")) {
                JOptionPane.showMessageDialog(null, "Selecione o Imposto ou Juros a Pagar!");
            } else {
                if (categoria.equalsIgnoreCase("Selecione Categoria :")) {
                    JOptionPane.showMessageDialog(null, "Selecione a Categoria.");
                } else {
                    try {

                        produto.setNome(txt_nome.getText().trim());
                        produto.setQuantidade(Integer.parseInt(txt_quantidade.getText().trim()));
                        String precoTXT = "";
                        double preco = 0.0;
                        precoTXT = txt_preco.getText().trim();
                        boolean aux = false;
                        /**
                         * *
                         * Se o Usuário digita vírgulas(,), transformamos em
                         * ponto(.)
                         */
                        for (int i = 0; i < precoTXT.length(); i++) {
                            if (precoTXT.charAt(i) == ',') {
                                String precoNovo = precoTXT.replace(",", ".");
                                preco = Double.parseDouble(precoNovo);
                                aux = true;
                            }
                        }

                        //Avaliar a condição.
                        if (aux == true) {
                            produto.setPreco(preco);
                        } else {
                            preco = Double.parseDouble(precoTXT);
                            produto.setPreco(preco);
                        }
                        produto.setDescricao(txt_descricao.getText().trim());

                        //Porcentagem e Juros IVA.
                        if (porcentagemIVA.equalsIgnoreCase("Sem Juros")) {
                            produto.setPorcentagemIva(0);
                        } else if (porcentagemIVA.equalsIgnoreCase("12%")) {
                            produto.setPorcentagemIva(12);
                        } else if (porcentagemIVA.equalsIgnoreCase("14%")) {
                            produto.setPorcentagemIva(14);
                        } else if (porcentagemIVA.equalsIgnoreCase("10%")) {
                            produto.setPorcentagemIva(10);
                        } else if (porcentagemIVA.equalsIgnoreCase("20%")) {
                            produto.setPorcentagemIva(20);
                        }

                        //IdCategoria - Carregar o Método para obter o idCategoria.
                        this.idCategoria();
                        produto.setIdCategoria(obterIdCategoriaCombo);
                        produto.setEstado(1);
                        if (controllerProduto.atualizarProduto(produto, idProduto)) {
                            JOptionPane.showMessageDialog(null, "Produto Atualizado com sucesso!");
                            this.carregarComboCategorias();
                            this.carregarTabelaProdutos();
                            this.jComboBox_iva.setSelectedItem("Selecione o ImpostoIVA");
                            this.limpar();

                        } else {
                            JOptionPane.showMessageDialog(null, "Erro ao tentar Atualizar Categoria!");
                        }

                    } catch (HeadlessException | NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Erro ao tentar Salvar a Categoria!" + e);
                    }
                }
            }

        }

    }//GEN-LAST:event_jButton_AtualizarActionPerformed

    private void jButton_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirActionPerformed
        //Código do botão para atualizar Produto.
        Controller_Produto controllerProduto = new Controller_Produto();
        if (idProduto == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um Produto!");
        } else {
            if (!controllerProduto.excluirProduto(idProduto)) {
                JOptionPane.showMessageDialog(null, "Produto Excluido com Sucesso!");
                this.carregarTabelaProdutos();
                this.carregarComboCategorias();
                this.limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o produto!");
            }
        }

    }//GEN-LAST:event_jButton_ExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Atualizar;
    private javax.swing.JButton jButton_Excluir;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JComboBox<String> jComboBox_iva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_walppaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_produtos;
    private javax.swing.JTextField txt_descricao;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_preco;
    private javax.swing.JTextField txt_quantidade;
    // End of variables declaration//GEN-END:variables

    /**
     ************************************************************************
     * Método para Limpar
     * ***********************************************************************
     */
    private void limpar() {
        txt_nome.setText("");
        txt_quantidade.setText("");
        txt_preco.setText("");
        txt_descricao.setText("");
        jComboBox_iva.setSelectedItem("elecione porcentagemIva:");
        jComboBox_categoria.setSelectedItem("Selecione Categoria:");
    }

    /**
     ************************************************************************
     * Método para Carregar as Categorias no JComboBox
     * ***********************************************************************
     */
    private void carregarComboCategorias() {
        Connection cn = Conexao.conectar();
        String sql = "Select * From tb_categoria";
        Statement stm;

        try {
            stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            jComboBox_categoria.removeAllItems();
            jComboBox_categoria.addItem("Selecione a Categoria:");

            while (rs.next()) {
                jComboBox_categoria.addItem(rs.getString("descricao"));
            }
            cn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar carregar o ComboBox Categorias!" + e);
        }

    }

    /**
     ************************************************************************
     * Método para mostrar todas os Produtos Salvos no Banco de Dados.
     * ***********************************************************************
     */
    String descricaoCategoria = "";
    double preco = 0.0;
    int porcentagemIva = 0;
    double IVA = 0;

    private void carregarTabelaProdutos() {

        Connection con = Conexao.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select p.idProduto, p.nome, p.quantidade, p.preco, p.descricao, p.porcentagemIva, c.descricao, p.estado from tb_produto AS p, tb_categoria As c where p.idCategoria = c.idCategoria;";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            FrmInterGerenciarProdutos.jTable_produtos = new JTable(model);
            FrmInterGerenciarProdutos.jScrollPane1.setViewportView(FrmInterGerenciarProdutos.jTable_produtos);

            model.addColumn("Nº");//ID
            model.addColumn("nome");
            model.addColumn("quantidade");
            model.addColumn("preco");
            model.addColumn("descricao");
            model.addColumn("porcentagemIva");
            model.addColumn("Categoria");
            model.addColumn("estado");

            while (rs.next()) {

                preco = rs.getDouble("preco");
                porcentagemIva = rs.getInt("porcentagemIva");

                Object fila[] = new Object[8];
                for (int i = 0; i < 8; i++) {
                    if (i == 5) {
                        this.calcularIva(preco, porcentagemIva);
                        fila[i] = IVA;
                        rs.getObject(i + 1);
                    } else {
                        fila[i] = rs.getObject(i + 1);
                    }
                }
                model.addRow(fila);
            }

            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar carregar a Tabela Produtos :" + e);
        }

        jTable_produtos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_produtos.rowAtPoint(e.getPoint());
                int coluna_point = 0;

                if (fila_point > -1) {
                    idProduto = (int) model.getValueAt(fila_point, coluna_point);
                    EnviarDadosProdutoSelecionado(idProduto);
                }
            }
        });
    }

    /**
     ***************************************************************************
     * Método para Calcular porcentagemIva
     * **************************************************************************
     */
    private double calcularIva(double preco, int iva) {
        int p_iva = iva;
        switch (p_iva) {
            case 0:
                IVA = 0.0;
                break;
            case 10:
                IVA = preco * 0.10;
                break;
            case 12:
                IVA = preco * 0.12;
                break;
            case 14:
                IVA = preco * 0.14;
                break;
            case 20:
                IVA = preco * 0.20;
                break;
            default:
                break;
        }

        //Rendondando casas decimais
        IVA = (double) Math.round(IVA * 100) / 100;
        return IVA;
    }

    /**
     ***************************************************************************
     * Método para quando clicar com o mouse no nome da categoria ela preencha
     * automaticamente o txt_Descricao.
     * **************************************************************************
     */
    private void EnviarDadosProdutoSelecionado(int idProduto) {

        try {
            Connection con = Conexao.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "Select * From tb_produto Where idProduto = '" + idProduto + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_nome.setText(rs.getString("nome"));
                txt_preco.setText(rs.getString("preco"));
                txt_descricao.setText(rs.getString("descricao"));
                txt_quantidade.setText(rs.getString("quantidade"));
                int iva = rs.getInt("porcentagemIva");
                switch (iva) {
                    case 0:
                        jComboBox_iva.setSelectedItem("Sem Juros");
                        break;
                    case 10:
                        jComboBox_iva.setSelectedItem("10%");
                        break;
                    case 12:
                        jComboBox_iva.setSelectedItem("12%");
                        break;
                    case 14:
                        jComboBox_iva.setSelectedItem("14%");
                        break;
                    case 20:
                        jComboBox_iva.setSelectedItem("20%");
                        break;
                    default:
                        jComboBox_iva.setSelectedItem("No grava Iva:");
                        break;
                }

                int idCate = rs.getInt("idCategoria");
                jComboBox_categoria.setSelectedItem(relacionarCategoria(idCate));

            }
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Selecionar o Produto!" + e);
        }

    }

    /**
     ***************************************************************************
     * Método para Relacionar Categirias.
     * **************************************************************************
     */
    private String relacionarCategoria(int idCategoria) {

        String sql = "Select descricao From tb_categoria Where idCategoria ='" + idCategoria + "'";
        Statement stm;

        try {
            Connection cn = Conexao.conectar();
            stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                descricaoCategoria = rs.getString("descricao");
            }
            cn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar carregar o ComboBox com o idCategoria!" + e);
        }

        return descricaoCategoria;
    }

    /**
     * *
     * Método para carregar o idCategoria
     */
    private int idCategoria() {
        String sql = "Select * From tb_categoria Where descricao = '" + this.jComboBox_categoria.getSelectedItem() + "'";
        Statement stm;
        try {
            Connection cn = Conexao.conectar();
            stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                obterIdCategoriaCombo = rs.getInt("idCategoria");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao obter a categoria!" + e);
        }

        return obterIdCategoriaCombo;
    }

}
