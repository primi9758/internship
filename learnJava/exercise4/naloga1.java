import java.util.Scanner;

public class naloga1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
        double number = 0;
        double max = Integer.MIN_VALUE;
        int which = 0;

        for (int i = 0; i < n; i++) {
            number = sc.nextDouble();
            if (number > max) {
                max = number;
                which = i;
            }
        }
        number = (Math.round(number*100.0))/100.0;
        System.out.printf("The biggest of these numbers is %.2f with an index of %d.", number, which);
    }
}