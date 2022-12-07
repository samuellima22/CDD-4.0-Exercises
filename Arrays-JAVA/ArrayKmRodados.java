package fundamentos;

import java.util.Scanner;

public class arrayExercicio02 {
public static void main(String[] args) {

double[] semanaOne = new double[7];
double[] semanaTwo = new double[7];

Scanner entradaK = new Scanner(System.in);
double somaOne = 0;
double somaTwo = 0;

for (int i = 0; i < semanaOne.length; i++) {
System.out.println("Digite quantos Km você rodou, referente a cada dia da semana Um: ");
double kmDiaSUm = entradaK.nextDouble();
semanaOne[i] = kmDiaSUm;
somaOne = somaOne + semanaOne[i];
}
System.out.println(somaOne / semanaOne.length);

for (int b = 0; b < semanaTwo.length; b++) {
System.out.println("Digite quantos Km você rodou, referente a cada dia da semana Dois: ");
double kmDiaSDois = entradaK.nextDouble();
semanaTwo[b] = kmDiaSDois;
somaTwo = somaTwo + semanaTwo[b];
}
System.out.println(somaTwo / semanaTwo.length);
}
}
