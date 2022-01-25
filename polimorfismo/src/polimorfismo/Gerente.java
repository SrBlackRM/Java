package polimorfismo;

public class Gerente extends Funcionario {
	
	public double bonificacao() {
		return super.bonificacao() + super.getSalario();
	}
}
