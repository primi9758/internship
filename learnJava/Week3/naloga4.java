public class naloga4{
    public static void main(String[] args){
            int x, y;
        //x in y are numbers, that are received from input fields, but I don't yet know how to do one
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
}
}