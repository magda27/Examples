import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class ArmstrongNumber {

    static boolean isArmstrongNumber(int n) {
    int temp;
    int digits = 0;
    int last = 0;
    int sum = 0;
    temp = n;
        while(temp > 0){
            temp = temp/10;
            digits++;
        }
        temp = n;
        while(temp > 0){
            last = temp %10;
            sum +=(Math.pow(last,digits));
            temp = temp/10;
        }
        if(n == sum) return true;
        else return false;
    }

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = scanner.nextInt();
        if(isArmstrongNumber(num)) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");


    }
}
