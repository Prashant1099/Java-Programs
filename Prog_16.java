// A program which takes any Year as input and checks whether the year is Leap year or not using
// Switch case.

import java.io.*;
class Prog_16
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
        switch (y % 4)
        {
            case 0:
                System.out.println("--------------------------");
                System.out.println(y+ " is a Leap Year");
                System.out.println("--------------------------");
                break;
            
            case 1:
            case 2:
            case 3:
                System.out.println("--------------------------");
                System.out.println(y+ " is not a Leap Year");
                System.out.println("--------------------------");            
        }
    }
    public static void main(String args[]) throws IOException
    {
        Prog_16 obj = new Prog_16();
        obj.input();
        obj.process();
    }
}