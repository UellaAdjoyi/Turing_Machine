/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import GameModel.*;
import GameView.*;
import GameController.*;
/**
 *
 * @author Uella Adjoyi
 */
public class WelcomeScreenController {
    private WelcomeScreenModel welcomeModel;
    private WelcomeScreen welcomeView;

    public WelcomeScreenController(WelcomeScreenModel model, WelcomeScreen view) {
        this.welcomeModel = model;
        this.welcomeView = view;

        this.welcomeView.getStartButton().addActionListener(new StartButtonListener());
    }

    // Listener pour démarrer le jeu
    private class StartButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            welcomeView.setVisible(false); // Cacher l'écran d'accueil
            createAndShowGameScreen(); // Créer et afficher l'écran de jeu
        }
    }

    // Créer et afficher l'écran de jeu
    private void createAndShowGameScreen() {
        // Créer le modèle de jeu
        GameModel gameModel = new GameModel();
        
        // Créer la vue du jeu
        GameView gameView = new GameView();
        
        // Créer le contrôleur du jeu
        GameController gameController = new GameController(gameModel, gameView);
    }
}
