// A program which takes Principal amount, rate and time as input and prints Simple Interest and 
// Net amount.

import java.io.*;

class Prog_6
{
    double p,r,t,si,net;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter Principle Amount = ");
        p = Double.parseDouble(br.readLine());

        System.out.print("Enter Rate             = ");
        r = Double.parseDouble(br.readLine());

        System.out.print("Enter Time             = ");
        t = Double.parseDouble(br.readLine());
    }
    public void proces()
    {
        si = (p * r * t)/100;
        net = p + si;
    }
    public void display()
    {
        System.out.println("---------------------------------");
        System.out.println("Simple Interest = " + si);
        System.out.println("Net Amount      = " + net);
        System.out.println("---------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_6 obj = new Prog_6();
        obj.input();
        obj.proces();
        obj.display();
    }
}