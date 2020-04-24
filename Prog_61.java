// Selection Sort.

import java.io.*;
class Prog_61
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
        for (i=0; i<r-1; i++)
            for (j=i+1; j<r; j++)
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
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
        Prog_61 obj = new Prog_61();
        obj.input();
        obj.process();
        obj.display();
    }
}