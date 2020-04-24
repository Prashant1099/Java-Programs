// Error Handling 2

import java.io.*;
class Prog_129
{
    public static void main(String args[]) throws IOException
    {
        int y;
        int a[] = {5,6};
        System.out.println("\nThis is Example of Multiple Catch Statement");

        try
        {
            int n=2;
            int b=5;
            double c=(b/n);

            System.out.println("Value of C in array = " +c);
            c = a[0];
            System.out.println("Value of C in array = " +c);           
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        y = a[1];
        System.out.println("Y = " +y);
    }
}