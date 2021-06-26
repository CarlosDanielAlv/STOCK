/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLLER.UserController;
import MODEL.UserModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Carlo
 */
public class UserView extends javax.swing.JInternalFrame {

    UserController uc = new UserController();

    /**
     * Creates new form UserView
     */
    public UserView() {
        initComponents();
    }

    // MÉTODO PARA VALIDAR CAMPOS EM BRANCO.
    private boolean validaCampos() {
        return this.txtLoginUser.getText().isEmpty() || this.txtNomeUser.getText().isEmpty() || this.txtPerfilUser.getSelectedItem() == null || this.txtPerfilUser.getSelectedIndex() == 0 || this.txtSenhaUser.getText().isEmpty()
                || this.txtRepSenhaUser.getText().isEmpty();
    }

    // MÉTODO PARA VALIDAR SENHAS.
    private boolean validaSenhas() {
        String senha1 = new String(this.txtSenhaUser.getPassword());
        String senha2 = new String(this.txtRepSenhaUser.getPassword());

        return senha1.equals(senha2);
    }

    // MÉTODO PARA VALIDAR CAMPO PESQUISA
    public boolean validaPesquisa() {
        return this.txtPesqCli.getText().isEmpty();
    }

    // MÉTODO PARA LIMPAR TODOS OS CAMPOS
    public void limpaCampos() {
        this.txtLoginUser.setText(null);
        this.txtNomeUser.setText(null);
        this.txtPerfilUser.setSelectedItem(null);
        this.txtRepSenhaUser.setText(null);
        this.txtSenhaUser.setText(null);
        UserView.txtIdUser.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdUser = new javax.swing.JTextField();
        txtNomeUser = new javax.swing.JTextField();
        txtPerfilUser = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLoginUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnExcluirUser = new javax.swing.JButton();
        btnSalvarUser = new javax.swing.JButton();
        txtSenhaUser = new javax.swing.JPasswordField();
        txtRepSenhaUser = new javax.swing.JPasswordField();
        txtPesqCli = new javax.swing.JTextField();
        btnPesqCli = new javax.swing.JButton();
        btnLimparUser = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários");
        setPreferredSize(new java.awt.Dimension(1270, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(53, 99, 135));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/password.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detalhes do usuário");

        txtIdUser.setBackground(new java.awt.Color(255, 255, 204));
        txtIdUser.setForeground(new java.awt.Color(255, 0, 102));

        txtPerfilUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Admin", "Funcionario" }));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Perfil");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Digite novamente sua senha");

        btnExcluirUser.setBackground(new java.awt.Color(255, 102, 102));
        btnExcluirUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExcluirUser.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/lixeira.png"))); // NOI18N
        btnExcluirUser.setText("Excluir");
        btnExcluirUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUserActionPerformed(evt);
            }
        });

        btnSalvarUser.setBackground(new java.awt.Color(0, 153, 153));
        btnSalvarUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSalvarUser.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/bookmark.png"))); // NOI18N
        btnSalvarUser.setText("Salvar");
        btnSalvarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUserActionPerformed(evt);
            }
        });

        txtPesqCli.setText("Pesquisar....");
        txtPesqCli.setToolTipText("Faça uma busca através do login de um usuário");

        btnPesqCli.setBackground(new java.awt.Color(53, 99, 135));
        btnPesqCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/lupa-arredondada.png"))); // NOI18N
        btnPesqCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCliActionPerformed(evt);
            }
        });

        btnLimparUser.setBackground(new java.awt.Color(102, 204, 255));
        btnLimparUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLimparUser.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon/borracha.png"))); // NOI18N
        btnLimparUser.setText("Limpar");
        btnLimparUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(758, 758, 758)
                        .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(869, 869, 869)
                        .addComponent(txtPesqCli, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnPesqCli))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel3)
                        .addGap(345, 345, 345)
                        .addComponent(jLabel4)
                        .addGap(357, 357, 357)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(txtNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtPerfilUser, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(txtSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(txtRepSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnSalvarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimparUser, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirUser, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtPesqCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesqCli))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerfilUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addComponent(txtSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(txtRepSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 540));

        setBounds(0, 0, 1265, 570);
    }// </editor-fold>//GEN-END:initComponents

    // BOTÃO (SALVAR) - CLICK
    private void btnSalvarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUserActionPerformed
        // método salvar abaixo
        sair: // Em caso de erro de sistema venha sair.
        if (this.validaCampos()) { // Valida Campos Em Branco
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obritórios!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else if (!this.validaSenhas()) { // Valida Senhas
            JOptionPane.showMessageDialog(null, "As senhas devem ser iguais!!!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } else { // Salva o usuário
            try {
                String senha = new String(this.txtSenhaUser.getPassword());
                String idCli = UserView.txtIdUser.getText();
                // Tratamento de inserção
                if (idCli.equals("")) {
                    if (uc.verUser(this.txtLoginUser.getText())) {// Verificar se o usuário já existe
                        JOptionPane.showMessageDialog(null, "Já existe um usuário com este login, por favor tente novamente!!!");
                    } else {
                        if (!uc.manterUsuario(0, this.txtNomeUser.getText(), this.txtPerfilUser.getSelectedItem().toString(), this.txtLoginUser.getText(), senha)) {
                            JOptionPane.showMessageDialog(null, "Erro ao inserir um usuário no banco de dados, contate o suporte técnico", "MENSAGEM", JOptionPane.ERROR_MESSAGE);
                            break sair; // Ir para o sair
                        }
                        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!!!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    if (!uc.manterUsuario(Integer.parseInt(idCli), this.txtNomeUser.getText(), this.txtPerfilUser.getSelectedItem().toString(), this.txtLoginUser.getText(), senha)) {
                        JOptionPane.showMessageDialog(null, "Erro ao alterar um usuário no banco de dados, contate o suporte técnico", "MENSAGEM", JOptionPane.ERROR_MESSAGE);
                        break sair; // Ir para o sair
                    }
                    JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!!!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception error) {
                System.out.println("Erro ao manter o cliente: " + error.getMessage());
            }
        }
    }//GEN-LAST:event_btnSalvarUserActionPerformed

    // BOTÃO (PESQUISAR) - CLICK
    private void btnPesqCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCliActionPerformed
        // tudo a baixo é referente a ação do botão pesquisar.
        UserModel um;

        if (!this.validaPesquisa()) { // Se o campo estiver preenchido
            try {
                um = uc.getUser(this.txtPesqCli.getText());
                this.txtNomeUser.setText(um.getNome());             // NOME
                this.txtLoginUser.setText(um.getLogin());           // LOGIN
                this.txtPerfilUser.setSelectedItem(um.getPerfil()); // PERFIL
                this.txtSenhaUser.setText(um.getSenha());           // SENHA
                JOptionPane.showMessageDialog(null, "Busca realizada com sucesso!!!");
            } catch (Exception e) {
                System.out.println("erro ao fazer a busca: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha o campo pesquisa para realizar uma busca.", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPesqCliActionPerformed

    // BOTÃO (LIMPAR) - CLICK
    private void btnLimparUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparUserActionPerformed
        // O código abaixo limpa todos os campos
        int limpar = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja limpar os dados? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if (limpar == JOptionPane.YES_OPTION)
            this.limpaCampos();
    }//GEN-LAST:event_btnLimparUserActionPerformed

    // BOTÃO (EXCLUIR) - CLICK
    private void btnExcluirUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUserActionPerformed
        // Validação de campos
        if (this.validaPesquisa()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo pesquisa para realizar uma busca.", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
        } else if (UserView.txtIdUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Necessário realizar uma pesquisa de um usuário válido", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // código abaixo realiza a exclusão de um usuário
            try {
                int excluir = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o usuário? não será possível recuperar o mesmo. ", "Atenção", JOptionPane.YES_NO_OPTION);
                if (excluir == JOptionPane.YES_OPTION) {
                    if (uc.DeleteUser(Integer.parseInt(UserView.txtIdUser.getText()))) {
                        this.limpaCampos();
                        JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!!!", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (Exception e) {
                System.out.println("ERRO EXCLUIR: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Houve um problema na exclusão, entre em contato com desenvolvedor.", "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirUserActionPerformed

    public void setTxtNomeUser(JTextField txtNomeUser) {
        this.txtNomeUser = txtNomeUser;
    }

    public JTextField getTxtNomeUser() {
        return txtNomeUser;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirUser;
    private javax.swing.JButton btnLimparUser;
    private javax.swing.JButton btnPesqCli;
    private javax.swing.JButton btnSalvarUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtIdUser;
    private javax.swing.JTextField txtLoginUser;
    private javax.swing.JTextField txtNomeUser;
    private javax.swing.JComboBox<String> txtPerfilUser;
    private javax.swing.JTextField txtPesqCli;
    private javax.swing.JPasswordField txtRepSenhaUser;
    private javax.swing.JPasswordField txtSenhaUser;
    // End of variables declaration//GEN-END:variables
}
