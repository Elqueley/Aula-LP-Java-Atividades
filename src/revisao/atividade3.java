package revisao;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um numero inteiro");
		int numero = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Digite alguma coisa");
		String frase = sc.nextLine();
		
		for(int i = 0; i < numero; i++) {
			System.out.println(frase);
		}

	}

}
