package interface_concept_13;

public class Cat implements Animal{
	public void eat() {
		System.out.println("Cat eating....");
	}
	public void noise() {
		System.out.println("mew mew....");
	}
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.noise();
		//g.noise(); // not implement here
	}
}
