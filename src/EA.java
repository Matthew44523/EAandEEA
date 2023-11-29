import java.util.Scanner;

public class EA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the modulus N for the EA");
        int n = in.nextInt();
        System.out.println("Please enter integer a for the EA");
        int a = in.nextInt();
        System.out.println("The GCD of " + n + " and " + a + " is: " + ea(n, a));


    }

    public static int ea(int n, int a){

        if(n == 0) {
            return a;
        }
        return ea(a%n,n);

    }


}