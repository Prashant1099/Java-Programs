// A program which takes any Range as input and prints Sum of Odd Numbers upto that range.

import java.io.*;
class Prog_27
{
    int r,i,sum;

    Prog_27()
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
        for (i=1; i<=r; i=i+2)
        {
            sum = sum + i;
        }
    }
    public void display()
    {
        System.out.println("--------------------------------------------");
        System.out.println("Sum of Odd Numbers upto Range " +r+ " = " +sum);
        System.out.println("--------------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_27 obj = new Prog_27();
        obj.input();
        obj.process();
        obj.display();
    }
}