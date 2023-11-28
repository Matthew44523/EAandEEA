import java.util.Scanner;

public class EAandEEA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the first integer for the EA");
        int a = in.nextInt();
        System.out.println("Please enter the second integer for the EA");
        int b = in.nextInt();
        System.out.println("The GCD of " + a + " and " + b + " is: " + ea(a, b));

    }

    public static int ea(int a, int b){

        if(a == 0) {
            return b;
        }
        return ea(b%a,a);

    }
}