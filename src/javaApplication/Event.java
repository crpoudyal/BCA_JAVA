package javaApplication;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;

public class Event extends JFrame implements ActionListener{
	
	Event(){
		JPanel jpanel = new JPanel();
		add(jpanel);
		
		JLabel username =  new JLabel("Username");
		JTextField user = new JTextField(30);
		JLabel password = new JLabel("Password");
		JTextField pass = new JTextField(30);
		JCheckBox checkbox = new JCheckBox("Remember Me");
		JButton btn = new JButton("Login");
		
		JLabel result = new JLabel("Result");
		JLabel res = new JLabel();
		jpanel.setLayout(new GridLayout(6,0));
		   jpanel.add(username);
		   jpanel.add(user);
		   jpanel.add(password);
		   jpanel.add(pass);
		   jpanel.add(checkbox);
		   jpanel.add(btn);
		   jpanel.add(result);
		   jpanel.add(res);
		   
		   
	   setVisible(true);
	   setSize(300,300);
	   setTitle("Login Form");
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	   
	   
		
	   btn.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent ae) {
			   String users = user.getText().toString();
			   String passs = pass.getText().toString();
			   res.setText(users+passs);
			   
			   
	   }
			   
	     });
    }
	
	

	public static void main(String[] args) {
		new Event();

	}

}
