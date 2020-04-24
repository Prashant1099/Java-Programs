// A program which takes any Number as input and checks whether the Number is Perfect Number or not.

import java.io.*;
class Prog_23
{
    int n,i,sum,temp;

    Prog_23()
    {
        sum = 0;
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
        temp = n;
        for (i=1; i<n; i++)
        {
            if (n % i == 0)
            {
                sum = sum + i;
            }
        }
    }
    public void display()
    {
        System.out.println("----------------------------------------");
        if (temp == sum)
        {
            System.out.println(n+ " is a Perfect Number");
        }
        else
        {
            System.out.println(n+ " is not a Perfect Number");
        }
        System.out.println("----------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_23 obj = new Prog_23();
        obj.input();
        obj.process();
        obj.display();
    }
}