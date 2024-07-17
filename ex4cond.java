package curso_java;

import java.util.Scanner;

public class Ex4cond {

	public static void main(String[] args) {
		//declarando variaveis
		Scanner sc = new Scanner (System.in);
		int horaInicio, horaFim, duracao;
		//inserindo dados
		horaInicio = sc.nextInt();
		horaFim = sc.nextInt();
		//ações conforme a inserção de dados feita
		if (horaInicio < horaFim){
			duracao = horaFim - horaInicio;
		}
		else {
			duracao = 24 - horaInicio + horaFim;	
		}
		//mostrando a mensagem do resultado
		System.out.println("O jogo durou" + duracao + "hora(s)");
		sc.close();

	}

}
