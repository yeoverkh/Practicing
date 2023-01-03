package Exercises;

public class ReverseBits {

    public static void main(String[] args) {

        System.out.println(reverseBits(0b10000010100101011001111010001000));
    }

    public static int reverseBits(int n) {

        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result = result | (n & 1);
            n >>= 1;
        }

        return result;
    }
}
