// Multiple Marksheet.

import java.io.*;
class Prog_119
{
    int roll,age,m1,m2,m3,m4,m5;
    double tot,per;
    char grade;
    String name;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter Name                 = ");
        name = br.readLine();

        System.out.print("Enter Age                  = ");
        age = Integer.parseInt(br.readLine());

        System.out.print("Enter Roll Number          = ");
        roll = Integer.parseInt(br.readLine());

        System.out.print("Enter Marks of 1st Subject = ");
        m1 = Integer.parseInt(br.readLine());

        System.out.print("Enter Marks of 2nd Subject = ");
        m2 = Integer.parseInt(br.readLine());

        System.out.print("Enter Marks of 3rd Subject = ");
        m3 = Integer.parseInt(br.readLine());

        System.out.print("Enter Marks of 4th Subject = ");
        m4 = Integer.parseInt(br.readLine());

        System.out.print("Enter Marks of 5th Subject = ");
        m5 = Integer.parseInt(br.readLine());
    }
    public void process()
    {
        tot = m1 + m2 + m3 + m4 + m5;
        per = tot/5;

        if (per <= 40)
        {
            grade = 'E';
        }
        else if (per <= 50)
        {
            grade = 'D';
        }
        else if (per <= 60)
        {
            grade = 'C';
        }
        else if (per <= 80)
        {
            grade = 'B';
        }
        else
        {
            grade = 'A';
        }
    }
    public void display()
    {
        System.out.println("\n\n----------------------------------------------------");
        System.out.println("\t\t\tMARKSHEET");
        System.out.println("----------------------------------------------------");
        System.out.println("Name                 = " +name);
        System.out.println("Age                  = " +age);
        System.out.println("Roll Number          = " +roll);
        System.out.println("----------------------------------------------------");
        System.out.println("Marks of 1st Subject = " +m1);
        System.out.println("Marks of 2nd Subject = " +m2);
        System.out.println("Marks of 3rd Subject = " +m3);
        System.out.println("Marks of 4th Subject = " +m4);
        System.out.println("Marks of 5th Subject = " +m5);
        System.out.println("----------------------------------------------------");
        System.out.println("Total                = " +tot);
        System.out.println("Percentage           = " +per);
        System.out.println("Grade                = " +grade);
        System.out.println("----------------------------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        int r,i;
        
        Prog_119 obj[] = new Prog_119[10];

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("\nEnter Range = ");
        r = Integer.parseInt(br.readLine());

        for (i=0; i<r; i++)
        {
            obj[i] = new Prog_119();
            obj[i].input();
            obj[i].process();    
        }

        for (i=0; i<r; i++)
        {
            obj[i].display();
        }
    }
}