package mockInterview;

public class IslandCount {

    public static void main(String[] args) {

        IslandCount test = new IslandCount();
        int[][] matrix = new int[5][5];
        int[] row0 = new int[] { 0, 1, 0, 1, 0 };
        int[] row1 = new int[] { 0, 0, 1, 1, 1 };
        int[] row2 = new int[] { 1, 0, 0, 1, 0 };
        int[] row3 = new int[] { 0, 1, 1, 0, 0 };
        int[] row4 = new int[] { 1, 0, 1, 0, 1 };
        matrix[0] = row0;
        matrix[1] = row1;
        matrix[2] = row2;
        matrix[3] = row3;
        matrix[4] = row4;
        System.out.println("input matrix is" );
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        int result = test.countIsland(matrix);
        System.out.println("number of island is : "+result);

    }

    private int countIsland(int[][] input) {
        if(input == null || input[0] == null)
            return 0;
        
        int islandCount = 0;
        int rowLength = input.length;
        int columnLength = input[0].length;
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if (input[i][j] == 0) {
                    continue;
                } else if (input[i][j] == 2) {
                    continue;
                } else {
                    input[i][j] = 2;
                    islandCount++;
                    dfs(input, i, j);
                }
            }
        }
        return islandCount;
    }

    private void dfs(int[][] input, int x, int y) {
        // left
        if (isValid(input, x - 1, y) && input[x - 1][y] == 1) {
            input[x - 1][y] = 2;
            dfs(input, x - 1, y);
        }
        // right
        if (isValid(input, x + 1, y) && input[x + 1][y] == 1) {
            input[x + 1][y] = 2;
            dfs(input, x + 1, y);
        }

        // up
        if (isValid(input, x, y - 1) && input[x][y - 1] == 1) {
            input[x][y - 1] = 2;
            dfs(input, x, y - 1);
        }

        // bottom
        if (isValid(input, x, y + 1) && input[x][y + 1] == 1) {
            input[x][y + 1] = 2;
            dfs(input, x, y + 1);
        }

    }

    private boolean isValid(int[][] input, int x, int y) {
        if (x < 0 || x >= input.length)
            return false;
        if (y < 0 || y >= input[0].length)
            return false;
        return true;
    }

}
