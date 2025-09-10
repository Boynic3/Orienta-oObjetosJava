package aula03;

import javax.swing.JOptionPane;

public class Ex3_03 {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Digite uma palavra ou frase: ");
		
		if (ehPalindromo(texto)) {
			JOptionPane.showMessageDialog(null, "É um palíndromo");
		} else {
			JOptionPane.showMessageDialog(null, "Não é um palíndromo");
		}
	}
	
	public static boolean ehPalindromo(String texto) {
		String textoFormatado = texto.toLowerCase().replaceAll("\\s+", "");				//Substitui as sequências de espaços (\\s+) por nada ("")
		char[]caracteres = textoFormatado.toCharArray();								//Transforma a String em um vetor de caracteres    // Maria -> ['M','a','r','i','a']
		
		int inicio = 0;
		int fim = caracteres.length -1;
		
		while (inicio < fim) {															//Verifica o palindromo comparando caractere por caractere
			if (caracteres[inicio] != caracteres[fim]) {
				return false;													// OVO  O->[0] V->[1] O->[2]
			}																	//Inicio=0    Fim=2 (3 elementos- 1 =2)
			inicio++;															//Se inicio=0 (O) for diferente do fim=2 (o) retorna falso
			fim--;																//Depois se inicio=1 (V) for diferente do fim=1(o) retorna falso
		}		
		return true;
	}

}
