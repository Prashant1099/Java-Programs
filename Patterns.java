// A program which takes Range as input and prints Different patterns upto that Range.

import java.io.*;
class Patterns
{
    int r,row,col,sp,x;
    char ch;

    Patterns()
    {
        sp = 1;
        x = 1;
        ch = 'A';
    }

    public void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("\nEnter Range = ");
        r = Integer.parseInt(br.readLine());
    }

    public void Prog_36()
    {
        for (row=1; row<=r; row++)
        {
            for (col=1; col<=row; col++)
            System.out.print(" "+col);
            System.out.println();
        }
        System.out.println("---------------------------");
    }
    
    public void Prog_37()
    {
        for (row=1; row<=r; row++)
        {
            for (col=1; col<=row; col++)
            System.out.print(" "+row);
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_38()
    {
        for (row=1; row<=r; row++)
        {
            for (col=1; col<=row; col++)
            System.out.print(" "+row%2);
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_39()
    {
        for (row=1; row<=r; row++)
        {
            for (col=1; col<=row; col++)
            System.out.print(" "+col%2);
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_40()
    {
        for (row=1; row<=r; row++)
        {
            for (col=1; col<=row; col++)
            System.out.print(" "+row*col);
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_41()
    {
        //x = 1;
        for (row=1; row<=r; row++)
        {
            for (col=1; col<=row; col++)
            System.out.print(" "+(x++));
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_42()
    {
        ch = 'A';
        for (row=1; row<=r; row++)
        {
            for (col=1; col<=row; col++)
            System.out.print(" "+(ch++));
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_43()
    {
        ch = 'A';
        for (row=1; row<=r; row++)
        {
            for (col=1; col<=row; col++)
            System.out.print(" "+(ch++));
            ch = 'A';
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_44()
    {
        for (row=1; row<=r; row++)
        {
            for (col=1; col<=row; col++)
            System.out.print(" "+ch);
            ch++;
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_45()
    {
        for (row=1; row<=r; row++)
        {
            for (sp=1; sp<=r-row+1; sp++)
                System.out.print("  ");
            for (col=1; col<=row; col++)
                System.out.print(" *");
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_46()
    {
        for (row=1; row<=r; row++)
        {
            for (col=1; col<=r-row+1; col++)
                System.out.print(" *");
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_47()
    {
        for (row=1; row<=r; row++)
        {
            for (sp=1; sp<=row; sp++)
                System.out.print("  ");
            for (col=1; col<=r-row+1; col++)
                System.out.print(" *");
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_48()
    {
        for (row=1; row<=r; row++)
        {
            for (sp=1; sp<=r-row+1; sp++)
                System.out.print("  ");
            for (col=1; col<=row; col++)
                System.out.print("   *");
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_49()
    {
        for (row=1; row<=r; row++)
        {
            for (sp=1; sp<=row; sp++)
                System.out.print("  ");
            for (col=1; col<=r-row+1; col++)
                System.out.print("   *");
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_50()
    {
        for (row=1; row<=r; row++)
        {
            for (sp=1; sp<=r-row+1; sp++)
                System.out.print("  ");
            for (col=1; col<=row; col++)
                System.out.print("   *");
            System.out.println();
        }
        for (row=2; row<=r; row++)
        {
            for (sp=1; sp<=row; sp++)
                System.out.print("  ");
            for (col=1; col<=r-row+1; col++)
                System.out.print("   *");
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_51()
    {
        for (row=1; row<=r; row++)
        {
            for (sp=1; sp<=row; sp++)
                System.out.print("  ");
            for (col=1; col<=r-row+1; col++)
                System.out.print("   *");
            System.out.println();
        }
        for (row=2; row<=r; row++)
        {
            for (sp=1; sp<=r-row+1; sp++)
                System.out.print("  ");
            for (col=1; col<=row; col++)
                System.out.print("   *");
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_52()
    {
        for (row=1; row<=r; row++)
        {
            for (col=1; col<=r; col++)
                System.out.print("  *");
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_53()
    {
        for (row=1; row<=r; row++)
        {
            for (sp=1; sp<=row; sp++)
                System.out.print("  ");
             for(col=1; col<=r-row+1; col++)
                if (col==1 || col==r-row+1)
                    System.out.print("   *");
                else
                    System.out.print("    ");
            System.out.println();
        }
        for (row=2; row<=r; row++)
        {
            for (sp=1; sp<=r-row+1; sp++)
                System.out.print("  ");
            for (col=1; col<=row; col++)
                if (col==1||col==row)
                        System.out.print("   *");
                else
                    System.out.print("    ");
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public void Prog_54()
    {
        for (row=1; row<=r; row++)
        {
            for (col=1; col<=r; col++)
                if (row==1 || row==r || col==1 || col==r)
                    System.out.print("  *");
                else
                    System.out.print("   ");
            System.out.println();
        }
        System.out.println("---------------------------");
    }
    public static void main(String args[]) throws IOException
    {
        Patterns obj = new Patterns();
        obj.input();
        obj.Prog_36();
        obj.Prog_37();
        obj.Prog_38();
        obj.Prog_39();
        obj.Prog_40();
        obj.Prog_41();
        obj.Prog_42();
        obj.Prog_43();
        obj.Prog_44();
        obj.Prog_45();
        obj.Prog_46();
        obj.Prog_47();
        obj.Prog_48();
        obj.Prog_49();
        obj.Prog_50();
        obj.Prog_51();
        obj.Prog_52();
        obj.Prog_53();
        obj.Prog_54();
    }
}