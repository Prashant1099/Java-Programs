// A program which prints Roots of Quadratic Equation.

import java.io.*;
import java.lang.Math;
class Prog_13A
{
    double a,b,c,d,r1,r2;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter A = ");
        a = Double.parseDouble(br.readLine());

        System.out.print("Enter B = ");
        b = Double.parseDouble(br.readLine());

        System.out.print("Enter C = ");
        c = Double.parseDouble(br.readLine());
    }
    public void process()
    {
        d = (b*b)-(4*a*c);
        System.out.println("-------------------------------------------");
        System.out.println("D = " +d);
        System.out.println("-------------------------------------------");

        if (d > 0)
        {
            System.out.println("The Equation contains two Different Roots");
            
            r1 = (-b+Math.sqrt(d))/(2*a);
            r2 = (-b-Math.sqrt(d))/(2*a);

            System.out.println("First Root  = " + r1);
            System.out.println("Second Root = " + r2);
        }
        else if (d == 0)
        {
            System.out.println("The Equation contains two Same Roots");

            r1 = (-b)/(2*a);
            r2 = (-b)/(2*a);

            System.out.println("First Root  = " + r1);
            System.out.println("Second Root = " + r2);
        }
        else 
        {
            System.out.println("The Equation has Imaginary Roots");
        }
        System.out.println("-------------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_13A obj = new Prog_13A();
        obj.input();
        obj.process();
    }
}