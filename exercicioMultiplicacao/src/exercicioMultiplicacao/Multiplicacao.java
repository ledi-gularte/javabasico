package exercicioMultiplicacao;

import java.util.Scanner;

public class Multiplicacao {
public static void main (String[] args) {
	Scanner teclado = new Scanner (System.in);
	int n1, n2;
	System.out.println("Digite o primeiro número");
	n1 = teclado.nextInt();
	System.out.println("Digite o segundo número");
	n2 = teclado.nextInt();
	int  multiplicacao= n1*n2;
	System.out.println("O resultado da multiplicação é: "+ multiplicacao);
	int resto = multiplicacao % 2;
	
	if(resto == 0) {
		System.out.println("O resultado da multiplicação é par");
	} else {
		System.out.println("o número é impar");
	}
}
}
