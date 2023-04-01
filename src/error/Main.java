package error;

public class Main {

    public static void main(String[] args) {

        String a = "a";
        for (int i = 0; i < 1000000; i++) {
            a += a;
        }
        System.out.println(a);
    }
}
