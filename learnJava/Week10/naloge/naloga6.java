import java.util.Scanner;

public class naloga6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int i = 0;
        int places = 0;
        while (i < 1) {
            n /= 10;
            places++;
            if (n == 0) {
                i++;
            }
        }

        System.out.printf("This number has this many places: %d", places);
    }
}