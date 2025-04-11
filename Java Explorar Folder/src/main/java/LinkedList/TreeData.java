package LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeData {
public static void main(String[] args) {
	
//	TreeSet Method
//	TreeSet<String> names = new TreeSet<>();
//	names.add("john");
//	names.add("reyan");
//	names.add("adam");
//	names.add("adam");
//	names.add("jane");
//	
//	System.out.println(names);
//	System.out.println(names.size());
//	System.out.println(names.descendingSet());
	
//	Set Method:
//	Set<String> set = new HashSet<>();
//	set.add("john");
//	set.add("reyan");
//	set.add("adam");
//	set.add("adam");
//	set.add("jane");
//	
//	
//	Set<Integer> val = new HashSet<>();
//	val.add(10);
//	val.add(20);
//	val.add(25);
//	
//	
//	Set<Integer> val1 = new HashSet<>();
//	val1.add(4);
//	val1.add(20);
//	val1.add(25);
//	
////	System.out.println(val.addAll(val1));
////	
////	System.out.println(val);
//	
//	val.retainAll(val1);
//	System.out.println(val1);
//	System.out.println(val);
//	Boolean con = val.contains(val1);
//	System.out.println(con);
// Set<Integer> setA = new HashSet<>();
// Set<Integer> setB = new HashSet<>();
// 
// setA.add(10);
// setA.add(60);
// setA.add(70);
// setA.add(90);
// setA.add(50);
// 
// setB.add(60);
// setB.add(70);
// setB.add(80);
// setB.add(90);
// setB.add(100);
// Union System
// setA.addAll(setB);
// System.out.println(setA);
// System.out.println(setB);
  
// setA.removeAll(setB);
// System.out.println(setA);
// System.out.println(setB);
// System.out.println(setA.size());
// System.out.println(setA.isEmpty());
// setA.clear();
// Boolean condition = setA.containsAll(setB);
 
// Intersection
// setA.retainAll(setB);
// System.out.println(setA);
//
// System.out.println("Is setA contains of '50' "+setA.contains(50));
	
	
//Otp Project-
//		Map<String, Integer> val = new HashMap<>();
//		Scanner scan = new Scanner(System.in);
//		while(true) {
//		System.out.print("Enter Mobile number..");
//		System.out.println();
//		String number = scan.next();
//		
//		int random = new Random().nextInt(10000);
//		System.out.println("Otp == "+ random);
//		
//		val.put(number, random);
//		System.out.println(val);
//		
//		System.out.println();
//		System.out.println("Enter Mobile Number");
//		System.out.println();
//		String num = scan.next();
//		
//		System.out.println();		
//		System.out.println("Enter Otp Number");
//		System.out.println();
//		int otp = scan.nextInt();
//		
//		System.out.println();
//		if(val.containsValue(otp) && val.containsKey(num)) {
//			System.out.println("Verify Number");
//			 break;
//		}else {
//			System.out.println("Incorect otp, Try Again!");
//		}
//}		
	while(true) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter the Mobile Number...");
		 String mobileNo = scan.next();
		 
		 int otp = 100000 + new Random().nextInt(90000);
		 
		 HashMap<String, Integer> otps = new HashMap<>();
		 otps.put(mobileNo, otp);
		 Integer otpr = otps.get(mobileNo);
		 System.out.println(otpr);
		 
		 
		// System.out.println("Enter MobileNo...");
		// String MobNo = scan.next();
		 System.out.println("Enter OtpNo...! Sent to you mobile Number");
		 int OtpNo = scan.nextInt(); 
		 

			if(otps.get(mobileNo).equals(OtpNo)) {
			 System.out.println("Verified");
			 otps.remove(otpr);
			 break;

		 } else {
			 System.out.print("!Occured, Invalid Otp Number");
		 }
	   }
		 
	}
}