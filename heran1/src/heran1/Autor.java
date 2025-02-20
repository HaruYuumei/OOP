package heran1;

public class Autor {
	private String name;
	private String email;
	private String nationality;
	
	
	//gets
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getNationality() {
		return nationality;
	}
	
	//sets
	public void setName(String newName) {
		name=newName;
	}
	public void setEmail(String newEmail) {
		email=newEmail;
	}
	public void setNationality(String newNationality) {
		nationality=newNationality;
	}
}
