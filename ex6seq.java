package curso_java;

import java.util.Scanner;
import java.lang.Math;
import java.util.Locale;

public class ex6seq {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//declaração de variáveis
		double A, B, C, triRet, circ, trap, quad, ret, pi = 3.14159;
		//inserção de dados
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		//cálculos
		triRet = A * C / 2;
		circ = pi * (Math.pow(C, 2));
		trap = (A + B)* C / 2;
		quad = Math.pow(B, 2);
		ret = A * B;
		//mostrando os resultados
		System.out.printf("TRIANGULO: %.3f%n", triRet);
		System.out.printf("CIRCULO: %.3f%n", circ);
		System.out.printf("TRAPEZIO: %.3f%n", trap);
		System.out.printf("QUADRADO: %.3f%n", quad);
		System.out.printf("RETANGULO: %.3f%n", ret);
		
		sc.close();
	}

}
