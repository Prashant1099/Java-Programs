// Replacement of word in string.

import java.io.*;
import java.util.*;
class Prog_95
{
    String str,t,s,rep,new_str = "";
    int wc,i;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
        
        System.out.print("\nEnter any String           = ");
        str = br.readLine();

        System.out.print("Enter Word to Replace      = ");
        s = br.readLine();

        System.out.print("Enter Word to Replace with = ");
        rep = br.readLine();
    }
    public void process()
    {
        StringTokenizer st = new StringTokenizer(str);

        wc = st.countTokens();
        
        System.out.println("\nTotal Number of words      = " +wc);

        for (i=1; i<=wc; i++)
        {
            t = st.nextToken();

            if (s.equals(t))
                new_str = new_str + rep + " ";
            else
                new_str = new_str + t + " ";
        }
    }
    public void display()
    {
        str = str + " ";
        if (str.equals(new_str))
        {
            System.out.println("---------------------");
            System.out.println("'" +s+ "' not Found");
            System.out.println("---------------------");
            System.exit(0);
        }
        
        System.out.println("----------------------------------");
        System.out.println("Old String = " + str);
        System.out.println("New String = " + new_str);
        System.out.println("----------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_95 obj = new Prog_95();
        obj.input();
        obj.process();
        obj.display();
    }
}