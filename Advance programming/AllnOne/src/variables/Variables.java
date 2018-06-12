package variables;

public class Variables {
	public String insVar = "hi sana"; // instance variables

	public static String strVar = "hi raju"; // static variables or class variables

	public void printTest() {
		int x = 10; // local
		System.out.println(x);
	}

	public static void main(String[] args) {

		Variables obj1 = new Variables();
		Variables obj2 = new Variables();

		System.out.println("obj1 :" + obj1.insVar);
		System.out.println("obj1 :" + obj2.insVar);
		System.out.println("-----------------------------");

		obj1.strVar = "hi obj1";
		obj1.strVar = "hi obj2";

		System.out.println("obj1 :" + obj1.strVar);
		System.out.println("obj2 :" + obj2.strVar);
		System.out.println("-----------------------------");

		System.out.println("obj1 : " + obj1.strVar);
		System.out.println("obj2 : " + obj2.strVar);
		System.out.println("-----------------------------");

		obj1.strVar = "hiraju obj";
		System.out.println("obj1 : " + obj1.strVar);
		System.out.println("obj2 : " + obj2.strVar);

	}

}
