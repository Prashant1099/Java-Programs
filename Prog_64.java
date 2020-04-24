// A program which prints Sum of all Even numbers, Product of all Odd numbers and Difference of
// Summation and Product values, from an array.

import java.io.*;
class Prog_64
{
	int r,i,sum,prod,dif;
	int a[] = new int[10];
	
	public void input() throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("\nEnter Range = ");
		r = Integer.parseInt(br.readLine());

		System.out.println("\nEnter " +r+" Numbers :- ");
		System.out.println("------------------");
		
		for (i=0; i<r; i++)
		{
			System.out.print("Enter " +(i+1)+ " Number : ");
			a[i] = Integer.parseInt(br.readLine());
		}
    }
    public void process()
    {
        sum = 0;
        prod = 1;
        
        for (i=0; i<r; i++)
            if (a[i] % 2 == 0)
                sum = sum + a[i];
            else
                prod = prod * a[i];
            
        if (prod > sum)
            dif = prod - sum;
        else
            dif = sum - prod;
    }
    public void display()
    {
        System.out.println("--------------------------------------");
        System.out.println("Summation of Even Numbers   = " + sum);
        System.out.println("Product of Odd Numbers      = " + prod);
        System.out.println("Difference of Sum % Product = " + dif);
        System.out.println("--------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_64 obj = new Prog_64();
        obj.input();
        obj.process();
        obj.display();
    }
}