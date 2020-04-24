// Lower Triangular Matrix.

import java.io.*;
class Prog_68
{
	int rr,cr,row,col,sn;
    int a[][] = new int[10][10];
    
    Prog_68()
    {
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
        System.out.println("----------------------");

        for (row=0; row<rr; row++)
        {
            for(col=0; col<cr; col++)
                System.out.print("  " + a[row][col]);
            System.out.println();
        }

        System.out.println("\nLower Triangular Matrix :-");
        System.out.println("-------------------------");

        for (row=0; row<rr; row++)
        {
            for(col=0; col<cr; col++)
                if (row >= col)
                    System.out.print("  " + a[row][col]);
                else
                System.out.print("  0");
            System.out.println();
        }
    }
    public static void main(String args[]) throws IOException
    {
        Prog_68 obj = new Prog_68();
        obj.input();
        obj.display();
    }
}