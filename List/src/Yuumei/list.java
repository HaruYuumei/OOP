package Yuumei;

import java.util.ArrayList;
import java.util.Scanner;

public class list {

	public static void main(String[] args) {

		// simple vars = int, float, double, char
		//complex vars = String, List, Array
		
		//creating list
		ArrayList<String> animeWaifus = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
		
		//add and remove itens from Lists
		System.out.println("How Many waifus?");
		int waifusize = input.nextInt();
		
		for (int i=0;i<waifusize;i++) {
			System.out.println("Add a Waifu:");
			String name = input.next();
			animeWaifus.add(name);
		}
		
		for(int j=animeWaifus.size()-1;j>=0;j--) {
			System.out.printf(animeWaifus.get(j)+"\n");
		}
		
	}

}
