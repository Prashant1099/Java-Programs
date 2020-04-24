// A program which takes any number as input and checks whether the number is Special number or not,
// using do while loop.

import java.io.*;
class Prog_51
{
	int n,temp,f,sum,mod,i;

	public void input() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("\nEnter any Number = ");
		n = Integer.parseInt(br.readLine());
	}
	public void process()
	{
		sum = 0;
		temp = n;

		do
		{
			mod = n % 10;
			f = 1;
			for (i=1; i<=mod; i++)
				f = f * i;
			sum = sum + f;
			n = n/10;
		}while(n > 0);
	}
	public void display()
	{
		System.out.println("------------------------------------------");
		if (temp == sum)
			System.out.println(temp+ " is a Special Number");
		else
			System.out.println(temp+ " is not a Special Numebr");
		System.out.println("------------------------------------------");
	}
	public static void main(String args[]) throws IOException
	{
		Prog_51 obj = new Prog_51();
		obj.input();
		obj.process();
		obj.display();
	}
}