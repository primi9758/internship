import java.util.Scanner;

public class naloga1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[n - i - 1] = sc.nextInt();
        }

        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
            System.out.print(numbers[i]);
            } else {
                System.out.printf("%d, ", numbers[i]);
            }
        }
        System.out.print("]");
    }
}