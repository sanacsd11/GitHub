/**BCAS,CSD11, G.Sirisanath , JAVA , 30 Mar 2018 , 12:05:42.
 * 
 */

/**
 * @author sri
 *
 */
import java.util.Scanner;

public class Sale {
	static Scanner scan = new Scanner(System.in);// Input output

	public static void displayProduct() {
		DataSet ds = new DataSet();// Call Default Products from DataSet class display method
		ds.displayProduct();
	}

	public static void makeSale() {
		System.out.print("Product ID: ");
		String id = scan.next();// Product Id

		System.out.print("Qty: ");
		int qty = scan.nextInt();// Product Qty

		System.out.print("Price: ");
		double price = scan.nextDouble();// Product Price

		System.out.print("Net Total: ");
		double total = Double.parseDouble(qty + "") * price;// Product Price
		System.out.print(total);
		System.out.println();

		System.out.print("Pay method(1 = cash | 2 = card) : ");
		String method = scan.next();// Pay method
		if (method.equalsIgnoreCase("1")) {
			System.out.print("Pay method : cash");
		} else if (method.equalsIgnoreCase("1")) {
			System.out.print("Pay method : Credit Card");
		} else {
			System.out.print("Invalid Paymethod");
			makeSale();
		}

		System.out.println();
		System.out.print("Pay Amount: ");
		double paid = scan.nextDouble();// Product Paid
		System.out.print(paid);

		System.out.println();
		System.out.print("Balance: ");
		double balance = paid - total;// Product Paid
		System.out.print(balance);

		System.out.println();
		System.out.println("-------------------------");
		System.out.println();

		System.out.println();
		System.out.println("Thank You For Shopping With Us === Call Again");
		System.out.println();
		
		addAnother();
	}

	public static void addAnother() {
		System.out.print("Do you want to add another sale?(y = yes | n = no)");
		String result = scan.next();// Add new

		if (result.equalsIgnoreCase("y")) {
			makeSale();
		} else {

			// Call Main function
			POSCashier cashier = new POSCashier();
			cashier.mainScreen();
		}

	}
}