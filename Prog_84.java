// Palindrom in String.

import java.io.*;
class Prog_84
{
    String str;
    int len,i;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
        
        System.out.print("\nEnter String = ");
        str = br.readLine();
    }
    public void Palindrom()
    {
        len = str.length();

        System.out.println("---------------------------------");
        for (i=0; i<len; i++)
            if (str.charAt(i) != str.charAt(len-(i+1)))
            {
                System.out.println("'"+str+"' is not a Palindrom String");
                System.out.println("---------------------------------");
                System.exit(0);
            }
            System.out.println("'"+str+"' is a Palindrom String");
        System.out.println("---------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_84 obj = new Prog_84();
        obj.input();
        obj.Palindrom();
    }
}