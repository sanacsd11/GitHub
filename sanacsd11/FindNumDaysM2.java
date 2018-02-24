class FindNumDaysM2{

public static void main(String args[]){
	int monthno = 5;
	
	switch(monthno){
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
		System.out.println("Days 31");
		break;
		
		case 2:System.out.println("Days 28");
		break;
		
		case 4:case 6:case 9:case 11:
		System.out.println("Days 30");
		break;
		
		default:System.out.println("This is not a days number");
	}
		}
			}