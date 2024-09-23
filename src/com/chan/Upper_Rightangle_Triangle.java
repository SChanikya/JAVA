package com.chan;

public class Upper_Rightangle_Triangle {
    public void Upper_right(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Upper_Rightangle_Triangle UT=new Upper_Rightangle_Triangle();
        UT.Upper_right(5);
    }
}
