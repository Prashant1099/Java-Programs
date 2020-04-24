// A program which takes any number as input and prints Factorial of that Number using do while loop.

import java.io.*;
class Prog_46
{
    int n,i,f;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter any Number = ");
        n = Integer.parseInt(br.readLine());
    }
    public void process()
    {
        i = 1;
        f = 1;
        do
        {
            f = f * i;
            i++;
        }while(i<=n);
    }
    public void display()
    {
        System.out.println("--------------------------------------");
        System.out.println("Factorial of " +n+ " = " +f);
        System.out.println("--------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_46 obj = new Prog_46();
        obj.input();
        obj.process();
        obj.display();  
    }
}