import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

import static java.nio.file.AccessMode.*;

/**
 * 
 */

/**
 * @author Caitlin Stewart
 * Chapter 13
 * Project 11
 *
 */
public class SameFolder {

	/**
	 Checks if two files are in the same folder.
	 */
	public static void main(String[] args) {
		int invalid=0;
		//String name;
		//String name2;
		//Scanner keyboard = new Scanner (System.in);
		
		
		Path fullPath1 = Paths.get("C:\\Users\\Caitlin\\Documents\\SpawnCoins.txt");
		try {
			fullPath1.getFileSystem().provider().checkAccess(fullPath1, READ);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Path is " + fullPath1.toString());
			System.out.println("File does not exist or permission error.");
			invalid=1;
		}
		
		int count = fullPath1.getNameCount();
		
		//fullPath1.getName(count - 2);
		
		
		Path fullPath2 = Paths.get("C:\\Users\\Caitlin\\Documents\\PickupCoin.txt");
		try {
			fullPath2.getFileSystem().provider().checkAccess(fullPath2, READ);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Path is " + fullPath2.toString());
			System.out.println("File does not exist or permission error.");
			invalid=1;
				}
		
		int count2 = fullPath2.getNameCount();
		
		//fullPath2.getName(count2 - 2);
		
		/*System.out.print("Enter the first file name: ");
		name = keyboard.nextLine();
		Path inputPath= Paths.get(name);
		Path fullPath1 = inputPath.toAbsolutePath();
		
		System.out.print("Enter the second file name: ");
		name2 = keyboard.nextLine();
		Path inputPath2= Paths.get(name2);
		Path fullPath2 = inputPath2.toAbsolutePath();
		
		System.out.println(fullPath1);
		System.out.println(fullPath2);
		*/
		
		
		/*check if two files are in the same folder, problematic
		  if two folders have same name in different directory*/
		
		switch (invalid)
		{
		case 1:
		System.out.println("Invalid path or permissions error.");
		break;
		
		case 0:
			 if ((fullPath1.getName(count - 2)).equals(fullPath2.getName(count2 - 2)))
					System.out.println ("The files are in the same folder.");
													
			else
				System.out.println("The files are in different folders.");	
		}
		
		
		
	}


}
