import java.util.Scanner;

public class naloga3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int minV = findv(a, b);
        System.out.printf("The smallest common multiple of %d and %d is %d.", a, b, minV);
    }

    public static int findv (int a, int b) {
        for (int i = 1; i <= b; i++){
            for (int j = 1; j <= a; j++) {
                if (a * i == b * j) {
                    return a * i;
                }
            }
        }
        return a * b;
    }
}