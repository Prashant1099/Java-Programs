// A program which takes any two number as input and prints Greatest number among them.

import java.io.*;
class Prog_7
{
    int a,b;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter First Number  = ");
        a = Integer.parseInt(br.readLine());

        System.out.print("Enter Second Number = ");
        b = Integer.parseInt(br.readLine());
    }
    public void proces()
    {
        System.out.println("-------------------------------");
        if (a > b)
        {
            System.out.println(a+ " is Greater than " +b);
        }
        else if (b > a)
        {
            System.out.println(b+ " is Greater than " +a);
        }
        else 
        {
            System.out.println("Both Numbers are Equal");
        }
        System.out.println("-------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_7 obj = new Prog_7();
        obj.input();
        obj.proces();
    }
}
