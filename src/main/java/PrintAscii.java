public class PrintAscii {
    public static void main(String[] args){
        char ch1 = 'a';
        char ch2 = 'b';

        int asciivalue1 = ch1;
        int asciivalue2 = ch2;
        System.out.println("The Ascii value of " + ch1 + " is: " + asciivalue1);
        System.out.println("The Ascii value of " + ch2 + " is: " + asciivalue2);

        int i1 = 'a';
        int i2 = 'b';
        System.out.println("The Ascii value of a = " + i1);
        System.out.println("The Ascii value of b = " + i2);

        int ascii1 = (int) ch1;
        int ascii2 = (int) ch2;

        System.out.println("The Ascii value of a = " + ascii1);
        System.out.println("The Ascii value of b = " + ascii2);


        for(int i = 65; i <= 90; i++)
        {
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
        }
    }
}
