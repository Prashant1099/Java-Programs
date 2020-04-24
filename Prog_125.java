// Multithreading 1

import java.io.*;
class t5 extends Thread
{
    public void run()
    {
        for (int i=1; i<=30; i++)
            System.out.println("5" + " x " +i+ " = "+(5*i));
    }
}
class t7 extends Thread
{
    public void run()
    {
        for (int i=1; i<=30; i++)
            System.out.println("7" + " x " +i+ " = "+(7*i));
    }
}
class t9 extends Thread
{
    public void run()
    {
        for (int i=1; i<=30; i++)
            System.out.println("9" + " x " +i+ " = "+(9*i));
    }
}
class t11 extends Thread
{
    public void run()
    {
        for (int i=1; i<=30; i++)
            System.out.println("11" + " x " +i+ " = "+(11*i));
    }
}
public class Prog_125 
{
    public static void main(String args[])
    {
        t5 obj5 = new t5();
        t7 obj7 = new t7();
        t9 obj9 = new t9();
        t11 obj11 = new t11();

        obj5.start();
        obj7.start();
        obj9.start();
        obj11.start();
    }
}

