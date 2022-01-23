package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de produto que deseja adicionar: ");
		int n = sc.nextInt();
		Product[] products = new Product[n];
		
		for(int i = 0; i<n; i++) {
			System.out.println("Entre com o nome do produto "+(i+1)+": ");
			String name = sc.next();
			System.out.printf("Entre com o preço do produto "+(i+1)+": ");
			double price = sc.nextDouble();
			System.out.println("Quantos(as) " + name + "(s) existem em estoque? ");
			int amountStocked = sc.nextInt();
			products[i] = new Product(name, price, amountStocked);
			System.out.println();
		}
		
		for(int i = 0; i<n; i++) {
			System.out.println("Total do produto "+(i+1)+": "+products[i].getTotal());
		}
		
		/*
		pd.setName("TV");
		pd.setPrice(900.00);
		
		pd.getName();
		pd.getPrice();
		*/
		
		sc.close();

	}

}
