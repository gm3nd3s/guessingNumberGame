public class Util {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 10;

    public static int generateRandom(){
       return (int) Math.floor(Math.random() * (MAX_NUMBER - MIN_NUMBER + 1 ) + MIN_NUMBER);
    }

}
