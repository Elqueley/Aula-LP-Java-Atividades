package revisao;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a altura do retangulo");
		double numero = sc.nextDouble();
		
		System.out.println("Digite base do retangulo");
		double numero2 = sc.nextDouble();
		
		System.out.println("A area do perimetro e :" + numero * numero2 );

	}

}
