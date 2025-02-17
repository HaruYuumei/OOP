package Yuumei;
import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {
	
		System.out.println("Welcome, Lets calculate the your BMI");
		System.out.println("First, we need some of your measures, in Kg and Cm, please");
		System.out.println("What is your Height?");
		
		Scanner input = new Scanner(System.in);
		float height = input.nextFloat();
		System.out.printf("Your Height is: %.2f\n",height);
		System.out.println("Now input your Weight:");
		float weight = input.nextFloat();
		System.out.printf("Your Weight is: %.2f KG\n",weight);
		System.out.println("Calculating your BMI...");
		double bmi  =weight / (height*height);
		System.out.printf("BMI = %.2f \n",bmi);
	}

}
