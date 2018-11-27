import javax.swing.*;

public class Aufgabe2_1810653053
{
    public static void main (String[]args)
    {

            int a = Integer.parseInt(JOptionPane.showInputDialog("bitte eine Zahl eingeben"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("bitte eine Zahl eingeben"));
        if(a==b)
        {
            System.out.println("die Zahlen eingegebeben sind gleich a=b="+a);
        }
        else
        {
            System.out.println("sie haben 2 ungleiche Zahlen eingegeben");
        }
        int i=0;
        while (a!=b)
        {

            if (a>b)
            {
               b++;
            }
            if (b>a)
            {
                a++;
            }
            i++;
            System.out.println(a+" "+b+" Schrittanzahl:"+i);
        }

    }
}
