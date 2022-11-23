package Fundamentos;
import java.util.Scanner;
public class ExercicioUm {

	public static void main(String[] args) {
		
		Scanner entraai = new Scanner(System.in);
		System.out.println("Digite um numero");
		double resp = entraai.nextDouble();
		
		if (resp < 0){
			System.out.println("O número é negativo");
		}
		else
			System.out.println("O número é positivo");
		
	}

}
