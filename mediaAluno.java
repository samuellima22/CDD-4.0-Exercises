package Fundamentos;

import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		double nota1, nota2;
		double media;
		
		Scanner entra4 = new Scanner(System.in);
		System.out.println("Digite sua n1 ");
		nota1 = entra4.nextDouble();
		System.out.println("Digite sua n2 ");
		nota2 = entra4.nextDouble();
		
		media = (nota1+nota2)/2;
		
		System.out.println(media);
	}
}
