package myapp_location;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
public class Reserver_voit extends javax.swing.JFrame {
    private int userid ;
    private String immatricule; 
    private float prix_journalier;
    private Connection conn;
    
    public Reserver_voit(int userid,String immatricule) {
    this.immatricule = immatricule;
    this.userid=userid;
    initComponents();
    aff_date_begin.setEditable(false);
    aff_date_end.setEditable(false);
    date_end.setEnabled(false);
    
    // Initialize database connection
    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/location", "root", "Meddhia@2004");
        loadCarData();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database connection error: " + e.getMessage());
    }
}

    private void loadCarData() {
    try {
        String sql = "SELECT prix_journalier FROM Voiture WHERE immatricule = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, immatricule);
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()) {
            prix_journalier = rs.getFloat("prix_journalier");
        } else {
            JOptionPane.showMessageDialog(this, "Voiture introuvable");
            this.dispose();
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading car data: " + e.getMessage());
    }
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        notifs = new javax.swing.JLabel();
        to_settings = new javax.swing.JLabel();
        to_acceuil = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        date_begin = new com.toedter.calendar.JCalendar();
        aff_date_begin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_begin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_begin1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        aff_date_end = new javax.swing.JTextField();
        date_end = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        total_paiement = new javax.swing.JLabel();
        myButton1 = new buttons.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("<");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        date_begin.setBackground(new java.awt.Color(204, 204, 204));
        date_begin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        date_begin.setForeground(new java.awt.Color(102, 102, 102));
        date_begin.setToolTipText("aff_date_begin");
        date_begin.setDecorationBackgroundColor(new java.awt.Color(204, 204, 204));
        date_begin.setWeekdayForeground(new java.awt.Color(0, 0, 0));
        date_begin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_beginPropertyChange(evt);
            }
        });

        aff_date_begin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        aff_date_begin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aff_date_beginActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\date (1).png"));

        txt_begin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_begin.setText("la date de début ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("de votre Location ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("de votre Location ");

        txt_begin1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_begin1.setText("le dernier jour ");

        jLabel7.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\date (1).png"));

        aff_date_end.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        aff_date_end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aff_date_endActionPerformed(evt);
            }
        });

        date_end.setBackground(new java.awt.Color(204, 204, 204));
        date_end.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        date_end.setForeground(new java.awt.Color(102, 102, 102));
        date_end.setDecorationBackgroundColor(new java.awt.Color(204, 204, 204));
        date_end.setWeekdayForeground(new java.awt.Color(0, 0, 0));
        date_end.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_endPropertyChange(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\credit.png"));
        jLabel8.setText("Paiment Total : ");

        total_paiement.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        total_paiement.setText(".........");

        myButton1.setText("Confirmer");
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(total_paiement, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total_paiement)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_begin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_begin, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aff_date_begin, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aff_date_end, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_begin1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date_end, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(txt_begin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(date_begin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(aff_date_begin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(txt_begin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(date_end, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aff_date_end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(to_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(notifs, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(to_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(notifs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(to_settings, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(to_acceuil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    }//GEN-LAST:event_to_acceuilMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        try {
            Affiche_voit_client s = new Affiche_voit_client(userid,immatricule);
            s.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Reserver_voit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Reserver_voit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void date_beginPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_beginPropertyChange
        SimpleDateFormat formatter = new SimpleDateFormat(" dd/MM/yyyy ");
        String f_Date = formatter.format(date_begin.getDate());
        aff_date_begin.setText(f_Date);
        date_end.setEnabled(true) ;
    }//GEN-LAST:event_date_beginPropertyChange

    private void aff_date_beginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aff_date_beginActionPerformed

    }//GEN-LAST:event_aff_date_beginActionPerformed

    private void aff_date_endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aff_date_endActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aff_date_endActionPerformed

    private void date_endPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_endPropertyChange
        SimpleDateFormat formatter = new SimpleDateFormat(" dd/MM/yyyy ");
        String f_Date_end = formatter.format(date_end.getDate());
        aff_date_end.setText(f_Date_end);
        updateTotal();
    }//GEN-LAST:event_date_endPropertyChange

    private void confirm_rentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirm_rentMouseClicked
        try {
            Verif() ;
        } catch (SQLException ex) {
            Logger.getLogger(Reserver_voit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirm_rentMouseClicked

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        try {
            Verif() ;
        } catch (SQLException ex) {
            Logger.getLogger(Reserver_voit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_myButton1ActionPerformed
    private boolean isCarAvailable(Date startDate, Date endDate) throws SQLException {
    String sql = "SELECT COUNT(*) FROM Location " +
                 "WHERE immatricule = ? AND statut = 'en cours' " +
                 "AND ((date_debut BETWEEN ? AND ?) " +
                 "OR (date_fin_prevue BETWEEN ? AND ?) " +
                 "OR (? BETWEEN date_debut AND date_fin_prevue) " +
                 "OR (? BETWEEN date_debut AND date_fin_prevue))";
    
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, immatricule);
    pstmt.setDate(2, new java.sql.Date(startDate.getTime()));
    pstmt.setDate(3, new java.sql.Date(endDate.getTime()));
    pstmt.setDate(4, new java.sql.Date(startDate.getTime()));
    pstmt.setDate(5, new java.sql.Date(endDate.getTime()));
    pstmt.setDate(6, new java.sql.Date(startDate.getTime()));
    pstmt.setDate(7, new java.sql.Date(endDate.getTime()));
    
    ResultSet rs = pstmt.executeQuery();
    rs.next();
    return rs.getInt(1) == 0;
}

private void updateCarAvailability(boolean available) throws SQLException {
    String sql = "UPDATE Voiture SET statut_disponibilite = ? WHERE immatricule = ?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, available ? "disponible" : "non disponible");
    pstmt.setString(2, immatricule);
    pstmt.executeUpdate();
}
    // verification lors du clique sur le bouto de confirmation 
// c'est une fonction A MODIFIERRRR/ modif de  BASE 
    private void Verif() throws SQLException {
    if (date_begin.getDate() == null || date_end.getDate() == null) {
        JOptionPane.showMessageDialog(this, "Please select both start and end dates!");
        return;
    }

    Date startDate = date_begin.getDate();
    Date endDate = date_end.getDate();

    if (startDate.after(endDate)) {
        JOptionPane.showMessageDialog(this, "Start date must be before end date!");
        return;
    }

    // Check if car is available for these dates
    if (!isCarAvailable(startDate, endDate)) {
        JOptionPane.showMessageDialog(this, "Car is not available for selected dates!");
        return;
    }

    // Calculate total
    float total = Calcul_total();
    
    try {
        // Insert reservation
        String sql = "INSERT INTO Location (date_debut, date_fin_prevue, montant_total, id_client, immatricule, statut) " +
                     "VALUES (?, ?, ?, ?, ?, 'en cours')";
        
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setDate(1, new java.sql.Date(startDate.getTime()));
        pstmt.setDate(2, new java.sql.Date(endDate.getTime()));
        pstmt.setFloat(3, total);
        pstmt.setInt(4, userid);
        pstmt.setString(5, immatricule);
        
        int rows = pstmt.executeUpdate();
        
        if (rows > 0) {
            // Update car availability
            updateCarAvailability(false);
            
            JOptionPane.showMessageDialog(this, "Reservation successful!\nTotal: " + total + " DT");
            new Acceuil(userid).setVisible(true);
            this.dispose();
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
    }
}



private float Calcul_total() {
    long diff = date_end.getDate().getTime() - date_begin.getDate().getTime();
    long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    return days * prix_journalier;
}
    @Override
public void dispose() {
    try {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    super.dispose();
}
 // chnagement du message du total 
    private void updateTotal() {
        Date date1 = date_begin.getDate();
        Date date2 = date_end.getDate();

        if (date1.after(date2)) {
            JOptionPane.showMessageDialog(null, "La date de début de location doit être anterieur à la date du retour !");
            total_paiement.setText(".............");
        } else {
            String msg = String.valueOf(Calcul_total());
            total_paiement.setText("Votre total est " + msg + " DT");
        }
    }

    
    
    
    
    
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Reserver_voit().setVisible(true);
        });
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aff_date_begin;
    private javax.swing.JTextField aff_date_end;
    private com.toedter.calendar.JCalendar date_begin;
    private com.toedter.calendar.JCalendar date_end;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private buttons.MyButton myButton1;
    private javax.swing.JLabel notifs;
    private javax.swing.JLabel to_acceuil;
    private javax.swing.JLabel to_settings;
    private javax.swing.JLabel total_paiement;
    private javax.swing.JLabel txt_begin;
    private javax.swing.JLabel txt_begin1;
    // End of variables declaration//GEN-END:variables
}
