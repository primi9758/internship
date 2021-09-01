import java.util.Scanner;

public class naloga7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 1;

        for (int i = 0; i < y; i++){
            result *= x;
        }

        System.out.print(result);
    }
}