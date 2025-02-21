package Aula5;

public class main {

	public static void main(String[] args) {
		funcionario h1 = new horista("Sakura",8,45);
		funcionario h2 = new assalariado("Hinata",450.50);
		funcionario h3 = new comissionado("Ten-Ten",157,3f);
		h1.payment();
		h2.payment();
		h3.payment();
		
	}

}
