/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameController;
import GameModel.*;
import GameView.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Uella Adjoyi
 */
public class GameController {
    private GameModel gameModel;
    private GameView gameView;

    public GameController(GameModel model, GameView view) {
        this.gameModel = model;
        this.gameView = view;
        this.gameView.getPlayButton().addActionListener(new PlayButtonListener());
        this.gameView.getQuitButton().addActionListener(new QuitButtonListener());
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
            // Logique du jeu à ajouter ici
        }
    }

    // Listener pour le bouton "Quitter"
    private class QuitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0); // Quitte l'application
        }
    }
}
