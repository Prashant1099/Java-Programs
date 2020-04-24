// Class method

import java.io.*;

class P5
{
	int a,b,c;
	float tot,avg;

	public void Input() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter First Number  = ");
		a = Integer.parseInt(br.readLine());

		System.out.print("Enter Second Number = ");
		b = Integer.parseInt(br.readLine());

		System.out.print("Enter Third Number  = ");
		c = Integer.parseInt(br.readLine());
	}

	public void Process() throws IOException
	{
		tot = a + b + c;
		avg = tot/3;
	}

	public void Display() throws IOException
	{
		System.out.println("---------------------");
		System.out.println("Total   = "+tot);
		System.out.println("Average = "+avg);
		System.out.println("---------------------");
	}

	public static void main(String args[]) throws IOException
	{
		P5 obj = new P5();
		obj.Input();
		obj.Process();
		obj.Display();
	}
}