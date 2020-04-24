// A program which takes any Number as input and checks in which position that number is present,
// into given array.
// Linear Search

import java.io.*;
class Prog_56
{
	int r,i,po,s;
	int a[] = new int[10];

	Prog_56()
	{
		po = 0;
	}

	public void input() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("\nEnter Range = ");
		r = Integer.parseInt(br.readLine());

		System.out.println("\nEnter " +r+ " Numbers :-");
		System.out.println("--------------------");

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
			{
				po = i+1;
				break;
			}
	}
	public void display()
	{
		System.out.println("--------------------------------------");
		switch(po)
		{
			case 0:
				System.out.println(s+ " not found");
				break;

			case 1:
				System.out.println(s+ " Found in " +po+ "st Position");
				break;

			case 2:
				System.out.println(s+ " Found in " +po+ "nd Position");
				break;

			case 3:
				System.out.println(s+ " Found in " +po+ "rd Position");
				break;

			default:
				System.out.println(s+ " Found in " +po+ "th Position");
				break;
		}
		System.out.println("--------------------------------------");
	}
	public static void main(String args[]) throws IOException
	{
		Prog_56 obj = new Prog_56();
		obj.input();
		obj.process();
		obj.display();
	}
}