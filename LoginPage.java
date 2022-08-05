/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// package dailyplanner;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

// import daily_planner.NewTask1;

/**
 *
 * @author DEEPTI SINGH
 */
public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    Connection con;
    PreparedStatement ps;;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        enter_username = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        enter_password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        Sign_up = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Heading.setBackground(new java.awt.Color(0, 0, 0));
        Heading.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 102));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("Daily Planner");

        jLabel1.setFont(new java.awt.Font("Segoe Script", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Login ");

        enter_username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        enter_username.setText("Enter username");
        enter_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enter_usernameMouseClicked(evt);
            }
        });

        username.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        username.setForeground(new java.awt.Color(153, 255, 255));
        username.setText("Username:");

        Password.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Password.setForeground(new java.awt.Color(153, 255, 255));
        Password.setText("Password:");

        enter_password.setText("jPasswordField1");
        enter_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enter_passwordMouseClicked(evt);
            }
        });

        login.setBackground(new java.awt.Color(204, 204, 0));
        login.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login.setText("Login");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
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

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEEPTI SINGH\\Downloads\\user-interface.png")); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 306,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(77, 214, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Password)
                                                        .addComponent(username))
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(enter_username,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 293,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(enter_password,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 293,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(285, 285, 285)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel1)))
                                .addGap(122, 122, 122))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 73,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sign_up, javax.swing.GroupLayout.PREFERRED_SIZE, 83,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(enter_username, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(enter_password, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(login)
                                        .addComponent(Sign_up))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(146, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(111, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {
        String name, password, pwd = "";
        name = enter_username.getText();
        password = new String(enter_password.getPassword());
        try {
            con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/daily_planner?user=root&password=Kingfisher@1");
            ps = con.prepareStatement("select password from login where username = ?");
            ps.setString(1, name);
            ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while (rs.next())
                pwd = rs.getString("password");
        } catch (SQLException ex) {
            Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (pwd.equals(password)) {
            NewTask main = new NewTask();
            main.setVisible(true);
            main.pack();
            this.dispose();
        } else if ("".equals(pwd))
            JOptionPane.showMessageDialog(this, "Invalid Username!!");
        else
            JOptionPane.showMessageDialog(this, "Incorrect password.\nTry again.");
    }

    private void enter_usernameMouseClicked(java.awt.event.MouseEvent evt) {
        enter_username.setText("");
    }

    private void enter_passwordMouseClicked(java.awt.event.MouseEvent evt) {
        enter_password.setText("");
    }

    private void Sign_upMouseClicked(java.awt.event.MouseEvent evt) {
        RegisterPage reg = new RegisterPage();
        reg.setVisible(true);
        reg.pack();
        this.dispose();
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel Password;
    private javax.swing.JButton Sign_up;
    private javax.swing.JPasswordField enter_password;
    public javax.swing.JTextField enter_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JLabel username;
    // End of variables declaration
}
