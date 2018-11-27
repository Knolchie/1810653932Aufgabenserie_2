import javax.swing.*;

public class Aufgabe3_1810653932 {
    public static void main(String[] args) {

        String eingabe= JOptionPane.showInputDialog("alter eingeben");
        double alter;
        alter = Double.parseDouble(eingabe);

        JOptionPane.showMessageDialog(null, alter);

        //Fließkommazahlen


        int otto = Integer.parseInt(eingabe);

        JOptionPane.showMessageDialog(null, otto);


        boolean otto1 = Boolean.parseBoolean(eingabe);

        JOptionPane.showMessageDialog(null, otto1);


        long otto2 = Long.parseLong(eingabe);

        JOptionPane.showMessageDialog(null, otto2);

        //nur Ganzzahlen

        char otto3 = eingabe.charAt(0);

        JOptionPane.showMessageDialog(null, otto3);

        //einzelne Zeichen (wenn Zeichenkette eingegben wird, wir nur das erste Zeichen gespeichert)

        byte otto4 = Byte.parseByte(eingabe);

        JOptionPane.showMessageDialog(null,otto4);

        //ganzZahlen

        short otto5=Short.parseShort(eingabe);

        JOptionPane.showMessageDialog(null, otto5);

        //ganzZahlen
        float otto6 =Float.parseFloat(eingabe);

        JOptionPane.showMessageDialog(null,otto6);

        //Fließkommazahlen// }

        String otto7 = String.valueOf(alter);

        JOptionPane.showMessageDialog(null, alter);

}


}