import java.util.Scanner;

/**
 * 
 */

/**
 * @author Caitlin Stewart
 * Chapter 7 Project 1
 * Count Spaces
 *
 */
public class CountSpaces {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// calculate number of spaces in set string
		
		String quote= "The person who says something is impossible should not interrupt the person who is doing it.";
		int spaceCount=0;
		Scanner input=new Scanner(System.in);
	
		
		for (int i=0; i<quote.length();i++)
		{
			if(Character.isWhitespace(quote.charAt(i))) spaceCount++;
		}
		System.out.println("The number of the spaces in the string is " + spaceCount);
	}

}
