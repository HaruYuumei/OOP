package heran1;

public class Main {

	public static void main(String[] args) {
		
		Autor Maria = new Autor();
		Maria.setName("Maria da Silva");
		Maria.setEmail("MariaEmail@Email.com");
		Maria.setNationality("Brasileira");
		
		Autor Ash = new Autor();
		Ash.setName("Ash Hancock");
		Ash.setEmail("AshHancock@Email.com");
		Ash.setNationality("England");
		
		LivroFisico l1 = new LivroFisico();
		l1.setAutor(Maria);
		l1.setEdition(1);
		l1.setGenre("Fantasia");
		l1.setTitle("Pequeno Mundo Magico");
		l1.setTiragem(5);
		l1.setPeso(645);
		
		LivroDigital l2 = new LivroDigital();
		l2.setAutor(Ash);
		l2.setEdition(5);
		l2.setGenre("Terror");
		l2.setTitle("Horror on the Ocean");
		l2.setDownloads(450);
		l2.setTamanho(3670);
		
		l1.info();
		System.out.println();
		l2.info();
		
		
		
	}

}
