package Array;

import java.util.Random;

public class Arraytest {

	final int randomRange = 1500;

	private int[] createArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			// array[i]=10*(i+1)
			Random rangene = new Random();
			int ranNumber = generateRandom(randomRange);
			array[i] = randNumber;
		}

		return array;
	}

	private void displayArray (int[]array) {
		for(int i=0; i<array.length;i++) {
			log("array["+i+"]"+array[i]);
		}	
	}

	public static void main(String[] args) {

		int[][] myArray = new int [2][3];
		myArray[0][0] = 10;
		myArray[0][1] = 20;
		myArray[0][2] = 30;
		
		myArray[1][0] = 23;
		myArray[1][1] = 34;
		myArray[1][2] = 54;
		
		System.out.println(myArray[1][2]);
		
	}
}