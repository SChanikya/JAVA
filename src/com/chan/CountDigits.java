
package com.chan;

public class CountDigits {
    public static int countDividingDigits(int n) {
        int count = 0;
        int temp = n; // Store original number

        while (temp != 0) {
            int digit = temp % 10;
            if (digit != 0 && n % digit == 0) {
                count++;
            }
            temp = temp / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDividingDigits(23));
    }
}
