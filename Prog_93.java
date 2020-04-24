// Word Searching.

import java.io.*;
import java.util.*;
class Prog_93
{
    String str,t,s;
    int wc,i,po;

    Prog_93()
    {
        po = 0;
    }

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
        
        System.out.print("\nEnter String = ");
        str = br.readLine();

        System.out.print("Enter Word to Search = ");
        s = br.readLine();
    }
    public void process()
    {
        StringTokenizer st = new StringTokenizer(str);

        wc = st.countTokens();
        
        System.out.println("\nTotal Number of words = " +wc);

        for (i=1; i<=wc; i++)
        {
            t = st.nextToken();

            if (s.equals(t))
            {
                po = i;
                break;
            }
        }
    }
    public void display()
	{
		System.out.println("--------------------------------------");
		switch(po)
		{
			case 0:
				System.out.println("'" +s+ "' not found");
				break;

			case 1:
				System.out.println("'" +s+ "' Found in " +po+ "st Position");
				break;

			case 2:
				System.out.println("'" +s+ "' Found in " +po+ "nd Position");
				break;

			case 3:
				System.out.println("'" +s+ "' Found in " +po+ "rd Position");
				break;

			default:
				System.out.println("'" +s+ "' Found in " +po+ "th Position");
				break;
		}
		System.out.println("--------------------------------------");
	}
    public static void main(String args[]) throws IOException
    {
        Prog_93 obj = new Prog_93();
        obj.input();
        obj.process();
        obj.display();
    }
}