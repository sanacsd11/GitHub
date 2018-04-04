/**BCAS,CSD11, G.Sirisanath , JAVA , 30 Mar 2018 , 12:05:42.
 * 
 */

/**
 * @author sri
 *
 */
import java.util.Scanner;

public class POSCashier{
	static Scanner scan=new Scanner(System.in);
	static AdminLogin admin= new AdminLogin();
	public static void mainScreen(){
		//Default options
		System.out.println();
		System.out.println();
		System.out.println("point of Sale Option");
		System.out.println();
		System.out.println();
		System.out.println("1. Add new Product  ");
		System.out.println("2. Make a Sale 	    ");
		System.out.println("3. Daily Summary    ");
		System.out.println("4. Add/Remove User  ");
		System.out.println("5. Logout  ");
		System.out.println();

		System.out.print("Select an option?");
		int select = scan.nextInt();//Get selected option as int in select variable

		option(select);//call option method
	}

	public static void option(int id){
		switch(id){
			case 1://If 1 Call Product
				Product product =new Product();
				product.mainOption();
				break;
			case 2://If 2 Call Sales
				Sale sale =new Sale();
				sale.displayProduct();

				sale.makeSale();
				break;
			case 3://If 3 Call Summary
				if(admin.askLogin()){//Check Admin privilleage
					Summary summary =new Summary();
					summary.displaySaleSummary();
					mainScreen();
				}
				else{
					System.out.println("");
					System.out.println("Unautheticated Access");
					System.out.println("=====================");
					mainScreen();
				}
				break;
			case 4://If 4 Call user
				if(admin.askLogin()){//Check Admin privilleage
					User user =new User();
					user.mainOption();
				}
				else{
					System.out.println("");
					System.out.println("Unautheticated Access");
					System.out.println("=====================");
					mainScreen();
				}
				break;
			case 5://If 5 Call Product
				System.out.println("");
				System.out.println("Logout Success..........");
				System.out.println("========================");

				UserLogin log =new UserLogin();
				log.askLogin();
				break;
			default:
				System.out.println("");
				System.out.println("Invalid Selection");
				System.out.println("=====================");
				mainScreen();
			}
	}
}