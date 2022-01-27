package Fracao;

public class TestLab1 {

	public static void main(String[] args) {
	
		Fracao f1 = new Fracao(1,2);
		Fracao f2 = new Fracao(1,3);
		Fracao f3 = f1.add(f2);
		Fracao f4 = f1.sub(f2);
		Fracao f5 = f1.mult(f2);
		Fracao f6 = f1.div(f2);
		System.out.println("float(f3): "+f3.toFloat());

	}

}
