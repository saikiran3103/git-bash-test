/* CallingMethodsInSameClass.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Hello World");
		System.out.println("Hello World rep1");
		System.out.println("Hello World rep1-2s");
		
		System.out.println("Hello World rep1-3s");
		System.out.println("Hello World rep2-3");

	}

	public static void printTwo() {
		printOne();
		printOne();
	}
}
