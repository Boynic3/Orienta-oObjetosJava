package aula03;
import javax.swing.JOptionPane;
import java.lang.Math;
public class Ex3_01 {
    public static void main(String[] args) {
        //String forma = JOptionPane.showInputDialog(null, "Qual figura? \n(círculo, quadrado, retângulo, trapézio ou triângulo)").toLowerCase();
        String forma = JOptionPane.showInputDialog(null, "Escolha a forma a calcular\n1- Círculo\n2- Quadrado\n3- Retângulo\n4- Trapézio\n5- Triângulo\n").toLowerCase();
        
        switch (forma) {
        													// Esse String.format serve para formatar variaveis dentro de strings 
        	case "1": case "círculo": case "circulo":
                double r = Double.parseDouble(JOptionPane.showInputDialog("Raio do círculo:"));
                JOptionPane.showMessageDialog(null, String.format("Área: %.2f\nPerímetro: %.1f", Math.PI*r*r, 2*Math.PI*r));
                break;
                
        	case "2": case "quadrado":
                double l = Double.parseDouble(JOptionPane.showInputDialog("Lado:"));
                JOptionPane.showMessageDialog(null, String.format("Área: %.2f\nPerímetro: %.2f", l*l, 4*l));
                break;
                
        	case "3": case "retângulo": case "retangulo":
                double b_ret = Double.parseDouble(JOptionPane.showInputDialog("Base do Retângulo:"));
                double a_ret = Double.parseDouble(JOptionPane.showInputDialog("Altura do Retângulo:"));
                JOptionPane.showMessageDialog(null, String.format("Área: %.2f\nPerímetro: %.2f", b_ret*a_ret, 2*(b_ret+a_ret)));
                break;
                
        	case "4": case "trapézio": case "trapezio":
                double bM = Double.parseDouble(JOptionPane.showInputDialog("Base maior:"));
                double bm = Double.parseDouble(JOptionPane.showInputDialog("Base menor:"));
                double h = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
                double l1 = Double.parseDouble(JOptionPane.showInputDialog("Lado 1:"));
                double l2 = Double.parseDouble(JOptionPane.showInputDialog("Lado 2:"));
                JOptionPane.showMessageDialog(null, String.format("Área: %.2f\nPerímetro: %.2f", (bM+bm)*h/2, bM+bm+l1+l2));
                break;
                
            case "5": case "triângulo": case "triangulo":
            	
            	double a = Double.parseDouble(JOptionPane.showInputDialog("Lado A:"));
            	double b = Double.parseDouble(JOptionPane.showInputDialog("Lado B:"));
            	double c = Double.parseDouble(JOptionPane.showInputDialog("Lado C:"));
            	double abs_a = Math.abs(a);
            	double abs_b = Math.abs(b);
            	double abs_c = Math.abs(c);
            	// Armazena os valores dos lados em uma lista
            	double[] lados = {a, b, c};
            	java.util.Arrays.sort(lados);  // Ordena de forma crescente os lados: MENOR lados[0]	MEDIO lados[1]	MAIOR lados[2]
            	
            	// Caso seja triangulo retangulo utilizará essa variavel aqui:
            	double area_tri_ret = (lados[0] * lados[1]) / 2;     // Como nao usamos a hipotenusa, logo podemos calcular a area multiplicando
            														 // só os menores lados de um triangulo
            	
            	// Caso não seja retangulo utilizará a formula de Heron:
            	double s = ((a + b + c)/2);          //s igual a semiperimetro
            	double area_tri = Math.pow(( s*(s-a)*(s-b)*(s-c)), 0.5);
            	
            	if ( (b + c > a) && (a + c > b) && (a + b > c) || (abs_b - abs_c < a) && (abs_a - abs_c < b) && (abs_a - abs_b < c) ) {
            		JOptionPane.showMessageDialog(null, "É possível criar um triângulo com esses lados");
            		JOptionPane.showMessageDialog(null, String.format("Área: %.2f\nPerímetro: %.1f", area_tri, a + b + c));
            	} else {
            		JOptionPane.showMessageDialog(null, "Não é possível criar um triângulo com esses lados");
            	}
            	
            	if ((a * a == (b * b + c * c)) || (b * b == (a * a + c * c)) || (c * c == (a * a + b * b))) {
            		JOptionPane.showMessageDialog(null, "E o triângulo formado é retângulo");
            		JOptionPane.showMessageDialog(null, String.format("Área: %.2f\nPerímetro: %.1f", area_tri_ret, a + b + c));
            	}
            	
            	break;

            default: JOptionPane.showMessageDialog(null, "Figura inválida!");
        }
    }
}