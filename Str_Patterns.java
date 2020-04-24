// A program which takes any String as input and prints different Pyramids.

import java.io.*;
class Str_Patterns
{
    String str;
    int len,row,col,sp;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
        
        System.out.print("\nEnter String = ");
        str = br.readLine();
    }
    public void Prog_78()
    {
        len = str.length();
        
        System.out.println("\nPyramid of " +str+ " :- ");
        System.out.println("----------------------");

        for (row=0; row<len; row++)
        {
            for (col=0; col<=row; col++)
                System.out.print(" " + str.charAt(col));
            System.out.println();
        }
    }
    public void Prog_79()
    {
        len = str.length();
        
        System.out.println("\nPyramid of " +str+ " :- ");
        System.out.println("----------------------");

        for (row=0; row<len; row++)
        {
            for (sp=0; sp<len-row-1; sp++)
                System.out.print("  ");
            for (col=0; col<=row; col++)
                System.out.print(" " + str.charAt(col));
            System.out.println();
        }
    }
    public void Prog_80()
    {
        len = str.length();
        
        System.out.println("\nPyramid of " +str+ " :- ");
        System.out.println("----------------------");

        for (row=0; row<len; row++)
        {
            for (col=0; col<=len-row-1; col++)
                System.out.print(" " + str.charAt(col));
            System.out.println();
        }
    }
    public void Prog_81()
    {
        len = str.length();
        
        System.out.println("\nPyramid of " +str+ " :- ");
        System.out.println("-------------------------");

        for (row=0; row<len; row++)
        {
            for (sp=0; sp<row; sp++)
                System.out.print("  ");
            for (col=0; col<=len-row-1; col++)
                System.out.print(" " + str.charAt(col));
            System.out.println();
        }
    }
    public static void main(String args[]) throws IOException
    {
        Str_Patterns obj = new Str_Patterns();
        obj.input();
        obj.Prog_78();
        obj.Prog_79();
        obj.Prog_80();
        obj.Prog_81();
    }
}