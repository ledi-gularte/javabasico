package teste;

import java.util.Scanner;

public class Nova {
public static void main (String[] args ) {
	Scanner teclado = new Scanner (System.in);
	Double nota1;
	Double nota2;
	double nota3;
	
	System.out.println("Digite a nota do primeiro trimestre");
	nota1 = teclado.nextDouble();
	System.out.println("Digite a nota do segundo trimestre");
	nota2 = teclado.nextDouble();
	System.out.println("Digite a nota do terceiro trimestre");
	nota3 = teclado.nextDouble();
	double media = (nota1 + nota2 + nota3)/3;
			System.out.printf("o valor da média é: %.2f", media );
			if (media<5) {
				System.out.println("Você foi reprovado");
				
			}
			else 
if(media>=5 && media<7) 
{
	
	System.out.println("Você ficou em recuperação");
}
else {
	System.out.println("Voce foi aprovado");
}
}
}
