public class GameLogic {

    public GameLogic(){

    }
    public String playGame(String playerOneName, String playerTwoName, int numberOfBestOfGames){
        Game game = new Game();
        Player player1 = new Player(playerOneName);
        Player player2 = new Player(playerTwoName);

        game.setNumber();
        player1.setNumber();
        player2.setNumber();

        int bestOfGames = numberOfBestOfGames / 2 + 1;

        while(player1.getScore() < bestOfGames || player2.getScore() < bestOfGames){
            System.out.println(results(game, player1, player2));

            game.setNumber();
            player1.setNumber();
            player2.setNumber();
        }
        return (bestOfGames == player1.getScore()? player1.getName() : player2.getName()) + "Won the game with " + bestOfGames + " match points in a best of " + numberOfBestOfGames + " matches!" ;
    }
    public void playersReplay(Player player1, Player player2){
        player1.setNumber();
        player2.setNumber();
    }


    public String results(Game game, Player player1, Player player2){
        boolean isThereAWinner = true;

        System.out.println("=================================");

        while (isThereAWinner){

            if(player1.getNumber() == game.getNumber() && player2.getNumber() == game.getNumber() ) {
                playersReplay(player1, player2);
                game.setNumber();
                System.out.println("DRAW! Play again!");
            }
            if(player1.getNumber() == game.getNumber()){
                player1.incrementScore();
                return player1.getName() + " wins with " + player1.getNumber() + "! "
                        + player1.getName() + " has now " + player1.getScore() + " points!";
            }
            if(player2.getNumber() == game.getNumber()){
                player2.incrementScore();
                return player2.getName() + " wins with " + player2.getNumber() + "! "
                        + player2.getName() + " has now " + player2.getScore() + " points!";
            }
            playersReplay(player1, player2);
            System.out.println("No player guessed the number! Let's try again!");
        }


        return "game over";
    }



}
