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
		int select = scan.nextInt();

		option(select);
	}

	public static void option(int id){
		switch(id){
			case 1:
				Product product =new Product();
				product.mainOption();
				break;
			case 2:
				Sale sale =new Sale();
				sale.displayProduct();

				sale.makeSale();
				break;
			case 3:
				if(admin.askLogin()){
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
			case 4:
				if(admin.askLogin()){
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
			case 5:
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