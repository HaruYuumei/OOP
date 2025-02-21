package Aula5;

public abstract class funcionario {
	
	private String name;
	
	public funcionario(String nName) {
		name=nName;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public abstract void payment();
}

