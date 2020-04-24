// Buffered Reader method

import java.io.*;

class P4
{
	public static void main (String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int a,b,c;
		float tot,avg;

		System.out.print("Enter First Number  = ");
		a = Integer.parseInt(br.readLine());

		System.out.print("Enter Second Number = ");
		b = Integer.parseInt(br.readLine());

		System.out.print("Enter Third Number  = ");
		c = Integer.parseInt(br.readLine());

		tot = a + b + c;
		avg = tot/3;

		System.out.println("---------------------");
		System.out.println("Total   = "+tot);
		System.out.println("Average = "+avg);
		System.out.println("---------------------");
	}
}