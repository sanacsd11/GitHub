class Grade{

public static void main(String args[]){

		int marks =34;
	
	if(marks>=75){
		System.out.println("garde A");
	}else if (75 > marks && marks >=65){
		System.out.println("garde B");
	}else if (65 > marks && marks >=55){
		System.out.println("garde C");
	}else if (55 > marks && marks>=35){
		System.out.println("garde D");
	}else{
		System.out.println("garde F");
	}
	}
}