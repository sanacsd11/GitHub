import java.util.Scanner;

/**BCAS,CSD11, G.Sirisanath , JAVA , 12 Mar 2018
 * 
 */

/**
 * @author Sri
 *
 */
public class SanaHate {
	public static void main(String[] args) {

		int isPrime = 1;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number :- ");

		int anyNum = scan.nextInt();

		if (anyNum == 0 || anyNum == 1) {
			System.out.println(anyNum + " is not prime number");
		} else {
			for (int i = 2; i <= anyNum / 2; i++) {
				if (anyNum % i == 0) {
					isPrime = 0;
				}
			}
			if (isPrime == 1)

				System.out.print(anyNum + " is a Prime Number");
			else
				System.out.print(anyNum + " is not a Prime Number");
		}
	}
}
