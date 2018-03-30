import java.util.Scanner;// Import package for Input output

public class AdminLogin{
		public static boolean askLogin(){
			Scanner scan=new Scanner(System.in);//Define scanner

			System.out.println();
			System.out.print("Admin Username : ");
			String username = scan.nextLine();//Get and set username
			System.out.println();
			System.out.print("Admin Password : ");
			String password = scan.nextLine();
			System.out.println();//Get and set Password

			return validateLogin(username,password);//validate user login to call method and return it
		}



		public static boolean validateLogin(String username,String password){
			if(username.equals("admin") && password.equals("admin")){// Check username and password
				System.out.print("Loading ");
				for(int x=0;x<25;x++){
					System.out.print(".");
				}
				System.out.println();
				System.out.print("login Success...");
				return true;
			}
			else{//If not
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