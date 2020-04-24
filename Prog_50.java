// A program which takes any Number as input and checks whether the Number is Armstrong Number or 
// not using do while loop.

import java.io.*;
import java.lang.Math;
class Prog_50
{
	int n,len,mod,temp,sum;

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
		sum = 0;
		len = 0;

		do
		{
			n = n/10;
			len++;
		}while(n > 0);

		n = temp;

		do
		{
			mod = n % 10;
			sum = sum + (int)Math.pow(mod,len);
			n = n/10;
		}while(n > 0);
	}
	public void display()
	{
		System.out.println("-----------------------------------------------");
		if (temp == sum)
			System.out.println(temp+ " is a Armstrong Number");
		else
			System.out.println(temp+ " is not a Armstrong Number");
		System.out.println("-----------------------------------------------");
	}
	public static void main(String args[]) throws IOException
	{
		Prog_50 obj = new Prog_50();
		obj.input();
		obj.process();
		obj.display();
	}
}