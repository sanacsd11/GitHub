package variables;

public class Dog {
	Dog(){
		
	}
	
	Dog(String name){
		System.out.println(name);
	}
	Dog(String name, String msg){
		System.out.println(name + "" + msg);
	}
	//Dog(String name, String place,int age ){
	//	System.out.println(name + age + place);
	////}

	public Dog(String name, int age, String place) {
		System.out.println(name + "is" + age+"from" + place);

	}

}
