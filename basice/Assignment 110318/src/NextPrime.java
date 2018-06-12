import java.util.Scanner;

public class NextPrime {

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberInput;
		System.out.println("Enter a prime number: ");
		numberInput = input.nextInt();
		int end = numberInput + 2;
		if (isPrime(end)) {
			System.out.println(end);
		}
		int i;
		for (i = numberInput; i < end; i++) {

		}
		if (isPrime(i)) {
			System.out.println(i);
		}
	}
}