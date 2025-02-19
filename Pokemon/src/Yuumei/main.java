package Yuumei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class main {

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
		
		ArrayList<pokemon> AllPokemons = new ArrayList<pokemon>();
		
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
		System.out.println("All pokemons added to the list!");
		
		System.out.println("Welcome to this silly little project!");
		System.out.println("this is a simple recreation of a pokemon battle");
		System.out.println("now lets start with choosing your pokemons!");
		System.out.println("The starting pokemons will be randomly selected from the pokemon list");
		System.out.println("you can choose between 3 bundles!");
		
		ArrayList<pokemon> PlayerPokemons = new ArrayList<pokemon>();
		
		ArrayList<pokemon> Bundle1 = new ArrayList<pokemon>();
		ArrayList<pokemon> Bundle2 = new ArrayList<pokemon>();
		ArrayList<pokemon> Bundle3 = new ArrayList<pokemon>();
		
		Collections.shuffle(AllPokemons, new Random());
		Bundle1.addAll(AllPokemons.subList(0, 3));
		AllPokemons.remove(0);
		AllPokemons.remove(1);
		AllPokemons.remove(2);
		Collections.shuffle(AllPokemons, new Random());
		Bundle2.addAll(AllPokemons.subList(0, 3));
		AllPokemons.remove(0);
		AllPokemons.remove(1);
		AllPokemons.remove(2);
		Collections.shuffle(AllPokemons, new Random());
		Bundle3.addAll(AllPokemons.subList(0, 3));
		AllPokemons.remove(0);
		AllPokemons.remove(1);
		AllPokemons.remove(2);
		System.out.printf("Bundle 1 Pokemons:\n");
		for (int i=0;i<Bundle1.size();i++) {
			System.out.println(Bundle1.get(i).name);
		}
		System.out.println();
		System.out.printf("Bundle 2 Pokemons:\n");
		for (int i=0;i<Bundle2.size();i++) {
			System.out.println(Bundle2.get(i).name);
		}
		System.out.println();
		System.out.printf("Bundle 3 Pokemons:\n");
		for (int i=0;i<Bundle3.size();i++) {
			System.out.println(Bundle3.get(i).name);
		}
		
		System.out.println();
		System.out.println("Choose one Bundle:");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		if(choice == 1) {
			PlayerPokemons.addAll(Bundle1);
			System.out.println("Your pokemons now are:");
			for (int i=0;i<Bundle1.size();i++) {
				System.out.println(Bundle1.get(i).name);
			}
		}
		if (choice == 2) {
			PlayerPokemons.addAll(Bundle2);
			System.out.println("Your pokemons now are:");
			for (int i=0;i<Bundle2.size();i++) {
				System.out.println(Bundle2.get(i).name);
			}
		}
		if(choice == 3) {
			PlayerPokemons.addAll(Bundle3);
			System.out.println("Your pokemons now are:");
			for (int i=0;i<Bundle3.size();i++) {
				System.out.println(Bundle3.get(i).name);
			}
		}
		
	
		
		
	}

}
