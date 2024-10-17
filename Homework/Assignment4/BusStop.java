/*
 * Write your program inside the main method to find the order
 * which the bus the student needs to take will arrive
 * according to the assignemnt description. 
 *
 * To compile:
 *        javac BusStop.java
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */


public class BusStop {

    public static void main(String[] args) {

        char[] a = new char [args.length];
        for (int i = 0; i < args.length; i++) {
            a[i] = args[i].charAt(0);
            System.out.println(a[i]);
            
        }


        

    }
}
