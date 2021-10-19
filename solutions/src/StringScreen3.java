
	/**************************************************************
	 * 
	 * 
	 *  Lab week 9: GUI more programming,  using string arraylists
	 * 
	 * 
	 ****************************************************************/
package com.week1.oo;
	
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

	public class StringScreen3  extends JFrame implements ActionListener
	{

		  // Declare GUI components as attributes of the screen
		  private JButton saveButton; 
		  private JButton showButton; 
		  private JButton clearButton; 
		  private JTextField firstName; 	  
		  private JTextField surName; 	  
		  private JTextField city; 
		  private JTextArea output;
		  
		  // This is the array list that will store any "person"s added via the GUI
		  private ArrayList<Person> people = new ArrayList();
	 
		  // Constructor
	  
		  public StringScreen3 (String title)
		  {
			   super(title);
			   setLayout(new FlowLayout());
			   firstName 	= new JTextField("first name   ");
			   surName 		= new JTextField("surname  ");
			   city			= new JTextField("city  ");
			   
			   
			   saveButton 	= new JButton("Save");
			   showButton 	= new JButton("Show all");
			   clearButton 	= new JButton("Delete all");
			   
			   
			   add(firstName);
			   add(surName);
			   add(city);

			   add(saveButton);
			   add(showButton);
			   add(clearButton);

			   saveButton. addActionListener(this);
			   showButton. addActionListener(this);
			   clearButton.addActionListener(this);

				output = new JTextArea ("data will go here");
				add(output);

			   
			   setLocation(300,300);
			   setSize(500,500);
			   setVisible(true);
			   		   
		  }


		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			Person p1; 
			
			if (arg0.getSource() == saveButton)
			{
				
				// create a person object out of the data entered in the text fields	
				p1 = new Person(firstName.getText(), surName.getText(), city.getText());

				// add the new person object to the array
				people.add(p1);
							
				JOptionPane.showMessageDialog(this, "just added " + p1.toString());
			
			}
			else 
				
			if (arg0.getSource() == showButton) 
			{
				
				// button 2- print out all the array contents
				
			
			    displayContents();
				String fullOutput = "People on the list are: " + "\r\n";
				

				// loop around the people Arraylist printing the contents. 	
				for (Person element:  people)
				{	
						fullOutput = fullOutput.concat(element.toString() + 
								"\r\n");
				        System.out.println(fullOutput);
				}        
				output.setText(fullOutput);			    
			}
			
			else
			{
				// must be the last button - to clear the contents
				people.clear();
				System.out.println("Did the clear");

				
			}
	
			
				
		 
		}  // end ActionPerformed


		private void displayContents() {

		}
		
		  
} // end class



