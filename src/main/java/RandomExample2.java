import java.util.Random;

public class RandomExample2 {

    public static void main(String[] args) {
        randomInts(3);
        randomInts(3,100,130);
    }

    public static void randomInts(int num) {
        Random random = new Random();
        random.ints(num).forEach(System.out::println);
    }

    public static void randomInts(int num, int origin, int bound) {
        Random random1 = new Random();
        random1.ints(num, origin, bound).forEach(System.out::println);
    }


}
