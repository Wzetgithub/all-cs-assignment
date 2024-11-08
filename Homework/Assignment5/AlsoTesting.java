public class AlsoTesting {
    public static void main(String[] args) {
        int count = 0;
        int num = Integer.parseInt(args[0]);
        int temp = num;
        int tet = num;
        int test = 0;
        while (!(temp==0)) {
            temp/=10;
            count++;
            System.out.println(count);
        }
            while (count >= 0) {
                for (int i = 1; i<=count; i++) {
                    tet=num;
                    double min = Math.pow(10, count-i);
                    // System.out.println(min);
                    int bet = (int)min;
                    test = num-(num-(num%bet));
                    tet = test;
                    
                    System.out.println(i + " " + num + " " + min +" " + bet + " " + test);
                    
                    
                    
                    
                    
             }
             num-=test;
             System.out.println(num);
             count--;
        }
            
        
    }
    
}
