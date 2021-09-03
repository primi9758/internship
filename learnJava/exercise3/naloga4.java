import java.util.Scanner;

public class naloga4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean comma = false;

        for (int i = a; i <= b; i++) {
            boolean ifArmstrong = checkNumber (i);
            if (ifArmstrong == true) {
                if (comma == true) {
                    System.out.print(", ");
                }
                System.out.print(i);
                comma = true;
            }
        }
    }

    public static boolean checkNumber (int number) {
        int forPlaces = number;
        int places = 0;
        while (forPlaces >= 1) {
            forPlaces /= 10;
            places++;
        }

        int sum = 0;
        int forSum = number;
        int digit;
        int partialSum = 1;

        while (forSum >= 1) {
            digit = forSum % 10;
            forSum /= 10;
            partialSum = 1;
            for (int i = 0; i < places; i++) {
                partialSum *= digit; 
            }
            sum += partialSum;
        }

        if (number == sum) {
            return true;
        }

        return false;
    }    
}