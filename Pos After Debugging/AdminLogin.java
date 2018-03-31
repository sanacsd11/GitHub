/**BCAS,CSD11, G.Sirisanath , JAVA , 30 Mar 2018 , 12:01:43.
 * 
 */

/**
 * @author sri
 *
 */
import java.util.Scanner;

public class AdminLogin{
		public static boolean askLogin(){
			Scanner scan=new Scanner(System.in);

			System.out.println();
			System.out.print("Admin Username : ");
			String username = scan.nextLine();
			System.out.println();
			System.out.print("Admin Password : ");
			String password = scan.nextLine();
			System.out.println();

			return validateLogin(username,password);
		}



		public static boolean validateLogin(String username,String password){
			if(username.equals("admin") && password.equals("admin")){
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