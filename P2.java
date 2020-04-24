// Command line argument Method

class P2
{    
	public static void main (String args[])
 {
	int a,b,c;
	float tot,avg;

	a = Integer.parseInt(args[0]);
	b = Integer.parseInt(args[1]);
	c = Integer.parseInt(args[2]);

	tot = a + b + c;
	avg = tot/3;

	System.out.println("---------------------");
	System.out.println("Total   = "+tot);
	System.out.println("Average = "+avg);
	System.out.println("---------------------");
    }
}