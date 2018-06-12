package Array0505;

public class MatrixArryDemo {
	public static void main(String[] args) {

		MatrixArray ma = new MatrixArray();

		ma.row = 1000;
		ma.col = 100;
		ma.maxRange = 123;

		int[][] matrixA = new int[ma.row][ma.col];
		int[][] matrixB = new int[ma.row][ma.col];
		int[][] matrixsum = new int[ma.row][ma.col];

		ma.setArrayValues(matrixA);
		ma.setArrayValues(matrixB);

		ma.printArrayValues(matrixA);
		System.out.println("#--------------------------------------------#");
		ma.printArrayValues(matrixB);

		matrixsum = ma.sumMatrix(matrixA, matrixB);

		System.out.println("#--------------------------------------------#");
		ma.printArrayValues(matrixsum);

	}

}
