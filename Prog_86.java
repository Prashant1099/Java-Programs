// A program which prints number of blank space,vowels,number,upper character,lower character 
// etc.. present in i/p string.

import java.io.*;
class Prog_86
{
    String str;
    int len,b,v,dig,up,low,i;

    Prog_86()
    {
        len = 0;
        b = 0;
        v = 0;
        dig = 0;
        up = 0;
        low = 0;
    }

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
        
        System.out.print("\nEnter String = ");
        str = br.readLine();
    }
    public void process()
    {
        len = str.length();

        for (i=0; i<len; i++)
        {
            if (str.charAt(i) == ' ')
                b++;
            else if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' ||
                    str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' ||
                    str.charAt(i) == 'U')
                v++;
            else if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                dig++;

            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                low++;
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                up++;
        }
    }
    public void display()
    {
        System.out.println("--------------------------------------------");
        System.out.println("The length of Input string         = " +len);
        System.out.println("Number of Words present            = " +(b+1));
        System.out.println("Number of Characters present       = " +(len-b));        
        System.out.println("Number of Blank Spaces present     = " +b);
        System.out.println("Number of Vowels present           = " +v);
        System.out.println("Number of Consonents present       = " +(len-(b+v+dig)));
        System.out.println("Number of Lower Characters present = " +low);
        System.out.println("Number of Upper Characters present = " +up);
        System.out.println("Number of Digits present           = " +dig);
        System.out.println("--------------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_86 obj = new Prog_86();
        obj.input();
        obj.process();
        obj.display();
    }
}