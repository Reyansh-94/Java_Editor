package java8_lecture15;

public class Alpha implements Beta{
	@Override
	public void test1() {
	System.out.println("incompleted method....");	
	}	
	public static void main(String[] args) {
	Alpha alpha = new Alpha();
	alpha.test1();
	 
	alpha.test4();
	
	}
}
