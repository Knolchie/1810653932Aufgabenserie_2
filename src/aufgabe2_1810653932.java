import javax.swing.*;

public class aufgabe2_1810653932 {

    public static void main(String[] args) {

        int zähler= 0;


        int benutzer1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte geben sie eine zahl ein"));
        int benutzer2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte geben sie eine 2te zahl ein"));


        while (benutzer1!=benutzer2) {

            zähler++;

            if (benutzer1 == benutzer2)
            {
                System.out.println(benutzer1);
                System.out.println("es wurden " + zähler + " Durchgänge benötigt");
             break;
            }

           else if (benutzer1 > benutzer2) {
                benutzer2++;
            }

         else if (benutzer2 > benutzer1) {
                benutzer1++;

            }




        }
    }
}
