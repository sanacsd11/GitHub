package BCAS;
/**BCAS,CSD11, G.Sirisanath , JAVA , 8 Apr 2018 , 18:30:20.
 * 
 */
/**
 * @author sri
 *
 */
// Java program to demonstrate working of ArrayList in Java
import java.io.*;
import java.util.*;

public class User{
	static Scanner scan=new Scanner(System.in);//Input Output
	// Creating generic integer ArrayList
	static ArrayList<String> userList = new ArrayList<String>();

	public static void addUser(){
		System.out.println();
		System.out.print("How many users do you want to add?");
		int count = scan.nextInt();//Ask loop count
		System.out.println();

		for (int i=0;i < count ;i++){
			System.out.print("User ID: ");
			userList.add(scan.next());//user ID

			System.out.print("Password: ");
			userList.add(scan.next());//user Name

			System.out.println();
			System.out.println("-------------------------");
			System.out.println();

		}

		printUser();
	}

	public static void printUser(){
		//print listing
		System.out.println();
		System.out.println("  User List  ");
		System.out.println("-------------------------");
		System.out.println();
		for (int i=0; i<userList.size(); i++)
            System.out.print(userList.get(i)+" ");

	}


	public static boolean askLogin(){
		System.out.println();
		System.out.print("Cashier Username : ");
		String username = scan.next();//Get and set username
		System.out.println();
		System.out.print("Cashier Password : ");
		String password = scan.next();
		System.out.println();//Get and set Password

		boolean x= validateLogin(username,password);//validate user login to call method and return it

		return x;
	}



	public static boolean validateLogin(String username,String password){
		boolean isValid = false;

		for (int i=0; i<userList.size(); i+=2){
			if(userList.get(i).equals(username) && userList.get(i+1).equals(password)){
				isValid = true;
				break;
			}
		}

		return isValid;
	}

	public static void removeUser(){
		int index = -1;
		printUser();
		System.out.println();
		System.out.print("Enter userid to Remove : ");
		String id = scan.next();//Get and set username

		for (int i=0; i<userList.size(); i+=2){
			if(userList.get(i).equals(id)){
				index = i;
				break;
			}
		}

		if(index != -1){
			userList.remove(index);
			System.out.println("User Removed!");
			mainScreen src=new mainScreen();
			src.adminPanel();
		}
		else{
			System.out.println("Invalid Selection");
			mainScreen src=new mainScreen();
			src.adminPanel();
		}
	}


}