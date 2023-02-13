package ativadade3;

public class CasoTres {

	public static void main(String[] args) {
		String agencia = "Ford", modelo = "ônix", cor = "vermelho";
		double valor = 50000.00;
		int juros = 30;
		int parcelas = 15;
		double prestacao = (valor * (1+juros/100))/parcelas; 
		
		System.out.println("agência de veículos é: " + agencia ); 
		System.out.println("O modelo do carro é: " + modelo);
		System.out.println("a cor do carro é: " + cor);
System.out.printf("o valor do veículo é: %.2f reais", valor);
System.out.println(); 
System.out.printf("A taxa de juros é de %d por cento", juros); 
System.out.println(); 
System.out.printf("o número de parcelas é de: %d", parcelas); 
System.out.println(); 
System.out.printf("o valor das prestações é de: %.2f reais", prestacao);
		
	}

}
