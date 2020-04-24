// Compairing of two string.

import java.io.*;
class Prog_85
{
    String str1,str2;
    int len1,len2,i;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
        
        System.out.print("\nEnter First String  = ");
        str1 = br.readLine();

        System.out.print("Enter Second String = ");
        str2 = br.readLine();
    }
    public void Compair()
    {
        len1 = str1.length();
        len2 = str2.length();
        
        System.out.println("--------------------------------------------");
        if (len1 == len2)
        {
            for (i=0; i<len1; i++)
                if (str1.charAt(i) != str2.charAt(i))
                {
                    System.out.println("Lengths are Same but Strings are Different");
                    System.out.println("--------------------------------------------");
                    System.exit(0);
                }
                System.out.println("Both Strings are Same");
        }
        else
        System.out.println("Both Strings are Different");
        System.out.println("--------------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_85 obj = new Prog_85();
        obj.input();
        obj.Compair();
    }
}