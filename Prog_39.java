// A program which takes any Numer as input and prints Reverse and Summation of that Digit using
// while loop.

import java.io.*;
class Prog_39
{
    int n,i,sum,mod,temp,rev;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter any Number = ");
        n = Integer.parseInt(br.readLine());
    }
    public void process()
    {
        temp = n;
        sum = 0;
        while(n>0)
        {
            mod = n % 10;
            rev = rev * 10 + mod;
            sum = sum + mod;
            n = n/10;
        }
    }
    public void display()
    {
        System.out.println("--------------------------------------");
        System.out.println("Reverse of " +temp+ " = " +rev);
        System.out.println("Sum of " +temp+ "     = " +sum);
        System.out.println("--------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_39 obj = new Prog_39();
        obj.input();
        obj.process();
        obj.display();  
    }
}