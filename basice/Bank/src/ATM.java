import java.text.NumberFormat;
import java.util.Scanner;

/**BCAS,CSD11, G.Sirisanath , JAVA , 26 Mar 2018 , 11:21:39.
 * 
 */

/**
 * @author Garthi
 *
 */
public class ATM {
	public static void main(String[]args) {
		Account checking = new Account();
		checking.setType("checking");
		checking.setBalance(0.00);
		checking.setRate(10.00);
		
		Account savings = new Account();
		savings.setType("savings");
		savings.setBalance(0.00);
		savings.setRate(10.00);
		
		NumberFormat formatter = Number.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		
		boolean session = true;
		
		while (session) {
			
			System.out.print("==========================\n" +" ATM Menu: \n \n + "1. Deposit Money \n " + " 2.Withdraw Money \n" + "3. Transfer Funds \n" + "4. Check Account Balance\n" + "5. End Session\n" + "=======================\n" + "\nEnter selection:");
			
				
				int selection = scan.nextInt();
			
			switch (selection) {
			
			case 1 :
				System.out.println("Enter (1) for Savinges or for Checking : ");
				int depAccount = scan.nextInt();
				
				if (depAccount==1) {
					
					System.out.println("\nYour current Saving balance is :" + formatter.format(saving.getBalance()) + "\n");
					
					System.out.println("How much money would you like to deposit?");
					double deposit = scan.nextDouble();
					
					saving.deposit(deposit);
					
					System.out.println("\nYour Saving balance is now :" + formater.format(saving.getBalance()) + "\n");
					
					}
				else if (depAccount == 2) {
					System.out.println("\nYour current Checking balance is :" + formatter.format(saving.getBalance()) + "\n");
					
					System.out.println("How much money would you like to deposit?");
					double deposit = scan.nextDouble();
					
					checking.deposit(deposit);
					
					System.out.println("\nChecking balance is now :" + formater.format(checking.getBalance()) + "\n");
					
				}
				
				break;
				
			case 2:
				
				System.out.println("\nYour Saving balance is now : " + formater.format(savings.getBalance()) + "\n");
				
				System.out.println("How much money would you like to withdraw?");
				
				double withdraw = scan.nextDouble();
				
				savings.withdraw(withdraw);
				
				System.out.println("\nYour Saving balance is now ; " + formater.format(saving.getBalance()) +"\n");
			}
			
			else if (witAccount == 2) {
				
				System.out.println("\nYourcurrent Checking balance is: " + formater.format(checking.getBalance()) + "\n");
				
				System.out.println("How much money would you like to withdraw?");
				
				double withdraw = scan.nextDouble();
				
				checking.withdraw(withdraw);
				
				

			}
		}
	}
}
