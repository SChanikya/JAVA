package com.chan;

public class lower_rightangle_traingle {
    public static void main(String[] args) {
        lower_rightangle_traingle t=new lower_rightangle_traingle();
        t.lower_right(5);
    }
    public void lower_right(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int k=n;k>=i;k--)
            {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
