package aula02;

import javax.swing.JOptionPane;

public class Ex2_01_grafico {

	public static void main(String[] args) {
 
		String nome;
		nome = JOptionPane.showInputDialog("Informe seu nome:");
		JOptionPane.showMessageDialog(null, "Olá " + nome + ", seja bem vindo(a)!");
	}

}
