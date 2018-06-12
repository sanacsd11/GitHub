package Array0505;

import java.util.Random;

public class MatrixArray {

	protected int row = 0;
	protected int col = 0;
	protected int maxRange = 0;

	protected int[][] setArrayValues(int[][] numArray) {

		Random rand = new Random();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				numArray[i][j] = rand.nextInt(maxRange);
			}
		}
		return numArray;
	}

	protected void printArrayValues(int[][] numArray) {

		// method 2
		for (int[] is : numArray) {
			for (int i : is) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}

	protected int[][] sumMatrix(int[][] arrayA, int[][] arrayB) {
		int[][] sumArray = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sumArray[i][j] = arrayA[i][j] + arrayB[i][j];
			}
		}
		return sumArray;

	}
}

// method 1
/*
 * for(int i =0; i<row; i++) { for(int j = 0; j < col; j++) {
 * System.out.println(numArray[i][j]+"\t"); } System.out.println(); }
 */
