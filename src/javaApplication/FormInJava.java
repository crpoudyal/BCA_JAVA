package javaApplication;
import java.awt.*;

import javax.swing.*;

public class FormInJava extends JFrame {
	
	FormInJava(){
		JPanel jpanel = new JPanel();
		add(jpanel);
		
		JLabel username =  new JLabel("Username");
		JTextField user = new JTextField(30);
		JLabel password = new JLabel("Password");
		JTextField pass = new JTextField(30);
		JCheckBox checkbox = new JCheckBox("Remember Me");
		JButton btn = new JButton("Login");
		jpanel.setLayout(new GridLayout(6,0));
		   jpanel.add(username);
		   jpanel.add(user);
		   jpanel.add(password);
		   jpanel.add(pass);
		   jpanel.add(checkbox);
		   jpanel.add(btn);
		   
		   
	   setVisible(true);
	   setSize(300,300);
	   setTitle("Login Form");
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	  
	}
	

	public static void main(String[] args) {
		new FormInJava();

	}

}
