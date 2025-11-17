package myapp_location;

import java.sql.*;
import java.io.*;
import java.nio.file.Files;

public class UpdateCarPhotos {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/location";
        String user = "root";
        String password = "Meddhia@2004";

        // Map of license plates to image filenames
        String[][] carImages = {
            {"AA-123-MB", "1.jpg"},
            {"BB-456-MB", "2.jpeg"},
            {"CC-789-MB", "3.jpg"},
            {"DD-123-BM", "4.png"},
            {"EE-456-BM", "5.jpg"},
            {"FF-789-BM", "6.jpeg"},
            {"GG-123-VW", "7.jpg"},
            {"HH-456-VW", "8.jpg"},
            {"II-789-VW", "9.png"},
            {"JJ-123-HY", "10.jpg"},
            {"KK-456-HY", "11.png"},
            {"LL-789-HY", "12.jpg"},
            {"MM-123-CH", "13.jpg"},
            {"NN-456-CH", "14.jpeg"},
            {"OO-789-CH", "15.jpg"},
            {"PP-123-MZ", "16.jpeg"},
            {"QQ-456-MZ", "17.png"},
            {"RR-789-MZ", "18.jpg"}
        };

        String desktopPath = System.getProperty("user.home") + "/Desktop/";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("✅ Connected to database successfully!");

            // Prepare the update statement
            String sql = "UPDATE Voiture SET photo = ? WHERE immatricule = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            for (String[] car : carImages) {
                String immatricule = car[0];
                String filename = car[1];
                File imageFile = new File(desktopPath + filename);

                if (!imageFile.exists()) {
                    System.err.println("❌ File not found: " + imageFile.getAbsolutePath());
                    continue;
                }

                try (FileInputStream fis = new FileInputStream(imageFile)) {
                    // Set the image data as a BLOB parameter
                    pstmt.setBinaryStream(1, fis, (int) imageFile.length());
                    pstmt.setString(2, immatricule);

                    int rowsAffected = pstmt.executeUpdate();
                    if (rowsAffected > 0) {
                        System.out.println("✔ Updated photo for: " + immatricule);
                    } else {
                        System.out.println("⚠ No rows updated for: " + immatricule);
                    }
                } catch (IOException e) {
                    System.err.println("❌ Error reading file: " + filename);
                    e.printStackTrace();
                }
            }

            System.out.println("✅ All updates completed!");
        } catch (SQLException e) {
            System.err.println("❌ Database error:");
            e.printStackTrace();
        }
    }
}