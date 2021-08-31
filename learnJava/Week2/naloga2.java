import java.util.Arrays;
import java.util.Scanner;
public class naloga2{
    public static void main(String[] args){
        System.out.println("\n//2");
        int x = (int)Math.round(Math.random()*10 +7);
        int min = 100000000;
        int[] numbers = {12, 33, 15, 22, 36};
        for(int i : numbers){
            if(i < min){
                min = i;
            }
        }
        System.out.println(min);
        System.out.println(x);

        if(min > x){
            System.out.println(min);
        }
        else{
            System.out.println("The number is too small.");
        }
    }
}