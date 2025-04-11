package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class ListsMethod {
public List<?> getList() {
	List<Long> arr = new ArrayList<>();
	arr.add(9327176472L);
	arr.add(9327176752L);
	arr.add(9327346472L);
	arr.add(9323476472L);
	arr.add(9326776472L);
	arr.add(9327236472L);
	arr.add(9329086472L);
	arr.add(9234176472L);
	arr.add(9329873472L);
	arr.add(9322354472L);
	arr.add(9367576472L);
	return arr;
} 
public static void main(String[] args) {
	ListsMethod r = new ListsMethod();
	List<?> list = r.getList();
	for(Object l : list) {
		System.out.println(l);
	}
	
}
}