public class Week2{
    public static void main(String[] args){
        //1
        int n = 501; //(int)Math.ceil(Math.random()*1000); for a random number between 1 and 1000
        int num = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
                num++;
            } 
        }
        System.out.println("Number of denominators: " + num);

        //2
        int x = (int)Math.round(Math.random()*10 +7);
        int min = 100000000;
        int[] numbers = {12, 33, 15, 22, 36};
        for(int i : numbers){
            if(i < min){
                min = i;
            }
        }
        System.out.println(min);
        System.out.println(x);

        if(min > x){
            System.out.println(min);
        }
        else{
            System.out.println("The number is too small.");
        }

        //3
        int number = 1234;
        int reverse = 0;
        int number1;

        if(number > 0){
        number1 = number;
        }
        if(number < 0){
        number1 = Math.abs(number);
        }
        if(number == 0){
            System.out.println(0);
        }

        int length = (int) (Math.log10(number) + 1);

        for(int i = 0; i < length; i++){
        int digit = number % 10;
        reverse = 10 * reverse + digit;
        number /= 10;
        }
        System.out.println(reverse);

        //4
        String txt = "jav kgev egv evg gbve java";
        
    }
}