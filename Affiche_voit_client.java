package myapp_location;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicScrollBarUI;

public final class Affiche_voit_client extends javax.swing.JFrame {
    private int userid;
    private String immat;
    public Affiche_voit_client(int userid,String immat) throws IOException, SQLException {
        this.immat=immat;
        this.userid=userid;
        initComponents();
        jScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollBar verticalBar = jScroll.getVerticalScrollBar();
        verticalBar.setUI(new BasicScrollBarUI() {
          @Override
          protected void configureScrollBarColors() {
          this.thumbColor = Color.GRAY; 
          this.trackColor = Color.LIGHT_GRAY; 
         }
        }); 
        loue_panel1.setVisible(false);
        louee_txt.setVisible(false);
        panne_panel1.setVisible(false);
        panne_txt.setVisible(false);
        Verif_etat();
        Remplissage_infos_voiture(this.immat) ; 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        notifs = new javax.swing.JLabel();
        to_settings = new javax.swing.JLabel();
        to_acceuil = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        paiement_parJour = new javax.swing.JLabel();
        myButton1 = new buttons.MyButton();
        jScroll = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        go_back = new javax.swing.JLabel();
        loue_panel1 = new javax.swing.JPanel();
        louee_txt = new javax.swing.JLabel();
        panne_panel1 = new javax.swing.JPanel();
        panne_txt = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        img_voiture = new javax.swing.JLabel();
        model_panel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        year_panel1 = new javax.swing.JPanel();
        img_cal = new javax.swing.JLabel();
        brand_panel1 = new javax.swing.JPanel();
        img_brand = new javax.swing.JLabel();
        type_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        color_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        matricule_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        modele = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        couleur = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        matricule = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        marque = new javax.swing.JLabel();
        panel_de_lannee = new javax.swing.JPanel();
        annee_pt1 = new javax.swing.JLabel();
        annee_pt2 = new javax.swing.JLabel();
        annee_pt3 = new javax.swing.JLabel();
        annee_pt4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

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

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\car (12).png"));
        jLabel8.setText("Paiement par Jour  : ");

        paiement_parJour.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        paiement_parJour.setText(".........");

        myButton1.setText("Réserver");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paiement_parJour, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paiement_parJour)
                    .addComponent(myButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        go_back.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        go_back.setText("<");
        go_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                go_backMouseClicked(evt);
            }
        });

        loue_panel1.setBackground(new java.awt.Color(51, 153, 0));

        louee_txt.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        louee_txt.setForeground(new java.awt.Color(255, 255, 255));
        louee_txt.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\car-rent (1).png"));
        louee_txt.setText("louée");

        javax.swing.GroupLayout loue_panel1Layout = new javax.swing.GroupLayout(loue_panel1);
        loue_panel1.setLayout(loue_panel1Layout);
        loue_panel1Layout.setHorizontalGroup(
            loue_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
            .addGroup(loue_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loue_panel1Layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(louee_txt)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        loue_panel1Layout.setVerticalGroup(
            loue_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(loue_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loue_panel1Layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(louee_txt)
                    .addGap(0, 2, Short.MAX_VALUE)))
        );

        panne_panel1.setBackground(new java.awt.Color(153, 0, 0));

        panne_txt.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        panne_txt.setForeground(new java.awt.Color(255, 255, 255));
        panne_txt.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\mechanic (1).png"));
        panne_txt.setText("en panne ");

        javax.swing.GroupLayout panne_panel1Layout = new javax.swing.GroupLayout(panne_panel1);
        panne_panel1.setLayout(panne_panel1Layout);
        panne_panel1Layout.setHorizontalGroup(
            panne_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(panne_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panne_panel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panne_txt)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panne_panel1Layout.setVerticalGroup(
            panne_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(panne_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panne_panel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panne_txt)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        img_voiture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(img_voiture, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(img_voiture, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        model_panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\car (10).png"));

        javax.swing.GroupLayout model_panel1Layout = new javax.swing.GroupLayout(model_panel1);
        model_panel1.setLayout(model_panel1Layout);
        model_panel1Layout.setHorizontalGroup(
            model_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, model_panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        model_panel1Layout.setVerticalGroup(
            model_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(model_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        year_panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        img_cal.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\calendar.png"));

        javax.swing.GroupLayout year_panel1Layout = new javax.swing.GroupLayout(year_panel1);
        year_panel1.setLayout(year_panel1Layout);
        year_panel1Layout.setHorizontalGroup(
            year_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, year_panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_cal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        year_panel1Layout.setVerticalGroup(
            year_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(year_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_cal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        brand_panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand_panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brand_panel1MouseClicked(evt);
            }
        });

        img_brand.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\car (3).png"));
        img_brand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_brandMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout brand_panel1Layout = new javax.swing.GroupLayout(brand_panel1);
        brand_panel1.setLayout(brand_panel1Layout);
        brand_panel1Layout.setHorizontalGroup(
            brand_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brand_panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        brand_panel1Layout.setVerticalGroup(
            brand_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brand_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_brand, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        type_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\car (13).png"));

        javax.swing.GroupLayout type_panelLayout = new javax.swing.GroupLayout(type_panel);
        type_panel.setLayout(type_panelLayout);
        type_panelLayout.setHorizontalGroup(
            type_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, type_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );
        type_panelLayout.setVerticalGroup(
            type_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(type_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        color_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\car-painting.png"));

        javax.swing.GroupLayout color_panelLayout = new javax.swing.GroupLayout(color_panel);
        color_panel.setLayout(color_panelLayout);
        color_panelLayout.setHorizontalGroup(
            color_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(color_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(color_panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        color_panelLayout.setVerticalGroup(
            color_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(color_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(color_panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        matricule_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\pic\\license-plate.png"));

        javax.swing.GroupLayout matricule_panelLayout = new javax.swing.GroupLayout(matricule_panel);
        matricule_panel.setLayout(matricule_panelLayout);
        matricule_panelLayout.setHorizontalGroup(
            matricule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matricule_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        matricule_panelLayout.setVerticalGroup(
            matricule_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matricule_panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("Modèle :");

        modele.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        modele.setText("....");
        modele.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setText("Type :");

        type.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        type.setText("....");
        type.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setText("Couleur :");

        couleur.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        couleur.setText("....");
        couleur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setText("Matricule de la Voiture:");

        matricule.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        matricule.setText("....");
        matricule.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setText("Marque ");

        marque.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        marque.setText("....");
        marque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panel_de_lannee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        annee_pt1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        annee_pt1.setText("2");

        annee_pt2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        annee_pt2.setText("0");

        annee_pt3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        annee_pt3.setText("2");

        annee_pt4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        annee_pt4.setText("3");

        javax.swing.GroupLayout panel_de_lanneeLayout = new javax.swing.GroupLayout(panel_de_lannee);
        panel_de_lannee.setLayout(panel_de_lanneeLayout);
        panel_de_lanneeLayout.setHorizontalGroup(
            panel_de_lanneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_de_lanneeLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_de_lanneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(annee_pt4)
                    .addComponent(annee_pt3)
                    .addComponent(annee_pt2)
                    .addComponent(annee_pt1))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panel_de_lanneeLayout.setVerticalGroup(
            panel_de_lanneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_de_lanneeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(annee_pt1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(annee_pt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(annee_pt3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(annee_pt4)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Année : ");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(model_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matricule_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modele, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matricule, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(marque, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brand_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(year_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panel_de_lannee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(color_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(couleur, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(type_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(go_back, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(loue_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panne_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panne_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loue_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modele))
                    .addComponent(model_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marque))
                    .addComponent(brand_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(year_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(type_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(type)))))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(panel_de_lannee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(color_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(couleur)))))
                .addGap(38, 38, 38)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matricule))
                    .addComponent(matricule_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jScroll.setViewportView(jPanel11);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(to_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(notifs, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(to_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(notifs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(to_settings, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(to_acceuil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void to_reserverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_reserverMouseClicked

            
    }//GEN-LAST:event_to_reserverMouseClicked

    private void brand_panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brand_panel1MouseClicked
        // il faut passer le nom du brand ou indice qui indique son nom pour afficher les voitures de la mçeme marque
        Aff_w_brands a = new Aff_w_brands(1,userid) ;
        a.setVisible(true);
        this.dispose() ;
    }//GEN-LAST:event_brand_panel1MouseClicked

    private void img_brandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_brandMouseClicked
        // il faut passer le nom du brand ou indice qui indique son nom pour afficher les voitures de la mçeme marque
        Aff_w_brands a = new Aff_w_brands(1,userid) ;
        a.setVisible(true);
        this.dispose() ;
    }//GEN-LAST:event_img_brandMouseClicked

    private void go_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_backMouseClicked
        Acceuil a = new Acceuil(userid);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_go_backMouseClicked

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        Reserver_voit a = new Reserver_voit(userid,immat);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_myButton1ActionPerformed
    private Connection getDatabaseConnection() throws SQLException {

    String url = "jdbc:mysql://localhost:3306/location";
        String user = "root";
        String password = "Meddhia@2004";
    return DriverManager.getConnection(url, user, password);
}
    
       // fct pour verifier si cest louee ou  en panne 
    public final String Verif_etat() throws SQLException {
    boolean L = false; 
    boolean P = false; 
    String res = "";
    try (Connection conn = getDatabaseConnection()) {
        String query = "SELECT etat_technique, statut_disponibilite FROM Voiture WHERE immatricule = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, immat);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String etatTechnique = rs.getString("etat_technique");
                    String statutDisponibilite = rs.getString("statut_disponibilite");

                    P = "en panne".equals(etatTechnique);

                    L = "non disponible".equals(statutDisponibilite);
                }
            }
        }

    if (L) {
        loue_panel1.setVisible(true);
        louee_txt.setVisible(true);
        res = "L"; 
    }
    if (P) {
        panne_panel1.setVisible(true);
        panne_txt.setVisible(true);
        res = "P";
    }
    return res; 
    }
   }
    
    public void Remplissage_infos_voiture(String immat) throws IOException {
    try (Connection conn = getDatabaseConnection()) {
        String query = "SELECT marque, modele, annee, couleur, prix_journalier, type, photo FROM Voiture WHERE immatricule = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, immat);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Get data from database
                    String marqueDB = rs.getString("marque");
                    String modeleDB = rs.getString("modele");
                    int anneeDB = rs.getInt("annee");
                    String couleurDB = rs.getString("couleur");
                    double prixDB = rs.getDouble("prix_journalier");
                    String typeDB = rs.getString("type");
                    Blob photoBlob = rs.getBlob("photo");

                    // Set car image (if exists in database)
                    if (photoBlob != null) {
                        InputStream is = photoBlob.getBinaryStream();
                        BufferedImage originalImage = ImageIO.read(is);
                        Image scaledImage = originalImage.getScaledInstance(219, 159, Image.SCALE_SMOOTH);
                        ImageIcon image = new ImageIcon(scaledImage);
                        img_voiture.setIcon(image);
                    } else {
                        // Default image if no photo in database
                        img_voiture.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\pic\\default_car"));
                    }

                    // Set year (split into 4 digits)
                    String anneeStr = String.valueOf(anneeDB);
                    if (anneeStr.length() == 4) {
                        annee_pt1.setText(String.valueOf(anneeStr.charAt(0)));
                        annee_pt2.setText(String.valueOf(anneeStr.charAt(1)));
                        annee_pt3.setText(String.valueOf(anneeStr.charAt(2)));
                        annee_pt4.setText(String.valueOf(anneeStr.charAt(3)));
                    }

                    // Set model
                    modele.setText(" " + modeleDB);

                    // Set brand and brand icon
                    marque.setText(" " + marqueDB);
                    setBrandIcon(marqueDB);

                    // Set type
                    type.setText(" " + typeDB);

                    // Set color
                    couleur.setText(" " + couleurDB);

                    // Set license plate (matricule)
                    matricule.setText(" " + immat);

                    // Set daily price
                    paiement_parJour.setText(" " + prixDB + " DT /Jour");
                }
            }
        }
    } catch (SQLException | IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erreur lors du chargement des informations de la voiture.", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
}

// Helper method to set brand icon
private void setBrandIcon(String marque) {
    String basePath = System.getProperty("user.dir") + "\\src\\main\\java\\pic\\";
    switch (marque.trim()) {
        case "Mercedes":
            img_brand.setIcon(new javax.swing.ImageIcon(basePath + "auto.png"));
            break;
        case "BMW":
            img_brand.setIcon(new javax.swing.ImageIcon(basePath + "car (1).png"));
            break;
        case "Volks Wagen":
            img_brand.setIcon(new javax.swing.ImageIcon(basePath + "car (2).png"));
            break;
        case "Hyundai":
            img_brand.setIcon(new javax.swing.ImageIcon(basePath + "car (3).png"));
            break;
        case "Peugeot":
            img_brand.setIcon(new javax.swing.ImageIcon(basePath + "car (4).png"));
            break;
        case "Chevrolet":
            img_brand.setIcon(new javax.swing.ImageIcon(basePath + "car (5).png"));
            break;
        case "Jaguar":
            img_brand.setIcon(new javax.swing.ImageIcon(basePath + "car (6).png"));
            break;
        case "Mazda":
            img_brand.setIcon(new javax.swing.ImageIcon(basePath + "car (7).png"));
            break;
        case "Opel":
            img_brand.setIcon(new javax.swing.ImageIcon(basePath + "car (9).png"));
            break;
        case "Skoda":
            img_brand.setIcon(new javax.swing.ImageIcon(basePath + "auto (1).png"));
            break;
        default:
            // Default icon if brand not found
            img_brand.setIcon(new javax.swing.ImageIcon(basePath + "car (12).png"));
            break;
    }
}
    
    
    
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Affiche_voit_client().setVisible(true);
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel annee_pt1;
    private javax.swing.JLabel annee_pt2;
    private javax.swing.JLabel annee_pt3;
    private javax.swing.JLabel annee_pt4;
    private javax.swing.JPanel brand_panel1;
    private javax.swing.JPanel color_panel;
    private javax.swing.JLabel couleur;
    private javax.swing.JLabel go_back;
    private javax.swing.JLabel img_brand;
    private javax.swing.JLabel img_cal;
    private javax.swing.JLabel img_voiture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScroll;
    private javax.swing.JPanel loue_panel1;
    private javax.swing.JLabel louee_txt;
    private javax.swing.JLabel marque;
    private javax.swing.JLabel matricule;
    private javax.swing.JPanel matricule_panel;
    private javax.swing.JPanel model_panel1;
    private javax.swing.JLabel modele;
    private buttons.MyButton myButton1;
    private javax.swing.JLabel notifs;
    private javax.swing.JLabel paiement_parJour;
    private javax.swing.JPanel panel_de_lannee;
    private javax.swing.JPanel panne_panel1;
    private javax.swing.JLabel panne_txt;
    private javax.swing.JLabel to_acceuil;
    private javax.swing.JLabel to_settings;
    private javax.swing.JLabel type;
    private javax.swing.JPanel type_panel;
    private javax.swing.JPanel year_panel1;
    // End of variables declaration//GEN-END:variables
}
