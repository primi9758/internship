import java.util.Scanner;

public class naloga9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int forPlaces = n;
        int forSum = n;
        int places = 0;
        int digit;
        int partialSum = 1;        
        int sum = 0;

        while (forPlaces >= 1) {
            forPlaces /= 10;
            places++;
        }

        while (forSum >= 1) {
            digit = forSum % 10;
            forSum /= 10;
            partialSum = 1;
            for (int i = 0; i < places; i++) {
                partialSum *= digit; 
            }
            sum += partialSum;
        }

        if (n == sum) {
            System.out.print("This number IS an Armstrong number!");
        } else {
            System.out.print("This number is not an Armstrong number. The number is " + n + " and the sum is " + sum);

        }

    }
}