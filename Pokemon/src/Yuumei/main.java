package Yuumei;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import Pokemons.pokemon;
import Pokemons.PokemonStarter;

public class main {

	public static void main(String[] args) {
		
		Pokemons.PokemonStarter.main(args);
		ArrayList<pokemon> PokemonList = Pokemons.PokemonStarter.AllPokemons;
		
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
		
		
		Collections.shuffle(PokemonList, new Random());
		Bundle1.addAll(PokemonList.subList(0, 3));
		PokemonList.remove(0);
		PokemonList.remove(1);
		PokemonList.remove(2);
		Collections.shuffle(PokemonList, new Random());
		Bundle2.addAll(PokemonList.subList(0, 3));
		PokemonList.remove(0);
		PokemonList.remove(1);
		PokemonList.remove(2);
		Collections.shuffle(PokemonList, new Random());
		Bundle3.addAll(PokemonList.subList(0, 3));
		PokemonList.remove(0);
		PokemonList.remove(1);
		PokemonList.remove(2);
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
