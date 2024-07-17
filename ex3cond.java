package curso_java;

import java.util.Scanner;

public class ex3cond {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		if (A % B == 0 || B % A == 0 ){
			System.out.println("SAO MULTIPLOS");
		}
		else {
			System.out.println("NAO SAO MULTIPLOS");
		}
		sc.close();

	}

}
