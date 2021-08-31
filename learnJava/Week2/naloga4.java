import java.util.Arrays;
import java.util.Scanner;
public class naloga4{
        public static String toString(char[] a)
    {
        // Creating object of String class
        String string = new String(a);
 
        return string;
    }
    public static void main(String[] args){
        System.out.println("\n//4");
        String txt = "java kgev egv evg gbve java";
        String[] words;
        char[] letters;
        int len = txt.length();
        int c = 1;
        for (int i = 0; i < len; i++) {
            if (txt.charAt(i) != ' ') {
                words = new String[c];
                letters = new char[i+1];
                letters[i] = txt.charAt(i);
                
            } else if (txt.charAt(i) == ' '){
                //String word = String.valueOf(letters);
                //words[c-1] = word;
                //System.out.println(toString(letters));
                c++;
                break;
            }
        }

        char[] b = {'u', 'g', 'o', 'f', 'h'};
        System.out.println(Arrays.toString(b));

        /*for(int i = 0; i < letters.length; i++){
                    System.out.println(word);
        }*/
    }
}