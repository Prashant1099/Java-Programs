// A program which takes any Number as input and checks whether the Number is Armstrong Number or 
// not using while loop.

import java.io.*;
import java.lang.Math;
class Prog_41
{
    int n,i,len,temp,sum,mod;

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
        len = 0;
        sum = 0;
        while(n>0)
        {
            n = n/10;
            len++;
        }

        n = temp;

        while(n>0)
        {
            mod = n % 10;
            sum = sum + (int)Math.pow(mod,len);
            n = n/10;
        }
    }
    public void display()
    {
        System.out.println("--------------------------------------");
        if (sum==temp)
            System.out.println(temp+ " is a Armstrong Number");
        else
            System.out.println(temp+ " is not a Armstrong Number");
        System.out.println("--------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_41 obj = new Prog_41();
        obj.input();
        obj.process();
        obj.display();  
    }
}