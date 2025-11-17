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


public class Account2 extends javax.swing.JFrame {
    private int userid;
    public Account2(int userid) {
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
        tel_usr.setEditable(false);
        adresse.setEditable(false);
        show_pwd.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        notifs = new javax.swing.JLabel();
        to_settings = new javax.swing.JLabel();
        to_acceuil = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        modif_mail = new javax.swing.JLabel();
        modif_pwd = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tel_usr = new javax.swing.JTextField();
        modif_tel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        adresse = new javax.swing.JTextField();
        modif_adresse = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        supp = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        show_pwd = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        notifs.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") +"\\src\\main\\java\\pic\\notification-icon-vector-materia (3).jpg"));
        notifs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notifsMouseClicked(evt);
            }
        });

        to_settings.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\settings-jp (1).jpg"));
        to_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                to_settingsMouseClicked(evt);
            }
        });

        to_acceuil.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\4-dots (4).jpg"));
        to_acceuil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                to_acceuilMouseClicked(evt);
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

        tel_usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel_usrActionPerformed(evt);
            }
        });

        modif_tel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        modif_tel.setText(" modifier");
        modif_tel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modif_telMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modif_telMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modif_telMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 18)); // NOI18N
        jLabel7.setText(" Numéro de Téléphone : ");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 18)); // NOI18N
        jLabel9.setText(" Adresse : ");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                    .addComponent(show_pwd)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(127, 127, 127))
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
                                    .addComponent(modif_tel)
                                    .addComponent(modif_adresse)
                                    .addComponent(modif_mail)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tel_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tel_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modif_tel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modif_adresse)
                .addGap(27, 27, 27)
                .addComponent(supp)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(to_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(notifs, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(to_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(notifs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(to_settings, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(to_acceuil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Settings s = new Settings(userid) ;
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked
    private boolean isValidEmail(String email) {
    String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
    return email.matches(regex);
}

    private boolean isValidPhone(String phone) {
  
    String cleaned = phone.replaceAll("[^0-9]", "");
    return cleaned.length() == 8;
}

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

// modification sur tel 
    private void modif_telMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modif_telMouseClicked
       if (!tel_usr.isEditable()) {
        tel_usr.setEditable(true);
        if (tel_usr.getText().startsWith("(+216) ")) {
            tel_usr.setText(tel_usr.getText().substring(8));
        }
        tel_usr.requestFocus();
        modif_tel.setText("sauvegarder");
        return;
    }

    String input = tel_usr.getText().trim();

    if (input.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Le numéro ne peut pas être vide", "Erreur", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!isValidPhone(input)) {
        JOptionPane.showMessageDialog(null, "Le numéro doit contenir 8 chiffres", "Erreur", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection conn = getDatabaseConnection()) {
        Statement stmt = conn.createStatement();
        String sql = "UPDATE CLIENT SET telephone = '" + input + "' WHERE id_client = " + userid;
        stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Numéro de téléphone modifié avec succès");
        tel_usr.setText(input);
        tel_usr.setEditable(false);
        modif_tel.setText("modifier");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erreur de base de données: " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_modif_telMouseClicked

    private void modif_telMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modif_telMouseEntered
        modif_tel.setForeground(Color.decode("#0000EE"));
        modif_tel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_modif_telMouseEntered

    private void modif_telMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modif_telMouseExited
        modif_tel.setForeground(Color.BLACK); 
        modif_tel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_modif_telMouseExited



    private void modif_adresseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modif_adresseMouseClicked
         if (!adresse.isEditable()) {
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
        String sql = "UPDATE CLIENT SET adress = '" + input + "' WHERE id_client = " + userid;
        stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Adresse modifiée avec succès");
        adresse.setEditable(false);
        modif_adresse.setText("modifier");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erreur de base de données: " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
    }
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
            String deleteClient = "DELETE FROM CLIENT WHERE id_client = " + userid;
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

    private void tel_usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel_usrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tel_usrActionPerformed

    private void show_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_pwdActionPerformed
        if (show_pwd.isSelected()){
            password.setEchoChar((char)0);
        }else {
            password.setEchoChar('•'); 
        }
    }//GEN-LAST:event_show_pwdActionPerformed

    private void notifsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notifsMouseClicked
        Notifs n = new Notifs(userid);
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_notifsMouseClicked

    private void to_settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_settingsMouseClicked
        Settings s = new Settings(userid);
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_to_settingsMouseClicked

    private void to_acceuilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_acceuilMouseClicked
           Acceuil a = new Acceuil(userid); 
           a.setVisible(true) ;
           this.dispose();
    }//GEN-LAST:event_to_acceuilMouseClicked

  
    private Connection getDatabaseConnection() throws SQLException {

    String url = "jdbc:mysql://localhost:3306/location";
        String user = "root";
        String password = "Meddhia@2004";
    return DriverManager.getConnection(url, user, password);
}
   /*public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Account2().setVisible(true);
        });
    }*/
   private void loadUserData() {
    try (Connection conn = getDatabaseConnection();
         Statement stmt = conn.createStatement()) {
        ResultSet rs = stmt.executeQuery(
            "SELECT a.email, a.password, c.telephone, c.adress " +
            "FROM AUTHENTIFICATION a " +
            "JOIN CLIENT c ON a.id = c.id_client " +
            "WHERE a.id = " + userid
        );

        if (rs.next()) {
            String dbEmail = rs.getString("email");
            String dbPassword = rs.getString("password");
            String dbTel = rs.getString("telephone");
            String dbAdresse = rs.getString("adress");

            email.setText(dbEmail);
            password.setText(dbPassword);
            tel_usr.setText(dbTel);
            adresse.setText(dbAdresse);

            email.setForeground(Color.GRAY);
            password.setForeground(Color.GRAY);
            tel_usr.setForeground(Color.GRAY);
            adresse.setForeground(Color.GRAY);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erreur de chargement: " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresse;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel modif_adresse;
    private javax.swing.JLabel modif_mail;
    private javax.swing.JLabel modif_pwd;
    private javax.swing.JLabel modif_tel;
    private javax.swing.JLabel notifs;
    private javax.swing.JPasswordField password;
    private javax.swing.JRadioButton show_pwd;
    private javax.swing.JLabel supp;
    private javax.swing.JTextField tel_usr;
    private javax.swing.JLabel to_acceuil;
    private javax.swing.JLabel to_settings;
    // End of variables declaration//GEN-END:variables

    
}
