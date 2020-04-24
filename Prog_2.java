// program which takes Base and Height of any Triangle as input and prints Area of that Triangle.
import java.io.*;

class Prog_2
{
    float b,h,ar;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter Base of Triangle   = ");
        b = Float.parseFloat(br.readLine());

        System.out.print("Enter Height of Triangle = ");
        h = Float.parseFloat(br.readLine());
    }
    public void process()
    {
        ar = (b * h)/2;
    }
    public void display()
    {
        System.out.println("---------------------------------------------------------");
        System.out.println("Area of Triangle having Base "+b+" and Height "+h+" = "+ar);
        System.out.println("---------------------------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_2 obj = new Prog_2();
        obj.input();
        obj.process();
        obj.display();
    }
}
