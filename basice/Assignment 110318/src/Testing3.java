import java.util.Scanner;
class Testing3{
	public static void main(String s[]){
		Scanner read = new Scanner(System.in);
		int x;
		System.out.println("Enter the number to find the next prime to it =");
		x=read.nextInt();
		System.out.println("The next primenumber to "+x+"is="+find_prime(x));
		
		public static int(int num){
			while(true) {
				boolean isprime=true;
				num=num+1;
				int sqt = (int)Math.sqrt(num);
				for(int i=2;i<=sqt;i++) {
					if (num%i==0) {
						isprime=false;
						break;
						
					}
				}
				if(isprime)
					return num;
			}
		}		
	}
}