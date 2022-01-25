package polimorfismo;

public class ControleBonificacao {
	
	public double bonificacao(Funcionario f) {
		return f.bonificacao() + f.getSalario();
	}
}
