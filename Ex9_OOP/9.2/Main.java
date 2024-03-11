public class Main {
    public static void main(String[] args) {
        Game footballGame = new Game(new Football(), new Football(), new Football());
        footballGame.playGame();    

        Game basketballGame = new Game(new Basketball(), new Basketball(), new Basketball());
        basketballGame.playGame();
    }
}