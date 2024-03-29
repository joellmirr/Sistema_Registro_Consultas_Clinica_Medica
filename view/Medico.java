/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.MedicoDao;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import model.MedicoM;

/**
 *
 * @author joelmir
 */
public class Medico extends javax.swing.JInternalFrame {
    MedicoDao Mdao =new MedicoDao() {};
    
    public Medico() {
        initComponents();
               
        // Desabilitar o JTextField
        //jTextField_codigo_.setEnabled(false);
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
        jLabel_tituloMedico = new javax.swing.JLabel();
        jLabel_nome = new javax.swing.JLabel();
        jLabel2_cpf = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        jLabel_endereco = new javax.swing.JLabel();
        jTextField_nome = new javax.swing.JTextField();
        jTextField_cpf = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_endereco = new javax.swing.JTextArea();
        jButton_Cadastar_ = new javax.swing.JButton();
        jButton_limpar_ = new javax.swing.JButton();
        jLabel_telefone = new javax.swing.JLabel();
        jTextField_telefone = new javax.swing.JTextField();
        jButton_sair_ = new javax.swing.JButton();
        jLabel_crm = new javax.swing.JLabel();
        jLabel_especialidade = new javax.swing.JLabel();
        jTextField_crm = new javax.swing.JTextField();
        jTextField_especialidade = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setTitle("Cadastro Medico");
        setToolTipText("");

        jPanel1.setToolTipText("Cadsatro Cliente");

        jLabel_tituloMedico.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel_tituloMedico.setText("Cadastrar Medico:");

        jLabel_nome.setText("Nome:");

        jLabel2_cpf.setText("CPF:");

        jLabel_email.setText("Email:");

        jLabel_endereco.setText("Endereco:");

        jTextArea_endereco.setColumns(20);
        jTextArea_endereco.setRows(5);
        jScrollPane1.setViewportView(jTextArea_endereco);

        jButton_Cadastar_.setText("Cadastrar ");
        jButton_Cadastar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cadastar_ActionPerformed(evt);
            }
        });

        jButton_limpar_.setText("Limpar");
        jButton_limpar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpar_ActionPerformed(evt);
            }
        });

        jLabel_telefone.setText("Telefone:");

        jButton_sair_.setText("Sair");
        jButton_sair_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sair_ActionPerformed(evt);
            }
        });

        jLabel_crm.setText("CRM:");

        jLabel_especialidade.setText("Especialidade:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_tituloMedico)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2_cpf)
                            .addComponent(jLabel_nome)
                            .addComponent(jLabel_email)
                            .addComponent(jLabel_telefone)
                            .addComponent(jLabel_endereco)
                            .addComponent(jLabel_crm)
                            .addComponent(jLabel_especialidade))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Cadastar_, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(jButton_limpar_, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jButton_sair_, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                                .addComponent(jTextField_cpf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_telefone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_nome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_email, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                                .addComponent(jTextField_crm, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_especialidade, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(139, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_tituloMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nome)
                    .addComponent(jTextField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2_cpf)
                    .addComponent(jTextField_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_crm)
                    .addComponent(jTextField_crm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_especialidade)
                    .addComponent(jTextField_especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_email))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_telefone)
                    .addComponent(jTextField_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_endereco))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_limpar_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_sair_)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton_Cadastar_, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(274, 274, 274))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_sair_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sair_ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton_sair_ActionPerformed

    private void jButton_limpar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpar_ActionPerformed
    this.limpar();
        
    }//GEN-LAST:event_jButton_limpar_ActionPerformed

    private void jButton_Cadastar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cadastar_ActionPerformed
        MedicoM m = this.MontarMedico();
        Mdao.inserir(m);
        
        limpar();
        // Desabilitar o JTextField
        //jTextField_codigo_.setEnabled(false);

    }//GEN-LAST:event_jButton_Cadastar_ActionPerformed

        public void limpar(){
            jTextField_nome.setText("");
            jTextField_cpf.setText("");
            jTextField_crm.setText("");
            jTextField_especialidade.setText("");
            jTextField_email.setText("");
            jTextField_telefone.setText("");
            jTextArea_endereco.setText("");
            //jComboBox_nivelAscesso.removeAllItems();
        }
        
        public MedicoM MontarMedico(){
            
            MedicoM m = new MedicoM();
            m.setNome(jTextField_nome.getText());
            m.setCpf(jTextField_cpf.getText());
            m.setCrm(jTextField_crm.getText());
            m.setEspecialidade(jTextField_especialidade.getText());
            m.setEmail(jTextField_email.getText());
            m.setTelefone(jTextField_telefone.getText());
            m.setEndereco(jTextArea_endereco.getText());
            return m;
            
        }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cadastar_;
    private javax.swing.JButton jButton_limpar_;
    private javax.swing.JButton jButton_sair_;
    private javax.swing.JLabel jLabel2_cpf;
    private javax.swing.JLabel jLabel_crm;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_endereco;
    private javax.swing.JLabel jLabel_especialidade;
    private javax.swing.JLabel jLabel_nome;
    private javax.swing.JLabel jLabel_telefone;
    private javax.swing.JLabel jLabel_tituloMedico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_endereco;
    private javax.swing.JTextField jTextField_cpf;
    private javax.swing.JTextField jTextField_crm;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_especialidade;
    private javax.swing.JTextField jTextField_nome;
    private javax.swing.JTextField jTextField_telefone;
    // End of variables declaration//GEN-END:variables
}
