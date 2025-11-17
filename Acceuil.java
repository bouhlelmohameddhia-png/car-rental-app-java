package myapp_location;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
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
import javax.swing.* ;
import javax.swing.plaf.basic.BasicScrollBarUI;

public final class Acceuil extends javax.swing.JFrame {
    
    private int userid;
    public Acceuil(int userid) {
        this.userid=userid;
        initComponents();
        show_panel.setLayout(new BoxLayout(show_panel, BoxLayout.Y_AXIS));
        show_panel.setAlignmentX(Component.CENTER_ALIGNMENT) ;
        jScrollp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollBar verticalBar = jScrollp.getVerticalScrollBar();
        verticalBar.setUI(new BasicScrollBarUI() {
          @Override
          protected void configureScrollBarColors() {
          this.thumbColor = Color.GRAY; // 
          this.trackColor = Color.LIGHT_GRAY; 
         }
        });
        jScrollp.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollBar v = jScrollPane1.getVerticalScrollBar();
        v.setUI(new BasicScrollBarUI() {
          @Override
          protected void configureScrollBarColors() {
          this.thumbColor = Color.GRAY; // The draggable part
          this.trackColor = Color.LIGHT_GRAY; // Background track
         }
        });
        jScrollPane1.setBorder(null);
        String[] nom =loadUserData();
        Changer_nom(nom);
        top3();
        createALLPanels(20) ; // on dait mettre nbr_voit , 3 c'etait  pour tester
        show_panel.add(Box.createVerticalStrut(20));
        System.out.println("current user id :"+userid);
    }
    private String[] loadUserData() {
    try (Connection conn = getDatabaseConnection()) {
        PreparedStatement stmt = conn.prepareStatement("SELECT nom, prenom FROM client WHERE id_client=?");
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
    return new String[]{"Unknown", ""}; // Default if no data found
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
        jScrollp = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        user_icon2 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        user_FIDELE = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        car_TOP2 = new javax.swing.JPanel();
        pic1 = new javax.swing.JLabel();
        modele_top2 = new javax.swing.JLabel();
        prix_top2 = new javax.swing.JLabel();
        loue_TOP2 = new javax.swing.JLabel();
        panne_TOP2 = new javax.swing.JLabel();
        car_TOP1 = new javax.swing.JPanel();
        pic = new javax.swing.JLabel();
        model_top1 = new javax.swing.JLabel();
        prix_top1 = new javax.swing.JLabel();
        loue_TOP1 = new javax.swing.JLabel();
        panne_TOP1 = new javax.swing.JLabel();
        car_TOP3 = new javax.swing.JPanel();
        pic2 = new javax.swing.JLabel();
        modele_top3 = new javax.swing.JLabel();
        prix_top3 = new javax.swing.JLabel();
        loue_TOP3 = new javax.swing.JLabel();
        panne_TOP3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        mercedes = new javax.swing.JLabel();
        bmw = new javax.swing.JLabel();
        vw = new javax.swing.JLabel();
        hundai = new javax.swing.JLabel();
        cheverolet = new javax.swing.JLabel();
        mazda = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        show_panel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        notifs = new javax.swing.JLabel();
        to_settings = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        to_acceuil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setPreferredSize(new java.awt.Dimension(360, 1294));

        user_icon2.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\pic\\userr.png"));
        user_icon2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setText(" *name* ");
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 14)); // NOI18N
        jLabel3.setText("Notre Client Régulier :");

        user_FIDELE.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "\\src\\main\\java\\pic\\vip.png"));
        user_FIDELE.setText("  *name *");
        user_FIDELE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(user_FIDELE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user_FIDELE, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("NOS TOP 3 VOITURES ");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NOS TOP 3 VOITURES ");

        car_TOP2.setBackground(new java.awt.Color(153, 153, 153));
        car_TOP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pic1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pic1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        modele_top2.setText("*modele*");

        prix_top2.setText(" price");

        loue_TOP2.setBackground(new java.awt.Color(102, 0, 0));
        loue_TOP2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loue_TOP2.setForeground(new java.awt.Color(255, 255, 255));
        loue_TOP2.setText("louée");

        panne_TOP2.setBackground(new java.awt.Color(102, 0, 0));
        panne_TOP2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        panne_TOP2.setForeground(new java.awt.Color(102, 0, 0));
        panne_TOP2.setText("en panne");

        javax.swing.GroupLayout car_TOP2Layout = new javax.swing.GroupLayout(car_TOP2);
        car_TOP2.setLayout(car_TOP2Layout);
        car_TOP2Layout.setHorizontalGroup(
            car_TOP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(car_TOP2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(car_TOP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(car_TOP2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(modele_top2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(car_TOP2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(loue_TOP2)
                        .addGap(18, 18, 18)
                        .addComponent(panne_TOP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(car_TOP2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prix_top2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        car_TOP2Layout.setVerticalGroup(
            car_TOP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(car_TOP2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(car_TOP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(car_TOP2Layout.createSequentialGroup()
                        .addComponent(modele_top2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prix_top2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(car_TOP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loue_TOP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panne_TOP2, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)))
                    .addComponent(pic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        car_TOP1.setBackground(new java.awt.Color(153, 153, 153));
        car_TOP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        model_top1.setText("*modele*");

        prix_top1.setText(" price");

        loue_TOP1.setBackground(new java.awt.Color(102, 0, 0));
        loue_TOP1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loue_TOP1.setForeground(new java.awt.Color(255, 255, 255));
        loue_TOP1.setText("louée");

        panne_TOP1.setBackground(new java.awt.Color(102, 0, 0));
        panne_TOP1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        panne_TOP1.setForeground(new java.awt.Color(102, 0, 0));
        panne_TOP1.setText("en panne");

        javax.swing.GroupLayout car_TOP1Layout = new javax.swing.GroupLayout(car_TOP1);
        car_TOP1.setLayout(car_TOP1Layout);
        car_TOP1Layout.setHorizontalGroup(
            car_TOP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(car_TOP1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(car_TOP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(car_TOP1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(loue_TOP1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panne_TOP1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                    .addGroup(car_TOP1Layout.createSequentialGroup()
                        .addGroup(car_TOP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(model_top1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(prix_top1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        car_TOP1Layout.setVerticalGroup(
            car_TOP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(car_TOP1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(car_TOP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(car_TOP1Layout.createSequentialGroup()
                        .addComponent(model_top1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prix_top1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(car_TOP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loue_TOP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panne_TOP1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)))
                    .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        car_TOP3.setBackground(new java.awt.Color(153, 153, 153));
        car_TOP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pic2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pic2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        modele_top3.setText("*modele*");

        prix_top3.setText(" price");

        loue_TOP3.setBackground(new java.awt.Color(102, 0, 0));
        loue_TOP3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loue_TOP3.setForeground(new java.awt.Color(255, 255, 255));
        loue_TOP3.setText("louée");

        panne_TOP3.setBackground(new java.awt.Color(102, 0, 0));
        panne_TOP3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        panne_TOP3.setForeground(new java.awt.Color(102, 0, 0));
        panne_TOP3.setText("en panne");

        javax.swing.GroupLayout car_TOP3Layout = new javax.swing.GroupLayout(car_TOP3);
        car_TOP3.setLayout(car_TOP3Layout);
        car_TOP3Layout.setHorizontalGroup(
            car_TOP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(car_TOP3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(pic2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(car_TOP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, car_TOP3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(car_TOP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prix_top3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modele_top3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(car_TOP3Layout.createSequentialGroup()
                        .addComponent(loue_TOP3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panne_TOP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        car_TOP3Layout.setVerticalGroup(
            car_TOP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(car_TOP3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(car_TOP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(car_TOP3Layout.createSequentialGroup()
                        .addComponent(pic2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(car_TOP3Layout.createSequentialGroup()
                        .addComponent(modele_top3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prix_top3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(car_TOP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loue_TOP3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panne_TOP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") +"\\src\\main\\java\\pic\\bronze-medal.png"));

        jLabel9.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") +"\\src\\main\\java\\pic\\gold-medal.png"));

        jLabel10.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\silver-medal.png"));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        mercedes.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\auto.png"));
        mercedes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mercedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mercedesMouseClicked(evt);
            }
        });

        bmw.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\car (1).png"));
        bmw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bmw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bmwMouseClicked(evt);
            }
        });

        vw.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\car (2).png"));
        vw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vwMouseClicked(evt);
            }
        });

        hundai.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\car (3).png"));
        hundai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hundai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hundaiMouseClicked(evt);
            }
        });

        cheverolet.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\car (5).png"));
        cheverolet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheverolet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cheveroletMouseClicked(evt);
            }
        });

        mazda.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\car (7).png"));
        mazda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mazda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mazdaMouseClicked(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel11.setText("MARQUES TENDANCES");

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel12.setText("NOS VOITURES");

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("NOS VOITURES");

        show_panel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout show_panelLayout = new javax.swing.GroupLayout(show_panel);
        show_panel.setLayout(show_panelLayout);
        show_panelLayout.setHorizontalGroup(
            show_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        show_panelLayout.setVerticalGroup(
            show_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(show_panel);

        jLabel15.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("MARQUES TENDANCES");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(user_icon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(mercedes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bmw, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(vw, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hundai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cheverolet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mazda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(car_TOP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(car_TOP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(car_TOP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jLabel7)
                    .addContainerGap(122, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(316, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jLabel11)
                    .addContainerGap(129, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(198, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jLabel15)
                    .addContainerGap(119, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_icon2))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(car_TOP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(car_TOP2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(car_TOP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vw, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(hundai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cheverolet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mazda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mercedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bmw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(191, 191, 191)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1069, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(275, 275, 275)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(979, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(659, 659, 659)
                    .addComponent(jLabel11)
                    .addContainerGap(614, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(794, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(479, 479, 479)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(669, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addGap(604, 604, 604)))
        );

        jScrollp.setViewportView(jPanel7);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollp, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollp, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        to_acceuil.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\4-dots (4).jpg"));
        to_acceuil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                to_acceuilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(to_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(notifs, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(to_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(notifs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(to_settings, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(to_acceuil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void to_settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_settingsMouseClicked
        Settings s = new Settings(userid);
        s.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_to_settingsMouseClicked

    private void to_acceuilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_acceuilMouseClicked

    }//GEN-LAST:event_to_acceuilMouseClicked

    private void notifsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notifsMouseClicked
        Notifs n = new Notifs(userid);
        n.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_notifsMouseClicked


    private void mercedesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mercedesMouseClicked
       
        String brand =" mercedes";
        Aff_w_brands k = new Aff_w_brands(userid,1) ; 
        k.setVisible(true) ; 
        this.dispose();
    }//GEN-LAST:event_mercedesMouseClicked

    private void bmwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmwMouseClicked
        // il faut passer lachaine contenant le nom de la voiture en passant vers la prochaine page 
        String brand ="bmw";
        Aff_w_brands k = new Aff_w_brands(userid,2) ; 
        k.setVisible(true) ; 
        this.dispose();
    }//GEN-LAST:event_bmwMouseClicked

    private void vwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vwMouseClicked
        
        String brand ="vw"; // short for volks wagen 
        Aff_w_brands k = new Aff_w_brands(userid,3) ; 
        k.setVisible(true) ; 
        this.dispose();
    }//GEN-LAST:event_vwMouseClicked

    private void hundaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hundaiMouseClicked
        
        String brand =" hyundai ";
        Aff_w_brands k = new Aff_w_brands(userid,4) ; 
        k.setVisible(true) ; 
        this.dispose();
    }//GEN-LAST:event_hundaiMouseClicked

    private void cheveroletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cheveroletMouseClicked
   
        String brand =" chevrolet ";
        Aff_w_brands k = new Aff_w_brands(userid,5) ; 
        k.setVisible(true) ; 
        this.dispose();
    }//GEN-LAST:event_cheveroletMouseClicked

    private void mazdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mazdaMouseClicked
       
        String brand ="mazda";
        Aff_w_brands k = new Aff_w_brands(userid,6) ; 
        k.setVisible(true) ; 
        this.dispose();
    }//GEN-LAST:event_mazdaMouseClicked

   
    
   
    public final void Changer_nom(String[] names) {
    String nom = names[0] != null ? names[0] : "";
    String prenom = names[1] != null ? names[1] : "";
    
    
    username.setText(prenom + " " + nom); 
    
    
    user_FIDELE.setText(top_client());
    }
    public String top_client() {
    try (Connection conn = getDatabaseConnection()) {
        
        String sql = "SELECT nom, prenom FROM client ORDER BY nb_location DESC LIMIT 1";
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) {
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            
            
            if (nom == null) nom = "";
            if (prenom == null) prenom = "";
            
            return (prenom + " " + nom).trim();
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, 
            "Error fetching best client: " + e.getMessage(),
            "Database Error",
            JOptionPane.ERROR_MESSAGE);
    }
    return "No VIP client"; 
}

    public final void top3() {
    
    try (Connection conn = getDatabaseConnection()) {
        String sql = "SELECT immatricule, modele, prix_journalier, statut_disponibilite, etat_technique, photo " +
                    "FROM Voiture ORDER BY nb_location DESC LIMIT 3";
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
       
        Font statusFont = new Font("Segoe UI", Font.PLAIN, 10);
        
        // Car 1 (Top Car)
        if (rs.next()) {
            String modele1 = rs.getString("modele");
            double prix1 = rs.getDouble("prix_journalier");
            String statut1 = rs.getString("statut_disponibilite");
            String etat1 = rs.getString("etat_technique");
            Blob photoBlob1 = rs.getBlob("photo");
            String immat=rs.getString("immatricule");
            if("disponible".equals(statut1)){
                loue_TOP1.setVisible(false);
            }
            if ("en marche".equals(etat1)){
                panne_TOP1.setVisible(false);
            }
            model_top1.setText(modele1);
            prix_top1.setText(String.format("%.2f DT / jour", prix1));
            
            
            if (photoBlob1 != null) {
                try {
                    ImageIcon icon = new ImageIcon(photoBlob1.getBytes(1, (int)photoBlob1.length()));
                    Image img = icon.getImage().getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
                    pic.setIcon(new ImageIcon(img));
                } catch (SQLException e) {
                    e.printStackTrace();                    
                    pic.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\pic\\default_car.png"));
                }
            }
                    
            car_TOP1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    try {
                        dispose();
                        Affiche_voit_client m = new Affiche_voit_client(userid,immat);
                        m.setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(Acceuil.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Acceuil.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        }
        
        
        if (rs.next()) {
            String modele2 = rs.getString("modele");
            double prix2 = rs.getDouble("prix_journalier");
            String statut2 = rs.getString("statut_disponibilite");
            String etat2 = rs.getString("etat_technique");
            Blob photoBlob2 = rs.getBlob("photo");
            String immat=rs.getString("immatricule");
            if("disponible".equals(statut2)){
                loue_TOP2.setVisible(false);
            }
            if ("en marche".equals(etat2)){
                panne_TOP2.setVisible(false);
            }
            modele_top2.setText(modele2);
            prix_top2.setText(String.format("%.2f DT / jour", prix2));
            
            // Set the image if available
            if (photoBlob2 != null) {
                ImageIcon icon = new ImageIcon(photoBlob2.getBytes(1, (int)photoBlob2.length())); // Set default image if loading fails
                Image img = icon.getImage().getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
                pic1.setIcon(new ImageIcon(img));
            }
                       
            car_TOP2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    try {
                        dispose();
                        Affiche_voit_client m = new Affiche_voit_client(userid,immat);
                        m.setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(Acceuil.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Acceuil.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        }
        
        
        if (rs.next()) {
            String modele3 = rs.getString("modele");
            double prix3 = rs.getDouble("prix_journalier");
            String statut3 = rs.getString("statut_disponibilite");
            String etat3 = rs.getString("etat_technique");
            Blob photoBlob3 = rs.getBlob("photo");
            String immat=rs.getString("immatricule");
            if("disponible".equals(statut3)){
                loue_TOP3.setVisible(false);
            }
            if ("en marche".equals(etat3)){
                panne_TOP3.setVisible(false);
            }
            modele_top3.setText(modele3);
            prix_top3.setText(String.format("%.2f DT / jour", prix3));
            
            
            if (photoBlob3 != null) {
                ImageIcon icon = new ImageIcon(photoBlob3.getBytes(1, (int)photoBlob3.length())); // Set default image if loading fails
                Image img = icon.getImage().getScaledInstance(pic2.getWidth(), pic2.getHeight(), Image.SCALE_SMOOTH);
                pic2.setIcon(new ImageIcon(img));
            }
            
            
            car_TOP3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    try {
                        dispose();
                        Affiche_voit_client m = new Affiche_voit_client(userid,immat);
                        m.setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(Acceuil.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Acceuil.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
        
        setDefaultCarValues(model_top1, prix_top1, loue_TOP1, panne_TOP1, "Modele 1");
        setDefaultCarValues(modele_top2, prix_top2, loue_TOP2, panne_TOP2, "Modele 2");
        setDefaultCarValues(modele_top3, prix_top3, loue_TOP3, panne_TOP3, "Modele 3");
    }
}
   
private void setDefaultCarValues(JLabel modelLabel, JLabel priceLabel, 
                               JLabel statusLabel, JLabel techLabel, 
                               String modelName) {
    modelLabel.setText(modelName);
    priceLabel.setText("0.00 DT / jour");
    statusLabel.setText("statut inconnu");
    statusLabel.setFont(new Font("Segoe UI", Font.PLAIN, 10));
    statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
    techLabel.setVisible(false);
    
    
    String defaultImagePath = System.getProperty("user.dir") + "\\src\\main\\java\\pic\\default_car.png";
    ImageIcon defaultIcon = new ImageIcon(defaultImagePath);
    
    if (modelLabel == model_top1) {
        Image img = defaultIcon.getImage().getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        pic.setIcon(new ImageIcon(img));
    } else if (modelLabel == modele_top2) {
        Image img = defaultIcon.getImage().getScaledInstance(pic1.getWidth(), pic1.getHeight(), Image.SCALE_SMOOTH);
        pic1.setIcon(new ImageIcon(img));
    } else if (modelLabel == modele_top3) {
        Image img = defaultIcon.getImage().getScaledInstance(pic2.getWidth(), pic2.getHeight(), Image.SCALE_SMOOTH);
        pic2.setIcon(new ImageIcon(img));
    }
}
    
    

    public  JPanel  createPanel(String model , String price , boolean L , boolean P ){
        JPanel car_panel = new JPanel() ; 
        JLabel img = new JLabel();
        JLabel modele = new JLabel();
        JLabel prix = new JLabel();
        JLabel loue_TOP4 = new JLabel();
        JLabel panne = new JLabel();

        img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        img.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        modele.setText(model);

        prix.setText(price);
        
         
        loue_TOP4.setBackground(new java.awt.Color(153, 0, 0));
        loue_TOP4.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        loue_TOP4.setText("louée");
        loue_TOP4.setVisible(false);
        
        if (L){
            loue_TOP4.setVisible(true);
        }
        
        
        panne.setBackground(new java.awt.Color(102, 0, 0));
        panne.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        panne.setForeground(new java.awt.Color(153, 0, 0));
        panne.setText("en panne");
        panne.setVisible(false);
        if(P){
            panne.setVisible(true);
        } 
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
                            .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            BorderFactory.createEmptyBorder(0, 0, 0, 0),  // external margin
            BorderFactory.createLineBorder(Color.BLACK)    // actual panel border
        ));
        return car_panel ;
    } 



    public final void createALLPanels(int voit) {
    try (Connection conn = getDatabaseConnection()) {
        String sql = "SELECT immatricule, modele, prix_journalier, statut_disponibilite, etat_technique, photo FROM Voiture";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            String modele = rs.getString("modele");
            double prix = rs.getDouble("prix_journalier");
            String statut = rs.getString("statut_disponibilite");
            String etat = rs.getString("etat_technique");
            Blob photoBlob = rs.getBlob("photo");
            String immat = rs.getString("immatricule"); 

            boolean louee = !"disponible".equalsIgnoreCase(statut);
            boolean enPanne = !"en marche".equalsIgnoreCase(etat);

            String formattedPrix = String.format("%.2f DT / jour", prix);

            JPanel panel = createPanel(modele, formattedPrix, louee, enPanne);
            show_panel.add(panel);
            show_panel.add(Box.createVerticalStrut(25));
            panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

            
            JLabel img = (JLabel) panel.getComponent(0);

try {
    if (photoBlob != null) {
        byte[] imageBytes = photoBlob.getBytes(1, (int) photoBlob.length());
        ImageIcon icon = new ImageIcon(imageBytes);
        Image scaled = icon.getImage().getScaledInstance(93, 97, Image.SCALE_SMOOTH);
        img.setIcon(new ImageIcon(scaled));
    } else {
        throw new Exception("photo is null");
    }
} catch (Exception e) {
    String path = System.getProperty("user.dir") + "\\src\\main\\java\\pic\\default_car.png";
    File imageFile = new File(path);

    if (!imageFile.exists()) {
        System.out.println("❌ File not found: " + imageFile.getAbsolutePath());
    } else {
        System.out.println("✅ Default image loaded from: " + imageFile.getAbsolutePath());
    }

    ImageIcon fallback = new ImageIcon(imageFile.getAbsolutePath());
    Image scaled = fallback.getImage().getScaledInstance(93, 97, Image.SCALE_SMOOTH);
    img.setIcon(new ImageIcon(scaled));
}



            
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    try {
                        dispose();
                        Affiche_voit_client m = new Affiche_voit_client(userid,immat);
                        m.setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(Acceuil.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Acceuil.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        }

        show_panel.revalidate();
        show_panel.repaint();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors du chargement des voitures: " + e.getMessage());
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bmw;
    private javax.swing.JPanel car_TOP1;
    private javax.swing.JPanel car_TOP2;
    private javax.swing.JPanel car_TOP3;
    private javax.swing.JLabel cheverolet;
    private javax.swing.JLabel hundai;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollp;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel loue_TOP1;
    private javax.swing.JLabel loue_TOP2;
    private javax.swing.JLabel loue_TOP3;
    private javax.swing.JLabel mazda;
    private javax.swing.JLabel mercedes;
    private javax.swing.JLabel model_top1;
    private javax.swing.JLabel modele_top2;
    private javax.swing.JLabel modele_top3;
    private javax.swing.JLabel notifs;
    private javax.swing.JLabel panne_TOP1;
    private javax.swing.JLabel panne_TOP2;
    private javax.swing.JLabel panne_TOP3;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel prix_top1;
    private javax.swing.JLabel prix_top2;
    private javax.swing.JLabel prix_top3;
    private javax.swing.JPanel show_panel;
    private javax.swing.JLabel to_acceuil;
    private javax.swing.JLabel to_settings;
    private javax.swing.JLabel user_FIDELE;
    private javax.swing.JLabel user_icon2;
    private javax.swing.JLabel username;
    private javax.swing.JLabel vw;
    // End of variables declaration//GEN-END:variables
}
