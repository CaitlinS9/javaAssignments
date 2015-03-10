

/**Chapter 4 Homework
 * @author Caitlin Stewart
 *Calculates how many days it is from today until 
 *end of current year
 */

import java.util.*;


public class YearEnd {

	/**
	calculates days until end of any year, including leap
	 */
	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int month;
		int day;
		int year;
		int daysLeft;
		
		//get input (doesn't validate)
		System.out.println("Please enter the month in numerical format");
		month= input.nextInt();
		
		System.out.println("Please enter the day");
		day= input.nextInt();
		
		System.out.println("Please enter the 4 digit year");
		year= input.nextInt();
		
		//get day of year based on input
		GregorianCalendar todaysDate = new
				GregorianCalendar(year,(month-1),day);
		int dayOfYear= todaysDate.get(GregorianCalendar.DAY_OF_YEAR);
		
		//calculates day in year, including leap
		GregorianCalendar daysinYear = new
			GregorianCalendar(year,11,31);
			int yearDays = daysinYear.get(GregorianCalendar.DAY_OF_YEAR);
		
			//DEBUG System.out.println("test days in year " + yearDays);
			
			//calculate days left in year
			daysLeft=(yearDays-dayOfYear);
		
	//display days in year
		System.out.println("There are " + daysLeft + " days until the end of the current year.");
	}

}
