// A program which takes any two number as input and prints Days and Months accordingly.

import java.io.*;
class Prog_17
{
    int day,mon;

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter Day (1-7)    = ");
        day = Integer.parseInt(br.readLine());

        System.out.print("Enter Month (1-12) = ");
        mon = Integer.parseInt(br.readLine());
    }
    public void process()
    {
        System.out.println("----------------------------------");
        switch(day)
        {
            case 1:
                System.out.println(day+ " is Monday");
                break;

            case 2:
                System.out.println(day+ " is Tuesday");
                break;

            case 3:
                System.out.println(day+ " is Wednesday");
                break;

            case 4:
                System.out.println(day+ " is Thrusday");
                break;

            case 5:
                System.out.println(day+ " is Friday");
                break;

            case 6:
                System.out.println(day+ " is Saturday");
                break;

            case 7:
                System.out.println(day+ " is Sunday");
                break;

            default:
                System.out.println("Error! Please enter Day between 1 to 7");
        }
        switch(mon)
        {
            case 1:
                System.out.println(mon+ " is January");
                break;

            case 2:
                System.out.println(mon+ " is February");
                break;

            case 3:
                System.out.println(mon+ " is March");
                break;
            
            case 4:
                System.out.println(mon+ " is April");
                break;

            case 5:
                System.out.println(mon+ " is May");
                break;

            case 6:
                System.out.println(mon+ " is June");
                break;

            case 7:
                System.out.println(mon+ " is July");
                break;

            case 8:
                System.out.println(mon+ " is August");
                break;

            case 9:
                System.out.println(mon+ " is September");
                break;

            case 10:
                System.out.println(mon+ " is October");
                break;

            case 11:
                System.out.println(mon+ " is November");
                break;

            case 12:
                System.out.println(mon+ " is December");
                break;

            default:
                System.out.println("Error! Please enter Month between 1 to 12");
        }
        System.out.println("----------------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Prog_17 obj = new Prog_17();
        obj.input();
        obj.process();
    }
}
