package BCAS;
/**BCAS,CSD11, G.Sirisanath , JAVA , 8 Apr 2018 , 18:19:15.
 * 
 */
/**
 * @author sri
 *
 */
import java.util.Scanner;// Import package for Input output

public class admin{
	    static Scanner scan=new Scanner(System.in);//Define scanner
		public static void main(String args[]){


			System.out.println("Welcome to BCAS");
			System.out.println("---------------");

			System.out.println("Press A to Admin Login");
			System.out.println("Press U to User Login");
			String option = scan.nextLine();//Get and set username

			if(option.equalsIgnoreCase("a")){
				askLogin();
			}
			else if(option.equalsIgnoreCase("u")){
				System.out.println("No user found...");
			}
			else{
				System.out.println("Invalid Entry....");
			}

		}

		public static void askLogin(){


			System.out.println();
			System.out.print("Admin Username : ");
			String username = scan.nextLine();//Get and set username
			System.out.println();
			System.out.print("Admin Password : ");
			String password = scan.nextLine();
			System.out.println();//Get and set Password

			validateLogin(username,password);//validate user login to call method and return it
		}



		public static void validateLogin(String username,String password){
			if(username.equals("BCAS") && password.equals("01")){// Check username and password
				mainScreen s= new mainScreen();
				s.adminPanel();
			}
			else{//If not
				System.out.print("login Fail please try again...");
				askLogin();
			}
	}
}