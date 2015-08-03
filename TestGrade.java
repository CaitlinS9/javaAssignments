import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Caitlin Stewart
 * Chapter 12
 * Program 10
 */
public class TestGrade {



	public static void main(String[] args) throws Exception
	{
		public int[] studentID= {12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
		public String[] studentGrade= {"0","0", "0","0", "0", "0", "0", "0", "0", "0"};
		String[] validGrades={"A", "B", "C", "D", "F", "I"};
		String inString,outString = ""; 
		boolean isValid;

		String error = new String();

		Scanner input=new Scanner(System.in);
		// TODO Auto-generated method stub
		for (int i=0; i < studentID.length;  i++ )
		{
			System.out.println("Enter grade for " + studentID[i]);
			studentGrade[i]=input.next();
		
			
			try
			{
				linearSearch(validGrades);
					
				if (isValid=false)
				{
					
					error= studentGrade[i] + " is invalid.";
					throw (new GradeException(error));
				}
				
				
				
				/*if (!(Arrays.asList(validGrades).contains(studentGrade[i])))
				{
					error= studentGrade[i]+ " is invalid.";
					throw (new GradeException(error));
				}*/
				
			}
			catch (GradeException something)
			{
				JOptionPane.showMessageDialog(null, something.getMessage());
				studentGrade[i] = "I";
			}
			
			
		}
		
		for (private static void linearSearch(String[] validGrades, String studentGrade[i]) 
			 
			{
			for (int x=0; x<validGrades.length; x++)
			{
				if (studentGrade[i]==validGrades[x])
					{
						 isValid=true;
						return 1;
					}
				 isValid=false;
				return -1;
			}
			}
		
	}

		for (int y=0; y<studentID.length; y++)
		{
			System.out.println("Student " + studentID[y]+ " has grade " + studentGrade[y]+ "\n");
			
		}
		
		
	}

	

}