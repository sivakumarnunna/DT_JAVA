package main.java;

public class Omnivorous extends Animal {
	
	
	
public void eat() {
		
		System.out.println("Omnivorous Eats vegitarion food");
	}
	
	
	
	public static void main(String[] args) {
		
		Animal dog = new Omnivorous();
		dog.eat();
	
	}

}
