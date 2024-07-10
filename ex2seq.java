package curso_java;
import java.util.math;
import java.util.Locale;
import java.util.Scanner;
public class ex2seq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//declarando tipos de variável
		double R, area;
		//inserindo valores
		R = sc.nextDouble();
		//cálculo da área
		area = 3.14159 * Math.pow(R, 2);
		//para seperação decimal no padrão dos Estados Unidos
		Locale.setDefault(Locale.US);
		
		System.out.printf("A=%.4f%n", area);
		
	}

}
