class TestMethods{
	public void addnum(int num1,int num2) {
		int result=num1 +num2;
		System.out.println(result);
	}
	public void subnum(int num1,int num2) {
		int result=num1 -num2;
		System.out.println(result);
	}
	public void mulnum(int num1,int num2) {
		int result=num1 *num2;
		System.out.println(result);
	}
	public void divnum(int num1,int num2) {
		int result=num1 /num2;
		System.out.println(result);
	}	
	public void additionnum(int num1,int num2) {
		int result=num1 /num2;
		System.out.println(result);
	}	
	public static void main(String [] args) {
		TestMethods tm= new TestMethods();
		
		//tm.addnum(20,30);
		tm.addnum(30,50);
		tm.subnum(100,50);
		tm.mulnum(10,20);
		tm.divnum(100,50);
	}
}