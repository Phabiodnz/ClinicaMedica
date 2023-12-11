/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetointegrador.clinicamedica.view;

/**
 *
 * @author Phabi
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        retanguloTitulo = new javax.swing.JPanel();
        jlabelTitulo = new javax.swing.JLabel();
        jButtonMedico = new javax.swing.JButton();
        jlabelLogin = new javax.swing.JLabel();
        jtxtLogin = new javax.swing.JTextField();
        jlabelSenha = new javax.swing.JLabel();
        jButtonFuncionario = new javax.swing.JButton();
        jLabelFuncao = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinica Médica");
        setResizable(false);

        retanguloTitulo.setBackground(new java.awt.Color(51, 51, 51));

        jlabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlabelTitulo.setText("Clinica Médica");

        javax.swing.GroupLayout retanguloTituloLayout = new javax.swing.GroupLayout(retanguloTitulo);
        retanguloTitulo.setLayout(retanguloTituloLayout);
        retanguloTituloLayout.setHorizontalGroup(
            retanguloTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retanguloTituloLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jlabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        retanguloTituloLayout.setVerticalGroup(
            retanguloTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retanguloTituloLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonMedico.setBackground(new java.awt.Color(51, 204, 255));
        jButtonMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonMedico.setText("Médico");
        jButtonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedicoActionPerformed(evt);
            }
        });

        jlabelLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabelLogin.setText("Login");

        jtxtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtLoginActionPerformed(evt);
            }
        });

        jlabelSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabelSenha.setText("Senha");

        jButtonFuncionario.setBackground(new java.awt.Color(255, 51, 51));
        jButtonFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonFuncionario.setText("Funcionário");
        jButtonFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFuncionarioActionPerformed(evt);
            }
        });

        jLabelFuncao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelFuncao.setForeground(new java.awt.Color(255, 0, 51));
        jLabelFuncao.setText("ESCOLHA SUA FUNÇÃO ABAIXO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(retanguloTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlabelSenha)
                    .addComponent(jlabelLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelFuncao)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonFuncionario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtxtLogin)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(retanguloTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelLogin)
                    .addComponent(jtxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelSenha)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelFuncao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMedicoActionPerformed

    private void jtxtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtLoginActionPerformed

    private void jButtonFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFuncionario;
    private javax.swing.JButton jButtonMedico;
    private javax.swing.JLabel jLabelFuncao;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JLabel jlabelLogin;
    private javax.swing.JLabel jlabelSenha;
    private javax.swing.JLabel jlabelTitulo;
    private javax.swing.JTextField jtxtLogin;
    private javax.swing.JPanel retanguloTitulo;
    // End of variables declaration//GEN-END:variables
}
