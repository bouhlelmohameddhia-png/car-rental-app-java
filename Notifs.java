package myapp_location;

import java.awt.Dimension;
import java.sql.* ; 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Notifs extends javax.swing.JFrame {
    private LocalDate dateRetour;
    private int userid;
    private String carDetails;
    private double penaltyAmount;
    public Notifs(int userid) {
        initComponents();
        Dimension size1 = jPanel2.getSize();
        int width1= size1.width ; 
        int height1 =size1.height;
        jPanel2.setPreferredSize(new Dimension (width1, height1));
        jPanel2.setMinimumSize(new Dimension (width1, height1));
        jPanel2.setMaximumSize(new Dimension (width1, height1));
        Dimension size2 = jPanel4.getSize();
        int width2= size2.width ; 
        int height2 =size2.height;
        jPanel4.setPreferredSize(new Dimension (width2, height2));
        jPanel4.setMinimumSize(new Dimension (width2, height2));
        jPanel4.setMaximumSize(new Dimension (width2, height2)) ;
        this.userid=userid;
        verifierDateRetour();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        notifs = new javax.swing.JLabel();
        to_settings = new javax.swing.JLabel();
        to_acceuil = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        no_notif_msg = new javax.swing.JLabel();
        no_notif_img = new javax.swing.JLabel();
        notif_pan1 = new javax.swing.JPanel();
        notif_pan = new javax.swing.JPanel();
        alert = new javax.swing.JLabel();
        contenu_msg = new javax.swing.JLabel();
        cout_penalite = new javax.swing.JLabel();
        notif_label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
        to_acceuil.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                to_acceuilComponentResized(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        no_notif_msg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        no_notif_msg.setText("Vous n'avez pas de Notifications");

        notif_pan1.setBackground(new java.awt.Color(204, 204, 204));

        alert.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        alert.setText("ALERTE");

        contenu_msg.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13));

        cout_penalite.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13));

        javax.swing.GroupLayout notif_panLayout = new javax.swing.GroupLayout(notif_pan);
        notif_pan.setLayout(notif_panLayout);
        notif_panLayout.setHorizontalGroup(
            notif_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notif_panLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(notif_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(notif_panLayout.createSequentialGroup()
                        .addComponent(alert, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cout_penalite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenu_msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        notif_panLayout.setVerticalGroup(
            notif_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notif_panLayout.createSequentialGroup()
                .addComponent(alert, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contenu_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cout_penalite, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout notif_pan1Layout = new javax.swing.GroupLayout(notif_pan1);
        notif_pan1.setLayout(notif_pan1Layout);
        notif_pan1Layout.setHorizontalGroup(
            notif_pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notif_pan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        notif_pan1Layout.setVerticalGroup(
            notif_pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notif_pan1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(notif_pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        notif_label.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\bell-icon-26.png"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notif_pan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(no_notif_img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notif_label, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(no_notif_msg)
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notif_pan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(no_notif_img, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(notif_label, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(no_notif_msg)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(to_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(notifs, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(to_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(notifs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(to_settings, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(to_acceuil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 180, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 180, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 320, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 320, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void to_acceuilComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_to_acceuilComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_to_acceuilComponentResized
    

// cette fonction(el vérifier) est à modifier selon la base et tous 
    private void verifierDateRetour() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/location", "root", "Meddhia@2004");
            // Get the current active location for this user
            String query = "SELECT v.marque, v.modele, l.date_fin_prevue, l.penalite " +
                          "FROM Location l " +
                          "JOIN Voiture v ON l.immatricule = v.immatricule " +
                          "WHERE l.id_client = ? AND l.statut = 'en cours'";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, userid);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                dateRetour = LocalDate.parse(rs.getString("date_fin_prevue"), formatter);
                carDetails = rs.getString("marque") + " " + rs.getString("modele");
                penaltyAmount = rs.getDouble("penalite");
                
                // Check if the return date has passed
                if (LocalDate.now().isAfter(dateRetour)) {
                    long daysLate = ChronoUnit.DAYS.between(dateRetour, LocalDate.now());
                    penaltyAmount = daysLate * 100; 
                    cout_penalite.setText("Vous avez une pénalité qui vaut " + penaltyAmount + " DT");
                    afficherMessageRetard();
                    System.out.println(penaltyAmount);
                    
                } else {
                    afficherElementsNormaux();
                }
            } else {
                // No active locations
                afficherAucuneLocation();
            }
            
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            afficherErreur();
        }
    }
    private void afficherAucuneLocation() {
        no_notif_msg.setText("Vous n'avez pas de locations en cours");
        no_notif_img.setVisible(false);
        no_notif_msg.setVisible(true);
        notif_label.setVisible(true);
        
        cout_penalite.setVisible(false);
        contenu_msg.setVisible(false);
        notif_pan.setVisible(false);
        alert.setVisible(false);
    }
    private void afficherErreur() {
        no_notif_msg.setText("Erreur de connexion à la base de données");
        no_notif_img.setVisible(false);
        no_notif_msg.setVisible(true);
        notif_label.setVisible(true);
        
        cout_penalite.setVisible(false);
        contenu_msg.setVisible(false);
        notif_pan.setVisible(false);
        alert.setVisible(false);
    }
    private void afficherMessageRetard() {
        contenu_msg.setText(" Votre voiture est en retard ! Veuillez la rendre au plus vite.");
        contenu_msg.setVisible(true);
        notif_pan.setVisible(true);
        alert.setVisible(true);
        notif_pan1.setVisible(true);
        cout_penalite.setVisible(true);
        
        notif_label.setVisible(false);
        no_notif_img.setVisible(false);
        no_notif_msg.setVisible(false);
    }
    private void afficherElementsNormaux() {
        no_notif_img.setVisible(true);
        no_notif_msg.setVisible(true);
        notif_pan1.setVisible(true);
        
        
        contenu_msg.setVisible(false);
        notif_pan.setVisible(false);
        alert.setVisible(false);
    }
    
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Notifs().setVisible(true);
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JLabel contenu_msg;
    private javax.swing.JLabel cout_penalite;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel no_notif_img;
    private javax.swing.JLabel no_notif_msg;
    private javax.swing.JLabel notif_label;
    private javax.swing.JPanel notif_pan;
    private javax.swing.JPanel notif_pan1;
    private javax.swing.JLabel notifs;
    private javax.swing.JLabel to_acceuil;
    private javax.swing.JLabel to_settings;
    // End of variables declaration//GEN-END:variables
}
