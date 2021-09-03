import java.util.Scanner;

public class naloga4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
        int[] numbers = new int[n];
        boolean dif = true;
        int[] same;
        int counter = 1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (numbers[i] == numbers[j]) {
                        if (numbers[i] < min) {
                            min = numbers[i];
                        }
                        dif = false;
                    }
                }

            } 
        }

        if (dif == true) {
            System.out.print("DIFFERENT");
        } else {
            System.out.print(min);
        }

    }
}