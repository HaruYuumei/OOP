package exercises;

public class Curso {
	public String nome;
	public double mensalidade;
	
	
	
	public void descrever() {
		System.out.printf("Curso: %s\n",nome);
		System.out.printf("Mensalidade: %.2f\n",mensalidade);
	}
	
	
	public void setNome(String newNome) {
		nome = newNome;
	}
	public void setMensalidade(double newMensalidade) {
		mensalidade = newMensalidade;
	}
}
