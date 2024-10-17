
/**
 * Compilation: javac EgyptianPyramid.java
 * Execution:   java EgyptianPyramid 'size of grid' 'number of initial blocks'
 * 
 * @author Ayla Muminovic
 * @author Kushi Sharma
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 */
public class EgyptianPyramid {
    
    public static void main(String[] args) {
        int rows = Integer.parseInt(args[0]);
        int bricks = Integer.parseInt(args[1]);
        char[][] test = new char[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j<rows; j++) {
                if (bricks > 0) {
                    test[i][j] = 'x';
                    bricks--;
                }
                else{
                    test[i][j] = '=';
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j<rows; j++) {
                System.out.print(test[i][j]);
            }
            System.out.println();
        }
            

    }
        
}
