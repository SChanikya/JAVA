package com.chan;

public class Count_Digits {
    public static int count_digit(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10; // Corrected logic to divide by 10
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Count_Digits n = new Count_Digits(); // Corrected object instantiation
        System.out.println(n.count_digit(486));
    }


}
