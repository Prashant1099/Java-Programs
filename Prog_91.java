// Reverse of each words in any String.

import java.io.*;
import java.util.*;
class Prog_91
{
    String str,t;
    int wc,i,j;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
        
        System.out.print("\nEnter String = ");
        str = br.readLine();
    }
    public void Replace()
    {
        StringTokenizer st = new StringTokenizer(str);

        wc = st.countTokens();
        
        System.out.println("-----------------------------------");
        System.out.println("Total Number of words = " +wc);
        System.out.println("-----------------------------------");

        for (i=1; i<=wc; i++)
        {
            t = st.nextToken();

            //System.out.println(i + ". -> " +t);
            //System.out.println("-----------------------------------");

            System.out.print("Reverse of '" +t+ "' = ");
            for (j=t.length()-1; j>=0; j--)
                System.out.print(t.charAt(j));
            System.out.println();
        }
        System.out.println("-----------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_91 obj = new Prog_91();
        obj.input();
        obj.Replace();
    }
}