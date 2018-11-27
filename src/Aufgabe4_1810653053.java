import javax.swing.*;

public class Aufgabe4_1810653053 {
    public static void main (String[]args)
    {
        int w=Integer.parseInt(JOptionPane.showInputDialog("bitte geben sie Zahl zw. 1 und 3 ein, um sich durch die Schleifen zu orientieren"));
        int i = 0;
        if (w==1)
        {
            while (10 > i)
            {
                System.out.println("Der Schleifenzähler ist:" + (++i));
            }
        }
        if (w==2)
        {
            do
                {
                System.out.println("Der Schleifenzähler ist:" + (++i));
            } while (10 > i);

        }
        if (w==3)
        {
            for (i=1;11 > i;i++)
            System.out.println("Der Schleifenzähler ist:" + (i));
        }
        if(w>3)
        {
            System.out.println("ungültige Eingabe - Abbruch des Programms");
        }

    }
}
