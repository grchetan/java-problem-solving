class pattern18 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {

            // 1. spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // 2. increasing numbers
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            // 3. decreasing numbers
            for (int col = row - 1; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
