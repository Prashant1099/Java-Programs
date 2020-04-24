// A program which takes Base and Expo as input and prints Power accordingly using do while loop.

import java.io.*;
class Prog_47
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
        do
        {
            po = po * b;
            i++;
        }while(i<=e);
    }
    public void display()
    {
        System.out.println("--------------------------------------");
        System.out.println(b+ " to the Power " +e+ " = " +po);
        System.out.println("--------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_47 obj = new Prog_47();
        obj.input();
        obj.process();
        obj.display();  
    }
}