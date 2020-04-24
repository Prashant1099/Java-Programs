// A program whick takes any Number as input and checks whether the number is Neon number or not,
// using while loop.

import java.io.*;
class Prog_43
{
	int n,sum,mod,ns;

	public void input() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("\nEnter any Number = ");
		n = Integer.parseInt(br.readLine());
	}
	public void process()
	{
		ns = n * n;
		while (ns > 0)
		{
			mod = ns % 10;
			sum = sum + mod;
			ns = ns/10;	
		}
	}
	public void display()
	{
		System.out.println("-------------------------------------------");
		if (n == sum)
			System.out.println(n+ " is a Neon Number");
		else
			System.out.println(n+ " is not a Neon Number");
		System.out.println("-------------------------------------------");
	}
	public static void main(String args[]) throws IOException
	{
		Prog_43 obj = new Prog_43();
		obj.input();
		obj.process();
		obj.display();
	}
}