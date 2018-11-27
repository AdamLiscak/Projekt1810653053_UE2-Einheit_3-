import javax.swing.*;

public class Aufgabe3_1810653053
{
    public static void main (String[]args)
    {
        double alter;
        String eingabe;
        eingabe= JOptionPane.showInputDialog("bitte geben sie euren Alter ein");
        alter=Double.parseDouble(eingabe);
        JOptionPane.showMessageDialog(null, "euer Alter ist:"+(String.valueOf(alter)));

    }
}
