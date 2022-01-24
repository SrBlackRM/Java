package exercicioPolimorfismo;

public class Funcionario {
	private String nome;
	private double salario;
		
	public Funcionario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double bonificacao() {
		return 0.1*this.salario;
	}
}
