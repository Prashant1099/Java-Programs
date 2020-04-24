// A program which takes any range as input and prints sum of following series upto that range,
// 1 + x^1/1! - x^2/2! + x^3/3! +........+ x^n/n!

import java.io.*;
class Prog_34
{
    double b,r,i,po,f,div,sum;

    Prog_34()
    {
        po = 1;
        f = 1;
        sum = 1;
    }

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter Base  = ");
        b = Double.parseDouble(br.readLine());

        System.out.print("Enter Range = ");
        r = Double.parseDouble(br.readLine());
    }
    public void process()
    {
        for (i=1; i<=r; i++)
        {
            po = po * b;
            f = f * i;
            div = po/f;
            if (i % 2 == 0)
            {
                sum = sum - div;
            }
            else
            {
                sum = sum + div;
            }
        }
    }
    public void display()
    {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Sum of 1 + x^1/1! - x^2/2! + x^3/3! +... upto Range " +r+ " = " +sum);
        System.out.println("------------------------------------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_34 obj = new Prog_34();
        obj.input();
        obj.process();
        obj.display();
    }
}