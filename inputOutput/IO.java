public class IO {
    public static void main(String[] args) {

        //javac IO.java
        //java IO 5 6
        System.out.println("Enter an integer: ");   
        int x = StdIn.readInt();
        System.out.println("Enter a second integer: ");
        int y = StdIn.readInt();
        System.out.println("Sum: " + (x+y));
        System.out.println((int)Math.random());
    }
    
}
