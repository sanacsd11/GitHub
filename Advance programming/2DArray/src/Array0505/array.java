package Array0505;

public class array {
	public static void main(String[] args) {
		int[][] myArray = new int[5][3];

		myArray[0][0] = 10;
		myArray[0][1] = 20;
		myArray[0][2] = 30;

		myArray[1][0] = 40;
		myArray[1][1] = 50;
		myArray[1][2] = 60;

		myArray[2][0] = 70;
		myArray[2][1] = 80;
		myArray[2][2] = 90;

		myArray[3][0] = 100;
		myArray[3][1] = 110;
		myArray[3][2] = 120;

		System.out.println(myArray[1][2]);
		System.out.println(myArray[3][2]);
		//System.out.println(myArray[5][2]);
	}
}
