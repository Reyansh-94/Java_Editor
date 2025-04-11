package CoreJava;

import java.io.FileWriter;
import java.io.IOException;

public class FinallyTry {
public static void main(String[] args) {
	FileWriter fw = null;
	try {
		int x = 10/0;
//		System.out.println(x);
		fw = new FileWriter("D:\\test\\contents.txt");
		fw.write("Mike");
	}catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	System.out.println(200);
}
}
