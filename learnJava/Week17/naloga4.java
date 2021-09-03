import java.util.Scanner;

public class naloga4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int number;
        int index = 0;

        for (int i = 0; i < n; i++) {
            number = sc.nextInt();
            if (number < min) {
                min = number;
                index = i;
            }
        }

        System.out.printf("The index of the smallest number is %d.", index);

    }
}