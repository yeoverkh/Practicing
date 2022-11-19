package Exercises;

public class StringYak {
    public static void main(String[] args) {
        String str = "yakpak";
        String result = str.replaceAll("y.k", "");
        System.out.println(result);
    }
}
