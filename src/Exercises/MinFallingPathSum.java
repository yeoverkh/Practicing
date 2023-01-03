package Exercises;

import java.util.Arrays;

public class MinFallingPathSum {

    public static void main(String[] args) {

        System.out.println(minFallingPathSum(new int[][] {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}}));
    }

    public static int minFallingPathSum(int[][] matrix) {
        int[][] helper = new int[matrix.length][matrix.length];

        System.arraycopy(matrix[0], 0, helper[0], 0, matrix[0].length);

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0) {

                    helper[i][j] = helper[i - 1][j + 1];
                } else if (j == matrix[i].length - 1){

                    helper[i][j] = Math.min(helper[i - 1][j - 1], helper[i - 1][j]);
                } else {

                    helper[i][j] = Math.min(helper[i - 1][j - 1], Math.min(helper[i - 1][j], helper[i - 1][j + 1]));
                }
                helper[i][j] += matrix[i][j];
            }
        }

        System.out.println(Arrays.deepToString(helper));

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < helper[helper.length - 1].length; i++) {
            min = Math.min(min, helper[helper.length - 1][i]);
        }
        return min;
    }
}
