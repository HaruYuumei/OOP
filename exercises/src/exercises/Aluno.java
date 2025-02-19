package exercises;

public class Aluno {
	
	public String name;
	private int matricula;
	public double desconto;
	public Curso curso;
	
	public void descrever() {
		System.out.println("Informações do aluno:");
		System.out.printf("Nome: %s\n",name);
		System.out.printf("Matricula: %s\n",matricula);
		System.out.printf("Desconto: %.2f\n",desconto);
		System.out.printf("Cursando: %s\n",curso.nome);
	}
	
	public void pagamento() {
		double calculo = curso.mensalidade - desconto;
		System.out.printf("O aluno possui um desconto de: %.2f\n",desconto);
		System.out.printf("Pagando então: %.2f\n",calculo);
	}
	
	
	public void setName(String newName) {
		name=newName;
	}
	public void setMatricula(int newMatricula) {
		matricula= newMatricula;
	}
	public void setDesconto(double newDesconto) {
		desconto = newDesconto;
	}
	public void setCurso(Curso newCurso) {
		curso=newCurso;
	}
}
