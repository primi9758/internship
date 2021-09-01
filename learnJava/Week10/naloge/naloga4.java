import java.util.Scanner;

public class naloga4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int M = sc.nextInt();
        int fac = 1;

        for (int i = 1; i <= M; i++) {
            fac *= i;
        }

        System.out.printf("The factorial of " + M + " is %d", fac);
    }
}