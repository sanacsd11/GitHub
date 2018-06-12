import java.text.DecimalFormat;

public class CurrencyFor {
	public static void main(String[]args) {
		double decimal = 1.564;
		System.out.println("The test number :- "+decimal);
		
		DecimalFormat currformat = new DecimalFormat("'Rs. '00.0##");
		String number = currformat.format(decimal);
		System.out.println(number);
		
	}

}
