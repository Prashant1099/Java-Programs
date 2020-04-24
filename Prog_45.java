//A program which takes any Number as input and prints Table of that Number using do while loop.

import java.io.*;
class Prog_45
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
        do
        {
            System.out.println(n+ " x " +i+ " = " +n*i);
            System.out.println("-----------------------------");
            i++;
        }while(i<=10);
    }
    public static void main(String args[]) throws IOException
    {
        Prog_45 obj = new Prog_45();
        obj.input();
        obj.Table();
    }
}