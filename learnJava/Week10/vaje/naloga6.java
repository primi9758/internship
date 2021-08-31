import java.util.*;
public class naloga6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String scores = sc.nextLine();
        int len = scores.length();
        int spaces = 0;
        int[] eachScore;

        for(int i = 0; i < len; i++){
            if(scores.charAt(i) == ' ') {
                spaces++;
            }
        }

        eachScore = new int [spaces + 1];

        for (int i = 0; i < spaces + 1; i++) {
            eachScore[i] = sc.nextInt();
        }

        int max = -1000000;
        int whichOne = 0;;
        for (int i = 0; i < eachScore.length; i++) {
            if (eachScore[i] > max){
                max = eachScore[i];
                whichOne = i + 1;
            }
        
        }
        System.out.println("Athlete number " + whichOne + " was the best with the score of " + max + ".");    
    }
}