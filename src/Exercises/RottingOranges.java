package Exercises;

import java.util.Arrays;

public class RottingOranges {

    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        grid[0] = new int[] {2, 1, 1};
        grid[1] = new int[] {1, 1, 0};
        grid[2] = new int[] {0, 1, 1};
        System.out.println(orangesRotting(grid));
        System.out.println(Arrays.deepToString(grid));
    }

    public static int orangesRotting(int[][] grid) {
        int[] indexes = findRotten(grid);
        if (indexes == null) return -1;
        int row = indexes[0];
        int column = indexes[1];
        int count = 0;
        if (column + 1 < grid[row].length) count += countMinutes(grid, row, column + 1, 0);
        if (row + 1 < grid.length) count += countMinutes(grid, row + 1, column, 0);
        if (row >= 1) count += countMinutes(grid, row - 1, column, 0);
        if (column >= 1) count += countMinutes(grid, row, column - 1, 0);
        return count;
    }

    private static int countMinutes(int[][] grid, int row, int column, int count) {
        System.out.println("counting..");
        if (grid[row][column] == 1) {
            grid[row][column] = 2;
            count++;
            System.out.println("count++ " + count);
            if (row + 1 < grid.length) count += countMinutes(grid, row + 1, column, 0);
            if (column + 1 < grid[row].length) count += countMinutes(grid, row, column + 1, 0);
            if (row >= 1) count += countMinutes(grid, row - 1, column, 0);
            if (column >= 1) count += countMinutes(grid, row, column - 1, 0);
        }

        return count;
    }

    private static int[] findRotten(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) return new int[] {i, j};
            }
        }
        System.out.println("not found");
        return null;
    }
}
