package aula04;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex4_02 {

	public static void main(String[] args) {
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de valores a serem gerados: "));
		int[] vetor = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			if (0 <= tamanho || tamanho > 20) {
				vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "º valor: "));
			}
			
		}
		Arrays.sort(vetor);
		System.out.println(vetor);
	}

}
//CONTINUAR
//
//
//
//
//
//