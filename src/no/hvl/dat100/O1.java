package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            int poengsum;
           
            while (true) {
                String poeng = showInputDialog("Hvor mye poeng fikk elev " + i + "?");
                poengsum = Integer.parseInt(poeng);
                
                if (poengsum < 0) {
                    showMessageDialog(null, "Poengsum kan ikke være mindre enn null. Vennligst prøv igjen.");
                } else if (poengsum > 100) {
                    showMessageDialog(null, "Poengsum kan ikke være mer enn 100. Vennligst prøv igjen.");
                } else {
                    break;
                }
            }
            
            System.out.print("Elev " + i + " ");
            
    
            if (poengsum < 40) {
                System.out.println("fikk karakter F");
            } else if (poengsum < 50) {
                System.out.println("fikk karakter E");
            } else if (poengsum < 60) {
                System.out.println("fikk karakter D");
            } else if (poengsum < 80) {
                System.out.println("fikk karakter C");
            } else if (poengsum < 90) {
                System.out.println("fikk karakter B");
            } else {
                System.out.println("fikk karakter A");
            }
        }
    }
}
