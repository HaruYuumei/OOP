package Exercises;

public class Main {

	public static void main(String[] args) {
		desktop nasa = new desktop(256,32,7);
		notebook wallmart = new notebook(4,8,11);
		
		nasa.print();
		System.out.println();
		wallmart.print();
	
		printable j;
		printable a;
		a = wallmart;
		a.print();
		System.out.println();
		j = nasa;
		j.print();
	}

}
