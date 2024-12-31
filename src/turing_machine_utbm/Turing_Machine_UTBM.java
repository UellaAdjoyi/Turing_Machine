/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package turing_machine_utbm;

import javax.swing.*;
import GameController.*;
import GameModel.*;
import GameView.*;
/**
 *
 * @author Uella Adjoyi
 */
public class Turing_Machine_UTBM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	 // Lancer l'application dans le thread de l'interface graphique Swing
        SwingUtilities.invokeLater(() -> {
            // Modèle pour l'écran d'accueil
            WelcomeScreenModel welcomeModel = new WelcomeScreenModel();

            // Vue pour l'écran d'accueil
            WelcomeScreen welcomeView = new WelcomeScreen();

            // Contrôleur pour l'écran d'accueil
            WelcomeScreenController welcomeController = new WelcomeScreenController(welcomeModel, welcomeView) {
                protected void createAndShowGameScreen() {
                    // Transition vers le jeu principal lorsque l'utilisateur commence
                    GameModel gameModel = new GameModel();
                    PlayerModel playerModel = new PlayerModel("Étudiant"); // Initialisation avec un nom
                    GameView gameView = new GameView();
                    GameController gameController = new GameController(gameModel, gameView, playerModel);

                    // Afficher la vue du jeu et cacher l'écran d'accueil
                    welcomeView.setVisible(false);
                    gameView.setVisible(true);
                }
            };

            // Configuration de la fermeture propre de l'application
            welcomeView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
 
}
