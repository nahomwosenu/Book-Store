package bookStore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nahom
 */
public class Book extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public Book() {
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

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lectureTable = new javax.swing.JTable();
        totalBooks = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        answerLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Book Borrowing System Home");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 20, 300, 30);

        String[][] list=bookStore.BookStore.getBookDetails();
        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            list,
            new String [] {
                "ISBN", "Title", "Author", "Price","Quantity","numberOfPages","Copies Left"
            }
        ));
        jScrollPane1.setViewportView(bookTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 100, 570, 140);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Number of books:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 420, 130, 20);

        String[][] list2=bookStore.BookStore.getBorrowList();
        lectureTable.setModel(new javax.swing.table.DefaultTableModel(
            list2,
            new String [] {
                "Lecture Name", "Book Title","Date Taken","Date to be Returned"
            }
        ));
        lectureTable.setOpaque(false);
        jScrollPane2.setViewportView(lectureTable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 240, 570, 160);

        int x=bookStore.BookStore.getNumberofBooks();
        String r=String.valueOf(x);
        totalBooks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalBooks.setForeground(new java.awt.Color(51, 0, 0));
        getContentPane().add(totalBooks);
        totalBooks.setBounds(260, 420, 90, 20);
        totalBooks.setText(r);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Total Number of users/Lectures: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 460, 230, 30);

        String S=String.valueOf(bookStore.BookStore.getTotalNumberOfLectures());
        jLabel4.setText(S);
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 470, 80, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Total Number of books Borrowed:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(3, 490, 237, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 490, 0, 0);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("Total Number of Books Available:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 530, 230, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(270, 530, 0, 0);

        String borrow=String.valueOf(bookStore.BookStore.getTotalNumberBooksBorrowed());
        jLabel9.setText(borrow);
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(250, 500, 80, 0);

        int count=bookStore.BookStore.getNumberofBooks()-bookStore.BookStore.getTotalNumberBooksBorrowed();
        String count2=String.valueOf(count);
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 530, 60, 0);

        String ans=String.valueOf(bookStore.BookStore.getTotalNumberBooksBorrowed());
        answerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        answerLabel.setText(ans);
        answerLabel.setForeground(new java.awt.Color(255, 255, 204));
        getContentPane().add(answerLabel);
        answerLabel.setBounds(260, 500, 80, 0);

        backgroundLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backgroundLabel.setForeground(new java.awt.Color(255, 255, 51));
        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/borrowing/system/pkgfinal/book2.jpg"))); // NOI18N
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, -20, 770, 730);

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(260, 500, 130, 14);

        jMenu1.setText("Menu");

        jMenu3.setText("Add New Book");
        jMenu1.add(jMenu3);

        jMenuItem2.setText("Borrow Books");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Return Books");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerLabel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JTable bookTable;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lectureTable;
    private javax.swing.JLabel totalBooks;
    // End of variables declaration//GEN-END:variables
}
