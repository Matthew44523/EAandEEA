import java.util.Scanner;

public class EEA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the modulus N for the EEA");
        int n = in.nextInt();
        System.out.println("Please enter integer a for the EEA");
        int a = in.nextInt();

        int result = eea(n, a);

        if (result == 1) {
            System.out.println("Error, the inverse does not exist");
        } else {
            System.out.println("The inverse of " + a + " mod " + n + " equals: " + result);   }

        }

    static int eea ( int a, int n)
    {
        for (int X = 1; X < a; X++)
            if (((n % a) * (X % a)) % a == 1)
                return X;
        return 1;
    }


}
