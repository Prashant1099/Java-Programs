// Java String Sorting.

import java.io.*;
class Prog_87
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String ch[] = new String[10];
        String c = " ";
        int r,i,j;

        System.out.print("\nEnter Range = ");
        r = Integer.parseInt(br.readLine());

        System.out.println("------------------------------");
        System.out.print("\nEnter String = ");
        for (i=0; i<r; i++)
        {
            System.out.print((i+1)+ ". ->");
            ch[i] = br.readLine();
        }

        for (i=0; i<r-1; i++)
            for (j=i+1; j<r; j++)
                if (ch[i].compareTo(ch[j]) > 0)
                {
                    c = ch[i];
                    ch[i] = ch[j];
                    ch[j] = c;
                }

        System.out.println("After Sorting Data is :");
        System.out.println("----------------------");
        for (i=0; i<r; i++)
            System.out.println(ch[i]);
    }
}