// A program which takes Base and Expo as input and prints Power accordingly using while loop.

import java.io.*;
class Prog_38
{
    int b,e,i,po;

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
        i = 1;
        po = 1;
        while(i<=e)
        {
            po = po * b;
            i++;
        }
    }
    public void display()
    {
        System.out.println("--------------------------------------");
        System.out.println(b+ " to the Power " +e+ " = " +po);
        System.out.println("--------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_38 obj = new Prog_38();
        obj.input();
        obj.process();
        obj.display();  
    }
}