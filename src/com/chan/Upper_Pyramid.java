package com.chan;

public class Upper_Pyramid {
    public static void main(String[] args) {
        Upper_Pyramid UP=new Upper_Pyramid();
        UP.Upper_pyramid_1(5);
        UP.Upper_pyramid_2(5);
    }
    public void Upper_pyramid_1(int n)
    {
        for(int i=0;i<n;i++)
        {
           // System.out.print(" *");
            for(int j=n-1;j>i;j--)
            {
                System.out.print("  ");
            }
           for(int k=0;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();

        }
    }
    public void Upper_pyramid_2(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
