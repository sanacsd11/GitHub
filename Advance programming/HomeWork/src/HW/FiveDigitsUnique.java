package HW;

import java.util.Arrays;
import java.util.Random;

public class FiveDigitsUnique {

	public int[] generateNumbers(int[] reloadArray) {
		Random rand = new Random();
		for (int i = 0; i < reloadArray.length; i++) {
			reloadArray[i] = rand.nextInt(99999);
			if (reloadArray[i] < 10000) {
				i--;

			}
		}
		return reloadArray;
	}

	public void printRealloadNumbers(int[] realoadArray) {
		
		Arrays.sort(realoadArray);
		for (int i : realoadArray) {
			System.out.println(i);
		}
	}

}