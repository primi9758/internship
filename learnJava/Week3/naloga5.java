public class naloga5{
    public static void main(String[] args){
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