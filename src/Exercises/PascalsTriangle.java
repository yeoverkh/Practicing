package Exercises;

import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        int[][] arr = new int[numRows][];
        arr[0] = new int[] {1};
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            List<Integer> row = new ArrayList<>(List.of(arr[0][0]));
            result.add(row);
            return result;
        }
        arr[1] = new int[] {1, 1};
        for (int i = 2; i < numRows; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = 1;
            arr[i][i] = 1;
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        for (int[] array : arr) {
            List<Integer> row = new ArrayList<>();
            for (int num : array) {
                row.add(num);
            }
            result.add(row);
        }
        return result;
    }
}
