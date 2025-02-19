package Yuumei;

public class pokemon {

	//normal attributes
	String name;
	int id;
	String type;
	//combat attributes
	float health;
	float defense;
	float agility;
	int level;
	float experience;
	
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
