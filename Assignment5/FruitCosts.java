/**
 * FruitCosts 
 * 
 * 1. This program reads in a list of fruits and their costs from a file (args[0]).
 * 2. Then finds the two lowest cost fruits and prints their names and costs
 * along with the total cost.
 * 
 * @author Srimathi Vadivel
 * @author Sarah Benedicto
 */
public class FruitCosts {
    /**
     * Main function to execute the program
     * 
     * @param args command-line arguments, where args[0] is the file name to read from
     */
    public static void main(String[] args) {

	// Do not remove this line, it opens the file for reading.
	StdIn.setFile(args[0]);

	// StdIn.readDouble, StdIn.readString() to read from the file
	
	// WRITE YOUR CODE HERE

    int count=0;
    int numOfFruit=StdIn.readInt();
    
    String[] spib = new String[numOfFruit];
    double[] prices = new double[numOfFruit];
    for (int i=0; i<numOfFruit; i++) {

        spib[i] = StdIn.readString();
        prices[i] = StdIn.readDouble();
    }
    double temp;
    String temp2;
    for (int j = 0; j<prices.length; j++) {
        for (int k = 0; k<prices.length-j; k++) {
            // System.out.println(k+j);
            if (prices[j]>prices[k+j]) {
                // System.out.println("J is " + j);
                // System.out.println("K is " + k);
                // System.out.println("Prices[j] is " + prices[j]);
                temp = prices[j];
                temp2 = spib[j];
                // System.out.println("temp is " + temp);
                prices[j] = prices[k+j];
                spib[j] = spib[k+j];
                // System.out.println("k+j is " + prices[k+j]);
                // System.out.println("New prices[j] is" + prices[j]);
                prices[k+j] = temp;
                spib[j+k] = temp2;
                
                // System.out.println("New prices[k] is " + prices[k]);
            }
            else;
        }
        
        // System.out.println(prices[j]);
        
    }
    double sum = 0;
    for (int i = 0; i<=1; i++) {
        System.out.println(spib[i] + " " + prices[i]);
        sum+=prices[i];
    }
    
    // System.out.println(sum);
    // System.out.println(sum%.01);
    double newSum = sum*100.0;
    newSum+=.1;
    newSum = (int) newSum;
    newSum*=1.00;
   newSum = newSum / 100.0;
   newSum+=.00;
   System.out.println("Total "+ newSum);
    // double trueSum = Math.round(sum);
    
    // System.out.println("Total " + trueSum);
    
    
        
       


    }
}
