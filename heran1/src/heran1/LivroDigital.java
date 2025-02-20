package heran1;

public class LivroDigital extends Livro {
	private int downloads;
	private double tamanho;
	
	public int getDownloads() {
		return downloads;
	}
	public void setDownloads(int newDownloads) {
		downloads=newDownloads;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double newTamanho) {
		tamanho=newTamanho;
	}
	
	public void info() {
		System.out.println("informações:");
		System.out.println(this.getTitle());
		System.out.println(this.getAutor().getName());
		System.out.println(this.getGenre());
		System.out.println(this.getDownloads()+" "+ "Downloads");
		System.out.println(this.getTamanho()+" "+ "MBs");
	}
}
