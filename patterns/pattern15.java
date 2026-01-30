public class pattern15 {
    public static void main(String[] args) {

        int n = 5;

        
        int totalRows = 2 * n - 1;

        for (int i = 1; i <= totalRows; i++) {

            int stars;
            int spaces;

            if (i <= n) {
                stars = i;
                spaces = n - i;
            } else {
                stars = totalRows - i + 1;
                spaces = i - n;
            }

           
            for (int s = 1; s <= spaces; s++) {
                System.out.print("  ");
            }

            
            for (int j = 1; j <= stars; j++) {
                System.out.print("*   ");
            }

            System.out.println();
        }
    }
}