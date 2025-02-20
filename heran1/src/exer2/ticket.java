package exer2;

public class ticket {

	public String eventName;
	public double value;
	
	
	public ticket(String newEventName,double newValue) {
		eventName= newEventName;
		value= newValue;
	}
	
	public void print() {
		System.out.println("==================");
		System.out.printf("=== %s ===\n",eventName);
		System.out.println("==================");
		System.out.printf("Valor: %.2f\n",value);
	}
	
	
	
}
