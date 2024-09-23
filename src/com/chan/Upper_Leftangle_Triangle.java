package com.chan;

public class Upper_Leftangle_Triangle
{
    public static void main(String[] args) {
        Upper_Leftangle_Triangle ULT=new Upper_Leftangle_Triangle();
        ULT.Upper_left(5);

    }
    public void Upper_left(int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=n-i;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
