// Priting words stating with vowels.

import java.io.*;
import java.util.*;
class Prog_92
{
    String str,t;
    int wc,i,count;

    Prog_92()
    {
        count = 0;
    }

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

        for (i=1; i<=wc; i++)
        {
            t = st.nextToken();

            char ch = t.charAt(0);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                count++;
                System.out.println(count+ ". -> " +t);

                // display ka do function banana hai.. display1 and display2.. phir usko yaha se call karna hai.
            }
        }
    }
    public void display()
    {
        if (count == 0)
        {
            System.out.println("-------------------------------");
            System.out.println("No word is starting from vowels.");
            System.out.println("-------------------------------");
            System.exit(0);
        }

        if (count > 0)
        {
            System.out.println("\nWords starting with vowel :-");
            System.out.println("--------------------------");

        }
    }
    public static void main(String args[]) throws IOException
    {
        Prog_92 obj = new Prog_92();
        obj.input();
        obj.process();
        obj.display();
    }
}