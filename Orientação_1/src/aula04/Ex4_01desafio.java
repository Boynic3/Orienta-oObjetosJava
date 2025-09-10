package aula04;
//CORRIGIR O HISTOGRAMA VERTICAL 
//
//
//
import javax.swing.JOptionPane;

public class Ex4_01desafio {

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
		int maxFrequencia = 0;
		for (int valor : valores) {
			if (valor >= min && valor <= max) {
				frequencia[valor - min]++;
			}
		}
		
		//HISTOGRAMA HORIZONTAL
		StringBuilder histogramaHorizontal = new StringBuilder();
		histogramaHorizontal.append("HISTOGRAMA HORIZONTAL\n");
		histogramaHorizontal.append("Intervalo: [" + min + ", " + max + "]\n");
		histogramaHorizontal.append("Valores: ");
		for (int i = 0; i < valores.length; i++) {
			histogramaHorizontal.append(valores[i]);
			if (i < valores.length-1) {
				histogramaHorizontal.append(", ");
			}
		}
		histogramaHorizontal.append("\n\n");
		for (int i = 0; i < frequencia.length; i ++) {
			int valorAtual = min + i;
			histogramaHorizontal.append(valorAtual + " ");
			
			//ADCIONA ASTERISCOS CONFORME A FREQUENCIA
			for (int j = 0; j < frequencia[i]; j++) {
				histogramaHorizontal.append("*");
			}
			histogramaHorizontal.append("\n");
		}
		
		//HISTOGRAMA VERTICAL
        StringBuilder histogramaVertical = new StringBuilder();
        histogramaVertical.append("\nHISTOGRAMA VERTICAL\n\n");
        //DE CIMA PARA BAIXO (DA MAIOR FREQUENCIA PARA A MENOR)
        for (int linha = maxFrequencia; linha > 0; linha--) {
            for (int i = 0; i < frequencia.length; i++) {
                if (frequencia[i] >= linha) {
                    histogramaVertical.append("* ");
                } else {
                    histogramaVertical.append("  ");
                }
            }
            histogramaVertical.append("\n");
        }
        
        //IMPRIME OS NÚMEROS DEPOIS DE COLOCAR TODOS OS *
        for (int i = 0; i < frequencia.length; i++) {
            histogramaVertical.append((min + i) + " ");
        }
		
		//COMBINANDO OS HISTOGRAMAS
        StringBuilder resultado = new StringBuilder();
        resultado.append(histogramaHorizontal.toString());
        resultado.append(histogramaVertical.toString());
        
        
		//EXIBE HISTOGRAMA
		System.out.println(resultado.toString());
	}
}
