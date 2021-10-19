/* 
 * Title: My Search Engine
 * Description: A Search engine that will search for the user's inputed word in three different text files
 * Date: 19/04/2021
 * Author: C19464094 - Raphael Bien Cabangbang
 * 
 */

//Packages
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner; 

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WordSearchEngine implements ActionListener
{
	//GUI Elements
	JFrame frame;
	JPanel panel;
	JButton button;
	JTextField userText;
	JLabel searchLabel;
	JLabel result1, result2, result3;

	
	public WordSearchEngine(){
		//Create GUI frame
		frame = new JFrame("Search Engine");
		panel = new JPanel();
		frame.setSize(550,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		
		//Label
		searchLabel = new JLabel("Enter your Word here:");
		searchLabel.setBounds(10,20,250,25);
		panel.add(searchLabel);
		
		//Text field for the search engine
		userText = new JTextField(20);
		userText.setBounds(150,20,270,25);
		panel.add(userText);
		
		//Button to search
		button = new JButton("Search");
		button.setBounds(450,20,80,25);
		button.addActionListener(this);
		panel.add(button);
		
		//Labels that displays the results
		result1 = new JLabel("");
		result1.setBounds(10,60,300,25);
		panel.add(result1);
		
		result2 = new JLabel("");
		result2.setBounds(10,80,300,25);
		panel.add(result2);
		
		result3 = new JLabel("");
		result3.setBounds(10,100,300,25);
		panel.add(result3);
	
		//Displays the Frame
		frame.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		// ints that will be used to display how many times the word appears
		int file1 = 0;
		int file2 = 0;
		int file3 = 0;
		int counter = 0;
		
		//directory to the folder with the text files
		String directoryPath = "C:\\Users\\Raphael\\eclipse-workspace\\Assignemnt\\Textfiles\\";
		File directory = new File(directoryPath);
		Scanner scan = new Scanner(System.in);
		
		//Create a list of the text files in the directory
		File[] fileList = directory.listFiles();
		
		// turns the user's input into a string
		String userEntered = userText.getText();
		
		if(fileList.length > 0) 
		{
			for(int i = 0; i<fileList.length; i++) 
			{
				if(fileList[i].exists()) 
				{
					scan = null;
					try 
					{
						scan = new Scanner(new BufferedReader(new FileReader(directoryPath + fileList[i].getName())));
					}
					catch (Exception DirectoryNotFound)
					{
						result1.setText("Path does not exist");
					}
					
					// will run if the text file has more lines
					while(scan.hasNext()) 
					{
						String words = scan.next();
						
						// increases the counter if the entered word appears in the file
						if(words.equals(userEntered)) {
							counter++;
						} else {
							// displays that the word does not appear in any file
							result1.setText("The word does not appear in any file");
							result2.setText("");
							result3.setText("");
						}
					}
					
					// sets each file int to the counter and resets the counter
					if(i==0) {
						file1 = counter;
						counter = 0;
					} else if(i==1) {
						file2 = counter;
						counter = 0;
					} else {
						file3 = counter;
						counter= 0;
					}
					
					// displays the file with the most occurrence of the word
					if(file1>file2 && file1>file3) 
					{
						result1.setText("The word appears "+ file1 + " times in file 1");
						if(file2>file3)
						{
							result2.setText("The word appears "+ file2 + " times in file 2");
							result3.setText("The word appears "+ file3 + " times in file 3");
						} 
						
						else 
						{
							result2.setText("The word appears "+ file3 + " times in file 3");
							result3.setText("The word appears "+ file2 + " times in file 2");
						} 
					} 
					
					else if(file3>file1 && file3>file2) 
					{
						result1.setText("The word appears "+ file3 + " times in file 3");
						if(file1>file2) 
						{
							result2.setText("The word appears "+ file1 + " times in file 1");
							result3.setText("The word appears "+ file2 + " times in file 2");
						} 
						
						else
						{
							result2.setText("The word appears "+ file2 + " times in file 2");
							result3.setText("The word appears "+ file1 + " times in file 1");
						}
					}
						
					else if(file2>file1 && file2>file3)
					{
						result1.setText("The word appears "+ file2 + " times in file 2");
						if(file1>file3) 
						{
							result2.setText("The word appears "+ file1 + " times in file 1");
							result3.setText("The word appears "+ file3 + " times in file 3");
						} 
									
						else 
						{
							result2.setText("The word appears "+ file3 + " times in file 3");
							result3.setText("The word appears "+ file1 + " times in file 1");
						}
					}
				//closes the scan
				scan.close();
				}
			}
		}
	} 
}