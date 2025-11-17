package myapp_location;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Signup_cont extends javax.swing.JFrame {
    private String nom;
    private String prenom;
    private char idType;
    private String cinPass;
    private String permis;
    private String telephone;
    private String adresse;

    public Signup_cont(String nom, String prenom, char idType, String cinPass, 
                      String permis, String telephone, String adresse) {
        initComponents();
        
        this.nom = nom;
        this.prenom = prenom;
        this.idType = idType;
        this.cinPass = cinPass;
        this.permis = permis;
        this.telephone = telephone;
        this.adresse = adresse;
        
        System.out.println("=== DEBUG: Data from First Form ===");
        System.out.println("First Name: " + nom);
        System.out.println("Last Name: " + prenom);
        System.out.println("ID Type: " + (idType == 'C' ? "CIN" : "Passeport"));
        System.out.println("ID Number: " + cinPass);
        System.out.println("Driver's License: " + permis);
        System.out.println("Phone: " + telephone);
        System.out.println("Address: " + adresse);
        System.out.println("================================");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        signupp = new buttons.MyButton();
        go_back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        email_usr = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        usr_pwd1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        usr_pwd2 = new javax.swing.JPasswordField();
        shw_pwd1 = new javax.swing.JCheckBox();
        shw_pwd2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        signupp.setBackground(new java.awt.Color(204, 204, 204));
        signupp.setText("S'inscrire ");
        signupp.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 20)); // NOI18N
        signupp.setRadius(35);
        signupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signuppActionPerformed(evt);
            }
        });

        go_back.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        go_back.setForeground(new java.awt.Color(255, 255, 255));
        go_back.setText("<");
        go_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                go_backMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  E-mail :");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  Mot de passe  :");

        email_usr.setBackground(new java.awt.Color(0, 0, 0));
        email_usr.setForeground(new java.awt.Color(255, 255, 255));
        email_usr.setBorder(null);
        email_usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_usrActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        usr_pwd1.setBackground(new java.awt.Color(0, 0, 0));
        usr_pwd1.setForeground(new java.awt.Color(255, 255, 255));
        usr_pwd1.setBorder(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  Confirmer mot de passe  :");

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        usr_pwd2.setBackground(new java.awt.Color(0, 0, 0));
        usr_pwd2.setForeground(new java.awt.Color(255, 255, 255));
        usr_pwd2.setBorder(null);
        usr_pwd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr_pwd2ActionPerformed(evt);
            }
        });

        shw_pwd1.setBackground(new java.awt.Color(0, 0, 0));
        shw_pwd1.setForeground(new java.awt.Color(255, 255, 255));
        shw_pwd1.setText("Afficher mot de passe ");
        shw_pwd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shw_pwd1ActionPerformed(evt);
            }
        });

        shw_pwd2.setBackground(new java.awt.Color(0, 0, 0));
        shw_pwd2.setForeground(new java.awt.Color(255, 255, 255));
        shw_pwd2.setText("Afficher mot de passe ");
        shw_pwd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shw_pwd2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(usr_pwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(usr_pwd2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(email_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(go_back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(signupp, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(shw_pwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(shw_pwd2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(go_back)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(usr_pwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shw_pwd1)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(usr_pwd2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(shw_pwd2)
                .addGap(67, 67, 67)
                .addComponent(signupp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
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

    private void signuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signuppActionPerformed
       Verif() ;
    }//GEN-LAST:event_signuppActionPerformed

    private void go_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_backMouseClicked
        Singup s = new Singup();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_go_backMouseClicked

    private void email_usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_usrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_usrActionPerformed

    private void usr_pwd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr_pwd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usr_pwd2ActionPerformed

    private void shw_pwd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shw_pwd1ActionPerformed
        if (shw_pwd1.isSelected()){
            usr_pwd1.setEchoChar((char)0);
        }else {
            usr_pwd1.setEchoChar('•'); 
        }
    }//GEN-LAST:event_shw_pwd1ActionPerformed

    private void shw_pwd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shw_pwd2ActionPerformed
        if (shw_pwd2.isSelected()){
            usr_pwd2.setEchoChar((char)0);
        }else {
            usr_pwd2.setEchoChar('•'); 
        }
    }//GEN-LAST:event_shw_pwd2ActionPerformed
   // fonction pour vérifier la structure de lemail 
    /* private static boolean Verif_email(){ 
     */
    
// A MODIFIER AVEC LA BASE 
    private void Verif() {
        // Input validation
        if (email_usr.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vous devez saisir votre email");
            return;
        }
        String emailText = email_usr.getText().trim();
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (!emailText.matches(emailRegex)) {
            JOptionPane.showMessageDialog(null, "Format de l'email invalide. Veuillez saisir une adresse valide.");
            return;
    }
        if (usr_pwd1.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Vous devez saisir un mot de passe");
            return;
        }
        if (!Arrays.equals(usr_pwd1.getPassword(), usr_pwd2.getPassword())) {
            JOptionPane.showMessageDialog(null, "Les mots de passe ne correspondent pas");
            return;
        }

        // Database operations
        try (Connection conn = getDatabaseConnection()) {
            conn.setAutoCommit(false); // Start transaction
            
            try {
                // 1. Insert into AUTHENTIFICATION table
                String authSql = "INSERT INTO AUTHENTIFICATION (email, password, type) VALUES (?, ?, 'client')";
                int generatedId = 0;
                
                try (PreparedStatement authStmt = conn.prepareStatement(authSql, Statement.RETURN_GENERATED_KEYS)) {
                    authStmt.setString(1, email_usr.getText().trim());
                    authStmt.setString(2, new String(usr_pwd1.getPassword())); // In production, hash this password
                    
                    int affectedRows = authStmt.executeUpdate();
                    
                    if (affectedRows == 0) {
                        throw new SQLException("Creating user failed, no rows affected.");
                    }
                    
                    // Get the generated ID
                    try (ResultSet generatedKeys = authStmt.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            generatedId = generatedKeys.getInt(1);
                        } else {
                            throw new SQLException("Creating user failed, no ID obtained.");
                        }
                    }
                }
                
                // 2. Insert into CLIENT table
                String clientSql = "INSERT INTO CLIENT (id_client, nom, prenom, id_type, cin_pass, permis, telephone, adress) " +
                                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                
                try (PreparedStatement clientStmt = conn.prepareStatement(clientSql)) {
                    clientStmt.setInt(1, generatedId);
                    clientStmt.setString(2, nom);
                    clientStmt.setString(3, prenom);
                    clientStmt.setString(4, String.valueOf(idType));
                    clientStmt.setString(5, cinPass);
                    clientStmt.setString(6, permis);
                    clientStmt.setString(7, telephone);
                    clientStmt.setString(8, adresse);
                    
                    int clientRows = clientStmt.executeUpdate();
                    
                    if (clientRows == 0) {
                        throw new SQLException("Creating client failed, no rows affected.");
                    }
                }
                
                conn.commit(); // Commit transaction
                JOptionPane.showMessageDialog(null, "Inscription réussie!");
                new Acceuil(generatedId).setVisible(true);
                this.dispose();
                
            } catch (SQLException e) {
                conn.rollback(); // Rollback on error
                JOptionPane.showMessageDialog(null, "Erreur d'inscription: " + e.getMessage());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur de connexion à la base de données: " + e.getMessage());
        } finally {
            // Clear sensitive data from memory
            Arrays.fill(usr_pwd1.getPassword(), '0');
            Arrays.fill(usr_pwd2.getPassword(), '0');
        }
    }

    private Connection getDatabaseConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/location";
        String user = "root";
        String password = "Meddhia@2004";
        return DriverManager.getConnection(url, user, password);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email_usr;
    private javax.swing.JLabel go_back;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JCheckBox shw_pwd1;
    private javax.swing.JCheckBox shw_pwd2;
    private buttons.MyButton signupp;
    private javax.swing.JPasswordField usr_pwd1;
    private javax.swing.JPasswordField usr_pwd2;
    // End of variables declaration//GEN-END:variables
}
