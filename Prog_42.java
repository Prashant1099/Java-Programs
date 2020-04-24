// A program which takes any number as input and checks whether the number is Special number or not,
// using while loop.

import java.io.*;
import java.lang.Math;
class Prog_42
{
	int n,temp,mod,i,sum,f;

	public void input() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("\nEnter any Number = ");
		n = Integer.parseInt(br.readLine());
		temp = n;
	}
	public void process()
	{
		sum = 0;
		while (n>0)
		{
			f = 1;	
			mod = n % 10;
			for (i=1; i<=mod; i++)
			f = f * i;
			
			sum = sum + f;
			n = n/10;
		}
	}
	public void display()
	{
		System.out.println("-----------------------------------");
		if (temp == sum)
			System.out.println(temp+ " is a Special Number");
		else
			System.out.println(temp+ " is not a Special Number");
		System.out.println("-----------------------------------");
	}
	public static void main(String args[]) throws IOException
	{
		Prog_42 obj = new Prog_42();
		obj.input();
		obj.process();
		obj.display();
	}
}