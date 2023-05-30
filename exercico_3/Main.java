package exercico_3;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura atual em Fahrenheit : ");
		double F = sc.nextDouble();
		
		double C = F - 32 / 1.8;
		
		System.out.printf("Temperatura em graus celsius é °C %.2f%n ", C);
		
		
		sc.close();
				

	}

}
