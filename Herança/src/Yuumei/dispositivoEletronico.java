package Yuumei;

public class dispositivoEletronico {
	private String nome;
	private String OS;
	private double preco;
	private float imposto;
	
	public dispositivoEletronico(String namae) {
		nome = namae;
	}
	
	public void setNome(String newNome) {
		nome = newNome;
	}
	public void setPreco(Double newPreco) {
		preco=newPreco;
	}
	public void setOS(String newOS) {
		OS = newOS;
	}
	public void setImposto(float newImposto) {
		imposto = newImposto;
	}
	
	public String getNome() {
		return nome;
	}
	public double getPreco(){
		return preco;
	}
	public String getOS() {
		return OS;
	}
	public void valorTotal() {
		System.out.println(this.getNome());
		System.out.println("Valor com imposto:");
		double soma = (imposto * preco) + preco;
		System.out.printf("%.2f\n",soma);
	}
}
