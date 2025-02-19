package exercises2;

public class Moeda {

	private double valor;
	private String nome;
	
	
	public void Moeda(double v,String n) {
		valor=v;
		nome=n;
	}
	
	public double getValor() {
		return valor;
	}
	public String getNome() {
		return nome;
	}
}

