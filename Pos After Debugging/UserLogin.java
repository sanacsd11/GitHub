/**BCAS,CSD11, G.Sirisanath , JAVA , 30 Mar 2018 , 12:05:42.
 * 
 */

/**
 * @author sri
 *
 */
import java.util.Scanner;

public class UserLogin{
	public static void askLogin(){
		Scanner scan=new Scanner(System.in);

		System.out.println();
		System.out.print("Username : ");
		String username = scan.nextLine();
		System.out.println();
		System.out.print("Password : ");
		String password = scan.nextLine();
		System.out.println();

		checkLogin(username,password);
	}

	public static void checkLogin(String username,String password){
		boolean isValid = validateLogin(username,password);

		if(isValid){
			POSCashier cashier = new POSCashier();
        	cashier.mainScreen();
		}
		else{
			askLogin();
		}
	}

	public static boolean validateLogin(String username,String password){
		if(username.equals("BCAS") && password.equals("Sri86")){
			System.out.print("Loading ");
			for(int x=0;x<25;x++){
				System.out.print(".");
			}
			System.out.println();
			System.out.print("login Success...");
			return true;
		}
		else{
			System.out.print("Loading ");
			for(int x=0;x<25;x++){
				System.out.print(".");
			}
			System.out.println();
			System.out.print("login Fail please try again...");
			return false;
		}
	}
}