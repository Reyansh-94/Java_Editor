package LinkedList;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataStore {
	
	private int add(int a, int b) {
		return a+b;
	}
	
	public int addTwoNumbers(int a, int b) {
		return add(a, b);
	}
 public static void main(String[] args) {
//	 List<String> str = new ArrayList<>();
//	 str.add("Preetam Singh");
//	 str.add("Sanjay Singh");
//	 str.add("Banti Singh");
//	 
//	 
//	 Iterator<String> val = str.iterator();
//	 
//	 while(val.hasNext()) 
//		 String x = val.next();
//		 System.out.println(x);
//	 }
//	 
//	String key1 = "apple";
//	String key2 = "banana";
//	
//	System.out.println(key1.hashCode()%16);
//	System.out.println(Math.abs(key2.hashCode()%16));
	 
	 
	 DataStore d = new DataStore();
	 System.out.println(d.addTwoNumbers(5,  7));
 }
	
}
