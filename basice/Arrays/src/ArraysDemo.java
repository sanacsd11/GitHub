
public class ArraysDemo {
	public static void main(String[] args) {
		
			ArrayOperations ao = new ArrayOperations();
			
			int[] marks = {20, 30, 4, 23, 2, 24, 20, 40};
			
			System.out.println("Minium :" + ao.findMinimum(marks));
			System.out.println("Maximum :" + ao.findMaximum(marks));
			System.out.println("Summation :" + ao.findSummation(marks));
			System.out.println("Different :" +  ao.findDifferent(marks));
			
			ArrayOperations ao2 = new ArrayOperations(marks);
	}

}
