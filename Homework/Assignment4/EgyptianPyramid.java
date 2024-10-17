
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
        int b = Integer.parseInt(args[1]);
        int bricks = b;
        char[][] test = new char[rows][rows];
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j<rows; j++) {
                if ((bricks > 0)&&(j<=rows-count-1)&&(j>=count)) {
                    
                        
                    test[Math.abs(i-rows)-1][j] = 'X';
                    bricks--;

                    
                }
                
                else{
                    test[Math.abs(i-rows)-1][j] = '=';
                }


            }
            count++;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j<rows; j++) {
                System.out.print(test[i][j]);
            }
            System.out.println();
        }
        System.out.println((bricks)+"_"+"Bricks"+"_"+"Remaining");
            

    }
        
}
