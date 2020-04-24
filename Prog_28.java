// A program which takes any Range as input and prints Sum of Even Numbers upto that range.

import java.io.*;
class Prog_31
{
    int r,i,sum;

    Prog_31()
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
        for (i=2; i<=r; i=i+2)
        {
            sum = sum + i;
        }
    }
    public void display()
    {
        System.out.println("--------------------------------------------");
        System.out.println("Sum of Even Numbers upto Range " +r+ " = " +sum);
        System.out.println("--------------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_31 obj = new Prog_31();
        obj.input();
        obj.process();
        obj.display();
    }
}