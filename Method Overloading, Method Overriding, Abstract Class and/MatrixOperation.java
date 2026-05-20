class MatrixOperation {

    void compute(int a, int b) {
        int sum = a + b;
        System.out.println("Addition of two numbers: " + sum);
    }

    void compute(int arr1[], int arr2[]) {
        System.out.println("Addition of two arrays:");

        for (int i = 0; i < arr1.length; i++) {
            int sum = arr1[i] + arr2[i];
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    void compute(int m1[][], int m2[][]) {
        System.out.println("Addition of two matrices:");

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                int sum = m1[i][j] + m2[i][j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        MatrixOperation obj = new MatrixOperation();

        obj.compute(5, 7);

        int a[] = {1, 2, 3};
        int b[] = {4, 5, 6};
        obj.compute(a, b);
        
        int m1[][] = {
            {1, 2},
            {3, 4}
        };

        int m2[][] = {
            {5, 6},
            {7, 8}
        };

        obj.compute(m1, m2);
    }
}