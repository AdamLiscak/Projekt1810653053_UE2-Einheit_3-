import javax.swing.*;

public class Aufgabe5_1810653053 {
    public static void main(String[] args)
    {
        System.out.println("_____forschleife(7)________\n");
      forschleife(7);
        System.out.println("\n_____forschleife(11)________\n");
      forschleife(11);
        System.out.println("\n_____whileschleife(13)________\n");
      whileschleife(13);
        System.out.println("\n_____whileschleife(17)________\n");
      whileschleife(17);
        System.out.println("\n_________Nutzerschleife________\n ");
        nutzerschleife();

    }
    static void forschleife(int a)
    {
        for(int i=1;a+1 > i;i++ )
        {
            System.out.println("der Schleifenzähler ist:"+i);
        }
    }
    static void whileschleife(int a)
    {
        int i=0;
        while (a > i)
        {
            i++;
            System.out.println("Der Schleidenzähler ist:"+((2*i)));
        }

    }
    static void nutzerschleife()
    {
        {
            int x=Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeben bitte:"));
            int y=Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeben bitte:"));
            for (int i=1;x+1 > i;i++)
            {
                System.out.println("\nDas ist der "+i+". Durchlauf der äußeren Schleife\n");
                for (int j=1;y+1 > j;j++)
                {
                    System.out.println("       Das ist der "+j+". Durchlauf der inneren Schleife");
                }
            }
        }
    }


    }

