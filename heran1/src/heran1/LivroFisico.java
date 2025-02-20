package heran1;

public class LivroFisico extends Livro {
	
	private int tiragem;
	private int peso;
	
	public int getTiragem() {
		return tiragem;
	}
	public void setTiragem(int newTiragem) {
		tiragem=newTiragem;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int newPeso) {
		peso=newPeso;
	}
	
	
	public void info() {
		System.out.println("informações:");
		System.out.println(this.getTitle());
		System.out.println(this.getAutor().getName());
		System.out.println(this.getGenre());
		System.out.println(this.getTiragem());
		System.out.println(this.getPeso() +" "+"gramas\n");
		
	}
}
