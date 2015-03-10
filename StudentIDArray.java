import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Caitlin Stewart
 * Chapter 8 Program
 *Get ID and display first name and GPA
 *Parallel Arrays
 */
public class StudentIDArray {

	public static void main(String[] args) {
		
		final int NUMBER_OF_ITEMS =10;
		int [] studentID = {1234, 1235, 1472, 1238, 4569, 7895, 7415, 8956, 5623, 7845};
		String [] firstName = {"Jon", "Caitlin", "Justin", "Lisa", "Wesley", "Daniel", "Chad", "Dan", "Tina", "Kelli" };
		double [] GPA = {3.2, 3.7, 2.8, 3.1, 4.0, 3.5, 2.2, 4.0, 3.4, 3.9 };
		int IDinput;
		String requestString;
		boolean validID= false;
		String name="none";
		double studentGPA=0.0;
		
		

		//request ID via dialog box	
		requestString=JOptionPane.showInputDialog(null, "What is the student ID?",
				"Student ID", JOptionPane.QUESTION_MESSAGE);
		
		IDinput= Integer.parseInt(requestString);
		
		

		//search array for input, use array position to determine other 
		//data from parallel arrays
		for (int x=0; x < NUMBER_OF_ITEMS && !validID; ++x)
		{
			if (IDinput == studentID[x])
			{
			validID=true;
			name = firstName[x];
			studentGPA= GPA[x];
			}
		}
		//display data
			if (validID)
				JOptionPane.showMessageDialog(null, "The name for the ID entered is " + name +
						" with GPA " + studentGPA );
			else
		//display error		
				JOptionPane.showMessageDialog(null, "Sorry, try again! " + IDinput +
						" is not valid.");	
	
	}

}
