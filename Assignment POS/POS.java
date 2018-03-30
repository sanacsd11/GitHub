public class POS{//Main Class
    public static void main(String args[]){//Main method
        screen();//Calling Screen method

        UserLogin uLog = new UserLogin();//Create object to user login class
        uLog.askLogin();//call ask login method in user login class
    }

    // Welcome text
    public static void screen(){
		System.out.println();
		System.out.println("             Welcome to BCAS CSD 11");
		System.out.println("===============================================");
	}
}