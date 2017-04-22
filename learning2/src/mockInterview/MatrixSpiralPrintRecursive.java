package mockInterview;

public class MatrixSpiralPrintRecursive implements MatrixSpiralPrintI {
    @Override
    public void matrixSpiralPrint(int[][] matrix) {
        if (matrix == null || matrix[0] == null)
            return;
        int row = matrix.length;
        int column = matrix[0].length;
        printHelper(matrix, 0, 0, row - 1, column - 1);
    }

    void printHelper(int[][] matrix, int rowStart, int columnStart, int rowEnd, int columnEnd) {
        if (rowStart > rowEnd)
            return;
        if (columnStart > columnEnd)
            return;
        if (rowStart == rowEnd) {
            for (int i = columnStart; i <= columnEnd; i++) {
                System.out.println(matrix[rowStart][i]);
            }
            return;
        }
        if (columnStart == columnEnd) {
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.println(matrix[i][columnStart]);
            }
            return;
        }
        // print the first row
        for (int i = columnStart; i < columnEnd; i++) {
            System.out.println(matrix[rowStart][i]);
        }
        // print the right most column
        for (int i = rowStart; i < rowEnd; i++) {
            System.out.println(matrix[i][columnEnd]);
        }
        // print the bottom row
        for (int i = columnEnd; i > columnStart; i--) {
            System.out.println(matrix[rowEnd][i]);
        }
        // print the left column
        for (int i = rowEnd; i > rowStart; i--) {
            System.out.println(matrix[i][columnStart]);
        }

        printHelper(matrix, rowStart + 1, columnStart + 1, rowEnd - 1, columnEnd - 1);

    }

    public static void main(String[] args) {
        MatrixSpiralPrintRecursive test = new MatrixSpiralPrintRecursive();
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
