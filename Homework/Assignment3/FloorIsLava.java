
/*************************************************************************
 *  Compilation:  javac FloorIsLava.java
 *  Execution:    java FloorIsLava n
 *
 *  @author Shane Haughton, Maaz Mansuri
 *
 **************************************************************************/

public class FloorIsLava {

    public static void main (String[] args ) {

        int x = Integer.parseInt(args[0]);
        for (int i = 1; i <= x; i++) {
            if (i%2==0) {
                System.out.print(i + " ");
            }
    
        }
        for (int i = x; i > 0; i--) {
            if (i%2==1) {
                System.out.print(i + " ");
            }
        }
    
    }
}
