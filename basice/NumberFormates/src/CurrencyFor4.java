import java.math.BigDecimal;

public class CurrencyFor4 {
	public static void main(String[] args) {
		double decimal = 9.12345;
		System.out.println("Test decimal Number:"+ decimal);
			int decimalPlaces = 3;
			BigDecimal bd= new BigDecimal(decimal);
			bd =bd.setScale(decimalPlaces, BigDecimal.ROUND_HALF_EVEN);
			double bigDecimal = bd.doubleValue();
			System.out.println("BigDecimal rounded in 4th decimal:" + bigDecimal);
	}
}
