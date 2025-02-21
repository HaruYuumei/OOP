package Aula5;

public class comissionado extends funcionario{

	private int sells;
	private double sellsValue;
	
	public comissionado(String nName,int sellCount, double sellsValues) {
		super(nName);
		sells=sellCount;
		sellsValue=sellsValues;
	}
	
	public void payment() {
		double salary = sells * sellsValue;
		System.out.printf("%s\nYour payment is:: %.2f\n",this.getName(),salary);
	}
}
