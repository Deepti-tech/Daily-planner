/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// package dailyplanner;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DEEPTI SINGH
 */
public class RegisterPage extends javax.swing.JFrame {

    public RegisterPage() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    Connection con;
    PreparedStatement ps;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        enter_username = new javax.swing.JTextField();
        Heading4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username4 = new javax.swing.JLabel();
        Password4 = new javax.swing.JLabel();
        enter_password = new javax.swing.JPasswordField();
        Sign_up = new javax.swing.JButton();
        confirm_password = new javax.swing.JLabel();
        enter_confirm_password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(703, 396));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        enter_username.setText("Enter username");
        enter_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enter_usernameMouseClicked(evt);
            }
        });

        Heading4.setBackground(new java.awt.Color(0, 0, 0));
        Heading4.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        Heading4.setForeground(new java.awt.Color(255, 255, 102));
        Heading4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading4.setText("Daily Planner");

        jLabel5.setFont(new java.awt.Font("Segoe Script", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Registration");

        username4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        username4.setForeground(new java.awt.Color(153, 255, 255));
        username4.setText("Username:");

        Password4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Password4.setForeground(new java.awt.Color(153, 255, 255));
        Password4.setText("Password:");

        enter_password.setText("jPasswordField1");
        enter_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enter_passwordMouseClicked(evt);
            }
        });

        Sign_up.setBackground(new java.awt.Color(204, 204, 0));
        Sign_up.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Sign_up.setText("Sign up");
        Sign_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sign_upMouseClicked(evt);
            }
        });

        confirm_password.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        confirm_password.setForeground(new java.awt.Color(153, 255, 255));
        confirm_password.setText("Confirm Password:");

        enter_confirm_password.setText("jPasswordField1");
        enter_confirm_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enter_confirm_passwordMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEEPTI SINGH\\Downloads\\online-registration.png")); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap(161, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Sign_up, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Password4)
                                                        .addComponent(confirm_password)
                                                        .addComponent(username4))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel5Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(enter_confirm_password,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 293,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(enter_password,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 293,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(enter_username,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 293,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(106, 106, 106)))
                                .addGap(105, 105, 105))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(246, 246, 246)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(281, 281, 281)
                                                .addComponent(Heading4, javax.swing.GroupLayout.PREFERRED_SIZE, 306,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(Heading4, javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31,
                                        Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(username4, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(enter_username, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel5Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Password4, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(enter_password))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(enter_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Sign_up)
                                .addContainerGap()));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(100, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(72, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE));

        pack();
    }// </editor-fold>

    private void enter_usernameMouseClicked(java.awt.event.MouseEvent evt) {
        enter_username.setText("");
    }

    private void enter_passwordMouseClicked(java.awt.event.MouseEvent evt) {
        enter_password.setText("");
    }

    private void enter_confirm_passwordMouseClicked(java.awt.event.MouseEvent evt) {
        enter_confirm_password.setText("");
    }

    private void Sign_upMouseClicked(java.awt.event.MouseEvent evt) {
        String name, password, confirmpwd;
        name = enter_username.getText();
        password = new String(enter_password.getPassword());
        confirmpwd = new String(enter_confirm_password.getPassword());
        try {
            if (confirmpwd.equals(password)) {
                con = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/daily_planner?user=root&password=Kingfisher@1");
                ps = con.prepareStatement("insert into login values (?,?) ");
                ps.setString(1, name);
                ps.setString(2, password);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Account created successfully!");
                MainPage main = new MainPage();
                main.setVisible(true);
                main.pack();
                this.dispose();
            } else
                JOptionPane.showMessageDialog(this, "Passwords are different.");
        } catch (SQLException ex) {
            Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Heading4;
    private javax.swing.JLabel Password4;
    private javax.swing.JButton Sign_up;
    private javax.swing.JLabel confirm_password;
    private javax.swing.JPasswordField enter_confirm_password;
    private javax.swing.JPasswordField enter_password;
    public javax.swing.JTextField enter_username;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel5;
    private javax.swing.JLabel username4;
    // End of variables declaration
}
