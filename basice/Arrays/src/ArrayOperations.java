public class ArrayOperations {

	public ArrayOperations() {

	}

	public ArrayOperations(int[] num) {

		System.out.println("Minium via constructor :-" + findMinimum(num));
		System.out.println("Maximum via constructor :-" + findMaximum(num));
		System.out.println("Summation via constructor :-" + findSummation(num));
		System.out.println("Different via constructor :-" + findDifferent(num));
	}

	public int findMinimum(int[] num) {

		int min = num[0];
		for (int iNum : num) {
			if (min != iNum && iNum > min) {
				min = iNum;
			}
		}
		return min;
	}

	public int findMaximum(int[] num) {
		int max = num[0];
		for (int iNum : num) {
			if (max != iNum && iNum > max) {
				max = iNum;
			}
			return max;
		}
		return max;
	}

	public int findSummation(int[] num) {
		int sum = 0;
		for (int iNum : num) {
			sum += iNum;
		}
	return sum;

	}


	public int findDifferent(int[]num) {
	return findMaximum(num) - findMinimum(num);
	}
	}
