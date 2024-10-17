public class vote {
        public static void main(String[] args) {
        try {
            double v = Double.parseDouble(args[0]);

        if (v >= 18) {
            System.out.println("Can vote");
        }
        if (v < 18 && v > 0){
            System.out.println("Cannot vote");
        }
        if (v <= 0) {
            System.out.println("Error");
        }
    
        } 
        catch (Exception e) {
            System.out.println("Please put a number.");
        }
}
}