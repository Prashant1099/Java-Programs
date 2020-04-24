//  A program which prints minimum value from the given array.

import java.io.*;
class Prog_60
{
	int r,i,min;
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
        min = a[0];
        
        for (i=0; i<r; i++)
            if (a[0] > a[i])
                min = a[i];
    }
    public void display()
    {
        System.out.println("------------------------------");
        System.out.println("Minimum Value = " +min);
        System.out.println("------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_60 obj = new Prog_60();
        obj.input();
        obj.process();
        obj.display();
    }
}