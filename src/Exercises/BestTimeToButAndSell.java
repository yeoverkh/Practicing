package Exercises;

import java.util.Arrays;

public class BestTimeToButAndSell {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 4};
        int min = Arrays.stream(prices).min().getAsInt();
        int indexMin = Arrays.asList(Arrays.stream(prices).boxed().toArray(Integer[]::new)).indexOf(min);
        if (indexMin == prices.length - 1) {
            int res1 = 0;
        }
        int max = min;
        int indexMax = indexMin;
        for (int i = prices.length - 1; i > indexMin; i--) {
            if (prices[i] > max) {
                max = prices[i];
                indexMax = i;
            }
        }
        int res = max == min ? 0 : max - min;
    }
}
