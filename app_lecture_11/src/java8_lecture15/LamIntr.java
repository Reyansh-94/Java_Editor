package java8_lecture15;

@FunctionalInterface
public interface LamIntr {
//public void test(int x);

public int test2();
default void test3() {
	System.out.println(200);
}
default int test4() {
	return 300;
}
 }
