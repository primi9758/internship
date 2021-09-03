import java.util.Scanner;

public class naloga3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int number;

        for (int i = 0; i < n; i++) {
            number = sc.nextInt();
            if (number < min) {
                min = number;
            }
        }

        System.out.printf("The smallest number is %d.", min);

    }
}