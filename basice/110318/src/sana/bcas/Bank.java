package sana.bcas;


import java.util.Date;
import java.util.Scanner;


public class Bank {
	private static final String Today = null;
		

	//private static final String new Date(); = null;

	private double Balance;
	private double Interest = 7;
	Scanner scan = new Scanner(System.in);
	
	public Bank(double initBalance) {
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

		Bank sri = new Bank(1000);
		Bank nix = new Bank(1500);
		Bank suv = new Bank(2000);
		Bank ban = new Bank(2500);
		Bank vin = new Bank(3000);

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
		
		sri.deposit(100);
		System.out.println("balance Sri : "+Sri.getBalance());
		
		
	}
}