// A program which takes any range as input and prints sum of following series upto that range,
// 1 + 1! + 2! + 3! +.......+ n!

import java.io.*;
class Prog_31
{
    double r,i,sum,f;

    Prog_31()
    {
        sum = 1;
        f = 1;
    }

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter Range = ");
        r = Double.parseDouble(br.readLine());
    }
    public void process()
    {
        for (i=1; i<=r; i++)
        {
            f = f * i;
            sum = sum + f;
        }
    }
    public void display()
    {
        System.out.println("-------------------------------------------------------");
        System.out.println("Sum of 1+1!+2!+3!+... upto Range " +r+ " = " +sum);
        System.out.println("-------------------------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_31 obj = new Prog_31();
        obj.input();
        obj.process();
        obj.display();
    }
}