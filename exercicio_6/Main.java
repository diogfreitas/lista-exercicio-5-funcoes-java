package exercicio_6;

public class Main {

	public static int soma(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15;

		int resultado = soma(a, b, c);
		System.out.println("A soma dos três números é: " + resultado);
	}

}

