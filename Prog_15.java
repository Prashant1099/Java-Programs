// A program which takes any Number as input and checks whether the Number is Even or Odd using
// Switch case.

import java.io.*;
class Prog_15
{
    int n;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter any Number - ");
        n = Integer.parseInt(br.readLine());
    }
    public void process()
    {
        switch(n%2)
        {
            case 0:
                System.out.println("-------------------------");
                System.out.println(n+ " is Even Number");
                System.out.println("-------------------------");
                break;
            
            case 1:
            case 2:
            case 3:
                System.out.println("-------------------------");
                System.out.println(n+ " is Odd Number");
                System.out.println("-------------------------");
                break;
        }
    }
    public static void main(String args[]) throws IOException
    {
        Prog_15 obj = new Prog_15();
        obj.input();
        obj.process();        
    }
}