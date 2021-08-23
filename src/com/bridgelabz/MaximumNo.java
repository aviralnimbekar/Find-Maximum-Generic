package com.bridgelabz;

public class MaximumNo {

    public static void main(String[] args) {
        System.out.println("Welcome to Maximum number finding program");

        MaximumNo maxNumber = new MaximumNo();
        maxNumber.findMaximum(2, 4, 6);
        maxNumber.findMaximum(1.2f, 1.4f, 1.6f);
        maxNumber.findMaximum("Apple", "Peach", "Banana");
    }

    public <T extends Comparable> T findMaximum(T X, T Y, T Z) {
        T max = X;
        if (Y.compareTo(max) > 0)
            max = Y;
        if (Z.compareTo(max) > 0)
            max = Z;
        System.out.println("Maximum Number = " + max);

        return max;
    }
}
