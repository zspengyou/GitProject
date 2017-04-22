package mockInterview;

public class TestMatrixSpiralPrint {
    public static void main(String[] args) {
        MatrixSpiralPrintI iterativeVersion = new MatrixSpiralPrintIterative();
        test(iterativeVersion);
        MatrixSpiralPrintI recursiveVersion = new MatrixSpiralPrintRecursive();
        test(recursiveVersion);
    }

    public static void test(MatrixSpiralPrintI test) {

        int[][] matrix = new int[1][1];
        matrix[0][0] = 0;
        // test 1
        System.out.println("test one: single element");
        test.matrixSpiralPrint(matrix);
        matrix = new int[1][2];
        for (int i = 0; i < 2; i++) {
            matrix[0][i] = i;
        }
        System.out.println("test two: single row");
        test.matrixSpiralPrint(matrix);
        // test 3
        matrix = new int[2][1];
        for (int i = 0; i < 2; i++) {
            matrix[i][0] = i;
        }
        System.out.println(" test three: single column");
        test.matrixSpiralPrint(matrix);
        // test 4
        matrix = new int[3][4];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = count++;
            }
        }
        System.out.println(" test four: normal case");
        test.matrixSpiralPrint(matrix);

    }

}
