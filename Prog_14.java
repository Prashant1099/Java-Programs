// Menu Driven Calculator using Switch case.

import java.io.*;
class Prog_14
{
    double a,b,c;
    //char ch;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter First Number  = ");
        a = Double.parseDouble(br.readLine());

        System.out.print("Enter Second Number = ");
        b = Double.parseDouble(br.readLine());
    }
    public void Add()
    {
        c = a + b;
        System.out.println("Addition of " +a+ " and " +b+ " = " +c);
    }
    public void Sub()
    {
        c = a - b;
        System.out.println("Subtraction of " +a+ " and " +b+ " = " +c);
    }
    public void Multi()
    {
        c = a * b;
        System.out.println("Multiplication of " +a+ " and " +b+ " = " +c);
    }
    public void Div()
    {
        c = a/b;
        System.out.println("Division of " +a+ " and " +b+ " = " +c);
    }
    public void Per()
    {
        c = (a*100)/b;
        System.out.println("Percentage of " +a+ " and " +b+ " = " +c);
    }
    
    public static void main(String args[])throws IOException
    {
        char ch;
        Prog_14 obj = new Prog_14();
        obj.input();

        System.out.println("\nA. Addition");
        System.out.println("B. Subtraction");
        System.out.println("C. Multiplication");
        System.out.println("D. Division");
        System.out.println("E. Percentage");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("\nEnter Your Choice = ");
        ch = (char)br.read();

        switch(ch)
        {
            case 'a':
            case 'A':
                System.out.println("----------------------------------------");
                obj.Add();
                System.out.println("----------------------------------------");
                break;
            
                case 'b':
                case 'B':
                    System.out.println("----------------------------------------");
                    obj.Sub();
                    System.out.println("----------------------------------------");
                    break;
                
                case 'c':
                case 'C':
                    System.out.println("----------------------------------------");
                    obj.Multi();
                    System.out.println("----------------------------------------");
                    break;
                
                case 'd':
                case 'D':
                    System.out.println("----------------------------------------");    
                    obj.Div();
                    System.out.println("----------------------------------------");
                    break;
            
                case 'e':
                case 'E':
                    System.out.println("----------------------------------------");
                    obj.Per();
                    System.out.println("----------------------------------------");
                    break;
                
                default:
                    System.out.println("----------------------------------------");
                    System.out.println("Wrong Choice.");
                    System.out.println("----------------------------------------");
        }        
    }
}