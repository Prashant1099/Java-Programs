// A program which takes any Number as input and checks whether that Number is Positive or Negative.

import java.io.*;
class Prog_10
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
        System.out.println("--------------------------------");
        if (n > 0)
        {
            System.out.println(n+" is Postive Number");
        }
        else if (n < 0)
        {
            System.out.println(n+" is Negative Number");
        }
        else 
        {
            System.out.println("Entered Number is Zero");
        }
        System.out.println("--------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_10 obj = new Prog_10();
        obj.input();
        obj.process();
    }
}