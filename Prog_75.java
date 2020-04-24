// Base program of Doouble Dimention Array (Matrix)

import java.io.*;
class Prog_75
{
	int rr,cr,row,col,sn,sum;
    int a[][] = new int[10][10];
    
    Prog_75()
    {
        sum=0;
        sn = 1;
    }	

	public void input() throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("\nEnter Row Range    = ");
        rr = Integer.parseInt(br.readLine());
        
        System.out.print("Enter Column Range = ");
		cr = Integer.parseInt(br.readLine());

		System.out.println("\nEnter " +(rr*cr)+" Elements :- ");
		System.out.println("-----------------------");
		
		for (row=0; row<rr; row++)
            for (col=0; col<cr; col++)
            {
                System.out.print("Enter " +(sn++)+ " Element = ");
                a[row][col] = Integer.parseInt(br.readLine());
            }
    }
    public void display()
    {
        System.out.println("\nMatrix Elements are :-");
        System.out.println("------------------------");

        for (row=0; row<rr; row++)
        {
            for(col=0; col<cr; col++)
                {
                    sum=sum+a[row][col];
                    System.out.print("  " + a[row][col]);
                }
            System.out.println();
        }
        System.out.println("--------------------------");
        System.out.println(" Sum   =  "+sum);
        System.out.println("--------------------------");

    }
    public static void main(String args[]) throws IOException
    {
        Prog_75 obj = new Prog_75();
        obj.input();
        obj.display();
    }
}