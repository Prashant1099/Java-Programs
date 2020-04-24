// A program which takes any number as input and checks occurance of that number.

import java.io.*;
class Prog_57
{
	int r,s,i,count;
	int a[] = new int[10];

	Prog_57()
	{
		count = 0;
	}

	public void input() throws IOException
	{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);



		System.out.print("\nEnter Range = ");
		r = Integer.parseInt(br.readLine());

		System.out.println("\nEnter " +r+ " Numbers :-");
		System.out.println("---------------------");

		for (i=0; i<r; i++)
		{
			System.out.print("Enter " +(i+1)+ " Number = ");
			a[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("\nEnter Number to Search = ");
		s = Integer.parseInt(br.readLine());
	}
	public void process()
	{
		for (i=0; i<r; i++)
			if (s == a[i])
				count++;
	}
	public void display()
	{
		System.out.println("--------------------------------------");
		switch(count)
		{
			case 0:
				System.out.println(s+ " not Found");
				break;

			case 1:
				System.out.println(s+ " occured " +count+ " time");
				break;

			default:
				System.out.println(s+ " occured " +count+ " times");
				break;
		}
		System.out.println("--------------------------------------");
	}
	public static void main(String args[]) throws IOException
	{
		Prog_57 obj = new Prog_57();
		obj.input();
		obj.process();
		obj.display();
	}
}
