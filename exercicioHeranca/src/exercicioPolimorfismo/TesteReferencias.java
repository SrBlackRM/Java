package exercicioPolimorfismo;

public class TesteReferencias {
	public static void main(String[] args) {
		Gerente g1 = new Gerente(2000.00);
		g1.setNome("Victor");
		System.out.println(g1.getNome()+" recebe: "+(g1.getSalario()+g1.bonificacao()));
	}
}
