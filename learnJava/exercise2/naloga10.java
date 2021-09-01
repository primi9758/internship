import java.util.Scanner;

public class naloga10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int steps = 1;

        while (n > 1) {
            if(n % 2 == 0) {
                n /= 2;
                steps++;
            } else {
                n= 3 * n + 1;
                steps++;
            }
        }

        System.out.print(steps);
    }
}