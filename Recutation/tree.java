public class tree{
    public static void main(String[] args) {
        int rows = Integer.parseInt(args[0]);
        int completedRows = 1;
        while (completedRows <rows) {
            for (int i = 0; i < ((rows - completedRows)/rows); i++) {
                System.out.print(" ");
            }
            
            for (int i = 0; i < completedRows; i++) {
                System.out.print(completedRows);
            }
            
            for (int i = 0; i < (rows-completedRows); i++) {
                System.out.print(" ");
            }
            System.out.println();
            completedRows++;

        }
    }
}