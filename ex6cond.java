package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class ex6cond {

	public static void main(String[] args) {
		//padrao decimal EUA
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		//inserindo dados
		double num = sc.nextDouble();
		//ações conforme a inserção de dados feita
		if (num >= 0.00 && num <= 25.00){
			System.out.println("Intervalo (0,25]");
		}
		else if (num >= 25.01 && num <= 50.00) {
			System.out.println("Intervalo (25,50]");	
		}
		else if (num >= 50.01 && num <= 75.00) {
			System.out.println("Intervalo (50,75]");
		}
		else if (num >= 75.01 && num <= 100.00) {
			System.out.println("Intervalo (75,100]");	
		}
		else{
			System.out.println("FORA DE INTERVALO");
		}
		
		sc.close();

	}

}
