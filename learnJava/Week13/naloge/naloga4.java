import java.util.Scanner;

public class naloga4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        int counter = 0;

        for (int i = 1; i <= 9; i += 2) {
            for (int j = m + 1; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if (k % d == 0) {
                        System.out.print(i);
                        System.out.print(j);
                        System.out.print(k);
                        System.out.println();
                        counter++;
                    }
                }
            }
        }

        System.out.printf("Number of combinations: %d", counter);
    }
}