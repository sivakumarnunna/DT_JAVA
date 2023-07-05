package main.java;

public class Addition {
	
	
	public void add(int a,int b) {
		int c = a+b;
		System.out.println(c);

	}
	public void add(double a,double b) {
		double c = a+b;
		System.out.println(c);
	}
	public void add(int a,int b,int c) {
		int d = a+b+c;
	}
	
	
	public static void main(String[] args) {
		
		Addition a = new Addition();
		
		a.add(3, 5);
	}
}
