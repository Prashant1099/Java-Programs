// String Reverse.

import java.io.*;
class Prog_77
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
    public void display()
    {
        len = str.length();

        System.out.println("---------------------------------");
        System.out.println("String = " +str);
        System.out.println("Length = " +len);
        System.out.println("---------------------------------");
    }

public void Reverse()
    {
            System.out.print("Reverse of "+str+"  = " );
            for(i=len-1;i>=0;i--)
            System.out.print(str.charAt(i));
            System.out.println("\n---------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_77 obj = new Prog_77();
        obj.input();
        obj.display();
        obj.Reverse();
    }
}