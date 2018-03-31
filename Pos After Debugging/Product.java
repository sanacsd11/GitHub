/**BCAS,CSD11, G.Sirisanath , JAVA , 30 Mar 2018 , 12:05:42.
 * 
 */

/**
 * @author sri
 *
 */
import java.util.Scanner;

public class Product{
	static Scanner scan=new Scanner(System.in);

	public static void mainOption(){
		System.out.println();
		System.out.print("How many product do you want to add?");
		int productAmount = scan.nextInt();
		addproduct(productAmount);
	}

	public static void addproduct(int amount){
		String[][] products= new String[amount][4];

		for (int i=0;i < amount ;i++){
			System.out.print("Product ID: ");
			products[i][0] = scan.next();

			System.out.print("Product Name: ");
			products[i][1] = scan.next();

			System.out.print("Product Quantity: ");
			products[i][2] = scan.next();

			System.out.print("Product Price: ");
			products[i][3] = scan.next();
			System.out.println();
			System.out.println("-------------------------");
			System.out.println();
		}

		
		System.out.println();
		System.out.println("  Product Summary  ");
		System.out.println("-------------------------");
		System.out.println();
		for (int j=0;j< amount;j++){
			System.out.println(products[j][0] + " | " + products[j][1] + " | " + products[j][2] + " | " + products[j][3]);
		}

		
		POSCashier cashier = new POSCashier();
        cashier.mainScreen();


	}
}