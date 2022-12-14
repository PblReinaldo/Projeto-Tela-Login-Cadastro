/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacelogin;

import controller.TelaCadastroController;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author só estudos calma
 */
public class TelaCadastro extends javax.swing.JFrame {

    private final TelaCadastroController controller;

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
        controller = new TelaCadastroController(this);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSenhaCd = new javax.swing.JPasswordField();
        txtUsuarioCd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ckMostrarSenhaCd = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(txtSenhaCd);
        txtSenhaCd.setBounds(140, 160, 120, 30);
        getContentPane().add(txtUsuarioCd);
        txtUsuarioCd.setBounds(140, 100, 120, 30);

        jLabel2.setText("Nome de usuário");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 70, 125, 16);

        jLabel3.setText("Senha");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 140, 60, 16);

        ckMostrarSenhaCd.setText("Mostrar senha");
        ckMostrarSenhaCd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckMostrarSenhaCdActionPerformed(evt);
            }
        });
        getContentPane().add(ckMostrarSenhaCd);
        ckMostrarSenhaCd.setBounds(140, 200, 125, 20);

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 240, 98, 40);

        setSize(new java.awt.Dimension(416, 326));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        controller.SaveUser();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ckMostrarSenhaCdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckMostrarSenhaCdActionPerformed
        // TODO add your handling code here:
        if(ckMostrarSenhaCd.isSelected())
            txtSenhaCd.setEchoChar('\u0000');
        else
            txtSenhaCd.setEchoChar('\u2022');
        
    }//GEN-LAST:event_ckMostrarSenhaCdActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    public JPasswordField getTxtSenhaCd() {
        return txtSenhaCd;
    }

    public void setTxtSenhaCd(JPasswordField txtSenhaCd) {
        this.txtSenhaCd = txtSenhaCd;
    }

    public JTextField getTxtUsuarioCd() {
        return txtUsuarioCd;
    }

    public void setTxtUsuarioCd(JTextField txtUsuarioCd) {
        this.txtUsuarioCd = txtUsuarioCd;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ckMostrarSenhaCd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtSenhaCd;
    private javax.swing.JTextField txtUsuarioCd;
    // End of variables declaration//GEN-END:variables
}
