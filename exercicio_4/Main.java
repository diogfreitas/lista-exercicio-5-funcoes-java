package exercicio_4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 valores: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double media = calcularMediaAritmetica(a, b, c);
		double harmonica = calcularMediaHarmonica(a, b, c);
		double geometrica = calcularMediaGeometrica(a, b, c);

		System.out.println("Média Aritmética: " + media);
		System.out.println("Média Harmônica: " + harmonica);
		System.out.println("Média Geométrica: " + geometrica);

		sc.close();
	}

	public static double calcularMediaAritmetica(double a, double b, double c) {
		return (a + b + c) / 3;
	}

	public static double calcularMediaHarmonica(double a, double b, double c) {
		return 3 / (1 / a + 1 / b + 1 / c);
	}

	public static double calcularMediaGeometrica(double a, double b, double c) {
		return Math.cbrt(a * b * c);
	}
}
