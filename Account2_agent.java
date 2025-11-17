package myapp_location;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Account2_agent extends javax.swing.JFrame {
    private int userid;
    public Account2_agent(int userid) {
        this.userid=userid;
        initComponents();
         loadUserData();
        
        email.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        if (email.getText().equals("Enter your email")) {
            email.setText("");
            email.setForeground(Color.BLACK);
        }
    }
});
        email.setEditable(false);
        password.setEditable(false);
        
       
        show_pwd.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        to_acceuil = new javax.swing.JLabel();
        to_settings = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        modif_mail = new javax.swing.JLabel();
        modif_pwd = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        modif_adresse = new javax.swing.JLabel();
        supp = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        show_pwd = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        to_acceuil.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\4-dots (4).jpg"));
        to_acceuil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                to_acceuilMouseClicked(evt);
            }
        });

        to_settings.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") +"\\src\\main\\java\\pic\\settings-jp (1).jpg"));
        to_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                to_settingsMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setText("<");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 18)); // NOI18N
        jLabel4.setText(" E-mail : ");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        modif_mail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        modif_mail.setText(" modifier");
        modif_mail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modif_mailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modif_mailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modif_mailMouseExited(evt);
            }
        });

        modif_pwd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        modif_pwd.setText(" modifier");
        modif_pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modif_pwdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modif_pwdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modif_pwdMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 18)); // NOI18N
        jLabel5.setText(" Mot de Passe  : ");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        modif_adresse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        modif_adresse.setText(" modifier");
        modif_adresse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modif_adresseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modif_adresseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modif_adresseMouseExited(evt);
            }
        });

        supp.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        supp.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\delete.png"));
        supp.setText(" Supprimer mon Compte ");
        supp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suppMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                suppMouseExited(evt);
            }
        });

        show_pwd.setBackground(new java.awt.Color(204, 204, 204));
        show_pwd.setText("Affiche  mot de passe ");
        show_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_pwdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show_pwd))
                .addGap(181, 181, 181))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modif_pwd)
                                    .addComponent(modif_adresse)
                                    .addComponent(modif_mail)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(supp)
                                .addGap(14, 14, 14))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modif_mail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modif_pwd)
                    .addComponent(show_pwd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(modif_adresse)
                .addGap(27, 27, 27)
                .addComponent(supp)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(to_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(to_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(to_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(to_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
        private boolean isValidEmail(String email) {
    String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
    return email.matches(regex);
}

  
    
    
    
    
    
    private void to_acceuilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_acceuilMouseClicked
        Acceuil_agent e = new Acceuil_agent(userid);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_to_acceuilMouseClicked

    private void to_settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_settingsMouseClicked
        Settings_agent s = new Settings_agent(userid);
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_to_settingsMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Settings_agent s = new Settings_agent(userid) ;
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void modif_mailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modif_mailMouseClicked
       if (!email.isEditable()) {
            email.setEditable(true);
            email.requestFocus();
            modif_mail.setText("sauvegarder");
            return;
        }

        String newEmail = email.getText().trim();

        if (newEmail.isEmpty() || newEmail.equals("Enter your email")) {
            JOptionPane.showMessageDialog(null, "L'email ne peut pas être vide", "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!isValidEmail(newEmail)) {
            JOptionPane.showMessageDialog(null, "Format d'email invalide", "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = getDatabaseConnection()) {
            Statement stmt = conn.createStatement();
            String sql = "UPDATE AUTHENTIFICATION SET email = '" + newEmail + "' WHERE id = " + userid;
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Email modifié avec succès");
            email.setEditable(false);
            email.setForeground(Color.GRAY);
            modif_mail.setText("modifier");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erreur de base de données: " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_modif_mailMouseClicked

    private void modif_mailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modif_mailMouseEntered
        modif_mail.setForeground(Color.decode("#0000EE"));
        modif_mail.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_modif_mailMouseEntered

    private void modif_mailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modif_mailMouseExited
        modif_mail.setForeground(Color.BLACK);
        modif_mail.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_modif_mailMouseExited

    private void modif_pwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modif_pwdMouseClicked
        if (!password.isEditable()) {
            password.setEditable(true);
            show_pwd.setEnabled(true);
            password.setEchoChar((char) 0);
            modif_pwd.setText("sauvegarder");
            password.requestFocus();
            return;
        }

        String newPassword = new String(password.getPassword()).trim();

        if (newPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Le mot de passe ne peut pas être vide", "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = getDatabaseConnection()) {
            Statement stmt = conn.createStatement();
            String sql = "UPDATE AUTHENTIFICATION SET password = '" + newPassword + "' WHERE id = " + userid;
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Mot de passe modifié avec succès");
            password.setEditable(false);
            show_pwd.setEnabled(false);
            password.setEchoChar('•');
            modif_pwd.setText("modifier");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erreur de base de données: " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_modif_pwdMouseClicked

    private void modif_pwdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modif_pwdMouseEntered
        modif_pwd.setForeground(Color.decode("#0000EE"));
        modif_pwd.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_modif_pwdMouseEntered

    private void modif_pwdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modif_pwdMouseExited
        modif_pwd.setForeground(Color.BLACK);
        modif_pwd.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_modif_pwdMouseExited

    private void modif_adresseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modif_adresseMouseClicked
       /* if (!adresse.isEditable()) {
            adresse.setEditable(true);
            adresse.requestFocus();
            modif_adresse.setText("sauvegarder");
            return;
        }

        String input = adresse.getText().trim();

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "L'adresse ne peut pas être vide", "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = getDatabaseConnection()) {
            Statement stmt = conn.createStatement();
            String sql = "UPDATE AGENT SET adress = '" + input + "' WHERE id_agentt = " + userid;
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Adresse modifiée avec succès");
            adresse.setEditable(false);
            modif_adresse.setText("modifier");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erreur de base de données: " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        } */
    }//GEN-LAST:event_modif_adresseMouseClicked

    private void modif_adresseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modif_adresseMouseEntered
        modif_adresse.setForeground(Color.decode("#0000EE"));
        modif_adresse.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_modif_adresseMouseEntered

    private void modif_adresseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modif_adresseMouseExited
        modif_adresse.setForeground(Color.BLACK);
        modif_adresse.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_modif_adresseMouseExited

    private void suppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppMouseClicked
        String[] options = {"Supprimer définitivement", "Annuler"};
        int choix = JOptionPane.showOptionDialog(
            null,
            "Voulez-vous vraiment supprimer votre compte ? Cette action est irréversible.",
            "Confirmation",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,
            options,
            options[1]);

        if (choix == 0) {
            try (Connection conn = getDatabaseConnection()) {
                Statement stmt = conn.createStatement();

                // Supprimer d'abord le client puis l'authentification
                String deleteClient = "DELETE FROM Agent WHERE id_agent = " + userid;
                String deleteAuth = "DELETE FROM AUTHENTIFICATION WHERE id = " + userid;

                stmt.executeUpdate(deleteClient);
                stmt.executeUpdate(deleteAuth);

                JOptionPane.showMessageDialog(null, "Compte supprimé avec succès");
                Login l = new Login();
                l.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erreur lors de la suppression: " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        } 
    }//GEN-LAST:event_suppMouseClicked

    private void suppMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppMouseEntered
        supp.setForeground(Color.RED) ;
    }//GEN-LAST:event_suppMouseEntered

    private void suppMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppMouseExited
        supp.setForeground(Color.BLACK) ;
    }//GEN-LAST:event_suppMouseExited

    private void show_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_pwdActionPerformed
        if (show_pwd.isSelected()){
            password.setEchoChar((char)0);
        }else {
            password.setEchoChar('•');
        }
    }//GEN-LAST:event_show_pwdActionPerformed
      
    
    private Connection getDatabaseConnection() throws SQLException {

    String url = "jdbc:mysql://localhost:3306/location";
        String user = "root";
        String password = "Meddhia@2004";
    return DriverManager.getConnection(url, user, password);
}
    
    
    
    
      private void loadUserData() {
    try (Connection conn = getDatabaseConnection();
         Statement stmt = conn.createStatement()) {
        ResultSet rs = stmt.executeQuery(
            "SELECT email, password FROM AUTHENTIFICATION WHERE id = " + userid
        );

        if (rs.next()) {
            String dbEmail = rs.getString("email");
            String dbPassword = rs.getString("password");
           
            

            email.setText(dbEmail);
            password.setText(dbPassword);
       
            

            email.setForeground(Color.GRAY);
            password.setForeground(Color.GRAY);
            
            
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erreur de chargement: " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
    }
}

    
   /* public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Account2_agent().setVisible(true);
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel modif_adresse;
    private javax.swing.JLabel modif_mail;
    private javax.swing.JLabel modif_pwd;
    private javax.swing.JPasswordField password;
    private javax.swing.JRadioButton show_pwd;
    private javax.swing.JLabel supp;
    private javax.swing.JLabel to_acceuil;
    private javax.swing.JLabel to_settings;
    // End of variables declaration//GEN-END:variables
}
