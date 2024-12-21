/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameModel;

/**
 *
 * @author Uella Adjoyi
 */
public class GameModel {
    private String gameStatus;

    public GameModel() {
        this.gameStatus = "En attente...";
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String status) {
        this.gameStatus = status;
    }
}
