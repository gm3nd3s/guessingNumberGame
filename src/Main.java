public class Main {
    public static void main(String[] args) {

        GameLogic gameLogic = new GameLogic();

        System.out.println("Hello! Let's play a game! Guess my number!");
        System.out.println(gameLogic.playGame("John", "Tânia", 10));
    }
}