package com.chan;

public class Lower_Leftangle_Triangle {
    public static void main(String[] args) {
        Lower_Leftangle_Triangle LLT=new Lower_Leftangle_Triangle();

        LLT.Lower_left(5);

    }
    public void Lower_left(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
