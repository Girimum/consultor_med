/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Mota
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadrastro = new javax.swing.JMenu();
        jMenuItemCadMedico = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemCadPaciente = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuFeramentas = new javax.swing.JMenu();
        jMenuItemBemVindos = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jMenuCadrastro.setText("Cadastro");

        jMenuItemCadMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/CadMedicos.png"))); // NOI18N
        jMenuItemCadMedico.setText("Médico");
        jMenuItemCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMedicoActionPerformed(evt);
            }
        });
        jMenuCadrastro.add(jMenuItemCadMedico);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/secretária.jpg"))); // NOI18N
        jMenuItem1.setText("Secretárias");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCadrastro.add(jMenuItem1);

        jMenuItemCadPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cadPacientes.png"))); // NOI18N
        jMenuItemCadPaciente.setText("Paciente");
        jMenuItemCadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadPacienteActionPerformed(evt);
            }
        });
        jMenuCadrastro.add(jMenuItemCadPaciente);

        jMenuBar1.add(jMenuCadrastro);

        jMenuRelatorio.setText("Relatorio");
        jMenuBar1.add(jMenuRelatorio);

        jMenuFeramentas.setText("Feramentas");

        jMenuItemBemVindos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/casa.jpg"))); // NOI18N
        jMenuItemBemVindos.setText("Inicio");
        jMenuItemBemVindos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBemVindosActionPerformed(evt);
            }
        });
        jMenuFeramentas.add(jMenuItemBemVindos);

        jMenuBar1.add(jMenuFeramentas);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(620, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMedicoActionPerformed
        FormMedico tela = new FormMedico();
        tela.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemCadMedicoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormSecretaria tela = new FormSecretaria ();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemCadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadPacienteActionPerformed
        FormPaciente tela = new FormPaciente();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemCadPacienteActionPerformed

    private void jMenuItemBemVindosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBemVindosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemBemVindosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadrastro;
    private javax.swing.JMenu jMenuFeramentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemBemVindos;
    private javax.swing.JMenuItem jMenuItemCadMedico;
    private javax.swing.JMenuItem jMenuItemCadPaciente;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
