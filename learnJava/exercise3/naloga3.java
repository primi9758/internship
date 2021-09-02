import java.util.Scanner;

public class naloga3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean comma = false;

        for (int i = a; i <= b; i++) {
            boolean palindrom = checkNumber (i);
            if (palindrom == true) {
                if (comma == true) {
                    System.out.print(", ");
                }
                System.out.print(i);
                comma = true;
            }
        }
    }

    public static boolean checkNumber (int number) {
        int dividend = number;
        int digit;
        int reverse = 0;

        while (dividend > 0){
            digit = dividend % 10;
            dividend /= 10;
            reverse = 10 * reverse + digit;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }    
}