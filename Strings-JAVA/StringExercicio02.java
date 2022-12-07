package fundamentos;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringExercicio02 {
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um texto: ");
	String e1 = entrada.nextLine();
	
	StringTokenizer mostrar = new StringTokenizer(e1);
	System.out.println(mostrar.countTokens());
	
}
}
