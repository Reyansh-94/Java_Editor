package interface_concept_14;

public class B extends A implements C{
	
	//@Override
	//public int test2(); //Error, if make a class final then inheritence(@Override) is not allowed 
	
	public int test3() {
		return 50;
	}
public static void main(String[] args) {
	System.out.println(B.x); //A.x(auto convert value in it)
	B b = new B();
	System.out.println(b.test3());
}
}
