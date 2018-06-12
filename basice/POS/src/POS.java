/**BCAS,CSD11, G.Sirisanath , JAVA , 30 Mar 2018 , 12:05:42.
 * 
 */

/**
 * @author sri
 *
 */
public class POS{
    public static void main(String args[]){
        screen();
//Display
        UserLogin uLog = new UserLogin();
        uLog.askLogin();
    }

   
    public static void screen(){
		System.out.println();
		System.out.println("             Welcome to BCAS CSD 11");
		System.out.println("===============================================");
	}
}