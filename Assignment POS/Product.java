import java.util.Scanner;

public class Product{
	static Scanner scan=new Scanner(System.in);//For input output

	public static void mainOption(){
		System.out.println();
		System.out.print("How many product do you want to add?");
		int productAmount = scan.nextInt();//get product count
		addproduct(productAmount);//call addproduct method
	}

	public static void addproduct(int amount){
		String[][] products= new String[amount][4];//Products array

		for (int i=0;i < amount ;i++){//Looping for ask users need
			System.out.print("Product ID: ");
			products[i][0] = scan.nextLine();

			System.out.print("Product Name: ");
			products[i][1] = scan.nextLine();

			System.out.print("Product Quantity: ");
			products[i][2] = scan.nextLine();

			System.out.print("Product Price: ");
			products[i][3] = scan.nextLine();
			System.out.println();
			System.out.println("-------------------------");
			System.out.println();
		}

		//Print Summary
		System.out.println();
		System.out.println("  Product Summary  ");
		System.out.println("-------------------------");
		System.out.println();
		for (int j=0;j< amount;j++){
			System.out.println(products[j][0] + " | " + products[j][1] + " | " + products[j][2] + " | " + products[j][3]);
		}

		//Call main screen
		POSCashier cashier = new POSCashier();
        cashier.mainScreen();


	}
}