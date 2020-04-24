// Short form of String.

import java.io.*;
import java.util.*;
class Prog_96
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
    public void process()
    {
        StringTokenizer st = new StringTokenizer(str);

        wc = st.countTokens();
        
        System.out.println("\nTotal Number of words = " +wc);

        System.out.print("\nShort Form of : ");
        for (i=1; i<wc; i++)
        {
            t = st.nextToken();

            System.out.print(t.charAt(0) + ".");
        }
        System.out.print(st.nextToken());

    }
    public static void main(String args[]) throws IOException
    {
        Prog_96 obj = new Prog_96();
        obj.input();
        obj.process();
    }
}