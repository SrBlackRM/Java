package polimorfismo;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setSalario(2500);
		f1.setNome("Michel");
		
		Funcionario g1 = new Gerente();
		g1.setSalario(2500);
		g1.setNome("Jade");
		
		ControleBonificacao c1 = new ControleBonificacao();
		System.out.println(c1.bonificacao(f1));
		System.out.println(c1.bonificacao(g1));
	}

}
