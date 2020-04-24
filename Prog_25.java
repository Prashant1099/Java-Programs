// A program which takes any Range as input and Prints Perfect Numbers in that range.

import java.io.*;
class Prog_25
{
    int r,n,i,j,sum;

    Prog_25()
    {
        sum = 0;
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
        System.out.println("--------------------------------------");
        System.out.println("Perfect Numbers upto Range " +r+ " are :");
        System.out.println("--------------------------------------");
        for (j=1; j<=r; j   ++)
        {
            sum = 0;
            n = j;
            for (i=1; i<n; i++){
                if (n % i == 0){
                    sum = sum + i;
                }
            }
            if (sum == n)
            {
                System.out.println(n);
            }
        }
        System.out.println("--------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_25 obj = new Prog_25();
        obj.input();
        obj.process();
    }
}