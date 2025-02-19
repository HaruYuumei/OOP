package Pokemons;

import java.util.ArrayList;

public class PokemonStarter {

	public static ArrayList<pokemon> AllPokemons = new ArrayList<pokemon>();
	
	public static void main(String[] args) {
		//name, id, type,health, defense, agility, level, xp
		// Creating the Pokemons
		pokemon Bulbassaur = new pokemon("bulbassaur",0,"grass",10,2,2,1,0);
		pokemon Charmander = new pokemon("Ivyssaur",1,"Fire",10,2,2,1,0);
		pokemon Squirtle = new pokemon("Squirtle",2,"Water",10,2,2,1,0);
		pokemon Pikachu = new pokemon("Pikachu",3,"Eletric",10,2,2,1,0);
		pokemon Nidoran = new pokemon("Nidoran",4,"Ground",10,2,2,1,0);
		pokemon Jigglepuff = new pokemon("Jigglepuff",5,"Psych",10,2,2,1,0);
		pokemon Gengar = new pokemon("Gengar",6,"Ghost",10,2,2,1,0);
		pokemon Eevee = new pokemon("Eevee",7,"Normal",10,2,2,1,0);
		pokemon Vaporeon = new pokemon("Vaporeon",8,"Water",10,2,2,1,0);
		pokemon Flareon = new pokemon("Flareon",9,"Fire",10,2,2,1,0);
		pokemon Jolteon = new pokemon("Jolteon",10,"Eletric",10,2,2,1,0);
		pokemon Articuno = new pokemon("Articuno",11,"Ice",10,2,2,1,0);
		pokemon Zapdos = new pokemon("Zapdos",12,"Eletric",10,2,2,1,0);
		pokemon Moltres = new pokemon("Moltres",13,"Fire",10,2,2,1,0);
		pokemon MewTwo = new pokemon("MewTwo",14,"God",100,8,9,10,100);
		
		
		//Adding the Pokemons to the list
		AllPokemons.add(Bulbassaur);
		AllPokemons.add(Charmander);
		AllPokemons.add(Squirtle);
		AllPokemons.add(Pikachu);
		AllPokemons.add(Nidoran);
		AllPokemons.add(Jigglepuff);
		AllPokemons.add(Gengar);
		AllPokemons.add(Eevee);
		AllPokemons.add(Vaporeon);
		AllPokemons.add(Flareon);
		AllPokemons.add(Jolteon);
		AllPokemons.add(Articuno);
		AllPokemons.add(Zapdos);
		AllPokemons.add(Moltres);
		AllPokemons.add(MewTwo);
		
		
	}
	
	public ArrayList<pokemon> getArray() {
		return AllPokemons;
	}

}
