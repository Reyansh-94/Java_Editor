package LinkedList;

public class A<T, U> {
 public T name;
 public U Id;
 
 public A(T name, U Id) {
	 super();
	 this.name = name;
	 this.Id = Id;
	 
 }
 public T getName() {
	 return name;
 }
public U getId() {
	return Id;
}
}
