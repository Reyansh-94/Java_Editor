package java8_lecture15;
@FunctionalInterface
public interface Beta {
public void test1();
//public void test2(); // error->can not create two method in interface use of @FunctionalInterface annotations

public static void test3() { // create completed method
	System.out.println("Completd method ...");
}

default public void test4() { //help us devlop the complete method
	System.out.println("default keyword....");
}

}
