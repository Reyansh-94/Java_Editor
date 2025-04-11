package java8_lecture15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lam1 {
public static void main(String[] args) {
//	LamIntr x1 = (int x) ->{
//		System.out.println(x);
//	};
//  x1.test()
	//return type method 
	LamIntr x1 = ()-> {
		return 100;
	};
	
	int x = x1.test2();
	System.out.println(x);

	x1.test3();
	System.out.println(x1.test4());
	
	List<Integer> arr = Arrays.asList(10, 12, 14, 15, 18, 17, 16, 18);
  List<Integer> arr1 = arr.stream().filter(d->d%2 == 0).collect(Collectors.toList());	
  System.out.println(arr1);
}
}
