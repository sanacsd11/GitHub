import java.util.Scanner;

/**BCAS,CSD11, G.Sirisanath , JAVA , 12 Mar 2018
 * 
 */

/**
 * @author Sri
 *
 */
public class NextPrimeCheck {
	public static void main(String[] args) {
// define prime as a integer that is equal to 1
		int isPrime = 1;

		Scanner scan = new Scanner(System.in);
// print Enter any number
		System.out.print("Enter any number :- ");
// declared anyNum as a integer
		int anyNum = scan.nextInt();

		if (anyNum == 0 || anyNum == 1) {
			System.out.println(anyNum + " is not prime number");
		} else {// else start 
			for (int i = 2; i <= anyNum / 1; i++) {
				if (anyNum % i == 0) {// if anynum divided by i that is equal to zero
					isPrime = 0;// it is prime 
				}
			}
			if (isPrime == 1)

				System.out.print(anyNum + " is a Prime Number");
			else // otherwise that is not prime 
				System.out.print(anyNum + " is not a Prime Number");
		}
	}
}
