/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameController;
import GameModel.*;

import GameView.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
/**
 *
 * @author Uella Adjoyi
 */
public class GameController {
    private GameModel gameModel;
    private GameView gameView;
    private PlayerModel playerModel;

    public GameController(GameModel model, GameView view,PlayerModel player) {
        this.gameModel = model;
        this.gameView = view;
        this.playerModel = player;

        this.gameView.getPlayButton().addActionListener(new PlayButtonListener());
        this.gameView.getQuitButton().addActionListener(new QuitButtonListener());
        this.gameView.getSubmitButton().addActionListener(new SubmitButtonListener());
        this.gameView.getHintButton().addActionListener(new HintButtonListener());  // Nouveau listener pour l'indice

    }
    
 // Listener pour le bouton "Obtenir un indice"
    private class HintButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String hint = gameModel.getHint();
            gameView.getHintLabel().setText("Indice : " + hint);  // Afficher l'indice
        }
    }

    // Mise à jour de l'état du jeu
    private void updateGameStatus(String status) {
        gameModel.setGameStatus(status);
        gameView.getGameStatusLabel().setText("Statut du jeu : " + status);
    }

    // Listener pour le bouton "Jouer un tour"
    private class PlayButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            updateGameStatus("Tour en cours...");
            gameView.getQuestionLabel().setText("Question : " + gameModel.getCurrentQuestion());
        }
    }

    // Listener pour le bouton "Quitter"
    private class QuitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0); // Quitte l'application
        }
    }
    
    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String answer = gameView.getAnswerField().getText();
            if (gameModel.validateAnswer(answer)) {
                playerModel.incrementScore(10);
                JOptionPane.showMessageDialog(gameView, "Bonne réponse ! Score : " + playerModel.getScore());
                gameModel.moveToNextQuestion();
            } else {
                JOptionPane.showMessageDialog(gameView, "Mauvaise réponse !");
            }

            playerModel.decrementInteractions();
            gameView.getInteractionsLabel().setText("Interactions restantes : " + playerModel.getRemainingInteractions());

            if (playerModel.getRemainingInteractions() <= 0 || !gameModel.hasMoreQuestions()) {
                JOptionPane.showMessageDialog(gameView, "Partie terminée ! Score final : " + playerModel.getScore());
                System.exit(0);
            } else {
                gameView.getQuestionLabel().setText("Question : " + gameModel.getCurrentQuestion());
            }
        }
    }
}
