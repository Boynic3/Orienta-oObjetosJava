package aula02;

import javax.swing.JOptionPane;

public class Ex2_03 {                 // Basicamente um verificador de triangulo retangulo

	public static void main(String[] args) {
		String strA, strB, strC;
		float a, b, c;
		Boolean resultado;
		
		strA = JOptionPane.showInputDialog(null, "Primeiro valor:");
		a = Float.parseFloat(strA);
		strB = JOptionPane.showInputDialog(null, "Segundo valor:");
		b = Float.parseFloat(strB);
		strC = JOptionPane.showInputDialog(null, "Terceiro valor:");
		c = Float.parseFloat(strC);

		//Fiz mais do que pediu e coloquei o operador || (or) para contemplar todos os casos de triangulo retangulo
		resultado= (a * a == (b * b + c * c)) || (b * b == (a * a + c * c)) || (c * c == (a * a + b * b));
		JOptionPane.showMessageDialog(null, "É um triangulo? " + resultado);
	}

	
}
