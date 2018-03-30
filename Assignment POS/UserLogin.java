import java.util.Scanner;

public class UserLogin{
	public static void askLogin(){
		Scanner scan=new Scanner(System.in);//Input Output

		System.out.println();
		System.out.print("Username : ");
		String username = scan.nextLine();//username
		System.out.println();
		System.out.print("Password : ");
		String password = scan.nextLine();//Password
		System.out.println();

		checkLogin(username,password);//Validate Login
	}

	public static void checkLogin(String username,String password){
		boolean isValid = validateLogin(username,password);

		if(isValid){//If validate success
			POSCashier cashier = new POSCashier();
        	cashier.mainScreen();//Main option
		}
		else{//If validate error
			askLogin();//return login
		}
	}

	public static boolean validateLogin(String username,String password){
		if(username.equals("admin") && password.equals("admin")){//Login validate
			System.out.print("Loading ");
			for(int x=0;x<25;x++){
				System.out.print(".");
			}
			System.out.println();
			System.out.print("login Success...");
			return true;
		}
		else{//Error
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