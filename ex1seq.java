package curso_java;
import java.util.Scanner;
public class ex1seq {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//inserção de dados
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		//cálculo da soma
		c = a + b;
		//mostrando o resultado
		System.out.printf("SOMA = %d", c); 
	}
}
