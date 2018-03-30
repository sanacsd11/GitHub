public class DataSet{

	public static void displayProduct(){//Display Product Data
		String[][] products= new String[3][4];//create a array

		//Push row no 1
		products[0][0] = "001";
		products[0][1] = "Ice Cream";
		products[0][2] = "5";
		products[0][3] = "75.00";

		//Push row no 2
		products[1][0] = "002";
		products[1][1] = "Coffee Powder";
		products[1][2] = "15";
		products[1][3] = "25.00";

		//Push row no 3
		products[2][0] = "003";
		products[2][1] = "Anchor";
		products[2][2] = "7";
		products[2][3] = "250.00";

		//Print product list
		for (int j=0;j< products.length;j++){
			System.out.println(products[j][0] + " | " + products[j][1] + " | " + products[j][2] + " | " + products[j][3]);
		}
	}

	public static void displaySaleSummary(){//Display Sales Data
			String[][] sales= new String[3][4];//create a array

			//Push row no 1
			sales[0][0] = "001";
			sales[0][1] = "Ice Cream";
			sales[0][2] = "5";
			sales[0][3] = "75.00";

			//Push row no 2
			sales[1][0] = "002";
			sales[1][1] = "Coffee Powder";
			sales[1][2] = "15";
			sales[1][3] = "25.00";

			//Push row no 3
			sales[2][0] = "003";
			sales[2][1] = "Anchor";
			sales[2][2] = "7";
			sales[2][3] = "250.00";

			//Print sales list
			for (int j=0;j< sales.length;j++){
				System.out.println(sales[j][0] + " | " + sales[j][1] + " | " + sales[j][2] + " | " + sales[j][3]);
			}
	}


}