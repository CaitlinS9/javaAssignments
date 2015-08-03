import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



/**
 * @author Caitlin Stewart
 * Program 13
 * Chapter 15
 */
public class JMovingFrame extends JFrame implements ActionListener{

	private JButton submit = new JButton("Submit");
	private JButton unsubmit = new JButton("Unsubmit");
	private Container con = getContentPane();
	private FlowLayout layout = new FlowLayout();
	public JPanel panel1 = new JPanel();
	public JPanel panel2 = new JPanel();
	public JLabel label = new JLabel("JLabel");
	
	public JMovingFrame()
	{
		super("JMovingFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		con.setLayout(layout);
		con.add(panel1);
		con.add(panel2);
		panel1.add(submit);
		panel1.setBackground(Color.PINK);
		panel2.add(unsubmit);
		panel2.setBackground(Color.BLUE);
		submit.addActionListener(this);
		unsubmit.addActionListener(this);
		setSize(500,100);
		
		
	}
	
	public static void main(String[] args)
	{
		JMovingFrame frame= new JMovingFrame();
		frame.setVisible(true);

	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source= e.getSource();
		if (source== submit)
			panel1.add(label);
		else panel2.add(label);
		con.invalidate();
		con.validate();
	}

}
