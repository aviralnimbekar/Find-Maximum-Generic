package com.bridgelabz;

public class MaximumNo {

    public static void main(String[] args) {
        System.out.println("Welcome to Maximum number finding program");

        MaximumNo maxNumber = new MaximumNo();
        maxNumber.findMaximum(2, 4, 6);
        maxNumber.findMaximum(1.2f,1.4f,1.6f);
        maxNumber.findMaximum("Apple", "Peach", "Banana");
    }

    public int findMaximum(Integer X, Integer Y, Integer Z) {
        Integer max = X;
        if (Y.compareTo(max) > 0)
            max = Y;
        if (Z.compareTo(max) > 0)
            max = Z;
        System.out.println("Maximum Number in Integer = " + max);

        return max;
    }

    public Float findMaximum(Float X, Float Y, Float Z) {
        Float max = X;
        if (Y.compareTo(max) > 0)
            max = Y;
        if (Z.compareTo(max) > 0)
            max = Z;
        System.out.println("Maximum Number in float = " + max);

        return max;
    }

    public String findMaximum(String X, String Y, String Z) {
        String max = X;
        if (Y.compareTo(max) > 0)
            max = Y;
        if (Z.compareTo(max) > 0)
            max = Z;
        System.out.println("Maximum Number in float = " + max);

        return max;
    }
}
