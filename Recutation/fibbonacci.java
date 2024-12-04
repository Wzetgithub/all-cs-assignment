public class fibbonacci {



    public static int fib(int a, int b) {


        if (a > 2) {
            a--;
            b= fib(a, b) + fib((a-1) , b);
            
             return b;
            
            
        }
        else {
            return 1;
        }
        



        
    }
    public static void main(String[] args) {

        System.out.println(fib(Integer.parseInt(args[0]), 1));
        
        
    }
}