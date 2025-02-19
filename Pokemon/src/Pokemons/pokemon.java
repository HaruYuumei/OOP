package Pokemons;

public class pokemon {

	//normal attributes
	public String name;
	public int id;
	public String type;
	//combat attributes
	public float health;
	public float defense;
	public float agility;
	public int level;
	public float experience;
	
	pokemon(String nome,int pid,String tipo,float hp,float def,float agi,int lv,float xp){
		name=nome;
		id=pid;
		tipo=type;
		health=hp;
		defense=def;
		agility=agi;
		level=lv;
		experience=xp;
		System.out.printf("Pokemon %s Created!\n",name);
	}
}
