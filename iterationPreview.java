public class iterationPreview {
    public static void main(String[] args) {
        int  count =1;
        int sum = 0;
        int n = Integer.parseInt(args[0]);
        while (count <=n) {
            sum = sum + count;
            count++;
        }
        System.out.println(sum);
    }
}
