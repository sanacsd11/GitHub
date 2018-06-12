import java.util.Scanner;

class PrimeNumber22 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int x;
		System.out.print("Enter the number to find next prime to it =");
		x = read.nextInt();
		System.out.print("The next primenumber to " + x + " is =" + findprime(x));
	}

	public static int findprime(int num) {
		while (true) {
			boolean isprime = true;
			num = num + 1;
			int sqt = (int) Math.sqrt(num);
			for (int i = 2; i <= sqt; i++) {
				if (num % i == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime);
			return num;
		}
	}
}
