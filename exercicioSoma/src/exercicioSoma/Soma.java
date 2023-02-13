package exercicioSoma;

import java.util.Scanner;

public class Soma {
public static void main (String[] args) {
Scanner teclado = new Scanner (System.in);
	int n1, n2;
	System.out.println("Digite o primeiro número");
	n1 = teclado.nextInt();
	System.out.println("Digite o segundo número");
	n2 = teclado.nextInt();
	int soma = n1+n2;
	System.out.println("o resultado da soma é: " + soma ); 
	
}
}
