import java.util.Scanner;

public class naloga3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int M = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= M; i++) {
            sum += i;
        }

        System.out.printf("The total sum is %d", sum);
    }
}