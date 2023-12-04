package Recursivas;

import javax.swing.JOptionPane;

/*
 *  Faça uma função recursiva que calcule e retorne o N-ésimo termo da sequência
Fibonacci. Alguns números desta sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
 */

public class Fibbonaci {
   public static void main(String args[]) {
	   int n;
	   
	   n = Integer.parseInt(JOptionPane.showInputDialog("Informe o termo que busca em fibonacci: "));
	   
	   System.out.println("O valor desse termo é de: " + SerieFibo(n));
   }

private static int SerieFibo(int n) {
	if(n == 1) {
		return 0;
	}
	else
		if(n == 2) {
			return 1;
		}
		else {
			return SerieFibo(n-1) + SerieFibo(n-2);
		}
	
}
}
