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
       WelcomeScreenModel welcomeModel = new WelcomeScreenModel();
        
        // Créer la vue d'accueil
        WelcomeScreen welcomeView = new WelcomeScreen();
        
        // Créer le contrôleur d'accueil
        WelcomeScreenController welcomeController = new WelcomeScreenController(welcomeModel, welcomeView);
    }
 
}
