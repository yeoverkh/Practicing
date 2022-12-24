package Exercises;

public class HammingWeight {

    public static void main(String[] args) {

        System.out.println("hamming weight: " + hammingWeight(0b00000000000000000000000000100101, 32));
    }

    public static int hammingWeight(int n, int length) {
        int count = 0;
        int a = 1;
        for (int i = 0; i < length; i++) {
            if ((n & a) != 0) count++;
            a <<= 1;
        }
        return count;
    }
}
