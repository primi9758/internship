import java.util.Arrays;
import java.util.Scanner;
public class naloga1{
    public static void main(String[] args){
        System.out.println("//1");
        int n = 502; //(int)Math.ceil(Math.random()*1000); for a random number between 1 and 1000
        int num = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
                num++;
            } 
        }
        System.out.println("Number of denominators: " + num);
    }
}