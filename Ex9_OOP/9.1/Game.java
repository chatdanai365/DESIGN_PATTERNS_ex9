public abstract class Game {
    public final void playGame() {
        initializeGame();
        playingGame();
        showResult();
    }

    public abstract void initializeGame();
    public abstract void playingGame();
    public abstract void showResult();
}