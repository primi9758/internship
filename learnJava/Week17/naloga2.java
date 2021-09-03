import java.util.Scanner;

public class naloga2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
        int[] numbers = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        if (n == 1) {
            System.out.printf("The sum of this number is %d.", sum);
        } else {
            System.out.printf("The sum of these numbers is %d.", sum);
        }

        sc.close();
    }
}