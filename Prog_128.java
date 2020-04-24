// Error Handling 1

import java.io.*;
class Prog_128
{
    public static void main(String args[]) throws IOException
    {
        int a[] = new int[5];
        int r,tot=0,avg,i;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try
        {
            System.out.print("\nEnter Range = ");
            r = Integer.parseInt(br.readLine());

            for (i=0; i<r; i++)
            {
                System.out.print("Enter " +(i+1)+ " Number = ");
                a[i] = Integer.parseInt(br.readLine());
                tot = tot + a[i];
            }
            avg = tot/r;

            System.out.println("----------------------");
            System.out.println("Total   = " +tot);
            System.out.println("Average = " +avg);
            System.out.println("----------------------");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.print("Error in above Statement");
        }
    }
}