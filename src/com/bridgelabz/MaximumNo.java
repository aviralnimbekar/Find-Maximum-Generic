package com.bridgelabz;

public class MaximumNo<T extends Comparable> {

    T X, Y, Z;

    public MaximumNo(T x, T y, T z) {
        X = x;
        Y = y;
        Z = z;
    }

    public static <T extends Comparable> T findMaximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        System.out.println("Maximum Number = " + max);

        return max;
    }

    public void testMaximum() {
        MaximumNo.findMaximum(X, Y, Z);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Maximum number finding program");

        new MaximumNo<Integer>(2, 4, 6).testMaximum();
        new MaximumNo<Float>(1.2f, 1.4f, 1.6f).testMaximum();
        new MaximumNo<String>("Apple", "Peach", "Banana").testMaximum();
    }
}
