
package prototype;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Connection conn = null;

    PreparedStatement pst = null;

    ResultSet rs = null;

    public Login () {
        initComponents ();
        conn = Signup.ConnectDb ();

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
        roles = new javax.swing.JComboBox<>();
        signup = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        infor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(840, 710));
        setMinimumSize(new java.awt.Dimension(840, 710));
        setResizable(false);
        setSize(new java.awt.Dimension(840, 710));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(null);
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        Welcome.setBackground(new java.awt.Color(255, 255, 255));
        Welcome.setFont(new java.awt.Font("URW Chancery L", 1, 36)); // NOI18N
        Welcome.setForeground(new java.awt.Color(51, 51, 51));
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setText("WELCOME");

        Username.setBackground(new java.awt.Color(255, 255, 255));
        Username.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(51, 51, 51));
        Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username.setText("Username");
        Username.setAutoscrolls(true);

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(51, 51, 51));
        Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Password.setText("Password");
        Password.setAutoscrolls(true);

        jPasswordFieldPassword.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordFieldPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPasswordFieldPassword.setInheritsPopupMenu(true);
        jPasswordFieldPassword.setPreferredSize(new java.awt.Dimension(290, 35));

        jTextFieldUsername.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTextFieldUsername.setInheritsPopupMenu(true);
        jTextFieldUsername.setPreferredSize(new java.awt.Dimension(290, 35));

        jButtonLogin.setBackground(new java.awt.Color(0, 153, 153));
        jButtonLogin.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("SIGN IN");
        jButtonLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.setOpaque(true);
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseEntered(evt);
            }
        });
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        roles.setBackground(new java.awt.Color(255, 255, 255));
        roles.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        roles.setForeground(new java.awt.Color(102, 102, 102));
        roles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Technician/ Engineer" }));
        roles.setSelectedItem(null);
        roles.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Sign In As?", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Open Sans", 0, 18), new java.awt.Color(51, 51, 51)), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true))); // NOI18N

        signup.setBackground(new java.awt.Color(204, 204, 255));
        signup.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        signup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup.setText("Sign Up");
        signup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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

        cancel.setBackground(new java.awt.Color(204, 204, 204));
        cancel.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel.setText("Cancel");
        cancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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

        infor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(infor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(roles, javax.swing.GroupLayout.Alignment.CENTER, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Password, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Welcome, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Password, Username, jPasswordFieldPassword, jTextFieldUsername, roles});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(infor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //this method validates if the input information is correct then it allows you to open the software or deny you entrance
    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        String query = "select * from login where username=? and Password=? and roles=? ";

        try {

            int count = 0;

            pst = conn.prepareStatement ( query );

            pst.setString ( 1 , jTextFieldUsername.getText () );
            pst.setString ( 2 , jPasswordFieldPassword.getText () );
            pst.setString ( 3 , roles.getSelectedItem ().toString () );

            rs = pst.executeQuery ();

            while ( rs.next () ) {

                count = count + 1;

            }

            String access = ( roles.getSelectedItem ().toString () );

            if ( "Administrator".equals ( access ) ) {

                if ( count == 1 ) {

                    infor.setText ( "Success" );
                    Dash das = new Dash ();
                    das.setVisible ( true );
                    dispose ();

                }

                else {

                    infor.setText ( "Oops Either Username or Password is incorrect, please try again" );

                }

            }

            if ( "Technician/ Engineer".equals ( access ) ) {

                if ( count == 1 ) {

                    infor.setText ( "Success" );
                    Dash dashy = new Dash ();
                    dashy.setVisible ( true );
                    dispose ();

                }

                else {

                    infor.setText ( "Oops Either Username or Password is incorrect, please try again" );

                }

            }

            else {

            }

        }

        catch ( Exception e ) {

            JOptionPane.showMessageDialog ( null , e );

        }

        finally {

            try {

                rs.close ();
                pst.close ();

            }

            catch ( Exception e ) {

            }

        }

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked

        Signup sign = new Signup ();
        sign.setVisible ( true );
        dispose ();

    }//GEN-LAST:event_signupMouseClicked

    private void signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseEntered

        signup.setFont ( new java.awt.Font ( "Open Sans" , 1 , 16 ) );

    }//GEN-LAST:event_signupMouseEntered

    private void signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseExited

        signup.setFont ( new java.awt.Font ( "Open Sans" , 0 , 14 ) );

    }//GEN-LAST:event_signupMouseExited

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked

        this.dispose ();

    }//GEN-LAST:event_cancelMouseClicked

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited

        cancel.setFont ( new java.awt.Font ( "Open Sans" , 0 , 14 ) );

    }//GEN-LAST:event_cancelMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered

        cancel.setFont ( new java.awt.Font ( "Open Sans" , 1 , 16 ) );

    }//GEN-LAST:event_cancelMouseEntered

    private void jButtonLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseExited

        jButtonLogin.setBackground ( new java.awt.Color ( 0 , 153 , 153 ) );
        jButtonLogin.setFont ( new java.awt.Font ( "Noto Sans" , 1 , 18 ) );
        jButtonLogin.setForeground ( new java.awt.Color ( 255 , 255 , 255 ) );
        jButtonLogin.setBorder ( new javax.swing.border.LineBorder ( new java.awt.Color ( 0 , 0 , 0 ) , 1 , true ) );

    }//GEN-LAST:event_jButtonLoginMouseExited

    private void jButtonLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseEntered

        jButtonLogin.setBackground ( new java.awt.Color ( 0 , 102 , 102 ) );
        jButtonLogin.setFont ( new java.awt.Font ( "Noto Sans" , 1 , 20 ) );
        jButtonLogin.setForeground ( new java.awt.Color ( 255 , 255 , 255 ) );
        jButtonLogin.setBorder ( new javax.swing.border.LineBorder ( new java.awt.Color ( 0 , 0 , 0 ) , 2 , true ) );

    }//GEN-LAST:event_jButtonLoginMouseEntered

    public static void main ( String args[] ) {

        try {
            for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels () ) {
                if ( "Windows".equals ( info.getName () ) ) {
                    javax.swing.UIManager.setLookAndFeel ( info.getClassName () );
                    break;
                }
            }
        }
        catch ( ClassNotFoundException ex ) {
            java.util.logging.Logger.getLogger ( Signup.class.getName () ).log ( java.util.logging.Level.SEVERE , null , ex );
        }
        catch ( InstantiationException ex ) {
            java.util.logging.Logger.getLogger ( Signup.class.getName () ).log ( java.util.logging.Level.SEVERE , null , ex );
        }
        catch ( IllegalAccessException ex ) {
            java.util.logging.Logger.getLogger ( Signup.class.getName () ).log ( java.util.logging.Level.SEVERE , null , ex );
        }
        catch ( javax.swing.UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger ( Signup.class.getName () ).log ( java.util.logging.Level.SEVERE , null , ex );
        }

        java.awt.EventQueue.invokeLater ( () -> {

            new Login ().setVisible ( true );

        } );

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel infor;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JComboBox<String> roles;
    private javax.swing.JLabel signup;
    // End of variables declaration//GEN-END:variables

}
