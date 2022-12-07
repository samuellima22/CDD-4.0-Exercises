package Arrays;

import java.util.Scanner;

public class ExemploArray1 {
	public static void main(String[] args) {
		
	double[] faturas = new double[12];
	double media = 0;
	double soma = 0;
	Scanner entradaF = new Scanner(System.in);
	for (int i = 0; i < faturas.length; i++) {
	System.out.println("Digite o valor recorrente a cada mês: ");
	double meses = entradaF.nextDouble();
	faturas[i] = meses;

	soma = soma + faturas[i];
	}
	System.out.println(soma / faturas.length);
	}
	}
