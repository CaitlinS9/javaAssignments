import java.util.Scanner;

/**
 * 
 */

/**Temperatures
 * Chapter 5 Homework
 * @author Caitlin Stewart
 * 
 *
 */
public class Temperatures {

	

	/**
	 * compares days high and low temperatures
	 * and gives applicable warnings
	 */
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int high;
		int low;
		
		
			System.out.println("Please enter today's high");
			high=input.nextInt();
			
			System.out.println("Please enter today's low");
			low=input.nextInt();	
		
		
		
		//Validate Data
		 if (high<low)
		 System.out.println("High cannot be less than low. Try again.");
		 
		//check temperatures with warnings
		if (high>= 90)
			System.out.println("Heat warning");
		
		if (low<32)
			System.out.println("Freeze warning");
		
		if ((high-low)>=40) 
			System.out.println("Large temperature swing");
	
		 System.out.println ("Thank you.");

	}

	private static void GetInput() {
		// TODO Auto-generated method stub
		
	}

}
