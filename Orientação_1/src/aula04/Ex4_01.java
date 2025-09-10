package aula04;

import javax.swing.JOptionPane;

public class Ex4_01 {

	public static void main(String[] args) {
		//DEFINE O INTERVALO
		int min = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor mínimo do intervalo"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor máximo do intervalo"));
		
		//DEFINE QUANTOS NÚMEROS
		int num = Integer.parseInt(JOptionPane.showInputDialog("Quantos valores serão inseridos?"));
		
		//LE OS VALORES
		int[] valores = new int[num];
		for (int i = 0; i < num; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor (entre " + min + " e " + max +"):"));
		}
		
		//FREQUENCIA DE CADA VALOR
		int[] frequencia = new int[max - min +1];     // Max = 10    Min = 0     10-0 + 1 = 11 valores de 0 a 10
		
		for (int valor : valores) {
			if (valor >= min && valor <= max) {
				frequencia[valor - min]++;
			}
		}
		
		//HISTOGRAMA
		StringBuilder histograma = new StringBuilder();
		histograma.append("HISTOGRAMA HORIZONTAL\n");
		histograma.append("Intervalo: [" + min + ", " + max + "]\n");
		histograma.append("Valores: ");
		for (int i = 0; i < valores.length; i++) {
			histograma.append(valores[i]);
			if (i < valores.length-1) {
				histograma.append(", ");
			}
		}
		histograma.append("\n\n");
		for (int i = 0; i < frequencia.length; i ++) {
			int valorAtual = min + i;
			histograma.append(valorAtual + " ");
			
			//ADCIONA ASTERISCOS CONFORME A FREQUENCIA
			for (int j = 0; j < frequencia[i]; j++) {
				histograma.append("*");
			}
			histograma.append("\n");
		}
		//EXIBE HISTOGRAMA
		System.out.println(histograma.toString());
	}
}
