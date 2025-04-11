package CoreJava;

public class ParentsMethod extends Combine{

	@Override
	public void test1() {
		System.out.println("Preetam singh");
		
	}

	@Override
	public void test2() {
		System.out.println("Sanjay Singh");
		
	}
	public static void main(String[] args) {
		ParentsMethod p1 = new ParentsMethod();
		p1.test1();
		p1.test2();
	}

}
