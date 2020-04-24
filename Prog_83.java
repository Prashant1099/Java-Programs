// Occurance in String.

import java.io.*;
class Prog_83
{
    String str;
    int len,count,i;
    char s;

    Prog_83()
    {
        count = 0;
    }

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
        
        System.out.print("\nEnter String = ");
        str = br.readLine();

        System.out.print("\nEnter Character to Search = ");
        s = (char)br.read();
    }   
    public void process()
    {
        len = str.length();

        for (i=0; i<len; i++)
            if (s == str.charAt(i))
                count++;
    }
    public void display()
	{
		System.out.println("--------------------------------------");
		switch(count)
		{
			case 0:
				System.out.println("'"+s+"'" + " not Found");
				break;

			case 1:
				System.out.println("'"+s+"'" + " occured " +count+ " time");
				break;

			default:
				System.out.println("'"+s+"'" + " occured " +count+ " times");
				break;
		}
		System.out.println("--------------------------------------");
	}
    public static void main(String args[]) throws IOException
    {
        Prog_83 obj = new Prog_83();
        obj.input();
        obj.process();
        obj.display();
    }
}