// A program which takes any Number as input and checks whether the Number is Prime or not.

import java.io.*;
class Prog_22
{
    int n,i,count;

    Prog_22()
    {
        count = 0;
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
        for (i=2; i<n; i++)
        {
            if (n % i == 0)
            {
                count = count + 1;
            }
        }
    }
    public void display()
    {
        System.out.println("----------------------------------");
        if (count == 0)
        {
            System.out.println(n+ " is a Prime Number");
        }
        else
        {
            System.out.println(n+ " is not a Prime Number");
        }
        System.out.println("----------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_22 obj = new Prog_22();
        obj.input();
        obj.process();
        obj.display();
    }
}