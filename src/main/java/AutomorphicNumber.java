
public class AutomorphicNumber {
    static  boolean isAutomorphic(int num) {
        int squere = num * num;
        while (num >0) {
            if (num % 10 != squere % 10)
                return false;
            num = num/10;
            squere = squere/10;
        }
        return true;
    }

    public static void main(String [] args) {
        System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");
        System.out.println(isAutomorphic(13) ? "Automorphic" : "Not Automorphic");
    }
}
