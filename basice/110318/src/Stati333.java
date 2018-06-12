
public class Stati333 {

	
	static int x = 10;
	static int y = 6;
	static int z = 20;

	static int mulNum(int x,int y) {
					return x * y;
				}

	static int addNnum(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		int result = addNnum(addNnum(mulNum(5, x), mulNum(7, y)), z);

		System.out.println(result);

	}
}
