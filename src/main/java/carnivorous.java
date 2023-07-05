package main.java;

public class carnivorous extends Animal {
	
	public void eat(){
		
		System.out.println("eats non vegitarion food");
	}
	
	
	public static void main(String[] args) {
		
		Animal cow = new Omnivorous();
		Animal tiger = new carnivorous();
		
		cow.eat();
		tiger.eat();
	}

}
