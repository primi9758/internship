import java.util.Arrays;
import java.util.Scanner;
public class naloga3{
    public static void main(String[] args){
        System.out.println("\n//3");
        int number = 1234; //write in input field
        int reverse = 0;
        int number1;
        int prevNum = number;

        if(number > 0){
        number1 = number;
        }
        if(number < 0){
        number1 = Math.abs(number);
        }
        if(number == 0){
            System.out.println(0);
        }

        int length = (int) (Math.log10(number) + 1);

        for(int i = 0; i < length; i++){
        int digit = number % 10;
        reverse = 10 * reverse + digit;
        number /= 10;
        }
        System.out.println(prevNum + " to " + reverse);
    }
}