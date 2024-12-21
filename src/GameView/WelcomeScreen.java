/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameView;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;

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
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         mainPanel = new JPanel() {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                // Charger l'image de fond
//                ImageIcon backgroundImage = new ImageIcon("");
//                g.drawImage(backgroundImage.getImage(), 0, 0, this);
//            }
//        };
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Ajouter un titre de bienvenue
        welcomeLabel = new JLabel("Bienvenue dans le jeu Turing Machine");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setAlignmentX(CENTER_ALIGNMENT);
        mainPanel.add(welcomeLabel);

        // Ajouter un bouton pour démarrer le jeu
//       ImageIcon startIcon = new ImageIcon("");
//        startButton = new JButton("Commencer le jeu", startIcon);
        startButton = new JButton("Commencer le jeu");
        startButton.setFont(new Font("Arial", Font.PLAIN, 18));
        startButton.setAlignmentX(CENTER_ALIGNMENT);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        mainPanel.add(startButton);

        add(mainPanel);
        setVisible(true);
    }

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
