import java.util.Scanner;

public class naloga8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit;
        int reverse = 0;
        int dividend = n;


        while (dividend > 0){
            digit = dividend % 10;
            dividend /= 10;
            reverse = 10 * reverse + digit;
        }

        if (n == reverse) {
            System.out.print("The number IS a plindrom!");
        } else {
            System.out.print("The number is not a plindrom.");
        }

    }
}