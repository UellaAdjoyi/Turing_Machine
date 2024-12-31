/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameModel;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Uella Adjoyi
 */
public class GameModel {
	private String gameStatus;
    private int score;
    private int remainingInteractions;
    private List<String[]> questions; 
    private List<String[]> hints;  // Liste d'indices associés aux questions
    private int currentQuestionIndex;
    private int remainingHints; // Nombre d'indices restants

    public GameModel() {
        this.gameStatus = "En attente...";
        this.score = 0;
        this.remainingInteractions = 10; // Par défaut, 10 interactions
        this.currentQuestionIndex = 0;
        this.remainingHints = 3; // Par défaut, 3 indices disponibles

     // Initialisation des questions et réponses
        this.questions = new ArrayList<>();
        questions.add(new String[]{"Quel est le mot de passe caché ?", "TURING"});
        questions.add(new String[]{"Quelle combinaison de chiffres est correcte ?", "1234"});
        questions.add(new String[]{"Quel est le résultat de 2+2 ?", "4"});
    
        this.hints = new ArrayList<>();
        hints.add(new String[]{"Indice pour la question 1 : Pensez à une machine célèbre.", "TURING"});
        hints.add(new String[]{"Indice pour la question 2 : C'est un nombre entre 1000 et 2000.", "1234"});
        hints.add(new String[]{"Indice pour la question 3 : Simple calcul de mathématiques.", "4"});
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String status) {
        this.gameStatus = status;
    }
    
    public int getScore() {
        return score;
    }
    // Getter pour les interactions restantes
    public int getRemainingInteractions() {
        return remainingInteractions;
    }

    // Décrémente le nombre d'interactions restantes
    public void decrementInteractions() {
        if (remainingInteractions > 0) {
            remainingInteractions--;
        }
    }

    // Augmente le score
    public void incrementScore(int points) {
        this.score += points;
    }

    // Retourne la question actuelle
    public String getCurrentQuestion() {
        if (currentQuestionIndex < questions.size()) {
            return questions.get(currentQuestionIndex)[0];
        }
        return null; // Plus de questions disponibles
    }

    // Valide la réponse fournie par le joueur
    public boolean validateAnswer(String answer) {
        if (currentQuestionIndex < questions.size()) {
            String correctAnswer = questions.get(currentQuestionIndex)[1];
            return correctAnswer.equalsIgnoreCase(answer);
        }
        return false; // Plus de questions ou index incorrect
    }

    // Passe à la question suivante
    public void moveToNextQuestion() {
        if (currentQuestionIndex < questions.size() - 1) {
            currentQuestionIndex++;
        }
    }

    // Vérifie s'il reste des questions
    public boolean hasMoreQuestions() {
        return currentQuestionIndex < questions.size() - 1;
    }
    
    // Méthode pour obtenir un indice
    public String getHint() {
        if (remainingHints > 0) {
            remainingHints--;
            return hints.get(currentQuestionIndex)[0]; // Retourne l'indice associé à la question actuelle
        }
        return "Aucun indice disponible.";
    }

    public int getRemainingHints() {
        return remainingHints;
    }
}
