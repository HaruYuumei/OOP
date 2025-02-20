package exer2;

public class main {
	
	public static void main(String[] args) {
		
		ticket t1 = new ticket("Subathon",10.0);
		vipticket t2 =  new vipticket("Subathon VIP PASS",25.0);
		t1.print();
		System.out.println();
		t2.print();
	}
}
