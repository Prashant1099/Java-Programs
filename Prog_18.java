// A program which takes any string as input and print that multiple times.

import java.io.*;
class Prog_18
{
    int r,i;
    String str;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter Range      = ");
        r = Integer.parseInt(br.readLine());

        System.out.print("Enter any String = ");
        str = br.readLine();
    }
    public void process() 
    {
        System.out.println("------------------------");
        for (i=1;i<=r;i++)
        {
            System.out.println(i+ ". " +str);
        }
        System.out.println("------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_18 obj = new Prog_18();
        obj.input();
        obj.process();
    }
}