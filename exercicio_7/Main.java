package exercicio_7;

public class Main {

	public static char nepo(int numero) {
		if (numero > 0) {
			return 'P';
		} else {
			return 'N';

		}

	}

	public static void main(String[] args) {
		int numero = 2;

		char saida = nepo(numero);
		System.out.println("Resultado : " + saida);

	}

}
