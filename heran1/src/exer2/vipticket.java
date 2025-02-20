package exer2;

public class vipticket extends ticket {
	public vipticket(String newEventName,double newValue) {
		super(newEventName,newValue);
	}
	public double valueAdd;
	
	public void print() {
		System.out.println("==================");
		System.out.printf("=== %s ===\n",this.eventName);
		System.out.println("==================");
		System.out.printf("Valor: %.2f\n",this.value);
	}
}
