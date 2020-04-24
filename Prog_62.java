// Bubble Sort.

import java.io.*;
class Prog_62
{
	int r,i,j,temp;
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
        for (i=0; i<r; i++)
            for (j=0; j<r-1; j++)
                if (a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
    }
    public void display()
    {
        System.out.println("------------------");
        System.out.println("After Sorting :-");
        System.out.println("------------------");
        for (i=0; i<r; i++)
            System.out.println(a[i]);
        System.out.println("------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_62 obj = new Prog_62();
        obj.input();
        obj.process();
        obj.display();
    }
}