package exercicioPolimorfismo;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario jade = new Funcionario(1500.00);
		jade.setNome("Jade Rainha Mota");
		
		Gerente michel = new Gerente(3000.00); //todo funcionario é gerente, mas o contrário não se aplica
		michel.setNome("Michel Rodrigues Mota");
		
		System.out.println("Salario Jade: " + jade.getSalario());
		System.out.println("Salario Michel: " + michel.getSalario());
		System.out.println("Adicionando bonificacao!");
		System.out.println("Bonificacao Jade: " + jade.bonificacao());
		System.out.println("Bonificacao Michel: " + michel.bonificacao() + "\n");
		double total[] = new double[2];
		total[0] = jade.bonificacao() + jade.getSalario();
		total[1] = michel.bonificacao() + michel.getSalario();
		System.out.println(jade.getNome()+": "+total[0]);
		System.out.println(michel.getNome()+": "+total[1]);
		
	}
}
