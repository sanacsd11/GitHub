import java.util.Scanner;

public class Testing2 {
	public static void main(String [] args){
		
		boolean prime=true;
		
		System.out.print("Enter number to check prime or not");
		Scanner sc=new  Scanner(System.in);
		Integer num=sc.nextInt();
		
		for(int i=2;i<num;i++){
			
			if(num%i==0) {
			    prime=false;
			}
		}
		
		if(prime==true){
			System.out.println("Given Number is a prime number");			
		}else {
			System.out.println("Given number is not a prime number");
		}
	}
}		


