/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameView;
import javax.swing.*;
import java.awt.Font;
import java.awt.GridLayout;
/**
 *
 * @author Uella Adjoyi
 */
public class GameView extends JFrame {
    private JPanel mainPanel;
    private JLabel gameStatusLabel;
    private JButton playButton;
    private JButton quitButton;

    public GameView() {
        setTitle("Jeu Turing Machine");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1));

        // Label d'état du jeu
        gameStatusLabel = new JLabel("Statut du jeu : En attente...");
        gameStatusLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        gameStatusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(gameStatusLabel);

        // Bouton pour jouer un tour
        playButton = new JButton("Jouer un tour");
        playButton.setFont(new Font("Arial", Font.PLAIN, 18));
        mainPanel.add(playButton);

        // Bouton pour quitter le jeu
        quitButton = new JButton("Quitter");
        quitButton.setFont(new Font("Arial", Font.PLAIN, 18));
        mainPanel.add(quitButton);

        add(mainPanel);
        setVisible(true);
    }

    public JButton getPlayButton() {
        return playButton;
    }

    public JButton getQuitButton() {
        return quitButton;
    }

    public JLabel getGameStatusLabel() {
        return gameStatusLabel;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
