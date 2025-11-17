package myapp_location;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class Acceuil_agent extends javax.swing.JFrame {
    private int userid;
    public Acceuil_agent(int userid) {
        this.userid=userid;
        initComponents();
        display.setLayout(new BoxLayout(display, BoxLayout.Y_AXIS));
        display.setAlignmentX(Component.CENTER_ALIGNMENT) ;
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollBar verticalBar = jScrollPane1.getVerticalScrollBar();
        verticalBar.setUI(new BasicScrollBarUI() {
          @Override
          protected void configureScrollBarColors() {
          this.thumbColor = Color.GRAY; 
          this.trackColor = Color.LIGHT_GRAY; 
         }
        });
        String[] nom = loadUserData();
    username2.setText(nom[0] + " " + nom[1]); 
    
    createALLPanels(20);
    JPanel pan = create_ajout();
    display.add(pan);
    display.add(Box.createVerticalStrut(25));
   }
    private String[] loadUserData() {
    try (Connection conn = getDatabaseConnection()) {
        PreparedStatement stmt = conn.prepareStatement("SELECT nom, prenom FROM agent WHERE id_agent=?");
        stmt.setInt(1, this.userid);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            return new String[]{nom, prenom}; 
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading user data: " + e.getMessage());
    }
    return new String[]{"Agent", ""}; 
}
    private void setAgentName(String[] names) {
    String nom = names[0] != null ? names[0] : "";
    String prenom = names[1] != null ? names[1] : "";
    username2.setText(prenom + " " + nom); 
    }
    private Connection getDatabaseConnection() throws SQLException {

       String url = "jdbc:mysql://localhost:3306/location";
        String user = "root";
        String password = "Meddhia@2004";
    return DriverManager.getConnection(url, user, password);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        username2 = new javax.swing.JLabel();
        user_icon4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        display = new javax.swing.JPanel();
        to_acceuil = new javax.swing.JLabel();
        to_settings = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        username2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username2.setText(" *name* ");
        username2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        user_icon4.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\userr.png"));
        user_icon4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("NOS VOITURES ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOS VOITURES ");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        display.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout displayLayout = new javax.swing.GroupLayout(display);
        display.setLayout(displayLayout);
        displayLayout.setHorizontalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        displayLayout.setVerticalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(user_icon4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel6)
                    .addContainerGap(199, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(username2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_icon4))
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jLabel6)
                    .addContainerGap(461, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(to_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(to_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(to_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
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
 

    public final JPanel create_ajout(){
        JPanel panel = new JPanel() ;    
        JLabel ajout = new JLabel() ; 
        ajout.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ajout.setText("+");
        ajout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ajout.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ajout.setText("+");
        ajout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(ajout)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ajout)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        
        panel.addMouseListener(new MouseAdapter(){
          @Override
           public void mouseClicked(MouseEvent e) {
               dispose(); 
               Ajout_voiture_agent m = new Ajout_voiture_agent (userid) ;
               m.setVisible(true);
            }
        });
        
        return panel ;
    }
    

public JPanel createPanel(String model, String price, boolean L, boolean P, ImageIcon carImage) {
    JPanel car_panel = new JPanel();
    JLabel img = new JLabel();
    JLabel modele = new JLabel();
    JLabel prix = new JLabel();
    JLabel loue_TOP4 = new JLabel();
    JLabel panne = new JLabel();

    
    if (carImage != null) {
        img.setIcon(carImage);
    } else {
        
        String defaultImagePath = System.getProperty("user.dir") + "\\src\\main\\java\\pic\\default_car.png";
        File imageFile = new File(defaultImagePath);
        
        if (imageFile.exists()) {
            ImageIcon defaultIcon = new ImageIcon(defaultImagePath);
            Image scaled = defaultIcon.getImage().getScaledInstance(93, 97, Image.SCALE_SMOOTH);
            img.setIcon(new ImageIcon(scaled));
        } else {
            
            img.setIcon(new ImageIcon());
            System.err.println("Default car image not found at: " + defaultImagePath);
        }
    }
    
  
    img.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    img.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    
    modele.setText(model);
    prix.setText(price);
    
    
    loue_TOP4.setBackground(new java.awt.Color(153, 0, 0));
    loue_TOP4.setFont(new java.awt.Font("Segoe UI", 1, 14));
    loue_TOP4.setText("louée");
    loue_TOP4.setVisible(L);
    
    
    panne.setBackground(new java.awt.Color(102, 0, 0));
    panne.setFont(new java.awt.Font("Segoe UI", 1, 14));
    panne.setForeground(new java.awt.Color(153, 0, 0));
    panne.setText("en panne");
    panne.setVisible(P);

    
    javax.swing.GroupLayout car_panelLayout = new javax.swing.GroupLayout(car_panel);
car_panel.setLayout(car_panelLayout);
car_panelLayout.setHorizontalGroup(
    car_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(car_panelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(12, 12, 12)
        .addGroup(car_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(car_panelLayout.createSequentialGroup()
                .addComponent(loue_TOP4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(car_panelLayout.createSequentialGroup()
                .addGroup(car_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE) // Changed from 80 to 120
                    .addComponent(modele, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
);
    car_panelLayout.setVerticalGroup(
        car_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(car_panelLayout.createSequentialGroup()
            .addGap(9, 9, 9)
            .addGroup(car_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(car_panelLayout.createSequentialGroup()
                    .addComponent(modele, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(car_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loue_TOP4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(car_panelLayout.createSequentialGroup()
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE))))
    );
    
    car_panel.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createEmptyBorder(0, 0, 0, 0),
        BorderFactory.createLineBorder(Color.BLACK)
    ));
    
    return car_panel;
}


public final void createALLPanels(int voit) {
    try (Connection conn = getDatabaseConnection()) {
        String sql = "SELECT immatricule, modele, prix_journalier, statut_disponibilite, etat_technique, photo " +
                    "FROM Voiture ORDER BY nb_location DESC";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            String modele = rs.getString("modele");
            double prix = rs.getDouble("prix_journalier");
            String statut = rs.getString("statut_disponibilite");
            String etat = rs.getString("etat_technique");
            Blob photoBlob = rs.getBlob("photo");
            String immatricule = rs.getString("immatricule");

            boolean louee = !"disponible".equalsIgnoreCase(statut);
            boolean enPanne = !"en marche".equalsIgnoreCase(etat);
            String formattedPrix = String.format("%.2f DT / jour", prix);

            
            ImageIcon carImage = null;
            if (photoBlob != null) {
                try {
                    byte[] imageBytes = photoBlob.getBytes(1, (int)photoBlob.length());
                    ImageIcon icon = new ImageIcon(imageBytes);
                    Image scaled = icon.getImage().getScaledInstance(93, 97, Image.SCALE_SMOOTH);
                    carImage = new ImageIcon(scaled);
                } catch (SQLException e) {
                    e.printStackTrace();
                   
                }
            }

            JPanel panel = createPanel(modele, formattedPrix, louee, enPanne, carImage);
            display.add(panel);
            display.add(Box.createVerticalStrut(25));
            panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

           
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    try {
                        dispose();
                        Affiche_voit_agent m = new Affiche_voit_agent(userid, immatricule);
                        m.setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(Acceuil_agent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        }

        display.revalidate();
        display.repaint();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors du chargement des voitures: " + e.getMessage());
    }
}
    
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Acceuil_agent().setVisible(true);
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel display;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel to_acceuil;
    private javax.swing.JLabel to_settings;
    private javax.swing.JLabel user_icon4;
    private javax.swing.JLabel username2;
    // End of variables declaration//GEN-END:variables
}
