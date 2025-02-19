package exercises;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Nota alunoNota = new Nota();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Indique a primeira nota:");
		alunoNota.setNota1(input.nextDouble());
		
		System.out.println("Indique a segunda nota:");
		alunoNota.setNota2(input.nextDouble());
		
		System.out.println("Indique a quantidade de faltas:");
		alunoNota.setfaltas(input.nextInt());
		
		System.out.println("Calculando...");
		System.out.println();
		
		alunoNota.resultado();
		
		
		
		Curso engenharia = new Curso();
		engenharia.setNome("Engenharia");
		engenharia.setMensalidade(3500.00);
		System.out.println();
		engenharia.descrever();
		
		Aluno a1 = new Aluno();
		a1.setCurso(engenharia);
		a1.setDesconto(350);
		a1.setMatricula(0001);
		a1.setName("José");
		System.out.println();
		a1.descrever();
		System.out.println();
		a1.pagamento();
	}

}
