package prototype;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Signup extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Signup() {
        initComponents();
        conn = Signup.ConnectDb();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        surname = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        Department = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        masterpassword = new javax.swing.JLabel();
        phonenumber1 = new javax.swing.JLabel();
        jButtonSignup = new javax.swing.JButton();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jTextFieldDepartment = new javax.swing.JTextField();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldSurname = new javax.swing.JTextField();
        jButtonlog = new javax.swing.JButton();
        jTextFieldUsername = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        jTextFieldEmailAddress = new javax.swing.JTextField();
        phonenumber2 = new javax.swing.JLabel();
        comfirmpassword = new javax.swing.JLabel();
        jPasswordFieldConfirmPassword = new javax.swing.JPasswordField();
        jPasswordFieldMasterPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 8, 27));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Welcome.setFont(new java.awt.Font("URW Chancery L", 1, 36)); // NOI18N
        Welcome.setForeground(new java.awt.Color(254, 254, 254));
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setText("WELCOME");
        jPanel1.add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 250, 40));

        surname.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        surname.setForeground(new java.awt.Color(201, 224, 248));
        surname.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        surname.setText("Surname:");
        jPanel1.add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 160, 30));

        password.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(201, 224, 248));
        password.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        password.setText("Password:");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 160, 30));

        Department.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        Department.setForeground(new java.awt.Color(201, 224, 248));
        Department.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Department.setText("Department:");
        jPanel1.add(Department, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 160, 30));

        firstname.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        firstname.setForeground(new java.awt.Color(201, 224, 248));
        firstname.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        firstname.setText("First Name:");
        jPanel1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 160, 30));

        masterpassword.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        masterpassword.setForeground(new java.awt.Color(201, 224, 248));
        masterpassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        masterpassword.setText("Master Password:");
        jPanel1.add(masterpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 160, 30));

        phonenumber1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        phonenumber1.setForeground(new java.awt.Color(201, 224, 248));
        phonenumber1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phonenumber1.setText("Phone Number:");
        jPanel1.add(phonenumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 160, 30));

        jButtonSignup.setBackground(new java.awt.Color(1, 6, 26));
        jButtonSignup.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonSignup.setForeground(new java.awt.Color(183, 227, 252));
        jButtonSignup.setText("SIGNUP");
        jButtonSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignupActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 110, 50));

        jPasswordFieldPassword.setBackground(new java.awt.Color(1, 2, 7));
        jPasswordFieldPassword.setForeground(new java.awt.Color(188, 231, 248));
        jPanel1.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 240, 40));

        jTextFieldDepartment.setBackground(new java.awt.Color(1, 2, 7));
        jTextFieldDepartment.setForeground(new java.awt.Color(188, 231, 248));
        jPanel1.add(jTextFieldDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 240, 40));

        jTextFieldPhoneNumber.setBackground(new java.awt.Color(1, 2, 7));
        jTextFieldPhoneNumber.setForeground(new java.awt.Color(188, 231, 248));
        jPanel1.add(jTextFieldPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 240, 40));

        jTextFieldFirstName.setBackground(new java.awt.Color(1, 2, 7));
        jTextFieldFirstName.setForeground(new java.awt.Color(188, 231, 248));
        jPanel1.add(jTextFieldFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 240, 40));

        jTextFieldSurname.setBackground(new java.awt.Color(1, 2, 7));
        jTextFieldSurname.setForeground(new java.awt.Color(188, 231, 248));
        jPanel1.add(jTextFieldSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 240, 40));

        jButtonlog.setText("LOGIN");
        jButtonlog.setPreferredSize(new java.awt.Dimension(85, 36));
        jButtonlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlogActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, 90, 36));

        jTextFieldUsername.setBackground(new java.awt.Color(1, 2, 7));
        jTextFieldUsername.setForeground(new java.awt.Color(188, 231, 248));
        jPanel1.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 240, 40));

        username.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(201, 224, 248));
        username.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        username.setText("Username:");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 160, 30));

        jTextFieldEmailAddress.setBackground(new java.awt.Color(1, 2, 7));
        jTextFieldEmailAddress.setForeground(new java.awt.Color(188, 231, 248));
        jPanel1.add(jTextFieldEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 240, 40));

        phonenumber2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        phonenumber2.setForeground(new java.awt.Color(201, 224, 248));
        phonenumber2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phonenumber2.setText("E-mail Address:");
        jPanel1.add(phonenumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 160, 30));

        comfirmpassword.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        comfirmpassword.setForeground(new java.awt.Color(201, 224, 248));
        comfirmpassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        comfirmpassword.setText("Comfirm Password:");
        jPanel1.add(comfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 160, 30));

        jPasswordFieldConfirmPassword.setBackground(new java.awt.Color(1, 2, 7));
        jPasswordFieldConfirmPassword.setForeground(new java.awt.Color(188, 231, 248));
        jPanel1.add(jPasswordFieldConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 240, 40));

        jPasswordFieldMasterPassword.setBackground(new java.awt.Color(1, 2, 7));
        jPasswordFieldMasterPassword.setForeground(new java.awt.Color(188, 231, 248));
        jPanel1.add(jPasswordFieldMasterPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 240, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Jelly Fish.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 560, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static Connection ConnectDb() {

        try {

            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:prototype.db");

            return conn;

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

            return null;

        }

    }

    private void jButtonlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlogActionPerformed
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonlogActionPerformed

    private void jButtonSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignupActionPerformed
        String sql = "INSERT INTO login(fname, sname, username,  passwordd, department, phonenumber, email, masterpassword)VALUES(?,?,?,?,?,?,?,?)";

        String a = "KYUDEEE";

        try {
            pst = conn.prepareStatement(sql);

            pst.setString(1, jTextFieldFirstName.getText());
            pst.setString(2, jTextFieldSurname.getText());
            pst.setString(3, jTextFieldUsername.getText());
            pst.setString(4, jPasswordFieldPassword.getText());
            pst.setString(5, jTextFieldDepartment.getText());
            pst.setString(6, jTextFieldPhoneNumber.getText());
            pst.setString(7, jTextFieldEmailAddress.getText());
            pst.setString(8, jPasswordFieldMasterPassword.getText());

            if (jPasswordFieldMasterPassword.getText().equals(a)) {

                if (jPasswordFieldConfirmPassword.getText().equals(jPasswordFieldPassword.getText())) {

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Successfully Registered");
                    dispose();
                    Login login = new Login();
                    login.setVisible(true);
                    rs.close();
                    pst.close();

                } else {
                    JOptionPane.showMessageDialog(null, "wrong credentials, check if the passwords match");
                }

            } else {

                JOptionPane.showMessageDialog(null, "wrong credentials, check if master password is correct");

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_jButtonSignupActionPerformed

    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        java.awt.EventQueue.invokeLater(() -> {
            new Signup().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Department;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel comfirmpassword;
    private javax.swing.JLabel firstname;
    private javax.swing.JButton jButtonSignup;
    private javax.swing.JButton jButtonlog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfirmPassword;
    private javax.swing.JPasswordField jPasswordFieldMasterPassword;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldDepartment;
    private javax.swing.JTextField jTextFieldEmailAddress;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    private javax.swing.JTextField jTextFieldSurname;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JLabel masterpassword;
    private javax.swing.JLabel password;
    private javax.swing.JLabel phonenumber1;
    private javax.swing.JLabel phonenumber2;
    private javax.swing.JLabel surname;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

}
