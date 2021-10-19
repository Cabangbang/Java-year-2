import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI implements ActionListener, MouseListener{
	JFrame frame;
	JPanel panel1, panel2;
	JButton button1, button2;
	JLabel label;
	JTextField tf;
	
	public GUI() {
		frame = new JFrame();
		panel1 = new JPanel(new FlowLayout());
		panel2 = new JPanel(new FlowLayout());
		button1 = new JButton("Button1");
		button2 = new JButton("Button2");
		label = new JLabel("Panel Text");
		tf = new JTextField("Name");
		
		tf.setToolTipText("Enter your name here");
		button1.setToolTipText("This is the first button, and show a message when clicked");
		button2.setToolTipText("This is the second button, and show a message when clicked");
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel2.setBackground(Color.red);
		
		
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(tf);
		panel2.add(label);
		panel2.addMouseListener((MouseListener) this);
	
		frame.add(panel1);
		frame.add(panel2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI");
		frame.setSize(300,300);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new GUI();
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1)
		{
			JOptionPane.showMessageDialog(button1, "Button1 was clicked");
			System.out.println("Button 1 was clicked");
		}
		else
		{
			JOptionPane.showMessageDialog(button1,"You entered " + tf.getText());
			String value = tf.getText();
			System.out.println(value);
		}
	}
	public void mouseClicked(MouseEvent e)
	{

	System.out.println("Panel was clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Panel was released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Panel was entered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Panel was exited");
		
	}

}
