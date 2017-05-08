/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookStore;

import java.util.ArrayList;
import javax.swing.JFrame;
public class loginWindow extends javax.swing.JFrame {
    
    public loginWindow() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        note = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 380));
        getContentPane().setLayout(null);

        login.setText("Login");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(180, 230, 190, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 100, 80, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 170, 80, 20);
        getContentPane().add(nameField);
        nameField.setBounds(180, 100, 190, 30);
        getContentPane().add(passwordField);
        passwordField.setBounds(180, 170, 190, 30);

        note.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        note.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(note);
        note.setBounds(210, 290, 170, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Book Store ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 280, 170, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookStore/images (2).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-2, -1, 440, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        String uname=nameField.getText();
        String pwd=String.copyValueOf(passwordField.getPassword());
       
         if("admin".compareTo(uname)==0 &&"1234".compareTo(pwd)==0){
            MainWindow menu=new MainWindow();
            menu.setTitle("Main Menu");
            menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
            //menu.setSize(640,800);
            menu.setVisible(true);
        }
        else note.setText("Incorrect Username or Password!");
    }//GEN-LAST:event_loginMouseClicked

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
            java.util.logging.Logger.getLogger(loginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton login;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel note;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
