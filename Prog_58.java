// A program which takes any number as input and checks whether the number is present or not.
// Binary Search

import java.io.*;
class Prog_58
{
    int r,i,po,mid,b,e,s;
    int a[] = new int[10];

    public void input() throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("\nEnter Range = ");
		r = Integer.parseInt(br.readLine());
        
        System.out.println("\nEnter " +r+ " Numbers :- ");
		System.out.println("------------------");
		
		for (i=0; i<r; i++)
		{
			System.out.print("Enter " +(i+1)+ " Number = ");
			a[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.print("\nEnter Number to Search = ");
		s = Integer.parseInt(br.readLine());
    }
    public void process()
    {
        po = 0;
        b = 0;
        e = r - 1;

        while (b <= e)
        {
            mid = (b + e)/2;
            if (s == a[mid])
            {
                po = mid + 1;
                break;
            }
            else if (s > a[mid])
                b = mid + 1;
            else 
                e = mid - 1;
        }
    }
    public void display()
	{
		System.out.println("--------------------------------------");
		switch(po)
		{
			case 0:
				System.out.println(s+ " not found");
				break;

			case 1:
				System.out.println(s+ " Found in " +po+ "st Position");
				break;

			case 2:
				System.out.println(s+ " Found in " +po+ "nd Position");
				break;

			case 3:
				System.out.println(s+ " Found in " +po+ "rd Position");
				break;

			default:
				System.out.println(s+ " Found in " +po+ "th Position");
				break;
		}
		System.out.println("--------------------------------------");
    }
    public static void main(String args[]) throws IOException
	{
		Prog_58 obj = new Prog_58();
		obj.input();
		obj.process();
		obj.display();
	}
}