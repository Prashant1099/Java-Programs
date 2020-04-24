// A program which takes any Number as input checks whether the number is Palindrom or not using
// do while loop.

import java.io.*;
class Prog_49
{
    int n,i,mod,temp,rev;

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
        do
        {
            mod = n % 10;
            rev = rev * 10 + mod;
            n = n/10;
        }while(n>0);
    }
    public void display()
    {
        System.out.println("--------------------------------------");
        if (temp == rev)
        {
            System.out.println(temp+ " is a Palindrom Number");
        }
        else
        {
            System.out.println(temp+ " is not a Palindrom Number");
        }
        System.out.println("--------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_49 obj = new Prog_49();
        obj.input();
        obj.process();
        obj.display();  
    }
}