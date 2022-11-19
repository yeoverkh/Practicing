package Exercises;

public class DetectCapitalUse {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("Leetcode"));
    }

    public static boolean detectCapitalUse(String word) {
        int length = word.length();
        if (length == 1) return true;
        String lowered = word.toLowerCase();
        String allCapitals = word.toUpperCase();
        String firstCapital = allCapitals.substring(0, 1) + lowered.substring(1, length);
        System.out.println(firstCapital);
        return word.equals(allCapitals) || word.equals(firstCapital) || word.equals(lowered);
    }
}
