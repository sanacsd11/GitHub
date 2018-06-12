class TestMethods{
	public void subnum(int num1,int num2) {
		int result=num1 -num2;
		System.out.println(result);
	}
	public static void main(String [] args) {
		TestMethods tm= new TestMethods();
		
		tm.subnum(60,30);
		tm.subnum(100,50);
	}
}