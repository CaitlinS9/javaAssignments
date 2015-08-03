import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/*
 * @author Caitlin Stewart
 * Chapter 14
 * Program 12
 * 
 */


public class JPopulation extends JFrame implements ActionListener
{
      public JPopulation()
      {
	  setSize(200,125);
	  setTitle("JPopulation");
	  setLayout(new FlowLayout());	  

	  
	  
	  
	  choices = new JComboBox(new String[]{"Oklahoma City", "Tulsa", "Broken Arrow", "Norman", 
				"Lawton", "Edmond", "Moore"});
	  pop = new JLabel("Please make a selection");

	  add(choices);
	  add(pop);	  	  
	  
	  //
	  choices.addActionListener(this);
	  setVisible(true);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }

      public static void main (String [] args)
      {
	  new JPopulation();
      }
    
      public void actionPerformed(ActionEvent e)
      {
    	  int[] population = {599476, 391906, 112000, 110925, 96867, 81405, 55081};
    	  int positionOfSelection = choices.getSelectedIndex();
	  pop.setText("The population is: "+population [positionOfSelection]); 
	  
      }

      public JLabel pop;
      public JComboBox choices ;
<<<<<<< HEAD
}
=======
}
>>>>>>> origin/master
