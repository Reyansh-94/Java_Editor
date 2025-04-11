package interface_concept_13;

public class Dog implements Animal{
	public void eat() {
		System.out.println("Dog eating....");
	}
	public void noise() {
		System.out.println("bhoo bhoo....");
	}
	public static void main(String[] args) {
		Dog g = new Dog();
		g.eat();
		g.noise();
	}
}
