package Array0505;

public class Test23D {
	public static void main(String[] args) {
		int[][][] myArray = new int[5][3][7];

		myArray[0][0][3] = 5;
		myArray[0][1][4] = 10;
		myArray[0][2][8] = 15;
		myArray[0][3][6] = 16;
		myArray[0][4][9] = 17;
		myArray[0][5][12] = 18;
		myArray[0][6][35] = 19;

		myArray[1][0][2] = 20;
		myArray[1][1] [3]= 25;
		myArray[1][2] [9]= 35;
		myArray[1][3] [15]= 36;
		myArray[1][4] [18]= 37;
		myArray[1][5][65] = 38;
		myArray[1][6][25] = 39;

		myArray[2][0] [12]= 40;
		myArray[2][1][12] = 45;
		myArray[2][2][85] = 50;
		myArray[2][3][28] = 51;
		myArray[2][4][98] = 52;
		myArray[2][5][69] = 53;
		myArray[2][6][36] = 54;

		myArray[3][0][25] = 55;
		myArray[3][1][36] = 60;
		myArray[3][2][96] = 65;
		myArray[3][3][69] = 66;
		myArray[3][4][36] = 67;
		myArray[3][5][26] = 68;
		myArray[3][6][13] = 69;

		System.out.println(myArray[1][2][1]);
		System.out.println(myArray[3][1][2]);
		System.out.println(myArray[5][2]);
	}
}
