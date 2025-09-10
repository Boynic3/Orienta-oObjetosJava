package aula02;

import java.util.Scanner;

public class Ex2_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //Scanner aberto (Tem que fechar depois)
		String nome;
		System.out.println("Informe seu nome:");
		nome = sc.nextLine();
		System.out.println("Olá " + nome + ", seja bem vindo(a)!");
		
		sc.close();  //Para fechar o scanner
	}

}
