package exercises2;

import java.util.ArrayList;

public class Cofrinho {
	ArrayList<Moeda> moedas = new ArrayList<Moeda>();
	public void Cofrinho() {
		
	}
	
	public void adicionar(Moeda m) {
		moedas.add(m);
		System.out.println("Foi adicionado ao cofrinho:");
		System.out.println(m.getValor());
	}
	
	public double calcularTotal() {

		double total = 0;
		for (Moeda m : moedas) {
			total += m.getValor();
		}
		return total;
	}

}
