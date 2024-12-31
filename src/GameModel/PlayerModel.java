package GameModel;

public class PlayerModel {
	private String name;
    private int score;
    private int remainingInteractions;

    public PlayerModel(String name) {
        this.name = name;
        this.score = 0;
        this.remainingInteractions = 10; // Par défaut, 10 interactions
    }

    public String getName() { return name; }
    public int getScore() { return score; }
    public int getRemainingInteractions() { return remainingInteractions; }

    public void incrementScore(int points) { this.score += points; }
    public void decrementInteractions() { this.remainingInteractions--; }
}
