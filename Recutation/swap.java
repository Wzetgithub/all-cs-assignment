public class swap {

    public static void swapper(int[] a, int b, int c) {

        int temp = a[b];
        a[b]=a[c];
        a[c]=temp;
        

    }
    public static void main(String[] args) {
        int count = 0;

        int[] test = new int[args.length - 2];
        for (int i = 0; i<args.length - 2; i++) {
            test[i]=Integer.parseInt(args[i]);
            count++;
        }
        swapper(test, Integer.parseInt(args[count]), Integer.parseInt(args[count+1]));
        for (int i = 0; i<test.length; i++) {
            System.out.print(test[i] + " ");
        }
        
    }
    
}
