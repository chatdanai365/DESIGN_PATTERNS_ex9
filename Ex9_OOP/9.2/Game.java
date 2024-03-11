public class Game {
    private InitializeStrategy initializeStrategy;
    private PlayingStrategy playingStrategy;
    private ResultStrategy resultStrategy;

    public Game(InitializeStrategy init, PlayingStrategy play, ResultStrategy result) {
        this.initializeStrategy = init;
        this.playingStrategy = play;
        this.resultStrategy = result;
    }

    public void playGame() {
        initializeStrategy.initializeGame();
        playingStrategy.playingGame();
        resultStrategy.showResult();
    }

    public void setInitializeStrategy(InitializeStrategy init) {
        this.initializeStrategy = init;
    }

    public void setPlayingStrategy(PlayingStrategy  play) {
        this.playingStrategy = play;    
    }

    public void setResultStrategy(ResultStrategy result) {
        this.resultStrategy = result;
    }
}