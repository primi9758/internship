import java.util.Arrays;
import java.util.Scanner;
public class naloga4 {
    public static void main (String[] args) {
        System.out.println("\n//4");

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        int len = sentence.length();
        String[] words;
        int spaces = 0;
        int number = 0;

        for (int i = 0; i < len; i++) {
            if (sentence.charAt(i) == ' ') {
                spaces++;
            }
        }
        
        words = new String [spaces+1];

        for (int i = 0; i < spaces + 1; i++) {
            words[i] = sc.next();
        }

        for (int i = 0; i < words.length; i++) {
                    System.out.println(words[i]);
        }

        for (int i = 0; i < words.length; i++) {
            if (words[i] == "java" || words[i] == "Java") {
                number++;
            }
        }

        System.out.println("Java or java is written " + number + " times");
    }
}