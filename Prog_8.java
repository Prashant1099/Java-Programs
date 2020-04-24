// A program which takes any three number as input and prints Greatest number among them.

import java.io.*;

class Prog_8
{
    int a,b,c;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter First Number  = ");
        a = Integer.parseInt(br.readLine());

        System.out.print("Enter Second Number = ");
        b = Integer.parseInt(br.readLine());

        System.out.print("Enter Third Number  = ");
        c = Integer.parseInt(br.readLine());
    }
    public void proces()
    {
        System.out.println("-------------------------------");
        if (a == b && a == c)
        {
            System.out.println("All Numbers are Equal");
        }
        else if (a > b && a > c)
        {
            System.out.println(a+ " is Greater than " +b+ ","+c);
        }
        else if (b > c)
        {
            System.out.println(b+ " is Greater than " +a+ ","+c);
        }
        else 
        {
            System.out.println(c+ " is Greater than " +a+ ","+b);
        }
        System.out.println("-------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_8 obj = new Prog_8();
        obj.input();
        obj.proces();
    }
}
