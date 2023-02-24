package revisao;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite alguma coisa");
		String nome = sc.nextLine();
		
		System.out.println("Digite um numero");
		int numero = sc.nextInt();
		
		for(int i = 0; i < numero; i++) {
			System.out.println(nome);
		}
		

	}

}
