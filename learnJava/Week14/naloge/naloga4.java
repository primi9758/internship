import java.util.Scanner;

public class naloga4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int maxD = findD(a, b);
        System.out.printf("The greatest common divisor of %d and %d is %d.", a, b, maxD);
    }

    public static int findD (int a, int b) {
        for (int i = a; i >= 1; i--){
            if (a % i == 0){
                for (int j = b; j >= 1; j--) {
                    if (b % j == 0) {
                        if (i == j) {
                            return i;
                        }
                    }
                }
            }
        }
        return 1;
    }
}