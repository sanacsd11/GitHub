package BCAS;
/**BCAS,CSD11, G.Sirisanath , JAVA , 8 Apr 2018 , 18:35:10.
 * 
 */
/**
 * @author sri
 *
 */
import java.util.*;

public class Product{
	static Scanner scan=new Scanner(System.in);//For input output
	// Creating generic string ArrayList
	static String[][] productsList= new String[5][5];//Products array
	static ArrayList<String> sales = new ArrayList<String>();

	public static void index(){
		User user = new User();
		boolean auth =  user.askLogin();
		checkAuth(auth);
	}

	public static void checkAuth(boolean result){
		if(result){
			productListData();
		}
		else{
			System.out.println("Cashier login failed?");
			index();
		}
	}



	public static void productListData(){
		System.out.println("Welcome to the BCAS POS");

		productsList[0][0] ="001";
		productsList[0][1] ="Anchor 400g";
		productsList[0][2] ="25";
		productsList[0][3] ="280.00";

		productsList[1][0] ="002";
		productsList[1][1] ="Tea Powder";
		productsList[1][2] ="100";
		productsList[1][3] ="80.00";

		productsList[2][0] ="003";
		productsList[2][1] ="Soya Meats";
		productsList[2][2] ="48";
		productsList[2][3] ="40.00";

		productsList[3][0] ="004";
		productsList[3][1] ="Chocco Biscuits 100g";
		productsList[3][2] ="112";
		productsList[3][3] ="40.00";

		productsList[4][0] ="005";
		productsList[4][1] ="Mixfruit Juice";
		productsList[4][2] ="49";
		productsList[4][3] ="70.00";
		System.out.println();
		System.out.println("ProID" + "\t" + "Product" + "\t\t" + "Qty" + "\t" + "Price");

		for (int i=0;i < productsList.length ;i++){//Looping for ask users need
			System.out.println( productsList[i][0] + "\t" + productsList[i][1] + "\t" + productsList[i][2] + "\t" + productsList[i][3]);
		}

		addproduct();
	}

	public static void addproduct(){
		System.out.println();
		System.out.print("Product ID: ");
		String id = scan.next();

		System.out.print("Qty: ");
		String qty = scan.next();

		calculatePrice(id,qty);

	}

	public static void calculatePrice(String id,String qty){
		int index=-1;
		for (int i=0;i < productsList.length ;i++){
			if(productsList[i][0].equalsIgnoreCase(id)){
				index = i;
				break;
			}
		}

		if(index != -1){
			System.out.println("Product: " + productsList[index][1]);
			double price = Double.parseDouble(qty) * Double.parseDouble(productsList[index][3]);
			System.out.println("Price  : " + price);

			sales.add(productsList[index][0]);//PRO ID
			sales.add(productsList[index][1]);//PRO NAME
			sales.add(qty);//PRO QTY
			sales.add(price + " ");//PRO PRICE

			//deduct qty from list
			double stock= Double.parseDouble(productsList[index][2]) - Double.parseDouble(qty);
			productsList[index][2] = stock + "";

			System.out.println("Do you want to add another product? (Y/N): ");
			String yn = scan.next();

			if(yn.equalsIgnoreCase("y")){
				addproduct();
			}
			else{
				summary();
			}
		}
		else{
			System.out.println("Invalid Entry....: ");
			productListData();
		}

	}

	public static void summary(){
		//print listing
		System.out.println();
		System.out.println("  Receipt  ");
		System.out.println("-------------------------");
		System.out.println();

		int loopIndex = sales.size()/4;
		double total = 0;

		for (int i=0; i<loopIndex; i+=4){
           System.out.print(sales.get(i) + "\t");
           System.out.print(sales.get(i+1) + "\t\t");
           System.out.print(sales.get(i+2) + "\t");
           System.out.print(sales.get(i+3) + "\t");

           total += Double.parseDouble(sales.get(i+3));
           System.out.println();
	   }

	   System.out.println("-------------------------");
	   System.out.println("Total : " + total);
	   System.out.println("Cash  : ");
	   double cash = scan.nextDouble();

	   System.out.println("Balance : " + (cash-total));
	   System.out.println("-------------------------");
	   System.out.println("-------------------------");
	}

	public static void SalesSummary(){
		System.out.println();
		System.out.println("  Stock After Sales  ");
		System.out.println("-------------------------");

		System.out.println("ProID" + "\t" + "Product" + "\t\t" + "Qty" + "\t" + "Price");

		for (int i=0;i < productsList.length ;i++){//Looping for ask users need
			System.out.println( productsList[i][0] + "\t" + productsList[i][1] + "\t" + productsList[i][2] + "\t" + productsList[i][3]);
		}

		System.out.println();
		System.out.println("  Sales Summary  ");
		System.out.println("-------------------------");

		for (int i=0; i<sales.size(); i++)
            System.out.print(sales.get(i)+" ");
	}
}