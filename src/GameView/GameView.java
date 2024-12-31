/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameView;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;

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
    private JLabel questionLabel;
    private JTextField answerField;
    private JButton submitButton;
    private JLabel interactionsLabel;
    private JButton hintButton;
    private JLabel hintLabel; 
    private JLabel scoreLabel; 
    
    public GameView() {
    	setTitle("Jeu Turing Machine");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10)); // Utilisation du BorderLayout pour organiser les composants

        // Panel principal pour les labels
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1, 5, 5));  // 4 lignes avec des espacements

        // Label d'état du jeu
        gameStatusLabel = new JLabel("Statut du jeu : En attente...");
        gameStatusLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        gameStatusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gameStatusLabel.setOpaque(true);  // Fond opaque pour la lisibilité
        gameStatusLabel.setBackground(new Color(200, 200, 255));  // Couleur de fond pour le label
        mainPanel.add(gameStatusLabel);

        // Score
        scoreLabel = new JLabel("Score : 0");
        scoreLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(scoreLabel);

        // Question
        questionLabel = new JLabel("Question : ");
        questionLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(questionLabel);

        // Champs de réponse et boutons
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());  // FlowLayout pour aligner horizontalement les composants
        answerField = new JTextField(20);
        inputPanel.add(answerField);

        submitButton = new JButton("Soumettre");
        submitButton.setFont(new Font("Arial", Font.PLAIN, 16));
        inputPanel.add(submitButton);

        // Ajout du panel d'entrée à la fenêtre principale
        add(inputPanel, BorderLayout.CENTER);

        // Panel pour les boutons d'action (jouer, indice, quitter)
        JPanel actionPanel = new JPanel();
        actionPanel.setLayout(new FlowLayout());  // FlowLayout pour aligner horizontalement
        playButton = new JButton("Jouer un tour");
        playButton.setFont(new Font("Arial", Font.PLAIN, 16));
        actionPanel.add(playButton);

        hintButton = new JButton("Obtenir un indice");
        hintButton.setFont(new Font("Arial", Font.PLAIN, 16));
        actionPanel.add(hintButton);

        quitButton = new JButton("Quitter");
        quitButton.setFont(new Font("Arial", Font.PLAIN, 16));
        actionPanel.add(quitButton);

        // Label pour l'affichage des indices
        hintLabel = new JLabel("Indice : Aucun");
        hintLabel.setFont(new Font("Arial", Font.ITALIC, 14));
        hintLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Label pour le nombre d'interactions restantes
        interactionsLabel = new JLabel("Interactions restantes : 10");
        interactionsLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        interactionsLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Ajout des panels à la fenêtre principale
        add(mainPanel, BorderLayout.NORTH);
        add(actionPanel, BorderLayout.SOUTH);
        add(hintLabel, BorderLayout.EAST);
        add(interactionsLabel, BorderLayout.WEST);

        // Affichage de la fenêtre
        setVisible(true);
    }

    // Méthodes d'accès pour les composants
    public JButton getPlayButton() {
        return playButton;
    }

    public JButton getQuitButton() {
        return quitButton;
    }

    public JLabel getGameStatusLabel() {
        return gameStatusLabel;
    }

    public JLabel getScoreLabel() {
        return scoreLabel;
    }

    public JLabel getQuestionLabel() {
        return questionLabel;
    }

    public JTextField getAnswerField() {
        return answerField;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public JLabel getInteractionsLabel() {
        return interactionsLabel;
    }

    public JButton getHintButton() {
        return hintButton;
    }

    public JLabel getHintLabel() {
        return hintLabel;
    }

    // Ajout d'un action listener au bouton "Jouer un tour"
    public void addPlayButtonListener(ActionListener listener) {
        playButton.addActionListener(listener);
    }

    // Ajout d'un action listener au bouton "Quitter"
    public void addQuitButtonListener(ActionListener listener) {
        quitButton.addActionListener(listener);
    }

    // Ajout d'un action listener au bouton "Soumettre"
    public void addSubmitButtonListener(ActionListener listener) {
        submitButton.addActionListener(listener);
    }

    // Ajout d'un action listener au bouton "Obtenir un indice"
    public void addHintButtonListener(ActionListener listener) {
        hintButton.addActionListener(listener);
    }
}
