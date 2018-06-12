package HW;

import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
		int array[] = { 1, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		int sum = 0;
		for (int s = 0; s < array.length; s++) {
			sum += array[s];
		}
		System.out.println("sum is " + sum);

		double avarage = 0;
		for (double s = 0; s < array.length; s++) {
			avarage = sum / array.length;
		}
		System.out.println("Avarage is" + avarage);

		int index = 0;
		for (int i = 0; (i < array.length) && (index == 0); i++) {
			if (array[i] == 60) {
				index = i;
			}
		}
		System.out.println("Index value is " + index);

		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Max is" + max);

		int min = 100;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Min is " + min);

		System.out.println(Arrays.toString(array));
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(array));

		
		
	}	
}
