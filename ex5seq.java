package curso_java;

import java.util.Scanner;
import java.util.Locale;

public class ex5seq {

	public static void main(String[] args) {
		//padrao EUA decimais
		Locale.setDefault(Locale.US);
		//declaração de variáveis
		Scanner sc = new Scanner(System.in);
		int p1, cd1, p2, cd2;
		double val1,val2, compra;
		//inserção de dados
		cd1 = sc.nextInt();
		p1 = sc.nextInt();
		val1 = sc.nextDouble();
		
		cd2 = sc.nextInt();
		p2 = sc.nextInt();
		val2 = sc.nextDouble();
		//cálculo do valor da compra
		compra = (p1 * val1) + (p2 * val2);
		//mensagem informando valor a ser pago
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", compra);
		sc.close();
	}

}
