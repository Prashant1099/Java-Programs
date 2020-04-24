// Multithreading 3

import java.io.*;
class t1 extends Thread
{
    public void run()
    {
        for (int i=1; i<=10; i++)
            if (i==5)
            {
                System.out.println("\n First Process Stop");
                stop();
            }
            else
                System.out.println("5" + " x " +i+ " = "+(5*i));
    }
}
class t2 extends Thread
{
    public void run()
    {
        for (int i=1; i<=10; i++)
        System.out.println("7" + " x " +i+ " = "+(7*i));
    }
}
public class Prog_127
{
    public static void main(String args[])
    {
        t1 obj1 = new t1();
        t2 obj2 = new t2();
        obj1.start();
        obj2.start();
    }
}