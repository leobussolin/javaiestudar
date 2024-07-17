package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class ex7cond {

	public static void main(String[] args) {
		//padrao decimal EUA
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner (System.in);
				//inserindo dados
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				//ações conforme a inserção de dados feita
				if (x == 0.0 && y == 0.0 ){
					System.out.println("ORIGEM");
				}
				else if (x == 0.0) {
					System.out.println("Eixo X");	
				}
				else if (y == 0.0) {
					System.out.println("Eixo Y");
				}
				else if (x > 0.0 && y > 0.0) {
					System.out.println("Q1");	
				}
				else if (x > 0.0 && y < 0.0) {
					System.out.println("Q4");
				}
				else if (x < 0.0 && y < 0.0) {
					System.out.println("Q3");
				}
				else {
					System.out.println("Q2");
				}
				
				sc.close();

	}

}
