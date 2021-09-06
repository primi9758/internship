import java.util.Scanner;

public class naloga2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		long n = sc.nextLong();
        long m = sc.nextLong();

        long nForDigits = n;
        long mForDigits = m;
        int dn = 0;
        int dm = 0;

        long nForReverse = n;
        long mForReverse = m;
        int nDigit = 0;
        int mDigit = 0;
        long nReverse = 0;
        long mReverse = 0;

        long printedDigits, usedDigit;

        //determine the number of digits in n and m
        dn = digitize(nForDigits, dn);
        dm = digitize(mForDigits, dm);

        //reverse numbers n and m to be easier to read
        nReverse = reverse(nForReverse, nDigit, nReverse);
        mReverse = reverse(mForReverse, mDigit, mReverse);


        while(nReverse > 0 && mReverse > 0) {
            usedDigit = mReverse % 10;
            mReverse /= 10;
            for (int i = 0; i < usedDigit; i++) {
                printedDigits = nReverse % 10;
                nReverse /= 10;
                System.out.print(printedDigits);
            }
            System.out.println();
        }
    }

    public static int digitize(long xForDigits, int dx) {
        while (xForDigits > 0) {
            xForDigits /= 10;
            dx++;
        }
        return dx;
    }
    
    public static long reverse(long xForReverse, int xDigit, long xReverse) {
        while (xForReverse > 0) {
            xDigit = (int) (xForReverse % 10);
            xForReverse /= 10;
            xReverse = xReverse * 10 + xDigit;
        }
        return xReverse;
    }
}