/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameView;

import java.awt.Dimension;
import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.Image;

/**
 *
 * @author Uella Adjoyi
 */
public class WelcomeScreen extends JFrame{
    private JPanel mainPanel;
    private JLabel welcomeLabel;
    private JButton startButton;

    public WelcomeScreen() {
    	setTitle("Bienvenue");
        setSize(500, 400); // Taille de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centrer la fenêtre à l'écran
        setLocationRelativeTo(null);

        // Panneau principal avec l'image de fond
        mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Charger l'image de fond (vérifiez le chemin de l'image)
                ImageIcon backgroundImage = new ImageIcon(getClass().getClassLoader().getResource("asset/homeBg.jpg"));
                if (backgroundImage != null) {
                    Image img = backgroundImage.getImage(); // Convertir en Image
                    Image resizedImg = img.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH); // Redimensionner
                    g.drawImage(resizedImg, 0, 0, this); // Dessiner l'image redimensionnée
                } else {
                    System.err.println("Image de fond non trouvée !");
                }
            }
        };

        // Utiliser un BoxLayout pour organiser les composants
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Ajouter un titre de bienvenue
        welcomeLabel = new JLabel("Bienvenue dans le jeu Turing Machine");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setAlignmentX(CENTER_ALIGNMENT);
        welcomeLabel.setForeground(Color.WHITE); // Ajouter une couleur claire pour le texte
        mainPanel.add(welcomeLabel);

        // Ajouter un bouton pour démarrer le jeu
        startButton = new JButton("Commencer le jeu");
        startButton.setFont(new Font("Arial", Font.PLAIN, 18));
        startButton.setAlignmentX(CENTER_ALIGNMENT);
        startButton.setBackground(new Color(0, 102, 204)); // Couleur de fond du bouton
        startButton.setForeground(Color.WHITE); // Couleur du texte du bouton
        mainPanel.add(Box.createRigidArea(new Dimension(0, 50))); // Espacement
        mainPanel.add(startButton);

        add(mainPanel); // Ajouter le panneau à la fenêtre
        setVisible(true); // Afficher la fenêtre
    }

    // Getters pour accéder aux composants (optionnel)
    public JButton getStartButton() {
        return startButton;
    }

    public JLabel getWelcomeLabel() {
        return welcomeLabel;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
    
}
