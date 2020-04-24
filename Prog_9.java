// A program which takes any Number as input and checks whether the number is Even or Odd.

import java.io.*;
class Prog_9
{
    int n;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter any Number = ");
        n = Integer.parseInt(br.readLine());
    }
    public void process()
    {
        System.out.println("--------------------------");
        if (n % 2 == 0)
        {
            System.out.println(n+" is Even Number");
        }
        else
        {
            System.out.println(n+" is Odd Number");
        }
        System.out.println("--------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_9 obj = new Prog_9();
        obj.input();
        obj.process();
    }
}