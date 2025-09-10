package aula03;

import javax.swing.JOptionPane;

public class Ex3_04 {

											//FUNÇÃO MAIN PARA IMPRIMIR RESULTADO BASEADO NOS INPUTS
	public static void main(String[] args) {
		int m, n, o, p;					    //Linhas e colunas das 2 matrizes ja transformadas em Int pelo Integer.parseInt(String)
		
		
		m = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da matriz M1: "));  //INPUTS DIRETAMENTE TRANSFORMADOS EM STRINGS
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da matriz M1: ")); //
		
		o = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da matriz M2: ")); //
		
		p = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da matriz M2: "));  //
		
		//VERIFICAÇÃO SE PODE MULTIPLICAR OU NÃO
		
		if (n != o) {
			JOptionPane.showMessageDialog(null, "Não é possível multiplicar essas matrizes\n" + "O número de colunas de M1 (" + n + ") deve " 
			+ "ser igual ao número de linhas de M2 ("+ o + ")");
			return;
		}
		
		//VARIAVEIS QUE RECEBEM A COLETA DOS ELEMENTOS DE CADA MATRIZ ANTES DE MULTIPLICAR
		int[][] m1 = lerMatriz(m, n, "M1");
		int[][] m2 = lerMatriz(o, p, "M2");
		
		//VARIAVEL QUE RECEBE A MULTIPLICAÇÃO DELES
		int[][] m3 = multiplicarMatrizes(m1, m2);
		
		StringBuilder resultado = new StringBuilder();
		resultado.append("Resultado da multiplicação de matrizes\n\n");
		resultado.append(matrizParaString(m1, "M1")).append("\n");
		resultado.append(matrizParaString(m2, "M2")).append("\n");
		resultado.append(matrizParaString(m3, "M3 (M1 x M2)"));
		
		JOptionPane.showMessageDialog(null, resultado.toString());
	}
	
											//FUNÇÃO QUE LE MATRIZES
	public static int[][] lerMatriz(int linhas, int colunas, String nome) {
		int[][] matriz = new int[linhas][colunas];
													//Formula para preencher uma matriz   Ex: 3linhas 2 colunas a11-> a12-> a21-> a22-> a31-> a32->
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j< colunas; j++) {
				String input = JOptionPane.showInputDialog("Digite o elemento " + nome +"[" +(i+1) + "][" + (j+1) + "]:");  //RECEBE O NUMERO EM STRING
				matriz[i][j] = Integer.parseInt(input);            //CONVERTE O NUMERO STRING RECEBIDO PARA INT
			}
		}
		return matriz;
	}
											//FUNÇÃO QUE MULTIPLICA AS MATRIZES M1 E M2 CASO SEJA POSSIVEL
	public static int[][] multiplicarMatrizes(int[][] m1, int[][] m2) {
		int linhasM1 = m1.length;
		int colunasM1 = m1[0].length;
		int colunasM2 = m2[0].length;
		
		int[][] resultado = new int[linhasM1][colunasM2];
		
		for (int i = 0; i < linhasM1; i++) {
			for (int j = 0; j < colunasM2; j++) {
				int soma = 0;
				for (int k = 0; k < colunasM1; k++) {
					soma += m1[i][k] * m2[k][j];
				}
				resultado[i][j] = soma;
			}
		}
		return resultado;
	}
	
											//FUNCAO QUE FORMATA AS MATRIZES PARA EXIBIÇÃO COM COLCHETES
	public static String matrizParaString(int[][] matriz, String nome) {
        StringBuilder sb = new StringBuilder();
        sb.append("Matriz ").append(nome).append(":\n");
        
        for (int i = 0; i < matriz.length; i++) {
            sb.append("[");
            for (int j = 0; j < matriz[0].length; j++) {
                sb.append(matriz[i][j]);
                if (j < matriz[0].length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]\n");
        }
        return sb.toString();
    }

	
}
