package chapter2;

public class SearchMatrix {

    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;
        if (matrix[0] == null || matrix[0].length == 0)
            return false;

        int rowNum = matrix.length;
        int colNum = matrix[0].length;
        if (matrix[0][0] > target || matrix[rowNum - 1][colNum - 1] < target)
            return false;
        int startRow = 0;
        int endRow = rowNum - 1;
        while (startRow <= endRow) {
            int midRow = startRow + (endRow - startRow) / 2;
            int min = matrix[midRow][0];
            int max = matrix[midRow][colNum - 1];
            if (min == target || max == target) {
                return true;
            } else if (max < target) {
                startRow = midRow + 1;
            } else if (min > target) {
                endRow = midRow - 1;
            } else {
                startRow = midRow;
                endRow = midRow;
                break;
            }
        }
        int startCol = 0;
        int endCol = colNum - 1;
        while (startCol <= endCol) {
            int midCol = startCol + (endCol - startCol) / 2;
            int val = matrix[startRow][midCol];
            if (val == target) {
                return true;
            } else if (val < target) {
                startCol = midCol + 1;
            } else {
                endCol = midCol - 1;
            }
        }
        return false;

    }

}
