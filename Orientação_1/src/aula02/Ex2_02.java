package aula02;

import java.util.Scanner;


public class Ex2_02 {

	public static void main(String[] args) {

		String valor1, valor2;
		
		int a, b;
		
		Scanner sc = new Scanner(System.in); //Para abrir o scanner
		System.out.println("Digite um valor inteiro:");
		valor1 = sc.nextLine();
		a = Integer.parseInt(valor1);
		System.out.println("Digite um valor inteiro:");
		valor2 = sc.nextLine();
		b = Integer.parseInt(valor2);
		
		System.out.println(a + b + "\n");
		System.out.println(a - b + "\n");
		System.out.println(a * b + "\n");
		System.out.println(a / b + "\n");
		System.out.println(Math.pow(a, b)+ "\n");
		
		
		sc.close();  //Para fechar o scanner
	}

}
