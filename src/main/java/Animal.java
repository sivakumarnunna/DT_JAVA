package main.java;

public class Animal {
	
	
	int legs;
	int hands;
	String color;
	int nose;
	
	public void eat() {
		
		System.out.println("Eats food");
	}
	
	public void sleep() {
		
		System.out.println("sleeps nighttime");

	}
	
	public static void main(String[] args) {
		
		Animal dog = new Animal();
		
		dog.color = "blue";
		Animal cat = new Animal();
		cat.color = "white";

		
	}

}
