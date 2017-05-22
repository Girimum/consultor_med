/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;

/**
 *
 * @author Mota
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();
        jButtonEnviar = new javax.swing.JButton();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fundotelaLogin.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/login.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 30, 260, 230);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(210, 290, 60, 20);

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(220, 330, 60, 20);

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(270, 290, 120, 20);

        jButtonSair.setText("Sair");
        jButtonSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(190, 380, 70, 19);

        jButtonEnviar.setText("Enviar");
        jButtonEnviar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEnviar);
        jButtonEnviar.setBounds(330, 380, 80, 19);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(270, 330, 120, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo1_1.png"))); // NOI18N
        jLabel1.setToolTipText("Girimun");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 400, 77, 80);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fund.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 630, 480);

        setSize(new java.awt.Dimension(648, 517));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
  if(jTextFieldUsuario.getText().equals("") && jPasswordFieldSenha.getText().equals("")  ){
      JOptionPane.showMessageDialog(rootPane,"Bem Vindo Cliente !");
       TelaPrincipal tela = new TelaPrincipal();
       tela.setVisible(true);
       dispose();
          
      } else {
           JOptionPane.showMessageDialog(rootPane,"Senha ou Usuario Invalidos!");
       }
  
    }//GEN-LAST:event_jButtonEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}