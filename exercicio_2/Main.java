package exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto : ");
		double valor = sc.nextDouble();
		double porcentagem = 10;
		double valorDesconto = valor * (porcentagem / 100);
		
		valor = valor + valorDesconto;
		
		
		System.out.println("Novo valor do produto : " + valor );
		
		
		sc.close();
		
	}

}
