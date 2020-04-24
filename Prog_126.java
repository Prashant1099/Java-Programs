// Multithreading 2

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
public class Prog_126
{
    public static void main(String args[])
    {
        t5 obj5 = new t5();                 //obj5.setPriority(1);
        t7 obj7 = new t7();                 //obj7.setPriority(2);
        t9 obj9 = new t9();                 //obj9.setPriority(3);
        t11 obj11 = new t11();              //obj11.setPriority(4);

        obj5.setPriority(Thread.MIN_PRIORITY);
        obj7.setPriority(obj5.getPriority()+2);
        obj11.setPriority(obj5.getPriority()+1);
        obj9.setPriority(Thread.MAX_PRIORITY);
        
        obj5.start();
        obj7.start();
        obj9.start();
        obj11.start();
    }
}