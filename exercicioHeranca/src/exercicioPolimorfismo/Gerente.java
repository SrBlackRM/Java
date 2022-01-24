package exercicioPolimorfismo;

public class Gerente extends Funcionario{

	public Gerente(double salario) {
		super(salario);
	}
	
	public double bonificacao() {
		return super.bonificacao() + super.getSalario();
	}
}
