import java.util.*;
public class naloga4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }

    }
}