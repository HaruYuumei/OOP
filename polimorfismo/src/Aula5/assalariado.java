package Aula5;

public class assalariado extends funcionario{

	private double salary;
	
	public assalariado(String nName,double salary) {
		super(nName);
		this.salary=salary;
	}
	
	public void payment() {
		System.out.printf("%s\nYour payment is: %.2f\n",this.getName(),salary);
	}

}
