public class FactorialExample {
    static int factorial(int f) {
        int fact = 1;
        for(int i = 1; i <=f; i++) {
           fact*=i;
        }
        return fact;
    }
    public static void main(String [] args) {
        int number = 4;
        System.out.println("For: " + number + "!= " + factorial(number));
    }
}
