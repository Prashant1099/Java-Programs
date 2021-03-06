// A program which takes any Number as input and checks whether the Number is Automorphic Number or 
// not using do while loop.

import java.io.*;
import java.lang.Math;
class Prog_53
{
	int n,len,temp,ns;

	public void input() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("\nEnter any Number = ");
		n = Integer.parseInt(br.readLine());
	}
	public void process()
	{
		temp = n;
		ns = n * n;

		do
		{
			n = n/10;
			len++;
		}while(n > 0);

		len = (int)Math.pow(10,len);
	}
	public void display()
	{
		System.out.println("-----------------------------------------------");
		if (temp == (ns%len))
			System.out.println(temp+ " is a Automorphic Number");
		else
			System.out.println(temp+ " is not a Automorphic Number");
		System.out.println("-----------------------------------------------");
	}
	public static void main(String args[]) throws IOException
	{
		Prog_53 obj = new Prog_53();
		obj.input();
		obj.process();
		obj.display();
	}
}