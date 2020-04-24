// A program which takes Range is input and prints Prime Number in that range.

import java.io.*;
class Prog_24
{
    int r,n,i,j,count;

    Prog_24()
    {
        count = 0;
    }

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter Range = ");
        r = Integer.parseInt(br.readLine());
    }
    public void process()
    {
        System.out.println("----------------------------------");
        System.out.println("Prime Numbers upto Range " +r+ " are :");
        System.out.println("----------------------------------");
        for (j=1; j<=r; j++)
        {
            count = 0;
            n = j;
            for (i=2; i<n; i++)
            {
                if (n % i == 0)
                {
                    count = count + 1;
                }
            }
            if (count == 0)
            {
                System.out.println(n);
            }            
        }
        System.out.println("----------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_24 obj = new Prog_24();
        obj.input();
        obj.process();
    }
}