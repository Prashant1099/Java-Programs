// Base Program of Token (Word Based Program).

import java.io.*;
import java.util.*;
class Prog_90
{
    String str,t;
    int wc,i;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
        
        System.out.print("\nEnter String = ");
        str = br.readLine();
    }
    public void display()
    {
        StringTokenizer st = new StringTokenizer(str);

        wc = st.countTokens();
        
        System.out.println("-----------------------------------");
        System.out.println("Total Number of words = " +wc);

        for (i=1; i<=wc; i++)
        {
            t = st.nextToken();

            System.out.println(i + ". -> " +t);
        }
    }
    public static void main(String args[]) throws IOException
    {
        Prog_90 obj = new Prog_90();
        obj.input();
        obj.display();
    }
}