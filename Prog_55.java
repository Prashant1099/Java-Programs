// Total and Average using Array.

import java.io.*;
class Prog_55
{
	int r,i,tot,avg;
	int a[] = new int[10];

	public void input() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("\nEnter Range = ");
		r = Integer.parseInt(br.readLine());

		System.out.println("\nEnter " +r+ " Numbers :-");
		System.out.println("-----------------");

		for (i=0; i<r; i++)
		{
			System.out.print("Enter " +(i+1)+ " Number = ");
			a[i] = Integer.parseInt(br.readLine());
		}	
	}
	public void process()
	{
		tot = 0;

		for (i=0; i<r; i++)
			tot = tot + a[i];
		avg = tot/r;
	}
	public void display()
	{
		System.out.println("--------------------");
		System.out.println("Summation = " +tot);
		System.out.println("Average   = " +avg);
		System.out.println("--------------------");
	}
	public static void main(String args[]) throws IOException
	{
		Prog_55 obj = new Prog_55();
		obj.input();
		obj.process();
		obj.display();
	}
}