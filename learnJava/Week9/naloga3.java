import java.util.*;
public class naloga3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        }
        else if(number % 2 == 1) {
            System.out.println("The number is odd.");
        }
    }
}