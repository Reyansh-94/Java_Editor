package data_structure_2;

public class Alpha {
public static void main(String[] args) {
//	String str = "mike is hacker scientist proficient professional";
//	String str1 = "kolkatakitecucuber";
//	System.out.println(str.contains("hacker"));
//	System.out.println(str.indexOf("hacker"));
//	System.out.println(str.indexOf('h', 7)); // indexOf(String str, int fromIndex)
//	System.out.println(str1.indexOf("k", 6));
	
//	System.out.println(str.startsWith("mike"));
//	System.out.println(str.endsWith("a"));
	
	//typecating
//	int x = 10;
//	String y = ""+x;
//	System.out.println(y);
//	float z = 12.43f;
//	String p = ""+z;
//	System.out.println(p);
//	System.out.println(String.valueOf(x)); //all primitive data type convert in string using of it method
//	System.out.println(String.valueOf(z));
//	
	
//	String str1 = "Nono has a more things for learning java, compilation";
//	System.out.println(str1.replace("Nono", "Sanu shoni"));
//    String[] str = {"A", "B", "C", "D", "E", "f"};
//    System.out.println(String.join("-", str));
	
	//Substring
	String s1 = "Hacker is hacked the bank account of mangement to stole all data from hub";
	System.out.println(s1.replace("Hacker", "Mahendra Singh").substring(0, s1.length()+5));
	
	//Concat method 
	String s2 = "Mahendra";
	String s3 = "Dhoni";
	System.out.println(s2.concat(" ").concat(s3));
}
}
