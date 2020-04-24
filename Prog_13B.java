// A program which takes Percentage as input and prints Grade accordingly.

import java.io.*;
class Prog_13B
{
    float per;
    char grade;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter Percentage = ");
        per = Float.parseFloat(br.readLine());
    }
    public void process()
    {
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
        /*if(per > 100)
        {
            System.out.println("Please Enter valid Percentage.");
            break;
        }*/
    }
    public void display()
    {
        System.out.println("----------------");
        System.out.println("Grade = " + grade);
        System.out.println("----------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_13B obj = new Prog_13B();
        obj.input();
        obj.process();
        obj.display();
    }
}