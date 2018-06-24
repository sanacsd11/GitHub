package sana;

public class EncapulationDemo {

	public static void main(String[]args) {
		vehicle vehicle = new vehicle();
		
		vehicle.setVehicalNumber("NP3150");
		String vehicleNumber = vehicle.getVehicalNumber();
		
		vehicle.setColour("White");
		String colour = vehicle.getcolour();
		
		vehicle.setModel ("Audi");
		String model = vehicle.getmodel();
		
		vehicle.setCapacity ("3 L");
		String Capacity = vehicle.getcapacity();
		
		vehicle.setType("sports");
		String type = vehicle.getType();
		
		vehicle.setMaufactureYear(2018);
		int maufactureYear = vehicle.getMaufactureYear();
		
		vehicle.setChassiNumber(123456789);
		int chassiNumber = vehicle.getChassiNumber();
		
		vehicle.setPassengerCapacity(05);
		int passengerCapacity = vehicle.getPassengerCapacity();
		
		vehicle.setMilage(0000);
		int milage = vehicle.getMilage();
		
		vehicle.setFueltype("Petrol");
		String fueltype = vehicle.getFueltype();
		
		System.out.println("Vehicle Number is : " + vehicleNumber);
		System.out.println("Vehicle Colour is : " + colour );
		System.out.println("Vehicle model is : " + model );
		System.out.println("Vehicle capacity is : " + Capacity );
		System.out.println("Vehicle type is  : " + type );		
		System.out.println("Vehicle maufactureYear is  : " + maufactureYear );
		System.out.println("Vehicle ChassiNumber is  : " + chassiNumber );
		System.out.println("Vehicle PassengerCapacity is  : " + passengerCapacity );
		System.out.println("Vehicle PassengerCapacity is  : " + milage );
		System.out.println("Vehicle PassengerCapacity is  : " + fueltype );


		
		
	}
}
