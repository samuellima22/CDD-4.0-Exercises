package Fundamentos;

import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {
		
		String domingo;
		String segunda;
		String terca;
		String quarta;
		String quinta;
		String sexta;
		String sabado;
		
		Scanner entra3 = new Scanner(System.in);
		System.out.println("Digite um número da semana ");
		int resp = entra3.nextInt();
		
		if (resp == 1){
			domingo = "Domingo";
			System.out.print(domingo);
		}
		else if (resp == 2){
			segunda = "Segunda";
			System.out.print(segunda);
		}
		else if(resp == 3){
			terca = "Terça";
			System.out.print(terca);
		}
		else if(resp == 4){
			quarta = "Quarta";
			System.out.print(quarta);
		}
		else if (resp == 5){
			quinta = "Quinta";
			System.out.print(quinta);
		}
		else if (resp == 6){
			sexta = "sexta";
			System.out.print(sexta);
		}
		else if (resp == 7){
			sabado = "sabado";
			System.out.print(sabado);
		}
		else {
			System.out.println("Valor invalido, Digite outro valor");
		}
	}
}
