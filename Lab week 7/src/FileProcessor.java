

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor
{

	
	String fileName;
	
	public FileProcessor (String fileName)
	{
		
		this.fileName = fileName;
		
	}
	
	public List<String> readFile()
	{		
		List <String> jobsList = new ArrayList<String>();
		try
		{
		    
			File fileExample = new File(fileName);
			Scanner myScanner = new Scanner(fileExample);
			  
			while (myScanner.hasNextLine())
			{
			    
				String line = myScanner.nextLine();
				System.out.println(line);
				jobsList.add(line);
			}

			myScanner.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		return jobsList;		  	  
	}

	 void openFile() {
		
		
	}
}   


	

