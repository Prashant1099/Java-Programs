// A program which takes 5 Digit Number as input and Prints Reverse and Sum of those Digits.

import java.io.*;
class Prog_5
{
    int n,n1,n2,n3,n4,n5,temp,sum = 0;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter any 5 digit Number = ");
        n = Integer.parseInt(br.readLine());
    }
    public void process()
    {
        temp = n;

        n1 = n%10;
        n  = n/10;
        n2 = n%10;
        n  = n/10;
        n3 = n%10;
        n  = n/10;
        n4 = n%10;
        n5  = n/10;
        

        sum = n1 + n2 + n3 + n4 + n5;
    }
    public void display()
    {
        System.out.println("-------------------------------");
        System.out.println("Reverse of " +temp +"   = " +n1+n2+n3+n4+n5);
        System.out.println("Summation of " +temp+ " = " + sum);
        System.out.println("-------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_5 obj = new Prog_5();
        obj.input();
        obj.process();
        obj.display();
    }
}