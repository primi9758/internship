import java.util.Scanner;

public class naloga3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
        double[] numbers = new double[n];
        double sum = 0;
        double u = 0;
        double sigma = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        u = sum / n;

        for (int i = 0; i < n; i++) {
            sum += (numbers[i] - u) * (numbers[i] - u);
        }

        sigma = Math.sqrt(sum / n);

        System.out.printf("The standard deviation of these numbers is %.2f.", sigma);
    }
}