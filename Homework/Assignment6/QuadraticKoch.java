/*************************************************************************
 * Compilation: javac QuadraticKoch.java
 * Execution: java QuadraticKoch n
 *
 * @author Jeremy Hui
 *
 *************************************************************************/
public class QuadraticKoch {

    /**
     * Gets the set of coordinates to draw one segment of the Quadratic Koch Curve.
     * Returns the coordinates in a 2D array of doubles in the following format:
     * {array of x-coordinates,
     * array of y-coordinates}
     * 
     * @param x0 the x-coordinate of one endpoint
     * @param y0 the y-coordinate of one endpoint
     * @param x5 the x-coordinate of the other endpoint
     * @param y5 the y-coordinate of the other endpoint
     * @return the set of coordinates to draw one segment of the Quadratic Koch
     *         Curve
     */
    public static double[][] getCoords(double x0, double y0, double x5, double y5) {
        double dx = (x5-x0)/3.0;
        double dy = (y5-y0)/3.0;
        double x1 = x0 + dx;
        double x2 = x1-dy;
        double x3 = x2+dx;
        double x4 = x3+dy;
        double y1 = y0 + dy;
        double y2 = y1+dx;
        double y3 = y2+dy;
        double y4 = y3-dx;
        System.out.println(x0 + " " + x1 + " " + x2 + " " + x3 + " " + x4 + " "+x5 + " ");
        double[][] gluh ={{x0, x1, x2,x3,x4,x5},{y0, y1, y2, y3, y4, y5}};
        return gluh;


        
    }

    /**
     * Gets the set of coordinates from getCoords() to draw the snowflake,
     * and calls Koch on two adjacent array indices with n being one less.
     * The method draws a line between the two endpoints if n == 0.
     * 
     * @param x0 the x-coordinate of one endpoint
     * @param y0 the y-coordinate of one endpoint
     * @param x5 the x-coordinate of the other endpoint
     * @param y5 the y-coordinate of the other endpoint
     * @param n  The current order
     */
    public static void koch(double x0, double y0, double x5, double y5, int n) {
        if (n==0) {
            StdDraw.line(x0,y0,x5,y5);
        }
        else {
            
            double[][] coords = getCoords(x0, y0, x5, y5);
            koch(coords[0][0], coords[1][0], coords[0][1], coords[1][1], n-1);
            koch(coords[0][1], coords[1][1], coords[0][2], coords[1][2], n-1);
            koch(coords[0][2], coords[1][2], coords[0][3], coords[1][3], n-1);
            koch(coords[0][3], coords[1][3], coords[0][4], coords[1][4], n-1);
            koch(coords[0][4], coords[1][4], coords[0][5], coords[1][5], n-1);
            

        }
    }

    /**
     * Takes an integer command-line argument n,
     * and draws a Quadratic Koch Curve of order n in a 1 x 1 canvas
     * with an initial square side length of 0.5.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        koch(.25, .75, .75, .75, n);
        koch(.75, .75, .75, .25, n);
        koch(.75, .25, .25, .25, n);
        koch(.25, .25, .25, .75, n);


        
    }
}