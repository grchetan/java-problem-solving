public class Swastik {
  
    public static void main(String[] args) {

        int n = 7;
        int mid = n / 2;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {

                if (
                    // top right
                    (row == 0 && col > mid) ||

                    // middle vertical
                    (col == mid) ||

                    // middle horizontal
                    (row == mid) ||

                    // bottom left
                    (row == n - 1 && col < mid) ||

                    // left vertical
                    (col == 0)
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

  

