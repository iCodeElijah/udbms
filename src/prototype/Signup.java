
package prototype;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Signup extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    Connection conn = null;

    PreparedStatement pst = null;

    ResultSet rs = null;

    public Signup () {

        initComponents ();
        conn = Signup.ConnectDb ();
        licenseCode.hide ();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        signup = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldUsername = new javax.swing.JTextField();
        licenseCode = new javax.swing.JTextField();
        jPasswordFieldConfirmPassword = new javax.swing.JPasswordField();
        roles = new javax.swing.JComboBox<>();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jTextFieldEmailAddress = new javax.swing.JTextField();
        jButtonSignup = new javax.swing.JButton();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        infor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setAutoscrolls(true);
        jPanel1.setFocusable(false);

        Welcome.setFont(new java.awt.Font("URW Chancery L", 1, 36)); // NOI18N
        Welcome.setForeground(new java.awt.Color(51, 51, 51));
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setText("WELCOME");
        Welcome.setAutoscrolls(true);
        Welcome.setDoubleBuffered(true);

        cancel.setBackground(new java.awt.Color(204, 204, 204));
        cancel.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel.setText("Cancel");
        cancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.setDoubleBuffered(true);
        cancel.setFocusable(false);
        cancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancel.setInheritsPopupMenu(false);
        cancel.setOpaque(true);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
        });

        signup.setBackground(new java.awt.Color(204, 204, 255));
        signup.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        signup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup.setText("Sign In");
        signup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup.setDoubleBuffered(true);
        signup.setFocusable(false);
        signup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signup.setInheritsPopupMenu(false);
        signup.setOpaque(true);
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupMouseEntered(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(null);

        jTextFieldUsername.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldUsername.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Username", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Open Sans", 0, 14)), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true))); // NOI18N
        jTextFieldUsername.setDoubleBuffered(true);
        jTextFieldUsername.setInheritsPopupMenu(true);
        jTextFieldUsername.setOpaque(true);

        licenseCode.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        licenseCode.setForeground(new java.awt.Color(51, 51, 51));
        licenseCode.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "License Code", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Open Sans", 0, 14)), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true))); // NOI18N
        licenseCode.setDoubleBuffered(true);
        licenseCode.setOpaque(true);

        jPasswordFieldConfirmPassword.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jPasswordFieldConfirmPassword.setForeground(new java.awt.Color(51, 51, 51));
        jPasswordFieldConfirmPassword.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Comfirm Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Open Sans", 0, 14)), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true))); // NOI18N
        jPasswordFieldConfirmPassword.setDoubleBuffered(true);
        jPasswordFieldConfirmPassword.setInheritsPopupMenu(true);
        jPasswordFieldConfirmPassword.setOpaque(true);

        roles.setBackground(new java.awt.Color(255, 255, 255));
        roles.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        roles.setForeground(new java.awt.Color(51, 51, 51));
        roles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Technician/ Engineer" }));
        roles.setSelectedItem(null);
        roles.setAutoscrolls(true);
        roles.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Sign Up As?", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Open Sans", 0, 14), new java.awt.Color(51, 51, 51)), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true))); // NOI18N
        roles.setDoubleBuffered(true);
        roles.setInheritsPopupMenu(true);
        roles.setOpaque(true);
        roles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rolesMouseClicked(evt);
            }
        });
        roles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolesActionPerformed(evt);
            }
        });

        jPasswordFieldPassword.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(51, 51, 51));
        jPasswordFieldPassword.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Open Sans", 0, 14), new java.awt.Color(51, 51, 51)), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true))); // NOI18N
        jPasswordFieldPassword.setDoubleBuffered(true);
        jPasswordFieldPassword.setInheritsPopupMenu(true);
        jPasswordFieldPassword.setOpaque(true);

        jTextFieldEmailAddress.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jTextFieldEmailAddress.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldEmailAddress.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Email Address", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Open Sans", 0, 14)), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true))); // NOI18N
        jTextFieldEmailAddress.setDoubleBuffered(true);
        jTextFieldEmailAddress.setInheritsPopupMenu(true);
        jTextFieldEmailAddress.setOpaque(true);

        jButtonSignup.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSignup.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonSignup.setForeground(new java.awt.Color(51, 51, 51));
        jButtonSignup.setText("SIGN UP");
        jButtonSignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSignup.setDoubleBuffered(true);
        jButtonSignup.setFocusable(false);
        jButtonSignup.setOpaque(true);
        jButtonSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignupActionPerformed(evt);
            }
        });

        jTextFieldPhoneNumber.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jTextFieldPhoneNumber.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldPhoneNumber.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Phone Number", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Open Sans", 0, 14), new java.awt.Color(51, 51, 51)), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true))); // NOI18N
        jTextFieldPhoneNumber.setDoubleBuffered(true);
        jTextFieldPhoneNumber.setInheritsPopupMenu(true);
        jTextFieldPhoneNumber.setOpaque(true);

        name.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(51, 51, 51));
        name.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Full Name", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Open Sans", 0, 14)), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true))); // NOI18N
        name.setDoubleBuffered(true);
        name.setInheritsPopupMenu(true);
        name.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roles, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(licenseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roles, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(licenseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        infor.setBackground(new java.awt.Color(255, 255, 255));
        infor.setForeground(new java.awt.Color(102, 102, 102));
        infor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infor.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infor, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(716, Short.MAX_VALUE)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(infor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static Connection ConnectDb () {

        try {

            Class.forName ( "org.sqlite.JDBC" );
            Connection conn = DriverManager.getConnection ( "jdbc:sqlite:prototype.db" );

            return conn;

        }
        catch ( Exception e ) {

            JOptionPane.showMessageDialog ( null , e );

            return null;

        }

    }

    private void jButtonSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignupActionPerformed

        String sql = "INSERT INTO login(name, username,  password, phonenumber, email, roles)VALUES(?,?,?,?,?,?)";

        String a = "04228863421";

        try {
            pst = conn.prepareStatement ( sql );

            pst.setString ( 1 , name.getText () );
            pst.setString ( 2 , jTextFieldUsername.getText () );
            pst.setString ( 3 , jPasswordFieldPassword.getText () );
            pst.setString ( 4 , jTextFieldPhoneNumber.getText () );
            pst.setString ( 5 , jTextFieldEmailAddress.getText () );
            pst.setString ( 6 , roles.getSelectedItem ().toString () );

            if ( roles.getSelectedItem ().equals ( "Administrator" ) ) {

                if ( licenseCode.getText ().equals ( a ) ) {

                    if ( jPasswordFieldPassword.getText ().equals ( jPasswordFieldConfirmPassword.getText () ) ) {

                        pst.executeUpdate ();

                        infor.setText ( "Success" );
                        dispose ();
                        Login lo = new Login ();
                        lo.setVisible ( true );

                        rs.close ();
                        pst.close ();

                    }

                    else {

                        infor.setText ( "wrong credentials, check if the passwords match" );

                    }

                }

                else {

                    infor.setText ( "wrong license code, please input a correct code or purchase one" );

                }

            }

            else if ( roles.getSelectedItem ().equals ( "Technician/ Engineer" ) ) {

                if ( jPasswordFieldPassword.getText ().equals ( jPasswordFieldConfirmPassword.getText () ) ) {

                    pst.executeUpdate ();

                    infor.setText ( "Success" );
                    dispose ();
                    Login lo = new Login ();
                    lo.setVisible ( true );

                    rs.close ();
                    pst.close ();

                }

                else {

                    infor.setText ( "wrong credentials, check if the passwords match" );

                }

            }

            else {

                infor.setText ( "wrong credentials" );

            }

        }

        catch ( Exception e ) {

        }

    }//GEN-LAST:event_jButtonSignupActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked

        this.dispose ();
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited

        cancel.setFont ( new java.awt.Font ( "Open Sans" , 0 , 14 ) );
    }//GEN-LAST:event_cancelMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered

        cancel.setFont ( new java.awt.Font ( "Open Sans" , 1 , 16 ) );
    }//GEN-LAST:event_cancelMouseEntered

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked

        Login lo = new Login ();
        lo.setVisible ( true );
        dispose ();

    }//GEN-LAST:event_signupMouseClicked

    private void signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseExited

        signup.setFont ( new java.awt.Font ( "Open Sans" , 0 , 14 ) );
    }//GEN-LAST:event_signupMouseExited

    private void signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseEntered

        signup.setFont ( new java.awt.Font ( "Open Sans" , 1 , 16 ) );
    }//GEN-LAST:event_signupMouseEntered

    private void rolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolesActionPerformed

        if ( roles.getSelectedItem ().equals ( "Administrator" ) ) {

            licenseCode.show ();

            jPanel2.repaint ();
            jPanel2.validate ();
            this.repaint ();
            this.validate ();

        }

        else {

            licenseCode.hide ();

            jPanel2.repaint ();
            jPanel2.validate ();
            this.repaint ();
            this.validate ();

        }

    }//GEN-LAST:event_rolesActionPerformed

    private void rolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rolesMouseClicked

        if ( roles.getSelectedItem ().equals ( "Administrator" ) ) {

            licenseCode.show ();

        }

        else {

            licenseCode.hide ();

        }

    }//GEN-LAST:event_rolesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel infor;
    private javax.swing.JButton jButtonSignup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldConfirmPassword;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldEmailAddress;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JTextField licenseCode;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> roles;
    private javax.swing.JLabel signup;
    // End of variables declaration//GEN-END:variables

}
