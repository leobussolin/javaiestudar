package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class ex4seq {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num_funcionario,x ;
		double hora_trab, salario_hora, salario_final;
		
		num_funcionario = sc.nextInt();
		hora_trab = sc.nextDouble();
		salario_hora = sc.nextDouble();
		
		
		salario_final = hora_trab * salario_hora;
		
		Locale.setDefault(Locale.US);
		System.out.println("NUMBER = "+ num_funcionario);
		System.out.printf("SALARY = U$ %.2f", salario_final);
		
		sc.close();
	}

}
