package data_structure_1;

public class Str_heap {
public static void main(String[] args) {
//	String s1 = "mike";
//	String s2 = "mike";
//	if(s1==s2) { //Compare the object address of both string
//		System.out.println("s1 is equal to s2");
//	}else {
//		System.out.println("s2 is not equal to s2");
//	}

	
//	if(s1.equals(s2)) { //Compare the value of s1 and s2
//		System.out.println("s1 is equal to s2");
//	}else {
//		System.out.println("s2 is not equal to s2");
//	}
	
//String s1 = " ";
//String s3 = "sonu shina";
//String s4 = "SONU SHINA";
//System.out.println(s3.equalsIgnoreCase(s4));
//System.out.println(s1.isEmpty());
//System.out.println(s1.isBlank());
//System.out.println(s1.length());

//	String s1 = "python";
//	String s_1 = "PYTHON";
//	String s2 = "java";
//	String s_2 = "JAVA";
//	String s3 = "abc";
//	String s4 = "acb";
//	
//	System.out.println(s1.compareTo(s2)); //s1 > s2 => +value(+6) count number of base p...j(decrease 6)
//	System.out.println(s2.compareTo(s1)); // s2 < s1 => -value(-6) 
//	
//	System.out.println(s_1.compareTo(s_2));
//	System.out.println(s_2.compareTo(s_1));
//	
//	System.out.println(s_1.compareTo(s2)); 
//	System.out.println(s2.compareTo(s_1));
//	
//	System.out.println(s1.compareTo(s_2));
//	System.out.println(s_2.compareTo(s1));
//	
//	System.out.println(s3.compareTo(s4));
//	System.out.println(s4.compareTo(s3));
//	
//	String str = "   sona   mohana   ";
//	String str1 = "\n \tACe    ";
//	System.out.println(str.trim());
//	System.out.println(str1.trim());
	
	
	//ChartAt method 
	String str = "abacdefaadr";
	int count = 0;
	for(int i=0; i<str.length(); i++) {
		if(str.charAt(i) == 'a') {
			count++;
			}		
	}
System.out.println("present a in it str "+ count + " time");
}
}
