package caso4;

import java.util.Scanner;

public class CasoQuatro {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String agencia, modelo, cor;
	double valor;
	int juros, parcelas;
	
	System.out.println("digite qual a agênciade veículos. ");
	agencia = teclado.nextLine();
	System.out.println("Qual o modelo do carro?");
	modelo = teclado.nextLine();
	System.out.println("Digite a cor do carro");
	cor = teclado.nextLine();
	System.out.println("Digite o valor do veículo");
	valor = teclado.nextDouble();
	System.out.println("Digite a taxa de juros");
	juros = teclado.nextInt();
	System.out.println("Digite a quantidade de parcelas");
	parcelas = teclado.nextInt();
	
	double prestacao = (valor*(1+juros/100))/parcelas;
	
	
	System.out.println("agência de veículos é: " + agencia ); 
	System.out.println("O modelo do carro é: " + modelo);
	System.out.println("a cor do carro é: " + cor);
System.out.printf("o valor do veículo é: %.2f reais", valor);
System.out.println(); 
System.out.printf("A taxa de juros é de %d por cento", juros); 
System.out.println(); 
System.out.printf("o número de parcelas é de: %d", parcelas); 
System.out.println(); 
System.out.printf("o valor das prestações é de: %.2f reais", prestacao );

}
}
