package BCAS.b;

public class A {
		public int x = 10;
		private int y = 15;
		protected int z = 20;
		
		public static void main(String[]args) {
		 A obj = new A ();
		 
		System.out.println("out put from A public :- "+obj.x);
		System.out.println("out put from A private :- "+obj.y);
		System.out.println("out put from A prodted :- "+obj.z);
	}

}

