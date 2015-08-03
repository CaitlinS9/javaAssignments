import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

/**
 * 
 */

/**
 * @author Caitlin Stewart
 * Program 15
 * Chapter 17
 *
 */
public class JDateAndTime extends JApplet implements ActionListener {

JButton button = new JButton("Submit");
JTextField text = new JTextField("Today is ");
JTextField date = new JTextField(25);
String dateString;

	public void init()
	{
		setSize (300,100);
		Container con = getContentPane();
		con.setLayout (new FlowLayout());
		con.add(button);
		con.add(text);
		
		button.addActionListener(this);
		
		

	}

	public void actionPerformed (ActionEvent e)
	{
		add (date);
		remove(button);
		remove (text);
		
		GregorianCalendar today = new GregorianCalendar();
		int month = today.get(GregorianCalendar.MONTH)+1;
		int day = today.get(GregorianCalendar.DAY_OF_MONTH);
		int year = today.get(GregorianCalendar.YEAR);
		int hour = today.get(GregorianCalendar.HOUR_OF_DAY);
		int minute = today.get(GregorianCalendar.MINUTE);
		
		dateString  = ( month + "/" + day + "/"+ year + " "+ hour + ":" + minute);
		
		date.setText("Today's date is: "+ dateString);
		validate();
		
	}

	
}
