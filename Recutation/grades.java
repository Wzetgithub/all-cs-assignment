public class grades {

    public static char grade(int a) {
        if (a>=90&&a<=100) {
            return 'A';
        }
        if (a>=80 && a<90) {
            return'B';
        }
        
        if (a>=70 && a<80) {
            return'C';
        }
        if (a>=60 && a<70) {
            return'D';
        }
        if (a<60 && a>=0) {
            return 'F';
        }

        else{
            return 'N';
        }

    }
    public static void main(String[] args) {
        System.out.println(grade(95));
        System.out.println(grade(73));
        System.out.println(grade(83));
        System.out.println(grade(66));
        System.out.println(grade(0));
        System.out.println(grade(55));
        System.out.println(grade(100));
        System.out.println(grade(101));
        System.out.println(grade(0-101));
        
    }
    
}
