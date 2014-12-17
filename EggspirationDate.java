import java.util.Scanner;
import java.util.Calendar;


public class EggspirationDate {
	
	public static int checkExp(int expDate){
		
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_YEAR); 
		return expDate - day;
		
	}
	
	public static void main(String[] args){
	
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter number on egg carton (must be between 0 and 366): "); 
	    int	date = scanner.nextInt();
		int daysRemaining = checkExp(date);
		System.out.println("Your eggs will expire " + daysRemaining + " days from now.");
		scanner.close();
	}
	
}
