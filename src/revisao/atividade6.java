package revisao;

import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int op = -1;
		int numero;
		String nome;
		
		while(op != 0){
		Menu.menu();
		op = sc.nextInt();
	
		switch (op) {
		case 1:
			sc.nextLine();
			
			System.out.println("Digite seu nome");
			nome = sc.nextLine();
			
			System.out.println("Ola :" + nome);
			
			break;
		case 2:
			sc.nextLine();
			
			System.out.println("Digite alguma coisa");
			nome = sc.nextLine();
			
			System.out.println("Digite um numero");
			numero = sc.nextInt();
			
			for(int i = 0; i < numero; i++) {
				System.out.println(nome);
			}
			
			break;
		case 3:
			
			System.out.println("Digite um numero inteiro");
			numero = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Digite alguma coisa");
			String frase = sc.nextLine();
			
			for(int i = 0; i < numero; i++) {
				System.out.println(frase);
			}
			
			break;
		case 4:
			
			System.out.println("Digite a altura do retangulo");
			double altura = sc.nextDouble();
			
			System.out.println("Digite base do retangulo");
			double base = sc.nextDouble();
			
			System.out.println("A area do perimetro e :" + altura * base );
			
			break;
		default:
			break;
		}
		}
		System.out.println("Programa finalizado !!!!!");
	}

}
