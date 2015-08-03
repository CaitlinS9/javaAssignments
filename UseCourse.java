/**
 * 
 */

/**
 * @author Caitlin Stewart
 *
 */
public class UseCourse extends CollegeCourse {

	/**
	 * 
	 */
	public UseCourse() {
		super (dept, courseNum, credits);
		
		CollegeCourse something;
		
		System.out.println("Please enter course department");
		dept= input.next();
				
		
		System.out.println("Please enter course number");
		courseNum=input.nextInt();
		
		System.out.println("Please enter number of credits");
		credits= input.nextInt();
		
		if (dept.equalsIgnoreCase("CIS")|| dept.equalsIgnoreCase("BIO")|| dept.equalsIgnoreCase("CHM") || dept.equalsIgnoreCase("PHY"))
		{
			something = new LabCourse (dept, courseNum, credits);
		}
		
		else
		{
			something = new CollegeCourse (dept, courseNum, credits);
		}
		
		something.display();
	
	}
public static void main (String[] args)
{
	new UseCourse();
}
}
