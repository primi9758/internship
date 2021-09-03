import java.util.Scanner;

public class naloga5 {
    public static void main (String[] args) {
        System.out.print("Input, how many numbers are going to be to inputed and then write in only different numbers!");
        Scanner sc = new Scanner (System.in);
		int k = sc.nextInt();
        int[] numbers = new int[2 * k + 1];

        for (int i = 0; i < 2 * k + 1; i++) {
            numbers[i] = sc.nextInt();
        }

        int smaller;
        int bigger;

        for (int i = 0; i < (2 * k + 1); i++) {
            smaller = 0;
            bigger = 0;
            for (int j = 0; j < (2 * k + 1); j++) {
                if (i != j){
                    if (numbers[i] < numbers[j]){
                        smaller++;
                    } else if (numbers[i] > numbers[j]) {
                        bigger++;
                    }
                }
            }

            if (smaller == k && bigger == k) {
                System.out.printf("The middle number is %d.", numbers[i]);
            }
        }

    }
}