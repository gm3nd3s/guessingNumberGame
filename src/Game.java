public class Game {
    private int number;

    public Game(){
    }

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        this.number = Util.generateRandom();
    }
}
