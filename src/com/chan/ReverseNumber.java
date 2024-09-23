package com.chan;
import java.util.Scanner;
public class ReverseNumber {
    public static int reverse(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number:");
        int input = sc.nextInt();
        int reversed = reverse(input);

        if (reversed % 10 == 0 && reversed != 0) {
            System.out.println(reversed / 10);
        } else {
            System.out.println(reversed);
        }/*
        if (String.valueOf(reversed).contains("-")) {
            System.out.println(reversed);
        } else if (String.valueOf(reversed).endsWith("0")) {
            System.out.println(reversed / 10);
        } else {
            System.out.println(reversed);
        }*/
    }

}
