package com.bridgelabz;

public class MaximumNo {

    public static void main(String[] args) {
        System.out.println("Welcome to Maximum number finding program");

        MaximumNo maxNumber = new MaximumNo();
        maxNumber.findMaximum(2, 4, 6);
    }

    public int findMaximum(Integer X, Integer Y, Integer Z) {
        Integer max = X;
        if (Y.compareTo(max) > 0)
            max = Y;
        if (Z.compareTo(max) > 0)
            max = Z;
        System.out.println("Maximum Number = " + max);

        return max;
    }
}
