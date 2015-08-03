/* Caitlin Stewart
 * Chapter 3
 * Salary Calculator
 */




import java.util.Scanner;


public class Salary {
	
	static double hourlyRate;
	static double regularHours;
	static double overtimeHours;
	
	public static void main(String [] args)
	{
	
		//get user data
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter your hourly rate: \n");
		hourlyRate= input.nextDouble();
		
		System.out.println("Please enter your regular hours: \n");
		regularHours=input.nextDouble();
		
		System.out.println("Please enter your overtime hours: \n");
		overtimeHours= input.nextDouble();
		
		//call OT to calculate/print calculated rates
		Salary.OT();
	}
	
	public static void OT ()
	{
		double weeklyRate;
		double OTRate;
		double totalPay;
		
		//calculate rates
		weeklyRate= regularHours*hourlyRate;
		OTRate= (hourlyRate*1.5) *overtimeHours;
		totalPay=weeklyRate+OTRate;
		
		//print rates
		System.out.println ("Your weekly pay is " + weeklyRate + 
			" and your overtime pay is " + OTRate +
			".\n Your total pay is " + totalPay	);
		
		
	}
	
	
}
