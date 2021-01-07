package javaApplication;
import javax.swing.*;


public class Javaapp extends JFrame{
	Javaapp(){
		JPanel jpanel = new JPanel();
	
		
		//Name Input Field
		JLabel jlabelN =new JLabel("NAME: ");
		
		JTextField namefield = new JTextField(10);
		
		
		//Address Input Field
		JLabel jlabelA =new JLabel("ADDRESS: ");
		
		JTextField addressfield = new JTextField(10);
		
		//Radio button
		JLabel jlabelradio = new JLabel("Gender");
		JRadioButton rbtn = new JRadioButton("Male");
		JRadioButton rbtn1 = new JRadioButton("Female");
		ButtonGroup grp = new ButtonGroup();
		grp.add(rbtn);
		grp.add(rbtn1);
		
		//button
		JButton jbtn = new JButton("Show");
		
		
		add(jpanel);
		jpanel.add(jlabelN);
		jpanel.add(namefield);
		jpanel.add(jlabelA);
		jpanel.add(addressfield);
		jpanel.add(jlabelradio);
		jpanel.add(rbtn);
		jpanel.add(rbtn1);
		jpanel.add(jbtn);
		
		
		setTitle("JAVA Application");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
	   new Javaapp();

	}

}
