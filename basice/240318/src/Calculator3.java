import java.util.Scanner;


public class Calculator3 {


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Simple Calculator");

        System.out.println("\nHere are your options:");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");

        System.out.print("\nWhat would you like to do?: ");
        int choice = kb.nextInt();
        System.out.println();


        if (choice == 1){
            addition();
        }
        else if (choice == 2){
            subtraction();
        }
        else if (choice == 3){
            division();
        }
        else if (choice == 4){
            multiplication();
        }

        System.out.println();
    }

	/**
	 * 
	 */
	private static void multiplication() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	private static void division() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	private static void subtraction() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	private static void addition() {
		// TODO Auto-generated method stub
		
	}
}