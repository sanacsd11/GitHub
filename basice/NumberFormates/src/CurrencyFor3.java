import java.math.BigDecimal;

public class CurrencyFor3 {
	public static void main(String[]args) {
		double decimal = 754.564;
		System.out.println("The test number :- "+decimal);
		int decimalPlace = 3;
		BigDecimal bd = new BigDecimal(decimal);
		bd=bd.setScale(decimalPlace,BigDecimal.ROUND_HALF_EVEN);
		double bigDecimal = bd.doubleValue();
		System.out.println("BigDecimal rounded in 3rd decimal:" + bigDecimal);
		
	}

}
