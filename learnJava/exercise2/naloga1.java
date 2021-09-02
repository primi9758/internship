import java.util.Scanner;

public class naloga1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        if (n > 1) {
            System.out.print(2);
        }
        for (int i = 3; i <= n; i += 2) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else if(j == i - 1){
                    System.out.print(", " + i);

                }
            }
        }
    }
}