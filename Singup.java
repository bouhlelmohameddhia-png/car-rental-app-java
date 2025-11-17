
package myapp_location;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class Singup extends javax.swing.JFrame {
// c pour cin et p pour passeport
    private char cin_OU_pass ; 
    public Singup() {
        initComponents();
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollBar verticalBar = jScrollPane1.getVerticalScrollBar();
        verticalBar.setUI(new BasicScrollBarUI() {
          @Override
          protected void configureScrollBarColors() {
          this.thumbColor = Color.GRAY; 
          this.trackColor = Color.LIGHT_GRAY; 
         }
         });
        nom_usr.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nom_usr = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        prenom_usr = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        cin_pass_usr = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        permis_usr = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        tel_usr = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        adress_usr = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        to_signupp = new javax.swing.JLabel();
        cin = new javax.swing.JRadioButton();
        pass = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        to_login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" S'INSCRIRE");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Nom :");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  Prénom :");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  Numéro de CIN / Passeport  :");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("  Numéro de permis de conduire :");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  Numéro de téléphone :");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("  Adresse :");

        nom_usr.setBackground(new java.awt.Color(0, 0, 0));
        nom_usr.setForeground(new java.awt.Color(255, 255, 255));
        nom_usr.setBorder(null);
        nom_usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_usrActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        prenom_usr.setBackground(new java.awt.Color(0, 0, 0));
        prenom_usr.setForeground(new java.awt.Color(255, 255, 255));
        prenom_usr.setBorder(null);
        prenom_usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenom_usrActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        cin_pass_usr.setBackground(new java.awt.Color(0, 0, 0));
        cin_pass_usr.setForeground(new java.awt.Color(255, 255, 255));
        cin_pass_usr.setBorder(null);
        cin_pass_usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cin_pass_usrActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        permis_usr.setBackground(new java.awt.Color(0, 0, 0));
        permis_usr.setForeground(new java.awt.Color(255, 255, 255));
        permis_usr.setBorder(null);
        permis_usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permis_usrActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        tel_usr.setBackground(new java.awt.Color(0, 0, 0));
        tel_usr.setForeground(new java.awt.Color(255, 255, 255));
        tel_usr.setBorder(null);
        tel_usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel_usrActionPerformed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        adress_usr.setBackground(new java.awt.Color(0, 0, 0));
        adress_usr.setForeground(new java.awt.Color(255, 255, 255));
        adress_usr.setBorder(null);
        adress_usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adress_usrActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        to_signupp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        to_signupp.setForeground(new java.awt.Color(255, 255, 255));
        to_signupp.setText("   Continuez  >   ");
        to_signupp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        to_signupp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                to_signuppMouseClicked(evt);
            }
        });

        cin.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(cin);
        cin.setForeground(new java.awt.Color(255, 255, 255));
        cin.setText("Carte d'Identité ");
        cin.setBorder(null);
        cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinActionPerformed(evt);
            }
        });

        pass.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(pass);
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText("Passeport");
        pass.setBorder(null);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Si vous avez un compte , ");

        to_login.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        to_login.setForeground(new java.awt.Color(255, 255, 255));
        to_login.setText("Connectez-vous ");
        to_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                to_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                to_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                to_loginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(cin)
                            .addGap(62, 62, 62)
                            .addComponent(pass)
                            .addGap(53, 53, 53))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(prenom_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cin_pass_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(permis_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tel_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(adress_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(to_login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(to_signupp, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_login))
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nom_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(prenom_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cin_pass_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cin)
                    .addComponent(pass))
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permis_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tel_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adress_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(to_signupp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nom_usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_usrActionPerformed
        // TODO add your handling code here
        prenom_usr.requestFocusInWindow();
    }//GEN-LAST:event_nom_usrActionPerformed

    private void prenom_usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenom_usrActionPerformed
        // TODO add your handling code here:
        
        
        cin_pass_usr.requestFocusInWindow();
        
    }//GEN-LAST:event_prenom_usrActionPerformed

    private void cin_pass_usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cin_pass_usrActionPerformed
        // TODO add y handling code here:
        permis_usr.requestFocusInWindow();
    }//GEN-LAST:event_cin_pass_usrActionPerformed

    private void permis_usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permis_usrActionPerformed
        // TODO add your handling code here:
        tel_usr.requestFocusInWindow();
    }//GEN-LAST:event_permis_usrActionPerformed

    private void tel_usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel_usrActionPerformed
        // TODO add your handling code here:
        adress_usr.requestFocusInWindow();
    }//GEN-LAST:event_tel_usrActionPerformed

    private void adress_usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adress_usrActionPerformed
        // TODO add your handling code here:
        to_signupp.requestFocusInWindow();
    }//GEN-LAST:event_adress_usrActionPerformed

    private void to_signuppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_signuppMouseClicked

        if (Verif_presence()){
            Signup_cont n = new Signup_cont(
            nom_usr.getText(),
            prenom_usr.getText(),
            cin_OU_pass,
            cin_pass_usr.getText(),
            permis_usr.getText(),
            tel_usr.getText(),
            adress_usr.getText()
            ) ;
            n.setVisible(true) ; 
            this.dispose() ;
        }
        
    }//GEN-LAST:event_to_signuppMouseClicked

// pour les bouttons 
    private void cinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinActionPerformed
        if (cin.isSelected()){
            
            cin_OU_pass = 'C' ;
         pass.setSelected(false); // Ensure mutual exclusion
         }
        
    }//GEN-LAST:event_cinActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        if (pass.isSelected()){
            cin_OU_pass = 'P' ;
            cin.setSelected(false);
        } 
    }//GEN-LAST:event_passActionPerformed

    private void to_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_loginMouseClicked
        Login l = new Login();
        l.setVisible(true);
        this.dispose() ;
    }//GEN-LAST:event_to_loginMouseClicked

    private void to_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_loginMouseEntered
        to_login.setForeground(Color.decode("#0000EE"));
        to_login.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_to_loginMouseEntered

    private void to_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_loginMouseExited
        to_login.setForeground(Color.WHITE); 
        to_login.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_to_loginMouseExited
    
private boolean Verif_presence() {
    boolean isValid = true;
    StringBuilder errors = new StringBuilder();
    if (nom_usr.getText().trim().isEmpty()) {
        errors.append("- Vous devez saisir le nom\n");
        isValid = false;}
    if (prenom_usr.getText().trim().isEmpty()) {
        errors.append("- Vous devez saisir le prénom\n");
        isValid = false;
    }
    if (!cin.isSelected() && !pass.isSelected()) {
        errors.append("- Vous devez sélectionner CIN ou Passeport\n");
        isValid = false;
    }
    if (cin_pass_usr.getText().trim().isEmpty()) {
        errors.append("- Vous devez saisir le numéro de CIN/Passeport\n");
        isValid = false;
    } else if (!cin_pass_usr.getText().matches("\\d{8}")) {
        errors.append("- Le CIN/Passeport doit contenir 8 chiffres\n");
        isValid = false;
    }
 
    if (permis_usr.getText().trim().isEmpty()) {
        errors.append("- Vous devez saisir le numéro de permis\n");
        isValid = false;
    } else if (!permis_usr.getText().matches("\\d{2}/\\d{6}")) {
        errors.append("- Le permis doit être au format XX/XXXXXX\n");
        isValid = false;
    }
    if (tel_usr.getText().trim().isEmpty()) {
        errors.append("- Vous devez saisir le numéro de téléphone\n");
        isValid = false;
    } else if (!tel_usr.getText().matches("\\d{8}")) {
        errors.append("- Le téléphone doit contenir 8 chiffres\n");
        isValid = false;
    }
    if (adress_usr.getText().trim().isEmpty()) {
        errors.append("- Vous devez saisir l'adresse\n");
        isValid = false;
    }
    
    if (!isValid) {
        JOptionPane.showMessageDialog(null, 
            "Veuillez corriger les erreurs suivantes :\n" + errors.toString(),
            "Erreurs de validation",
            JOptionPane.ERROR_MESSAGE);
    }
    
    return isValid;
}
    

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Singup().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adress_usr;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cin;
    private javax.swing.JTextField cin_pass_usr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField nom_usr;
    private javax.swing.JRadioButton pass;
    private javax.swing.JTextField permis_usr;
    private javax.swing.JTextField prenom_usr;
    private javax.swing.JTextField tel_usr;
    private javax.swing.JLabel to_login;
    private javax.swing.JLabel to_signupp;
    // End of variables declaration//GEN-END:variables
}
