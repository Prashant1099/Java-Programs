//  A program which prints maximum value from the given array.

import java.io.*;
class Prog_59
{
	int r,i,max;
	int a[] = new int[10];
	
	public void input() throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("\nEnter Range = ");
		r = Integer.parseInt(br.readLine());

		System.out.println("\nEnter " +r+" Numbers :- ");
		System.out.println("------------------");
		
		for (i=0; i<r; i++)
		{
			System.out.print("Enter " +(i+1)+ " Number : ");
			a[i] = Integer.parseInt(br.readLine());
		}
    }
    public void process()
    {
        max = a[0];
        
        for (i=0; i<r; i++)
            if (a[0] < a[i])
                max = a[i];
    }
    public void display()
    {
        System.out.println("------------------------------");
        System.out.println("Maximum Value = " +max);
        System.out.println("------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_59 obj = new Prog_59();
        obj.input();
        obj.process();
        obj.display();
    }
}