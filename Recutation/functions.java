public class functions {

    public static double triArea (double a, double b){
        double area = (double)((a*b)/2);
        return area;

    }
    public static double tempConversion (double a){
        double constant = 9.0/5.0;
        double fTemp = (a*constant)+32;
        return fTemp;
    }    
    public static double speed (double a, double b) {
        double speed = a/b;
        return speed;
    }
    public static double diameter (double a) {
        double diameter = 2*a;
        return diameter;
    }

    public static void main(String[] args) {

        System.out.println(triArea(8, 3));
        System.out.println(tempConversion(100));
        System.out.println(speed(8, 2));
        System.out.println(diameter(15));
        
    }
}
