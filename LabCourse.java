/**
 * 
 */

/**
 * @author Caitlin Stewart
 *
 */
public class LabCourse extends CollegeCourse  
{

	public LabCourse(String dept, int courseNum, int credits)
	{
		super(dept, courseNum, credits);
	}

	public void display()
	{
		fee+= 50;
		System.out.println ("The lab course "+ dept + courseNum + " is " + credits+ " credits with a cost of $"+ fee);
	}
}
