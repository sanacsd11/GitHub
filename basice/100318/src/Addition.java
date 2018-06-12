
class Addition{
	//public void addnum(int num1,int num2) {
	public int addnum(int num1,int num2) {
		int result1=num1 +num2;
		//System.out.println(result1);
		
	}
	public void subnum(int num1,int num2) {
		int result2=num1 -num2;
		System.out.println(result2);
	}
	public void mulnum(int num1,int num2) {
		int result3=num1 *num2;
		System.out.println(result3);
	}
	public void divnum(int num1,int num2) {
		int result4=num1 /num2;
		System.out.println(result4);
	}	
	//public void additionnum(int num1,int num2) {
	//	int result= tm.addnum + tm.subnum;
	//	System.out.println(result);
		
	public static void main(String [] args) {
		TestMethods tm= new TestMethods();
		
		//tm.addnum(20,30);
		tm.addnum(30,50);
		tm.subnum(100,50);
		tm.mulnum(10,20);
		tm.divnum(100,50);
	}
}

