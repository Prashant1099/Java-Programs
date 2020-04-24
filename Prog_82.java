// Searching in String.

import java.io.*;
class Prog_82
{
    String str;
    int len,po,i;
    char s;

    Prog_82()
    {
        po = 0;
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
            {
                po = i + 1;
                break;
            }
    }
    public void display()
	{
		System.out.println("--------------------------------------");
		switch(po)
		{
			case 0:
				System.out.println(s+ " not found");
				break;

			case 1:
            System.out.println("'"+s+"'" + " Found in " +po+ "st Position");
				break;

			case 2:
            System.out.println("'"+s+"'" + " Found in " +po+ "nd Position");
				break;

			case 3:
            System.out.println("'"+s+"'" + " Found in " +po+ "rd Position");
				break;

			default:
				System.out.println("'"+s+"'" + " Found in " +po+ "th Position");
				break;
		}
		System.out.println("--------------------------------------");
	}
    public static void main(String args[]) throws IOException
    {
        Prog_82 obj = new Prog_82();
        obj.input();
        obj.process();
        obj.display();
    }
}