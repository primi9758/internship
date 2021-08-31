import java.util.Arrays;
import java.util.Scanner;
public class naloga5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PIN code.");


        int PIN = sc.nextInt();
        if(PIN == 2581){
            System.out.println("CORRECT!");
        }
        else{
            System.out.println("WRONG!");
        }

        sc.close();
    }
}