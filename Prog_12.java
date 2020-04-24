// A program which takes any Amount as input and prints Tax and Net Amount.

import java.io.*;
class Prog_12
{
    double amt,tax,net;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter Amount = ");
        amt = Double.parseDouble(br.readLine());
    }
    public void process()
    {
        if (amt <= 1000)
        {
            tax = 0;
        }
        else if (amt <= 2000)
        {
            tax = (amt * 10)/100;
        }
        else if (amt <= 3100)
        {
            tax = (amt * 20)/100;
        }
        else 
        {
            tax = (amt * 31)/100;
        }

        net = amt + tax;
    }
    public void display()
    {
        System.out.println("------------------------------");
        System.out.println("Tax        = " + tax);
        System.out.println("Net Amount = " + net);
        System.out.println("------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_12 obj = new Prog_12();
        obj.input();
        obj.process();
        obj.display();
    }
}