package Yuumei;

public class principal {
	
	public static void main(String[] args) {
		notebook acer = new notebook("Acer");
		Computador thermaltake = new Computador("Pc");
		
		acer.setOS("Windows");
		acer.setPreco(2560.25);
		acer.setImposto(0.15f);
		acer.valorTotal();
		
		thermaltake.valorTotal();
	}
}
