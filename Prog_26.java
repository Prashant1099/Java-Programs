// A program which takes any Range as input and prints Sum of Natural Numbers upto that range.

import java.io.*;
class Prog_26
{
    int r,i,sum;

    Prog_26()
    {
        sum = 0;
    }

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter Range = ");
        r = Integer.parseInt(br.readLine());
    }
    public void process()
    {
        for (i=1; i<=r; i++)
        {
            sum = sum + i;
        }
    }
    public void display()
    {
        System.out.println("----------------------------------------------");
        System.out.println("Sum of Natural Numbers upto Range " +r+ " = " +sum);
        System.out.println("----------------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_26 obj = new Prog_26();
        obj.input();
        obj.process();
        obj.display();
    }
}