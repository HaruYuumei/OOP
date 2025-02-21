package Exercises;

public class notebook extends computador implements printable{

	private int inches;
	
	public notebook(int GBs, int Nproc,int inch) {
		super(GBs, Nproc);
		inches = inch;
	}

	
	
	@Override
	public double CalculateValue() {
		 double result = this.getMemory() * 250 + this.getProcessors() * 500 + inches*100;
		 return result;
	}
	
	@Override
	public void print() {
		System.out.println("Ram size:" + this.getMemory());
		System.out.println("Logical processors:" + this.getProcessors());
		System.out.println("Monitor size:" + inches);
		System.out.println("Value:" + CalculateValue());
	}
	
}
