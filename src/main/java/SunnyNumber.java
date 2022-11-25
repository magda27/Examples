import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to check");
        int num = scanner.nextInt();
        isSunnyNumber(num);

    }

    static boolean findPerfectSquare(double num) {
        double square_root = Math.sqrt(num);
        return((square_root - Math.floor(square_root)) == 0);
    }
    static void isSunnyNumber(int N) {


         if(findPerfectSquare(N+1)) {
             System.out.println("yes, it is a sunny number");
         }
         else {
             System.out.println(" sorry, not a sunny number");
         }
//return true;
    }
}
