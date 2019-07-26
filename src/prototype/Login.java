package prototype;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Login() {
        initComponents();
        conn = Signup.ConnectDb();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jTextFieldUsername = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jButtonsign = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(840, 710));
        setMinimumSize(new java.awt.Dimension(840, 710));
        setResizable(false);
        setSize(new java.awt.Dimension(840, 710));

        jPanel1.setBackground(new java.awt.Color(0, 8, 27));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Welcome.setFont(new java.awt.Font("URW Chancery L", 1, 36)); // NOI18N
        Welcome.setForeground(new java.awt.Color(254, 254, 254));
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setText("WELCOME");
        jPanel1.add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 240, 50));

        Username.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(230, 250, 249));
        Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username.setText("USERNAME");
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 280, 30));

        Password.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(230, 250, 249));
        Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Password.setText("PASSWORD");
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 280, 30));

        jPasswordFieldPassword.setBackground(new java.awt.Color(1, 2, 7));
        jPasswordFieldPassword.setForeground(new java.awt.Color(155, 195, 255));
        jPasswordFieldPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldPassword.setPreferredSize(new java.awt.Dimension(290, 35));
        jPanel1.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        jTextFieldUsername.setBackground(new java.awt.Color(1, 2, 7));
        jTextFieldUsername.setForeground(new java.awt.Color(155, 195, 255));
        jTextFieldUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUsername.setPreferredSize(new java.awt.Dimension(290, 35));
        jPanel1.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jButtonLogin.setBackground(new java.awt.Color(1, 7, 23));
        jButtonLogin.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(155, 195, 255));
        jButtonLogin.setText("LOGIN");
        jButtonLogin.setOpaque(true);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 100, 50));

        jButtonsign.setText("SIGNUP");
        jButtonsign.setPreferredSize(new java.awt.Dimension(85, 36));
        jButtonsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsignActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Jelly Fish.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 560, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //this method validates if the input information is correct then it allows you to open the software or deny you entrance
    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        String query = "select * from login where username=? and Passwordd=? ";

        try {

            int count = 0;

            pst = conn.prepareStatement(query);

            pst.setString(1, jTextFieldUsername.getText());
            pst.setString(2, jPasswordFieldPassword.getText());

            rs = pst.executeQuery();

            if (rs.next()) {

//if the inpute information is right, then you will see this message prompting you to proceed
                JOptionPane.showMessageDialog(null, "Username and Password are correct, please proceed");
                project pro = new project();
                pro.setVisible(true);
                dispose();

            } else {

//if the input information is wrong, the following statement will be output
                JOptionPane.showMessageDialog(null, "Oops Either Username or Password is incorrect, please try again");

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

// this method opens the signup page and closes the login page when the sigup button is pressed
    private void jButtonsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsignActionPerformed
        Signup sign = new Signup();
        sign.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButtonsignActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel Welcome;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonsign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
