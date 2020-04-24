// A program which takes any Year as input and prints whether that is Leap year or not.

import java.io.*;

import javax.lang.model.util.ElementScanner6;
class Prog_11
{
    int y;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter any Year = ");
        y = Integer.parseInt(br.readLine());
    }
    public void process()
    {
        System.out.println("-------------------------------");
        if (y % 400 == 0)
        {
            if (y % 100 == 0)
            {
                System.out.println(y+" is a Leap Year");
            }
            else
            {
                System.out.println(y+" is not a Leap Year");
            }
        }
        else if (y % 4 == 0)
        {
            System.out.println(y+" is a Leap Year");
        }
        else 
        {
            System.out.println(y+" is not a Leap Year");
        }
        System.out.println("-------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_11 obj = new Prog_11();
        obj.input();
        obj.process();
    }
}