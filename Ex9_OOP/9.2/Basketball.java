public class Basketball implements InitializeStrategy, PlayingStrategy, ResultStrategy {
    @Override
    public void initializeGame() {
        System.out.println("Initializing basketball game...");
    }

    @Override
    public void playingGame() {
        System.out.println("Playing basketball game...");
    }

    @Override
    public void showResult() {
        System.out.println("Showing the results for the basketball game...");
    }
}