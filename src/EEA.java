import java.util.Scanner;

public class EEA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the modulus N for the EEA");
        int n2 = in.nextInt();
        System.out.println("Please enter integer a for the EEA");
        int a2 = in.nextInt();

        int result = eea(n2, a2, 1, 1);

        if (result == 1) {
            System.out.println("The ");
        }
        else{
            System.out.println("Error, the inverse does not exist");
        }

    }

    public static int eea(int n, int a, int x, int y){

        if(n == 0){

            x = 0;
            y = 0;
            return a;

        }

        int x1 = 1, y1 = 1;
        int gcd = eea(a%n,n,x1,y1);

        x = y1 - (a/n) * x1;
        y = x1;

        return gcd;

    }


}
