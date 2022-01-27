package Fracao;

public class Fracao {
	
	private static int contador = 0;
	private int numerador;
	private int denominador;
	
	public Fracao(int numerador, int denominador) {
		Fracao.contador += 1;
		this.numerador = numerador;
		this.denominador = denominador;
		this.stringando();
	}
	
	public Fracao add(Fracao f) {
		int fracaoDenominador = f.denominador * this.denominador;
		int fracaoNumerador = ((fracaoDenominador / f.denominador) * f.numerador)+((fracaoDenominador / this.denominador) * this.numerador);
		Fracao fracaoNova = new Fracao(fracaoNumerador,fracaoDenominador);
		return fracaoNova;
	}
	
	public Fracao sub(Fracao f) {
		int fracaoDenominador = f.denominador * this.denominador;
		int fracaoNumerador = ((fracaoDenominador / f.denominador) * f.numerador)-((fracaoDenominador / this.denominador) * this.numerador);
		if(fracaoNumerador < 0) {
			fracaoNumerador *= -1;
		}
		Fracao fracaoNova = new Fracao(fracaoNumerador,fracaoDenominador);
		return fracaoNova;
	}
	
	public Fracao mult(Fracao f) {
		int fracaoDenominador = f.denominador * this.denominador;
		int fracaoNumerador = f.numerador * this.numerador;
		Fracao fracaoNova = new Fracao(fracaoNumerador, fracaoDenominador);
		return fracaoNova;
	}
	
	public Fracao div(Fracao f) {
		int fracaoDenominador = this.denominador * f.numerador;
		int fracaoNumerador = this.numerador * f.denominador;
		Fracao fracaoNova = new Fracao(fracaoNumerador, fracaoDenominador);
		return fracaoNova;
	}
	
	public void stringando() {
		System.out.println("f"+Fracao.contador+": ( "+ this.numerador + " / " + this.denominador + " )");
	}
	
	public double toFloat() {
		double floatN = this.numerador;
		double floatD = this.denominador;
		return floatN/floatD;
	}
	
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	
}
