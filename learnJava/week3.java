import java.util.Arrays;
public class week3{
    public static void main(String[] args){
        //1
        System.out.println("Ucim se programirati.");

        //2
        System.out.println((33 + 5 * 6) / 7);

        //3
        System.out.print("Primoz Zidansek 2002");
        System.out.println(" Another one");

        //4
        int x, y;
        //x in y are numbers, that are received from input fields, but I have already written them in the program, because it is easier that way for me
        x = 220;
        y = 284;
        int sumx = 0;
        int sumy = 0;


        for(int i = 1; i <= (int)Math.ceil(x/2); i++){
            if(x % i == 0){
                sumx = sumx + i;
            }
        }

        for(int i = 1; i <= (int)Math.ceil(y/2); i++){
            if(y % i == 0){
                sumy = sumy + i;
            }
        }

        if(sumx == y && sumy == x){
            System.out.println("friendly numbers");
        }
        else{
            System.out.println("not friendly numbers");
        }

        //5
        int n;
        n = 10; //n is normally given with an input field
        int a = 1;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for(int i = 0; i < n-2; i++){
            int a1 = b;
            b = b + a;
            a = a1;
        System.out.println(b);
        }
    }
}