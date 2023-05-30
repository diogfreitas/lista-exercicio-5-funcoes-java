package exercicio_9;

public class Main {

	public static int reverso(int numero) {
		int reverso = 0;

		while (numero != 0) {
			int digito = numero % 10; 
			reverso = (reverso * 10) + digito;
			numero = numero / 10; 
		}

		return reverso;
	}

	public static void main(String[] args) {
		int numero = 127;
		int reverso = reverso(numero);
		System.out.println(reverso); 
	}
}