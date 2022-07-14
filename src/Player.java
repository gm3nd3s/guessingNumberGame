public class Player {
    private String name;
    private int score;
    private int number;

    public Player (String name){
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore(){
        this.score++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        this.number = Util.generateRandom();
    }
}
