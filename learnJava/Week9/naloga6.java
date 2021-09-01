import java.util.Scanner;
public class naloga6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int len = sentence.length();
        int spaces = 0;
        int[] numbers;
        for (int i = 0; i < len; i++) {
            if (sentence.charAt(i) == ' ') {
                spaces++;
            }
        }

        numbers = new int[spaces + 1];

        for (int i = 0; i < spaces + 1; i++) {
            numbers[i] = (int) sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < spaces + 1; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
    System.out.println(min);
    
    }
}