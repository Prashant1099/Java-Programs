// A program which takes Radius as input and prints Diameter, Area and Parimeter of that Circle.

import java.io.*;

class Prog_3
{
    double r,d,ar,pa;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter Radius of Circle = ");
        r = Double.parseDouble(br.readLine());
    }
    public void process() throws IOException
    {
        d = 2 * r;
        ar = 3.14*r*r;
        pa = 2*3.14*r;
    }
    public void display() throws IOException
    {
        System.out.println("-----------------------------------");
        System.out.println("Diameter of Circle  = " + d);
        System.out.println("Area of Circle      = " + ar);
        System.out.println("Parimeter of Circle = " + pa);
        System.out.println("-----------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_3 obj = new Prog_3();
        obj.input();
        obj.process();
        obj.display();
   }
}