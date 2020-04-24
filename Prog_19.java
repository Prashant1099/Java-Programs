// A program which takes any number as input and prints Table of that number.

import java.io.*;
class Prog_19
{
    int n,i;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter any Number = ");
        n = Integer.parseInt(br.readLine());
    }
    public void process()
    {
        for (i=1; i<=10; i++)
        {
            System.out.println(n+ " x " +i+ " = " + n*i);
            System.out.println("-------------------");
        }
    }
    public static void main(String args[]) throws IOException
    {
        Prog_19 obj = new Prog_19();
        obj.input();
        obj.process();
    }
}