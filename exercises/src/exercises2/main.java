package exercises2;

public class main {

	public static void main(String[] args) {
		Moeda cinquenta = new Moeda();
		Moeda vintecinco = new Moeda();
		Moeda umreal = new Moeda();
		
		vintecinco.Moeda(0.25,"R$:0.25");
		cinquenta.Moeda(0.50,"R$:0.50");
		umreal.Moeda(1.00, "R$:1.00");
		
		Cofrinho cofre = new Cofrinho();
		
		cofre.adicionar(vintecinco);
		cofre.adicionar(cinquenta);
		cofre.adicionar(umreal);
		
		System.out.println("Quantidade no cofrinho:");
		System.out.println(cofre.calcularTotal());
		
		

	}

}
