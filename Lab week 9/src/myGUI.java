import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class myGUI implements ActionListener, MouseListener{
	JFrame frame;
	JPanel panel;
	JButton button1, button2, button3;
	JTextField tf1, tf2, tf3;
	ArrayList<Person> people = new ArrayList<Person>();
	
	public myGUI() {
		frame = new JFrame();
		panel = new JPanel(new FlowLayout());
		button1 = new JButton("Save");
		button2 = new JButton("Show all");
		button3 = new JButton("Delete");
		tf1 = new JTextField("First Name");
		tf2 = new JTextField("Surname");
		tf3 = new JTextField("City");
		
		tf1.setToolTipText("Enter your first name here");
		tf1.setToolTipText("Enter your surname here");
		tf1.setToolTipText("Enter your city here");
		button1.setToolTipText("This is the first button, and show a message when clicked");
		button2.setToolTipText("This is the second button, and show a message when clicked");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		panel.add(tf1);
		panel.add(tf2);
		panel.add(tf3);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI");
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new myGUI();
	}
		
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1)
		{
			String userfname = tf1.getText();
			String usersname = tf2.getText();
			String usercity = tf3.getText();
			Person person = new Person(userfname, usersname, usercity);
			people.add(person);
			JOptionPane.showMessageDialog(button1, person.toString());
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
		else
		{
			for (int i = 0; i < people.size(); i++) 
			{
			      System.out.println(people.get(i));
			}
		}
		if(e.getSource()==button3)
		{
			JOptionPane.showMessageDialog(button3, "Deleted");
			people.removeAll(people);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
