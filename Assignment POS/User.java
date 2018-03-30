import java.util.Scanner;

public class User{
	static Scanner scan=new Scanner(System.in);//Input Output

	public static void mainOption(){
		System.out.println();
		System.out.print("How many users do you want to add?");
		int count = scan.nextInt();//Ask loop count
		addUser(count);//Call Add User
	}

	public static void addUser(int amount){
		String[][] users= new String[amount][4];//user Adding Stoerage

		for (int i=0;i < amount ;i++){
			System.out.print("User ID: ");
			users[i][0] = scan.nextLine();//user ID

			System.out.print("User Name: ");
			users[i][1] = scan.nextLine();//user Name

			System.out.println();
			System.out.println("-------------------------");
			System.out.println();
		}

		//print listing
		System.out.println();
		System.out.println("  User List  ");
		System.out.println("-------------------------");
		System.out.println();
		for (int j=0;j< amount;j++){
			System.out.println(users[j][0] + " | " + users[j][1]);
		}

		//Call Main function
		POSCashier cashier = new POSCashier();
        cashier.mainScreen();

	}
}