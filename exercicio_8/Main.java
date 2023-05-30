package exercicio_8;

public class Main {

	public static double somaImposto(double taxaImposto, double custo) {
		double imposto = custo * (taxaImposto / 100); // Calcula o valor do imposto
		double custoComImposto = custo + imposto; // Calcula o custo com imposto
		return custoComImposto;
	}

	public static void main(String[] args) {
		double taxaImposto = 10.0; // Taxa de imposto de 10%
		double custo = 100.0; // Custo do item antes do imposto

		double custoComImposto = somaImposto(taxaImposto, custo);
		System.out.println("O custo com imposto é: " + custoComImposto);
	}
}
