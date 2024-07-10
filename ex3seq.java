package curso_java;

import java.util.Scanner;

public class ex3seq {

	public static void main(String[] args) {
		//declaração de variáveis
		int A,B,C,D, DIFERENCA;
		
		Scanner sc = new Scanner (System.in);
		//inserção de dados
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		//cálculo
		DIFERENCA = (A * B - C * D);
		//mostrando resultado
		System.out.println("DIFERENCA = "+ DIFERENCA);
		
		sc.close();

	}

}
