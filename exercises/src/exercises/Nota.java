package exercises;

public class Nota {
	private double nota1;
	private double nota2;
	private int faltas;
	
	
	public void setNota1(double newNota) {
		nota1 = newNota;
	}
	public void setNota2(double newNota) {
		nota2 = newNota;
	}
	
	public void setfaltas(int newFaltas) {
		faltas = newFaltas;
	}
	
	public double getNota1() {
		return nota1;
	}
	public double getNota2() {
		return nota2;
	}
	
	public int getFaltas() {
		return faltas;
	}
	
	public void resultado() {
		int media = 70;
		double soma = nota1 + nota2 / 2;
		if(soma >100)
		{
			soma = 100;
		}
		if(soma >= media && faltas < 7) {
			System.out.println(soma);
			System.out.println(faltas);
			System.out.println("Parabéns pela aprovação!");
		}else if(soma >= media && faltas > 7)
		{
			System.out.printf("Total de faltas: %d\n",faltas);
			System.out.println("Infelizmente voce reprovou por faltas!");
		}
		if(soma <= media/2) {
			System.out.println(soma);
			System.out.println("Infelizmente voce reprovou!");
		}
		if(soma < media && soma > media/2) {
			double pontos = media-soma;
			System.out.println(soma);
			System.out.printf("Voce Esta de recuperação, faltando: %.2f pontos para passar!\n",pontos);
		}
	}
}

