package medias;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double nota1, nota2, nota3, nota4, media;
	System.out.println("digite a nota do primeiro bimestre");
	nota1 = teclado.nextDouble();
	System.out.println("Digite a nota do segundo bimestre");
	nota2 = teclado.nextDouble();
	System.out.println("Digite a nota do terceiro bimestre");
	nota3 = teclado.nextDouble();
	System.out.println("Digite a nota do quarto bimestre");
	nota4 = teclado.nextDouble();
	
	media = (nota1+nota2+nota3+nota4)/4;
	System.out.printf("nota: %.2f", media);
	
	if(media < 5) {
		System.out.println("Sua nota foi menor que 5, então você está reprovado");
		
	}
	if (media >= 5 && media < 7) {
		System.out.println("Você ficou em recuperação");
	} else {
		System.out.println("Você foi aprovado");
	}
	
}
}
