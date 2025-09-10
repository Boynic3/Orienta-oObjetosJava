package aula03;
import java.util.Scanner;



public class Ex3_02 {
	    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        
        // Cria e preenche o vetor
        int[] vetor = new int[tamanho];
        System.out.println("Digite os " + tamanho + " valores inteiros:");
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        // Calcula e exibe os resultados usando as funções
        System.out.println("\n=== RESULTADOS ===");
        System.out.printf("Média dos valores: %.2f\n", calcularMedia(vetor));
        System.out.println("Números positivos: " + contarPositivos(vetor));
        System.out.println("Números negativos: " + contarNegativos(vetor));
        System.out.println("Zeros: " + contarZeros(vetor));
        System.out.println("Números pares: " + contarPares(vetor));
        System.out.println("Números ímpares: " + contarImpares(vetor));
        
        scanner.close();
    }																//MÉDIA
    															  
	    public static double calcularMedia(int[] vetor) {
	        int soma = 0;
	        for (int num : vetor) {
	            soma += num;
	        }
	        return (double) soma / vetor.length;
	    }															//NÚMEROS POSITIVOS

	    public static int contarPositivos(int[] vetor) {
	        int count = 0;
	        for (int num : vetor) {
	            if (num > 0) count++;
	        }
	        return count;
	    }															//NÚMEROS NEGATIVOS

	    public static int contarNegativos(int[] vetor) {
	        int count = 0;
	        for (int num : vetor) {
	            if (num < 0) count++;
	        }
	        return count;
	    }															//CONTA ZEROS

	    public static int contarZeros(int[] vetor) {
	        int count = 0;
	        for (int num : vetor) {
	            if (num == 0) count++;
	        }
	        return count;
	    }															//CONTA PARES

	    public static int contarPares(int[] vetor) {
	        int count = 0;
	        for (int num : vetor) {
	            if (num % 2 == 0) count++;
	        }
	        return count;
	    }															//CONTA ÍMPARES

	    public static int contarImpares(int[] vetor) {
	        int count = 0;
	        for (int num : vetor) {
	            if (num % 2 != 0) count++;
	        }
	        return count;
	    }

	}
	


	
	
	
	
	
//Solução do LANNA
/*

   public static void main(String[] args) {
	//Variaveis
	String strX, strNum;
	int x, num;
	int v[];

	// 1º Passo: Ler o valor de x
	strX = JOptionPane.showInputDialog("Informe a quantidade de numeros: ");
	x = Integer.parseInt(strX);

	// 2º Passo: Criar um vetor de X posicoes e preenche-lo com valores lidos do teclado
	v = new int[x];
	for (int i=0; i<x; i++) {
		strNum = JOptionPane.showInputDialog("Informe um numero entre 0 e 20");
		num = Integer.parseInt(strNum);
		if (num > 0 && num <=20) {
			v[i] = num;
		} else {
			i--;
		}
	}

	imprimirVetor(v); 
   }

	

	private static void imprimirVetor(int[] v) {
		String resposta = "";
		resposta += "v =[";
		for (int i: v) {
			resposta += i + ", ";
		}
		resposta += "]\n";
		resposta += v;           //(Ponteiro)

		JOptionPane.showMessageDialog(null, resposta);
	}

}
*/

//ANOTACOES

	//Scanner leia = new Scanner (System.in);
	//int i[];
	//int j[];
	//
	//int n = leia.nextInt();
	//
	//
	//for (int i = 0; i < ; i++) {
	// System.out.println();
	//}
	//
	//leia.close();

	// Leia(x);
	// Criar vetor de tamanho x;
	// Ler x numeros armazenar vetor;
	// Ordenar vetor;
	// Imprimir vetores;
	//

