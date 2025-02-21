package Exercises;

public abstract class computador implements printable {
	
	private int GbMemory;
	private int NumProcessors;
	
	public abstract double CalculateValue();
	
	public computador(int GBs, int Nproc) {
		GbMemory = GBs;
		NumProcessors = Nproc;
		
	} 
	
	public int getMemory() {
		return GbMemory;
	}
	public int getProcessors() {
		return NumProcessors;
	}
	
	public void setMemory(int newMemory) {
		GbMemory=newMemory;
	}
	public void setProcessors(int newProcessors) {
		NumProcessors = newProcessors;
	}
	
	public void print() {
		System.out.println(getMemory());
		System.out.println(getProcessors());
	}
}
