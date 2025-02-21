package Exercises;

public class desktop extends computador implements printable {
	
	private double acessories;
	
	public desktop(int GBs, int Nproc,double acess) {
		super(GBs, Nproc);
		acessories = acess;
	}

	
	@Override
	public double CalculateValue() {
	 double result = this.getMemory() * 200 + this.getProcessors() * 400 + acessories;
	 return result;
	}
	
	@Override
	public void print() {
		System.out.println("Ram size:" + this.getMemory());
		System.out.println("Logical processors:" + this.getProcessors());
		System.out.println("Acessories:" + acessories);
		System.out.println("Value:" + CalculateValue());
	}

}
