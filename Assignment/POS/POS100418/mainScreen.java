package BCAS;
/**BCAS,CSD11, G.Sirisanath , JAVA , 8 Apr 2018 , 18:38:42.
 * 
 */
/**
 * @author sri
 *
 */
import java.util.Scanner;

public class mainScreen{
	static Scanner scan=new Scanner(System.in);
	//static AdminLogin admin= new AdminLogin();

	public static void adminPanel(){
		//Default options
		System.out.println();
		System.out.println();
		System.out.println("Login Success... Welcome to BCAS Admin");
		System.out.println();
		System.out.println();
		System.out.println("1. Add User  ");
		System.out.println("2. Add Product 	    ");
		System.out.println("3. Daily Summary    ");
		System.out.println("4. Remove User  ");
		System.out.println("5. Logout  ");
		System.out.println();

		System.out.print("Select an option?");
		int select = scan.nextInt();//Get selected option as int in select variable

		option(select);//call option method
	}

	public static void option(int id){
		User user =new User();
		Product product =new Product();

		switch(id){
			case 1://If 1 Call User
				user.addUser();
				adminPanel();
				break;

			case 2://If 2 Call Product
				product.index();
				adminPanel();
				break;

			case 3://If 2 Call Product
				product.SalesSummary();
				adminPanel();
				break;

			case 4://If 1 Call User
				user.removeUser();
				adminPanel();
				break;

			case 5://If 1 Call User
				System.exit(0);
				break;

			default:
				System.out.println("");
				System.out.println("Invalid Selection");
				System.out.println("=====================");
				adminPanel();

		}
	}
}