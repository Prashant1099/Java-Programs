// Sanner Method

import java.util.Scanner;

class P3
{
	public static void main (String args [])
	{
		int a,b,c;
		float tot,avg;

		Scanner sc = new Scanner (System.in);

		System.out.println("Enter First Number  = ");
		a = sc.nextInt();

		System.out.println("Enter Second Number = ");
		b = sc.nextInt();

		System.out.println("Enter Third Number  = ");
		c = sc.nextInt();

		tot = a + b + c;
		avg = tot/3;

		System.out.println("---------------------");
		System.out.println("Total   = "+tot);
		System.out.println("Average = "+avg);
		System.out.println("---------------------");
	}
}