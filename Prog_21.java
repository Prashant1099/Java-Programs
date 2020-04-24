// A program which takes any number as input and prints Factorial of that number.

import java.io.*;
class Prog_21
{
    int n,i,f;

    Prog_21()
    {
        f = 1;
    }

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter any Number = ");
        n = Integer.parseInt(br.readLine());
    }
    public void process()
    {
        for (i=1; i<=n; i++)
        {
            f = f*i;
        }
    }
    public void display()
    {
        System.out.println("-------------------------------------");
        System.out.println("Factorial of " +n+ " = " +f);
        System.out.println("-------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_21 obj = new Prog_21();
        obj.input();
        obj.process();
        obj.display();
    }
}