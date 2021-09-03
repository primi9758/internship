import java.util.Scanner;

public class naloga2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
        double[] numbers = new double[n];
        double sum = 0;
        double u = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        u = sum / n;

        System.out.printf("The arithmetic mean of these numbers is %.2f.", u);
    }
}