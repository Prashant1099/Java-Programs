// A program which takes any Number as input and prints Table of that Number using while loop.

import java.io.*;
class Prog_36
{
    int n,i;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter any Number = ");
        n = Integer.parseInt(br.readLine());
    }
    public void Table()
    {
        i = 1;
        while(i<=10)
        {
            System.out.println(n+ " x " +i+ " = " +n*i);
            System.out.println("------------------------");
            i++;
        }
    }
    public static void main(String args[]) throws IOException
    {
        Prog_36 obj = new Prog_36();
        obj.input();
        obj.Table();
    }
}