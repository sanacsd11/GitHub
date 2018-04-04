import java.util.Scanner;

public class Sale{
	static Scanner scan=new Scanner(System.in);//Input output

	public static void displayProduct(){
		DataSet ds = new DataSet();//Call Default Products from DataSet class display method
		ds.displayProduct();
	}

	public static void makeSale(){
		System.out.print("Product ID: ");
		String id = scan.nextLine();//Product Id

		System.out.print("Qty: ");
		int qty = scan.nextInt();//Product Qty

		System.out.print("Price: ");
		double price = scan.nextDouble();//Product Price

		System.out.print("Net Total: ");
		double total = Double.parseDouble(qty + "")*price;//Product Price
		System.out.print(total);

		System.out.println();
		System.out.println("-------------------------");
		System.out.println();

		addAnother();
	}

	public static void addAnother(){
		System.out.print("Do you want to add another sale?(y = yes | n = no)");
		String result = scan.nextLine();//Add new

		if(result == "y"){
			makeSale();
		}
		else{

		//Call Main function
		POSCashier cashier = new POSCashier();
        cashier.mainScreen();
		}

	}
}