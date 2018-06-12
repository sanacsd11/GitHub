package HW;

public class FiveDigitsUnique2 {
	static int[] reLoadNumberArray;
	static int noofcards = 10000;

	public static void main(String[] args) {
		reLoadNumberArray = new int[noofcards];

		FiveDigitsUnique rn = new FiveDigitsUnique();
		rn.generateNumbers(reLoadNumberArray);
		rn.printFiveDigitsUnique2(FiveDigitsUnique2);

	}

}
