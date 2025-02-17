package Yuumei;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int
		var idade = 14;
		//string
		var nome = "Madoka";
		//float
		float height = 1.50f;
		//double
		var weight = 72.5;
		
		//Get Input from user, importing Scanner function from java.util
		Scanner input = new Scanner(System.in);
		
		//apply to var the user input
		var userInput = input.next();
		
		//different printing types
		System.out.print("Nome: \n" + nome);
		System.out.printf("Idade: %d\n",idade);
		System.out.printf("Height: %.2f\n", height);
		System.out.println("Weight: " + weight);
		
		System.out.println(userInput);
		
		System.out.println("Hello World");
		
		//if else else if
			if(idade < 18) {
				System.out.println("UOOOOOOHHHHH");
			}
			else {
				System.out.println("You good!");
			}

			//forloop
			for(int i=0;i<10;i++)
			{
				System.out.println("Valor: " + i);
			}
		
			//array and list
			int ages[] = {11,15,20,26,13,50};
			//empty array = type name[] = new type[n];
			
			for (int age = 0;age < ages.length; age++)
			{
				int currentage = ages[age];
					if(currentage < 18) {
						System.out.println("UOOOOOOHHHHH");
					}
					else if (currentage <30)
					{
						System.out.println("hey there!");
					}
					else
					{
						System.out.println("MOMMYYYYYYY");
					}
			}
			
	}

}
