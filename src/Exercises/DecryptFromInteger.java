package Exercises;

public class DecryptFromInteger {
    public static void main(String[] args) {

        System.out.println(freqAlphabets("1226#"));
    }

    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0, n = s.length();
        while (i < n) {
            boolean isBig = i + 2 < n && s.charAt(i + 2) == '#';
            char ch;
            if (isBig) {
                ch = (char) ('a' + Integer.parseInt(s.substring(i, i + 2)) - 1);
                i += 3;
            } else {
                ch = (char) ('a' + s.charAt(i) - '1');
                i++;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
