
public class testing {
   public static void main(String[] args) {
        StdOut.print("Num 1: ");
        int a = StdIn.readInt();
        StdOut.print("Num 2: ");
        int b = StdIn.readInt();
        StdOut.print("What operation? (+, -, *, /)");
        char op = StdIn.readChar();
        int sum = a+b;
        int dif = a-b;
        int prod = a*b;
        int quo;
        if (op == '*') {
         StdOut.println(prod);
        }
        if (op == '-') {
         StdOut.println(dif);
        }
        if (op == '+') {
         StdOut.println(sum);
        }
        if (op == '/') {
         
         if (b==0) {
            StdOut.println("Divide by zero error");
         }
         else {
            quo = a/b;
            System.out.print(quo);
        }
        }
        
   }
    
}
