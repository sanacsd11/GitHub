/**BCAS,CSD11, G.Sirisanath , JAVA , 30 Mar 2018 , 12:05:15.
 * 
 */

/**
 * @author sri
 *
 */
import java.util.Scanner;

public class User{
	static Scanner scan=new Scanner(System.in);

	public static void mainOption(){
		System.out.println();
		System.out.println("1. Add User");
		System.out.println("2. Remove User");


		System.out.print("Select an option?");
		String option = scan.next();
		if(option.equalsIgnoreCase("1")){
			addUser();
		}
		else if(option.equalsIgnoreCase("2")){
			removeUser();
		}
		else{
			System.out.print("Invalid Selection");
			mainOption();
		}
	}

	public static void addUser(){
		System.out.println();
		System.out.print("How many users do you want to add?");
		int count = scan.nextInt();

		String[][] users= new String[count][4];

		for (int i=0;i < count ;i++){
			System.out.print("User ID: ");
			users[i][0] = scan.next();

			System.out.print("User Name: ");
			users[i][1] = scan.next();

			System.out.println();
			System.out.println("-------------------------");
			System.out.println();
		}

		System.out.println();
		System.out.println("  User List  ");
		System.out.println("-------------------------");
		System.out.println();
		for (int j=0;j< count;j++){
			System.out.println(users[j][0] + " | " + users[j][1]);
		}

	
		POSCashier cashier = new POSCashier();
        cashier.mainScreen();

	}

	public static void removeUser(){
		String[][] users= new String[3][2];

		
		users[0][0] = "001";
		users[0][1] = "John Doe";

		
		users[1][0] = "002";
		users[1][1] = "Peter Stroke";

		
		users[2][0] = "003";
		users[2][1] = "James Roy";

		System.out.println();
		
		for (int j=0;j< users.length;j++){
			System.out.println(users[j][0] + " | " + users[j][1]);
		}

		System.out.println();
		System.out.print("Enter User ID for remove?");
		String userId = scan.next();

		
		for (int j=0;j< users.length;j++){
			if(users[j][0].equalsIgnoreCase(userId)){
				users[j][0] = "removed";
				users[j][1] = "removed";
			}
		}

		System.out.println();
		
		for (int j=0;j< users.length;j++){
			System.out.println(users[j][0] + " | " + users[j][1]);
		}

		
		POSCashier cashier = new POSCashier();
        cashier.mainScreen();
	}
}