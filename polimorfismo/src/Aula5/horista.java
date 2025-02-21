package Aula5;

public class horista extends funcionario {
	private int hours;
	private int hoursValue;
	
	public horista(String name,int hoursWorked,int hoursValues) {
		super(name);
		hours=hoursWorked;
		hoursValue=hoursValues;
	}
	
	public void payment() {
		double valor=hours*hoursValue;
		System.out.printf("%s\nYour payment is: %.2f\n",this.getName(),valor);
	}
	
	

}	
