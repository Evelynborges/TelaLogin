/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Nelmecc
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

        jButtonENTRAR = new javax.swing.JButton();
        jButtonSAIR = new javax.swing.JButton();
        lblUSUARIO = new javax.swing.JLabel();
        lblSENHA = new javax.swing.JLabel();
        jTextFieldUSUARIO = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelChaveLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FUNDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonENTRAR.setText("Entrar");
        jButtonENTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonENTRARActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonENTRAR);
        jButtonENTRAR.setBounds(290, 160, 63, 23);

        jButtonSAIR.setText("Sair");
        jButtonSAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSAIRActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSAIR);
        jButtonSAIR.setBounds(380, 160, 73, 23);

        lblUSUARIO.setText("Usuário:");
        getContentPane().add(lblUSUARIO);
        lblUSUARIO.setBounds(270, 80, 50, 14);

        lblSENHA.setText("Senha:");
        getContentPane().add(lblSENHA);
        lblSENHA.setBounds(270, 110, 60, 20);

        jTextFieldUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUSUARIOActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUSUARIO);
        jTextFieldUSUARIO.setBounds(320, 80, 80, 20);

        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        jPasswordFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(320, 110, 80, 20);

        jLabelChaveLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Chave 2.png"))); // NOI18N
        getContentPane().add(jLabelChaveLogin);
        jLabelChaveLogin.setBounds(0, 20, 240, 260);

        jLabel2.setFont(new java.awt.Font("Perpetua", 3, 18)); // NOI18N
        jLabel2.setText("Marmoraria Software");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 20, 160, 30);

        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDO.png"))); // NOI18N
        getContentPane().add(FUNDO);
        FUNDO.setBounds(-10, -20, 510, 330);

        setSize(new java.awt.Dimension(483, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUSUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUSUARIOActionPerformed

    private void jButtonENTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonENTRARActionPerformed
        if (jTextFieldUSUARIO.getText().equals ("Evelyn") && jPasswordFieldSenha.getText().equals("123")){
            TelaPrincipal tela = new TelaPrincipal ();
            tela.setVisible(true);
            dispose ();
        }
        else{
           JOptionPane.showMessageDialog(rootPane, "Acesso Negado!");    
        }
    }//GEN-LAST:event_jButtonENTRARActionPerformed

    private void jButtonSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSAIRActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButtonSAIRActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed


    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jPasswordFieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
           if (jTextFieldUSUARIO.getText().equals ("Evelyn") && jPasswordFieldSenha.getText().equals("123")){
              TelaPrincipal tela = new TelaPrincipal ();
              tela.setVisible(true);
                dispose ();
           }
           else{
              JOptionPane.showMessageDialog(rootPane, "Acesso Negado!");    
        }                                  

    }//GEN-LAST:event_jPasswordFieldSenhaKeyPressed

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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JLabel FUNDO;
    private javax.swing.JButton jButtonENTRAR;
    private javax.swing.JButton jButtonSAIR;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelChaveLogin;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUSUARIO;
    private javax.swing.JLabel lblSENHA;
    private javax.swing.JLabel lblUSUARIO;
    // End of variables declaration//GEN-END:variables
}
