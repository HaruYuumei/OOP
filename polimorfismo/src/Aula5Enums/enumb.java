package Aula5Enums;

enum Seasons{
	Summer,
	Winter,
	Autum,
	Spring
}

public class enumb {
	Seasons Style;
	public enumb(Seasons newStyle) {
		Style = newStyle;
	}
	
	public void print() {
		
		switch (Style) {
		case Summer:
			System.out.println("Atsui"); break;
		case Winter:
			System.out.println("FUYU"); break;
		case Spring:
			System.out.println("HARU"); break;
		case Autum:
			System.out.println("RAIN"); break;
	}
		
	}
}
	
	
	

