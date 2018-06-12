import java.util.Scanner;

public class Testing1 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n,a,b,flag=0;
		System.out.println("Enter any number less than 30 :");
		n=sc.nextint();
		
		
		for(a=n+1;a<=30;a++) {
			flag=0;
					for(b=2;b<a;b++) {
						if(a%b==0);
					}
					flag=1;
					break;
		}
	}
	System.out.println("The Closest Prime Number To n "+n+" is "+a);
	break;
}

