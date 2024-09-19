package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		
		String input = showInputDialog("skriv in et positivt heltall");
		int n = Integer.parseInt(input);
		
		int fakultet = 1;
		
		while (n > 1) {
			fakultet = fakultet * n;
			n = n - 1;
		}
		
		System.out.print("fakulteten av " + input + " er: " + fakultet);
		

	}

}
