/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetointegrador.clinicamedica.view;

import javax.swing.JOptionPane;
import projetointegrador.clinicamedica.controller.FuncionarioController;
import projetointegrador.clinicamedica.daos.ExceptionDAO;

/**
 *
 * @author Phabi
 */
public class TelaDeletarFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeletarFuncioanrio
     */
    public TelaDeletarFuncionario() {
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

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelDigiteID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jButtonDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deletar Funcionário");
        setResizable(false);

        jPanelTitulo.setBackground(new java.awt.Color(51, 51, 51));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Deletar Funcionário");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(86, 86, 86))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelTitulo)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabelDigiteID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelDigiteID.setText("Digite o ID do funcionário");

        jTextFieldID.setText("0");
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jButtonDeletar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonDeletar.setText("DELETAR");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelDigiteID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldID)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButtonDeletar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDigiteID)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
       boolean sucesso;
       FuncionarioController funcionarioController = new FuncionarioController();
       try{
            sucesso = funcionarioController.apagarFuncionario(Integer.parseInt(jTextFieldID.getText()));
            if (sucesso){
               JOptionPane.showMessageDialog(null,"O funcionário foi deletado com sucesso");
            }else{
               JOptionPane.showMessageDialog(null,"Id Inválido, verifique o ID digitado");
            }
        }catch(ExceptionDAO e1){
           JOptionPane.showMessageDialog(null,"Erro:" + e1);
        }    
    }//GEN-LAST:event_jButtonDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeletarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeletarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeletarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeletarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeletarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JLabel jLabelDigiteID;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}