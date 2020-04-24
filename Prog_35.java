// A program which takes any Range as input and Prints Fibonacci Series Upto that range.

import java.io.*;
class Prog_35
{
    int b,e,r,sum,i;

    Prog_35()
    {
        b = 0;
        e = 1;
    }

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter Range = ");
        r = Integer.parseInt(br.readLine());
    }
    public void Fibo()
    {
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Fibonacci Series upto Range " +r+ " = " +b+ "," +e);
        
        for (i=3; i<=r; i++)
        {
            sum = b + e;
            System.out.print("," +sum);
            b = e;
            e = sum;
        }
        System.out.println("\n-----------------------------------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_35 obj = new Prog_35();
        obj.input();
        obj.Fibo();
    }
}