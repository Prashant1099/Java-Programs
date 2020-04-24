// A program which takes any three Numbers as input and Swap them, using third variable.

import java.io.*;

class Prog_4
{
    int a,b,c,temp;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter A = ");
        a = Integer.parseInt(br.readLine());

        System.out.print("Enter B = ");
        b = Integer.parseInt(br.readLine());

        System.out.print("Enter C = ");
        c = Integer.parseInt(br.readLine());
    }
    public void process() throws IOException
    {
       temp = c;
       c = b;
       b = a;
       a = temp; 
    }
    public void display() throws IOException
    {
        System.out.println("------------------");
        System.out.println("After Swapping :");
        System.out.println("------------------");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_4 obj = new Prog_4();
        obj.input();
        obj.process();
        obj.display();
    }
}