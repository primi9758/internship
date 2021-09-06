import java.util.Scanner;

public class naloga1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
        int[] first = new int[n];
        int[] second = new int[n];
        int time;
        int minTime = Integer.MAX_VALUE;
        int which = 0;
        boolean canceled = true;

        for (int i = 0; i < n; i++) {
            first[i] = sc.nextInt();
            if(first[i] > 0) {
                second[i] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i ++) {
            if (first[i] > 0 && second[i] > 0) {
                time = first[i] + second[i];
                if (time < minTime) {
                    minTime = time;
                    which = i;
                }
                canceled = false;
            }
        }

        if (canceled == true) {
            System.out.print("NOBODY FINISHED");
        } else {
            System.out.printf("Competitor with number %d was the best with a time of %d.", which + 1, minTime);
        }
    }
}