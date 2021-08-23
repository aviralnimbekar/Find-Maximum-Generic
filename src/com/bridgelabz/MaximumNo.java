package com.bridgelabz;

public class MaximumNo<T extends Comparable> {

    T input1, input2, input3, input4, input5;

    public MaximumNo(T input1, T input2, T input3, T input4, T input5) {
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.input4 = input4;
        this.input5 = input5;
    }

    public static <T extends Comparable> T findMaximum(T input1, T input2, T input3, T input4, T input5) {
        T max = input1;
        if (input2.compareTo(max) > 0)
            max = input2;
        if (input3.compareTo(max) > 0)
            max = input3;
        if (input4.compareTo(max) > 0)
            max = input4;
        if (input5.compareTo(max) > 0)
            max = input5;
        System.out.println("Maximum Number = " + max);

        return max;
    }

    public void testMaximum() {
        MaximumNo.findMaximum(input1, input2, input3, input4, input5);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Maximum number finding program");

        new MaximumNo<Integer>(2, 4, 6, 8, 10).testMaximum();
        new MaximumNo<Float>(1.2f, 1.4f, 1.6f, 1.8f, 1.11f).testMaximum();
        new MaximumNo<String>("Apple", "Peach", "Banana", "Greps", "Guava").testMaximum();
    }
}
