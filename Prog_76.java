// String base program.

import java.io.*;
class Prog_76
{
    String str;
    int len;

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
    public static void main(String args[]) throws IOException
    {
        Prog_76 obj = new Prog_76();
        obj.input();
        obj.display();
    }
}