package fundamentos;

import java.util.Scanner;

public class StringExercicio04 {
	public static void main(String[] args) {
		Scanner entradaOne = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String textinho = entradaOne.nextLine();
		
		String str1 = textinho.toUpperCase();
		System.out.println(str1);
		
		}

}
