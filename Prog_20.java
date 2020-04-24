// A program which takes Base and Exponent as input and prints Power accordingly.

import java.io.*;
class Prog_20
{
    int b,e,i,po;

    Prog_20()
    {
        po = 1;
    }

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter Base = ");
        b = Integer.parseInt(br.readLine());

        System.out.print("Enter Expo = ");
        e = Integer.parseInt(br.readLine());
    }
    public void process()
    {
        for (i=1; i<=e; i++)
        {
            po = po*b;
        }
    }
    public void display()
    {
        System.out.println("----------------------------------");
        System.out.println(b+ " to the Power " +e+ " = " +po);
        System.out.println("----------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_20 obj = new Prog_20();
        obj.input();
        obj.process();
        obj.display();
    }
}