package VIEW;

import CONTROLLER.ClientController;
import CONTROLLER.EnderecoController;
import MODEL.ClientModel;
import MODEL.EnderecoModel;
import br.com.parg.viacep.ViaCEP;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
// a linha abaixo importa recursos da biblioteca rs2

/**
 *
 * @author Carlo
 */
public class ClientView extends javax.swing.JInternalFrame {

    EnderecoController ec = new EnderecoController();
    ClientController cc = new ClientController();

    public ClientView() {
        initComponents();
        ClientView.txtIdCli.setVisible(false);
        ClientView.txtIdEndereco.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeCli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPesqClient = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefoneCli = new javax.swing.JTextField();
        txtCepCli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCidadeCli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBairroCli = new javax.swing.JTextField();
        txtRuaCli = new javax.swing.JTextField();
        txtUfCli = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtComplementoCli = new javax.swing.JTextField();
        btnSalvarCli = new javax.swing.JButton();
        btnBuscarCep = new javax.swing.JButton();
        btnExcluirCli = new javax.swing.JButton();
        txtEmailCli1 = new javax.swing.JTextField();
        btnPesqCli = new javax.swing.JButton();
        txtIdEndereco = new javax.swing.JTextField();
        txtIdCli = new javax.swing.JTextField();
        btnLimparCli = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(53, 99, 135));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/avaliacao-do-cliente.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detalhes do cliente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 64));
        jPanel1.add(txtNomeCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 288, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        txtPesqClient.setText("Pesquisar...");
        txtPesqClient.setToolTipText("Telefone cliente");
        jPanel1.add(txtPesqClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 110, 190, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, -1, -1));
        jPanel1.add(txtTelefoneCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 288, -1));
        jPanel1.add(txtCepCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 200, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BAIRRO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("RUA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));
        jPanel1.add(txtCidadeCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 180, -1));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CIDADE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, -1, -1));
        jPanel1.add(txtBairroCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 220, -1));
        jPanel1.add(txtRuaCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 220, -1));
        jPanel1.add(txtUfCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 220, -1));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("UF");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("COMPLEMENTO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));
        jPanel1.add(txtComplementoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 460, -1));

        btnSalvarCli.setBackground(new java.awt.Color(0, 153, 153));
        btnSalvarCli.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSalvarCli.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/bookmark.png"))); // NOI18N
        btnSalvarCli.setText("Salvar");
        btnSalvarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, -1, 40));

        btnBuscarCep.setBackground(new java.awt.Color(102, 204, 255));
        btnBuscarCep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBuscarCep.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/endereco.png"))); // NOI18N
        btnBuscarCep.setText("Buscar");
        btnBuscarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCepActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        btnExcluirCli.setBackground(new java.awt.Color(255, 102, 102));
        btnExcluirCli.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExcluirCli.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/lixeira.png"))); // NOI18N
        btnExcluirCli.setText("Excluir");
        btnExcluirCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluirCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, -1, 40));
        jPanel1.add(txtEmailCli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 288, -1));

        btnPesqCli.setBackground(new java.awt.Color(53, 99, 135));
        btnPesqCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/lupa-arredondada.png"))); // NOI18N
        btnPesqCli.setBorder(null);
        btnPesqCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesqCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 40, 30));

        txtIdEndereco.setBackground(new java.awt.Color(255, 255, 204));
        txtIdEndereco.setForeground(new java.awt.Color(255, 0, 102));
        jPanel1.add(txtIdEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 430, 60, -1));

        txtIdCli.setBackground(new java.awt.Color(255, 255, 204));
        txtIdCli.setForeground(new java.awt.Color(255, 0, 102));
        jPanel1.add(txtIdCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 170, 60, -1));

        btnLimparCli.setBackground(new java.awt.Color(102, 204, 255));
        btnLimparCli.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLimparCli.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/borracha.png"))); // NOI18N
        btnLimparCli.setText("Limpar");
        btnLimparCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimparCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, -1, 40));

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CEP");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jPanel3.setBackground(new java.awt.Color(53, 99, 135));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 970, 110));

        jPanel4.setBackground(new java.awt.Color(53, 99, 135));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 970, 230));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefone");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 540));

        setBounds(0, 0, 1265, 570);
    }// </editor-fold>//GEN-END:initComponents

    public boolean validaCampos() {
        return this.txtNomeCli.getText().isEmpty() || this.txtTelefoneCli.getText().isEmpty() || this.txtEmailCli1.getText().isEmpty()
                || this.txtCepCli.getText().isEmpty() || this.txtBairroCli.getText().isEmpty() || this.txtRuaCli.getText().isEmpty()
                || this.txtUfCli.getText().isEmpty() || this.txtCidadeCli.getText().isEmpty() || this.txtComplementoCli.getText().isEmpty();
    }

    // MÉTODO PARA VALIDAR CAMPO PESQUISA
    public boolean validaPesquisa() {
        return this.txtPesqClient.getText().isEmpty();
    }

    // BOTÃO (SALVAR) - CLICK
    private void btnSalvarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCliActionPerformed
        String idCli = ClientView.txtIdCli.getText();       // Pegando valor de id Cliente
        String idEnd = ClientView.txtIdEndereco.getText(); // Pegando valor de id Endereço

        // método salvar abaixo
        sair: // Em caso de erro de sistema venha sair.
        if (this.validaCampos()) { // Valida Campos Em Branco
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obritórios!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Salvar o Cliente
            try {
                if (idCli.equals("")) { // Caso o id do cliente seja branco faça um insert
                    if (cc.verCli(this.txtTelefoneCli.getText())) { // Verifica se já existe um registro na base de dados
                        JOptionPane.showMessageDialog(null, "Já existe um cliente com este número de telefone, tente pesquisa-lo.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        // Verifique se as duas inserções foram feitas

                        // add ENDEREÇO
                        if (ec.addEnd(0, this.txtCepCli.getText(), this.txtBairroCli.getText(), this.txtRuaCli.getText(), this.txtUfCli.getText(), this.txtCidadeCli.getText(), this.txtComplementoCli.getText())) {
                            try {
                                //  add CLIENTE
                                if (cc.addCli(0, this.txtNomeCli.getText(), this.txtTelefoneCli.getText(), this.txtEmailCli1.getText())) {
                                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!!!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Erro ao inserir um cliente no banco de dados, contate o suporte técnico", "MENSAGEM", JOptionPane.ERROR_MESSAGE);
                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Erro ao alterar um cliente no banco de dados, contate o suporte técnico", "MENSAGEM", JOptionPane.ERROR_MESSAGE);
                                System.out.println("Erro ao Cadastrar o Cliente: " + e.getMessage());
                                break sair; // Ir para o sair
                            }
                        }
                    }
                } else {
                    // Verifique se as duas alterações foram feitas
                    // update ENDEREÇO
                    if (ec.addEnd(Integer.parseInt(idEnd), this.txtCepCli.getText(), this.txtBairroCli.getText(), this.txtRuaCli.getText(), this.txtUfCli.getText(), this.txtCidadeCli.getText(), this.txtComplementoCli.getText())) {
                        try {
                            //  update CLIENTE
                            if (cc.addCli(Integer.parseInt(idCli), this.txtNomeCli.getText(), this.txtTelefoneCli.getText(), this.txtEmailCli1.getText())) {
                                JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!!!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Erro ao alterar um cliente no banco de dados, contate o suporte técnico", "MENSAGEM", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            System.out.println("Erro ao alterar o Cliente: " + e.getMessage());
                            break sair; // Ir para o sair
                        }
                    }
                }
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar um cliente no banco de dados, contate o suporte técnico", "MENSAGEM", JOptionPane.ERROR_MESSAGE);
                System.out.println("Erro ao manter o cliente: " + error.getMessage());
            }
        }
    }//GEN-LAST:event_btnSalvarCliActionPerformed

    // MÉTODO PARA VALIDAR CAMPO CEP NULL
    public boolean validarCep() {
        if (this.txtCepCli.getText().length() < 8 || this.txtCepCli.getText().length() > 8) {
            return false;
        } else if (this.txtCepCli.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    // V ^
    // BOTÃO (BUSCAR CEP) - CLICK
    private void btnBuscarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCepActionPerformed
        // O código realziar uma pesquisa de CEP
        ViaCEP viaCep = new ViaCEP();
        EnderecoModel em;
        if (!this.validarCep()) {
            JOptionPane.showMessageDialog(null, "Preencha um CEP Válido ", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            try { // COLOCAR NA CONTROLER
                em = ec.retornaCep(this.txtCepCli.getText(), this.txtComplementoCli.getText());
                this.txtBairroCli.setText(em.getBairro());
                this.txtRuaCli.setText(em.getRua());
                this.txtUfCli.setText(em.getUf());
                this.txtCidadeCli.setText(em.getCidade());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Houve um erro ao pesquisar o CEP: " + ex.getMessage());
                Logger.getLogger(ClientView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBuscarCepActionPerformed

    // BOTÃO (EXCLUIR) - CLICK
    private void btnExcluirCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCliActionPerformed
        // Validação de campos
        if (this.validaPesquisa()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo pesquisa para realizar uma busca.", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
        } else if (ClientView.txtIdCli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Necessário realizar uma pesquisa de um usuário válido!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // código abaixo realiza a exclusão de um usuário
            try {
                int excluir = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o cliente? não será possível recuperar o mesmo. ", "Atenção", JOptionPane.YES_NO_OPTION);
                if (excluir == JOptionPane.YES_OPTION) {
                    if (cc.DeleteCli(Integer.parseInt(ClientView.txtIdCli.getText())) && ec.DeleteEnd(Integer.parseInt(ClientView.txtIdEndereco.getText()))) {
                        this.limparCampos();
                        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!!!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (Exception e) {
                System.out.println("ERRO EXCLUIR: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Houve um problema na exclusão, entre em contato com desenvolvedor.", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirCliActionPerformed

    // BOTÃO (PESQUISAR) - CLICK
    private void btnPesqCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCliActionPerformed
        // tudo a baixo é referente a ação do botão pesquisar.
        ClientModel cm;
        try {
            cm = cc.getCli(this.txtPesqClient.getText());
            this.txtNomeCli.setText(cm.getNomeCli());                           // NOME
            this.txtTelefoneCli.setText(cm.getTelCli());                        // TELEFONE
            this.txtEmailCli1.setText(cm.getEmailCli());                        // EMAIL
            this.txtCepCli.setText(cm.getEndereco().getCep());                  // CEP
            this.txtBairroCli.setText(cm.getEndereco().getBairro());            // BAIRRO
            this.txtRuaCli.setText(cm.getEndereco().getRua());                  // RUA
            this.txtUfCli.setText(cm.getEndereco().getUf());                    // UF
            this.txtCidadeCli.setText(cm.getEndereco().getCidade());            // CIDADE
            this.txtComplementoCli.setText(cm.getEndereco().getComplemento());  // COMPLEMENTO
            JOptionPane.showMessageDialog(null, "Busca realizada com sucesso!!!");
        } catch (SQLException ex) {
            Logger.getLogger(ClientView.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro na busca: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnPesqCliActionPerformed

    // MÉTODO PARA LIMPAR TODOS OS CAMPOS
    public void limparCampos() {
        this.txtBairroCli.setText(null);
        this.txtCepCli.setText(null);
        this.txtCidadeCli.setText(null);
        this.txtComplementoCli.setText(null);
        this.txtEmailCli1.setText(null);
        this.txtNomeCli.setText(null);
        this.txtPesqClient.setText("Pesquisar...");
        this.txtRuaCli.setText(null);
        this.txtTelefoneCli.setText(null);
        this.txtUfCli.setText(null);
        ClientView.txtIdCli.setText(null);
        ClientView.txtIdEndereco.setText(null);
    }

    // BOTÃO (LIMPAR) - CLICK
    private void btnLimparCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCliActionPerformed
        // 
        int limpar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja limpar os dados? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if (limpar == JOptionPane.YES_OPTION)
            this.limparCampos();
    }//GEN-LAST:event_btnLimparCliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCep;
    private javax.swing.JButton btnExcluirCli;
    private javax.swing.JButton btnLimparCli;
    private javax.swing.JButton btnPesqCli;
    private javax.swing.JButton btnSalvarCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtBairroCli;
    private javax.swing.JTextField txtCepCli;
    private javax.swing.JTextField txtCidadeCli;
    private javax.swing.JTextField txtComplementoCli;
    private javax.swing.JTextField txtEmailCli1;
    public static javax.swing.JTextField txtIdCli;
    public static javax.swing.JTextField txtIdEndereco;
    private javax.swing.JTextField txtNomeCli;
    private javax.swing.JTextField txtPesqClient;
    private javax.swing.JTextField txtRuaCli;
    private javax.swing.JTextField txtTelefoneCli;
    private javax.swing.JTextField txtUfCli;
    // End of variables declaration//GEN-END:variables
}
