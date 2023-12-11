/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetointegrador.clinicamedica.view;
import javax.swing.JOptionPane;
import projetointegrador.clinicamedica.controller.FuncionarioController;

/**
 *
 * @author Phabi
 */
public class TelaCadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaCadastroFuncionario() {
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
        jlabelNome = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        jlabelRG = new javax.swing.JLabel();
        jtxtRG = new javax.swing.JTextField();
        jlabelCPF = new javax.swing.JLabel();
        jtxtCPF = new javax.swing.JTextField();
        jlabelEndereco = new javax.swing.JLabel();
        jtxtEndereco = new javax.swing.JTextField();
        jlabelNumero = new javax.swing.JLabel();
        jtxtNumero = new javax.swing.JTextField();
        jlabelBairro = new javax.swing.JLabel();
        jtxtBairro = new javax.swing.JTextField();
        jlabelCidade = new javax.swing.JLabel();
        jtxtCidade = new javax.swing.JTextField();
        jlabelEstado = new javax.swing.JLabel();
        jtxtEstado = new javax.swing.JTextField();
        jlabelTelefone = new javax.swing.JLabel();
        jtxtTelefone = new javax.swing.JTextField();
        jlabelData = new javax.swing.JLabel();
        jformtxtData = new javax.swing.JFormattedTextField();
        jButtonCadastro = new javax.swing.JButton();
        jlabelData1 = new javax.swing.JLabel();
        jtxtSexo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        retanguloTitulo.setBackground(new java.awt.Color(51, 51, 51));

        jlabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlabelTitulo.setText("Cadastro Funcionário");

        javax.swing.GroupLayout retanguloTituloLayout = new javax.swing.GroupLayout(retanguloTitulo);
        retanguloTitulo.setLayout(retanguloTituloLayout);
        retanguloTituloLayout.setHorizontalGroup(
            retanguloTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retanguloTituloLayout.createSequentialGroup()
                .addGap(73, 73, 73)
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

        jlabelNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabelNome.setText("Nome Completo");

        jtxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNomeActionPerformed(evt);
            }
        });

        jlabelRG.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabelRG.setText("RG");

        jtxtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRGActionPerformed(evt);
            }
        });

        jlabelCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabelCPF.setText("CPF");

        jlabelEndereco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabelEndereco.setText("Endereço");

        jtxtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEnderecoActionPerformed(evt);
            }
        });

        jlabelNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabelNumero.setText("Número");

        jtxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNumeroActionPerformed(evt);
            }
        });

        jlabelBairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabelBairro.setText("Bairro");

        jlabelCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabelCidade.setText("Cidade");

        jlabelEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabelEstado.setText("Estado");

        jlabelTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabelTelefone.setText("Telefone");

        jlabelData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabelData.setText("Data de Nascimento");

        try {
            jformtxtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonCadastro.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCadastro.setText("CADASTRAR");
        jButtonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroActionPerformed(evt);
            }
        });

        jlabelData1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabelData1.setText("Sexo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(retanguloTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jButtonCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlabelEndereco)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtxtEndereco))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlabelRG)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jlabelCPF)
                            .addGap(18, 18, 18)
                            .addComponent(jtxtCPF))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlabelNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlabelNumero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jlabelBairro))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlabelCidade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtxtCidade)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtBairro)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlabelEstado)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtxtEstado))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlabelData1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtxtSexo))
                                .addComponent(jlabelData))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jformtxtData, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlabelTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtTelefone)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(retanguloTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelNome)
                    .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelRG)
                    .addComponent(jtxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelCPF)
                    .addComponent(jtxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelEndereco)
                    .addComponent(jtxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelNumero)
                    .addComponent(jtxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelBairro)
                    .addComponent(jtxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelCidade)
                    .addComponent(jtxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelEstado)
                    .addComponent(jtxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelTelefone)
                    .addComponent(jtxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelData)
                    .addComponent(jformtxtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelData1)
                    .addComponent(jtxtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButtonCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNomeActionPerformed

    private void jtxtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRGActionPerformed

    private void jtxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNumeroActionPerformed

    private void jtxtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEnderecoActionPerformed

    private void jButtonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroActionPerformed
        boolean sucesso;
        
        try{
            FuncionarioController funcionarioController = new FuncionarioController();
            sucesso = funcionarioController.cadastrarFuncionario(jtxtNome.getText(), jtxtRG.getText(),jtxtCPF.getText(), jtxtEndereco.getText(), jtxtNumero.getText(), 
                    jtxtBairro.getText(),  jtxtCidade.getText(), jtxtEstado.getText(), jtxtTelefone.getText(), jformtxtData.getText(), jtxtSexo.getText());
            if(sucesso){
                JOptionPane.showMessageDialog(null,"O cadastro foi realizado com sucesso");
                }else{
                JOptionPane.showMessageDialog(null,"Os campos não foram preenchidos corretamente");
            }
        }catch (Exception erro){
            JOptionPane.showMessageDialog(null,"Erro:" + erro);
        }
    }//GEN-LAST:event_jButtonCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastro;
    private javax.swing.JFormattedTextField jformtxtData;
    private javax.swing.JLabel jlabelBairro;
    private javax.swing.JLabel jlabelCPF;
    private javax.swing.JLabel jlabelCidade;
    private javax.swing.JLabel jlabelData;
    private javax.swing.JLabel jlabelData1;
    private javax.swing.JLabel jlabelEndereco;
    private javax.swing.JLabel jlabelEstado;
    private javax.swing.JLabel jlabelNome;
    private javax.swing.JLabel jlabelNumero;
    private javax.swing.JLabel jlabelRG;
    private javax.swing.JLabel jlabelTelefone;
    private javax.swing.JLabel jlabelTitulo;
    private javax.swing.JTextField jtxtBairro;
    private javax.swing.JTextField jtxtCPF;
    private javax.swing.JTextField jtxtCidade;
    private javax.swing.JTextField jtxtEndereco;
    private javax.swing.JTextField jtxtEstado;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JTextField jtxtNumero;
    private javax.swing.JTextField jtxtRG;
    private javax.swing.JTextField jtxtSexo;
    private javax.swing.JTextField jtxtTelefone;
    private javax.swing.JPanel retanguloTitulo;
    // End of variables declaration//GEN-END:variables
}
