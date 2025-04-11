package interface_concept_13;

public class B implements A{

	@Override
	public void test1() {
		System.out.println(100);		
	}

	@Override
	public int test2() { // completed method in class
		return 120;
	}
public static void main(String[] args) {
	B b = new B();
    b.test1();
	System.out.println(b.test2());
}
}
