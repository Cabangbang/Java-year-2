import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lab6 implements ActionListener
{
	JFrame frame;
	JPanel panel1, panel2, panel3;
	JButton button1, button2;
	JLabel label;
	JTextField tf;
	int number = 0;
	int i;
	
	public Lab6()
	{
		frame = new JFrame();
		button1 = new JButton("Generate the random number");
		button2 = new JButton("Check your guess");
		panel1 = new JPanel(new FlowLayout());
		panel2 = new JPanel(new FlowLayout());
		panel3 = new JPanel(new FlowLayout());
		label = new JLabel("Then make a guess...");
		tf = new JTextField("Enter Your Guess");
		
		button1.setToolTipText("Click to generate a random number");
		button2.setToolTipText("Click to guess");
		tf.setToolTipText("Enter your guess here");
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		panel1.add(button1);
		panel2.add(label);
		panel2.add(tf);
		panel3.add(button2);
		
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI");
		frame.setSize(300,300);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Lab6();
		}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==button1)
		{
			JOptionPane.showMessageDialog(button1, "A random number has been generated");
			number = 1 +(int)(100*Math.random());
			i = 0;
		}
		else
		{
		
			i++;

			try {
				Integer.parseInt(tf.getText());
			} catch(NumberFormatException exception) {
				JOptionPane.showMessageDialog(button1, "Enter an Integer");
			}
			
			int guess = Integer.parseInt(tf.getText());
				
			if(number==guess)
			{
				JOptionPane.showMessageDialog(button1, "You are Correct");
				JOptionPane.showMessageDialog(button1, "Your guess of " + guess +" equals the random number "+ number + ". It took you " + i + " tries");
			}
			else if(number<guess)
			{
				JOptionPane.showMessageDialog(button1, "Your guess of "+ guess +" is too high. Guess again");
			}
			else if(number>guess)
			{
				JOptionPane.showMessageDialog(button1, "Your guess of "+ guess +" is too low. Guess again");
			}
			
			
		}
	}

}

