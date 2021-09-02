import java.util.Scanner;

public class naloga6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int places = 0;
        while (n > 0) {
            n /= 10;
            places++;
        }

        System.out.printf("This number has this many places: %d", places);
    }
}