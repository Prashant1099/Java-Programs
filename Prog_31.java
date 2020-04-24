// A program which takes any range as input and prints sum of following series upto that range,
// 1 + x^1 + x^2 + x^3 +......+ x^n

import java.io.*;
class Prog_31
{
    double b,r,i,sum,po;

    Prog_31()
    {
        sum = 1;
        po = 1;
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
            sum = sum + po;
        }
    }
    public void display()
    {
        System.out.println("-------------------------------------------------------");
        System.out.println("Sum of 1+x^1+x^2+x^3+... upto Range " +r+ " = " +sum);
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