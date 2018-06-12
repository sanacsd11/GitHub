/**BCAS,CSD11, G.Sirisanath , JAVA , 17 Mar 201816:00:292018
 * 
 */
package BCAS.b;

/**
 * @author Garthi
 *
 */

import java.util.Date;
import java.util.Scanner;


public class BbaannKK {
	private static final String Today = null;
		

	//private static final String new Date(); = null;

	private double Balance;
	private double Interest = 7;
	Scanner scan = new Scanner(System.in);
	
	public BbaannKK(double initBalance) {
		Balance = initBalance;
	}

	public double getBalance() {
		return Balance;
	}

	public void withDraw(double amount) {
		Balance = Balance - amount;
	}

	public void deposit(double amount) {
		Balance = Balance + amount;
	}

	public void addInterst() {
		Balance = Balance + ((Interest / 100) * Balance) / 12;
	}

	public static void main(String[] args) {

		BbaannKK sri = new BbaannKK(1000);
		BbaannKK nix = new BbaannKK(1500);
		BbaannKK suv = new BbaannKK(2000);
		BbaannKK ban = new BbaannKK(2500);
		BbaannKK vin = new BbaannKK(3000);

		System.out.println(new Date());
		Date today = new Date();
		System.out.println("Todayis :-" +Today);
		System.out.println("**********************");
		System.out.println("Balance sri :- " + sri.getBalance());
		System.out.println("Balance nix :- " + nix.getBalance());
		System.out.println("Balance suv :- " + suv.getBalance());
		System.out.println("Balance ban :- " + ban.getBalance());
		System.out.println("Balance vin :- " + vin.getBalance());
		System.out.println("**********************");
		
		//sri.deposit(100);
		//System.out.println("balance Sri : "+Sri.getBalance());
		
		
	}
}