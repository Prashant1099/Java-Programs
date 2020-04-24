// Single Inheritance.

import java.io.*;
public class Prog_122
{
    String name;
    int age,id;

    public void emp_input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter Name of Employee = ");
        name = br.readLine();

        System.out.print("Enter Employee ID      = ");
        id = Integer.parseInt(br.readLine());

        System.out.print("Enter Age              = ");
        age = Integer.parseInt(br.readLine()); 
    }

    public void emp_display()
    {
        System.out.println("\n\n--------------------------------------------------");
        System.out.println("\t\t  Salary Slip");
        System.out.println("--------------------------------------------------");
        System.out.println("Name of Employee = " +name);
        System.out.println("Emplyoee ID      = " +id);
        System.out.println("Age              = " +age);
    }

    public static void main(String args[]) throws IOException
    {
        child obj = new child();
        obj.emp_input();
        obj.c_input();
        obj.process();
        obj.emp_display();
        obj.display();    }
}       // Closing of Base Class
class child extends Prog_122
{
    public double bs=0,da,ta,hra,pf,esi,sum,sub,tot,net;

    public void c_input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter Basic Salary     = ");
        bs = Integer.parseInt(br.readLine());
    }
    
    public void process()
    {
        da  = (bs * 40)/100;
        ta  = (bs * 10)/100;
        hra = (bs * 15)/100;
        pf  = (bs * 15)/100;
        esi = (bs * 7)/100;
        sum = (da + ta + hra);
        sub = (pf + esi);
        net = (bs + sum - sub);
    }

    public void display()
    {
        System.out.println("--------------------------------------------------");
        System.out.println("Basic Salary\t = " +bs);
        System.out.println("--------------------------------------------------");
        System.out.println("\t  Addition \t\t  Deduction");
        System.out.println("--------------------------------------------------");
        System.out.println("\tDA  = " +da+ " "+"\t\tPF  = "+pf);
        System.out.println("\tTA  = " +ta+ " "+"\t\tESI = "+esi);
        System.out.println("\tHRA = " +hra);
        System.out.println("--------------------------------------------------");
        System.out.println(" \t  "+sum+ "\t\t  " +sub);
        System.out.println("--------------------------------------------------");
        System.out.println("Net Salary = " +net);
        System.out.println("--------------------------------------------------");
    }
}