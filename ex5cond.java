package curso_java;

import java.util.Scanner;

public class ex5cond {

	public static void main(String[] args) {
		//declarando variaveis
				Scanner sc = new Scanner (System.in);
				int codigo, quantidade;
				double conta = 0;
				//inserindo dados
				codigo = sc.nextInt();
				quantidade = sc.nextInt();
				//ações conforme a inserção de dados feita
				if (codigo == 1){
					conta = quantidade * 4.00;
				}
				else if (codigo == 2) {
					conta = quantidade * 4.50;	
				}
				else if (codigo == 3) {
					conta = quantidade * 5.00;	
				}
				else if (codigo == 4) {
					conta = quantidade * 2.00;	
				}
				else if (codigo == 5) {
					conta = quantidade * 1.50;	
				}
				else {
					System.out.println("PRODUTO NAO ENCONTRADO");	
				}
				//mostrando a mensagem do resultado
				System.out.printf("Total: R$ %.2f%n", conta);
				sc.close();
	}

}
