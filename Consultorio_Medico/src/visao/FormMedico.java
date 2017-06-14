/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import modeloBeans.BeansMed;
import modeloDao.ControleMedico;
import modeloConection.conexaoBD;
/**
 *
 * @author Usuario-pc
 */
public class FormMedico extends javax.swing.JFrame {

    BeansMed mod = new BeansMed();
    ControleMedico control = new ControleMedico();
    conexaoBD conex = new conexaoBD();
    
    public FormMedico() {
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

        jFormattedTextFieldNome = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldRG = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMedico = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldFoneTeleF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordFieldSenhaMed = new javax.swing.JPasswordField();
        jFormattedTextFieldRG = new javax.swing.JFormattedTextField();
        jComboBoxSexo = new javax.swing.JComboBox<String>();
        jButtonCancela = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadrastro = new javax.swing.JMenu();
        jMenuItemCadMedico = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemCadPaciente = new javax.swing.JMenuItem();
        jMenuItemCadCovenio = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuFeramentas = new javax.swing.JMenu();
        jMenuItemBemVindos = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setEnabled(false);

        jLabel2.setText("Nome:");

        jLabel4.setText("Sexo:");

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.setEnabled(false);
        jFormattedTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCPFActionPerformed(evt);
            }
        });

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);

        jTableMedico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableMedico);

        jLabel5.setText("CPF:");

        jLabel6.setText("RG:");

        jLabel7.setText("Telefone:");

        jTextFieldFoneTeleF.setEnabled(false);

        jLabel8.setText("Endereço:");

        jTextFieldEndereco.setEnabled(false);

        jLabel9.setText("Senha de Acesso:");

        jPasswordFieldSenhaMed.setEnabled(false);
        jPasswordFieldSenhaMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaMedActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRG.setEnabled(false);

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F", " " }));
        jComboBoxSexo.setEnabled(false);
        jComboBoxSexo.setName(""); // NOI18N
        jComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexoActionPerformed(evt);
            }
        });

        jButtonCancela.setText("Cancela");
        jButtonCancela.setEnabled(false);
        jButtonCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(jButtonCancela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(2, 2, 2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(jFormattedTextFieldRG))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldFoneTeleF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPasswordFieldSenhaMed))))
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldFoneTeleF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jPasswordFieldSenhaMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addGap(40, 40, 40)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Médicos");

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

        jMenuItemCadCovenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/convenios.png"))); // NOI18N
        jMenuItemCadCovenio.setText("Convênio");
        jMenuItemCadCovenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadCovenioActionPerformed(evt);
            }
        });
        jMenuCadrastro.add(jMenuItemCadCovenio);

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

        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Sair.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(698, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jPasswordFieldSenhaMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaMedActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        mod.setNome(jTextFieldNome.getText());
        mod.setSexo((String) jComboBoxSexo.getSelectedItem());
        mod.getcpf(jFormattedTextFieldCPF.getText());
        mod.getRg(jFormattedTextFieldRG.getText());
        mod.setTelefone(jTextFieldFoneTeleF.getText());
        mod.setEndereco(jTextFieldEndereco.getText());
        mod.setSexo((String) jComboBoxSexo.getSelectedItem());
        mod.getSenha(jPasswordFieldSenhaMed.getText());
        control.Salvar(mod); 
        jTextFieldNome.setText("");
        jFormattedTextFieldCPF.setText("");
        jFormattedTextFieldRG.setText("");
        jTextFieldFoneTeleF.setText("");
        jTextFieldEndereco.setText("");
        
         jTextFieldNome.setEnabled(false);
         jFormattedTextFieldCPF.setEnabled(false);
         jFormattedTextFieldRG.setEnabled(false);
         jComboBoxSexo.setEnabled(false);
         jTextFieldFoneTeleF.setEnabled(false);
         jTextFieldEndereco.setEnabled(false);
         jButtonSalvar.setEnabled(false);
        
       
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jFormattedTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCPFActionPerformed

    private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSexoActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jButtonSalvar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCPF.setEnabled(true);
        jFormattedTextFieldRG.setEnabled(true);
        jComboBoxSexo.setEnabled(true);
        jTextFieldFoneTeleF.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jPasswordFieldSenhaMed.setEnabled(true);
        jButtonCancela.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jMenuItemCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMedicoActionPerformed
        FormMedico tela = new FormMedico();
        tela.setVisible(true);
        dispose();
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

    private void jMenuItemCadCovenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadCovenioActionPerformed
        FormConvenio tela = new FormConvenio();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemCadCovenioActionPerformed

    private void jMenuItemBemVindosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBemVindosActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemBemVindosActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButtonCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelaActionPerformed
        jButtonSalvar.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        jFormattedTextFieldCPF.setEnabled(!true);
        jFormattedTextFieldRG.setEnabled(!true);
        jComboBoxSexo.setEnabled(!true);
        jTextFieldFoneTeleF.setEnabled(!true);
        jTextFieldEndereco.setEnabled(!true);
        jPasswordFieldSenhaMed.setEnabled(!true);
        jButtonCancela.setEnabled(!true);
          jButtonSalvar.setEnabled(!true);
          
         jTextFieldNome.setEnabled(false);
         jFormattedTextFieldCPF.setEnabled(false);
         jFormattedTextFieldRG.setEnabled(false);
         jComboBoxSexo.setEnabled(false);
         jTextFieldFoneTeleF.setEnabled(false);
         jTextFieldEndereco.setEnabled(false);
         jButtonSalvar.setEnabled(false);
        
    }//GEN-LAST:event_jButtonCancelaActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        jButtonSalvar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCPF.setEnabled(true);
        jFormattedTextFieldRG.setEnabled(true);
        jComboBoxSexo.setEnabled(true);
        jTextFieldFoneTeleF.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jPasswordFieldSenhaMed.setEnabled(true);
        jButtonCancela.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

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
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormMedico().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancela;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldNome;
    private javax.swing.JFormattedTextField jFormattedTextFieldRG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadrastro;
    private javax.swing.JMenu jMenuFeramentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemBemVindos;
    private javax.swing.JMenuItem jMenuItemCadCovenio;
    private javax.swing.JMenuItem jMenuItemCadMedico;
    private javax.swing.JMenuItem jMenuItemCadPaciente;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSenhaMed;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableMedico;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldFoneTeleF;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRG;
    // End of variables declaration//GEN-END:variables
}
