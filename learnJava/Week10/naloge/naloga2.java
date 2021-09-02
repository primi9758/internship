import java.util.Scanner;

public class naloga2 {
    public static void main (String[] args) {
        Scanner sc1 = new Scanner (System.in);
        int M = sc1.nextInt();
        int num = (int) ((Math.random() * M) + 1);
        boolean guessed = false;
        
        System.out.printf("Guess the number between 1 and %d", M);
        System.out.println("");
        System.out.println("You have 3 tries.");

        Scanner sc2 = new Scanner (System.in);
        int guess1 = sc2.nextInt();

        if (guess1 < num) {
            System.out.println("It's bigger than that. You have 2 tries left.");
        } else if (guess1 > num) {
            System.out.println("It's smaller than that. You have 2 tries left.");
        } else {
            System.out.println("Congratulations! You guessed the number!");
            guessed = true;
        }

        if (guessed == false) {
            Scanner sc3 = new Scanner (System.in);
            int guess2 = sc3.nextInt();

            if (guess2 < num) {
                System.out.println("It's bigger than that. You have 1 try left.");
            } else if (guess2 > num) {
                System.out.println("It's smaller than that. You have 1 try left.");
            } else {
                System.out.println("Congratulations! You guessed the number!");
                guessed = true;
            }
        }

        if (guessed == false) {
            Scanner sc4 = new Scanner (System.in);
            int guess3 = sc4.nextInt();

            if (guess3 < num) {
                System.out.println("It's bigger than that.");
            } else if (guess3 > num) {
                System.out.println("It's smaller than that.");
            } else {
                System.out.println("Congratulations! You guessed the number on the last try!");
                guessed = true;
            }
        }

    }
}