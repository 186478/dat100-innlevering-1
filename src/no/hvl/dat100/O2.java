package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		
		String brutto = showInputDialog("hva er bruttoinntekten?");
		double bruttoInntekt = Integer.parseInt(brutto);
		
		double trinnskatt = beregnTrinnskatt(bruttoInntekt);
		
		System.out.printf("Trinnskatten for en bruttoinntekt på %.2f kroner er %.2f kroner.%n", bruttoInntekt, trinnskatt);
		
		
	}
	
	public static double beregnTrinnskatt(double bruttoinntekt) {
        double skatt = 0;

        if (bruttoinntekt <= 208050) {
            skatt = 0;
        } else if (bruttoinntekt <= 292850) {
            skatt = (bruttoinntekt - 208050) * 0.017; // 1,7 %
        } else if (bruttoinntekt <= 670000) {
            skatt = (292850 - 208050) * 0.017 + (bruttoinntekt - 292850) * 0.04; // 4,0 %
        } else if (bruttoinntekt <= 937900) {
            skatt = (292850 - 208050) * 0.017 + (670000 - 292850) * 0.04 + (bruttoinntekt - 670000) * 0.136; // 13,6 %
        } else if (bruttoinntekt <= 1350000) {
            skatt = (292850 - 208050) * 0.017 + (670000 - 292850) * 0.04 + (937900 - 670000) * 0.136 + (bruttoinntekt - 937900) * 0.166; // 16,6 %
        } else {
            skatt = (292850 - 208050) * 0.017 + (670000 - 292850) * 0.04 + (937900 - 670000) * 0.136 + (1350000 - 937900) * 0.166 + (bruttoinntekt - 1350000) * 0.176; // 17,6 %
        }

        return skatt;
    }


}
