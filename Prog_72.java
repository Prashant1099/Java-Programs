// Addition of two Matrix.

import java.io.*;
class Prog_72
{
	int rr,cr,row,col,sn;
    int a[][] = new int[10][10],b[][] = new int[10][10],c[][] = new int[10][10];
    
	public void input() throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

        // Input of MATRIX A
        sn = 1;
        System.out.print("\nEnter Row Range of Matrix A    = ");
        rr = Integer.parseInt(br.readLine());
        
        System.out.print("Enter Column Range of Matrix A = ");
		cr = Integer.parseInt(br.readLine());

		System.out.println("\nEnter " +(rr*cr)+" Elements of Matrix A :- ");
		System.out.println("------------------------------");
		
		for (row=0; row<rr; row++)
            for (col=0; col<cr; col++)
            {
                System.out.print("Enter " +(sn++)+ " Element = ");
                a[row][col] = Integer.parseInt(br.readLine());
            }

        // Input of MATRIX B
        sn = 1;
        System.out.print("\nEnter Row Range of Matrix B    = ");
        rr = Integer.parseInt(br.readLine());
        
        System.out.print("Enter Column Range of Matrix B = ");
        cr = Integer.parseInt(br.readLine());

        System.out.println("\nEnter " +(rr*cr)+" Elements of Matrix B :- ");
        System.out.println("------------------------------");
        
        for (row=0; row<rr; row++)
            for (col=0; col<cr; col++)
            {
                System.out.print("Enter " +(sn++)+ " Element = ");
                b[row][col] = Integer.parseInt(br.readLine());
            }
    }
    
    public void process()
    {
        for (row=0; row<rr; row++)
        {
            for (col=0; col<cr; col++)
            {
                c[row][col] = a[row][col] + b[row][col];
            }
        }
    }
    
    public void display()
    {
        // Display of MATRIX A
        System.out.println("\nMATRIX A :-");
        System.out.println("-----------");

        for (row=0; row<rr; row++)
        {
            for(col=0; col<cr; col++)
                System.out.print("  " + a[row][col]);
            System.out.println();
        }

        // Display of MATRIX B
        System.out.println("\nMATRIX B :-");
        System.out.println("-----------");

        for (row=0; row<rr; row++)
        {
            for(col=0; col<cr; col++)
                System.out.print("  " + b[row][col]);
            System.out.println();
        }

        // Display of MATRIX A+B
        System.out.println("\nAddition of MATRIX A & MATRIX B :-");
        System.out.println("---------------------------------");

        for (row=0; row<rr; row++)
        {
            for(col=0; col<cr; col++)
                System.out.print("  " + c[row][col]);
            System.out.println();
        }
    }
    public static void main(String args[]) throws IOException
    {
        Prog_72 obj = new Prog_72();
        obj.input();
        obj.process();
        obj.display();
    }
}