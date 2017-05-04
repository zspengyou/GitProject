package chapter4BFS;

public class NumberOfIslands {
	public int numIslands(boolean[][] grid) {
		if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
			return 0;
		}
		int count = 0;
		int row = grid.length;
		int col = grid[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] == true) {
					count++;
					markByDFS(grid, i, j);
				}
			}
		}
		return count;

	}

	private void markByDFS(boolean[][] grid, int row, int col) {
		if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length)
			return;
		if (grid[row][col] == true) {
			grid[row][col] = false;
			markByDFS(grid, row - 1, col);
			markByDFS(grid, row + 1, col);
			markByDFS(grid, row, col - 1);
			markByDFS(grid, row, col + 1);
		}
	}
}
