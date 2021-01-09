package javaApplication;
import javax.swing.*;
import java.awt.event.*;

public class JavaCalc extends JFrame implements ActionListener{
	
	JavaCalc(){
		JPanel jpanel = new JPanel();
		add(jpanel);
		
		JLabel num1 = new JLabel("Enter First Number");
		JTextField num1txt = new JTextField(30);
		JLabel num2 = new JLabel("Enter First Number");
		JTextField num2txt = new JTextField(30);
		
		JButton add = new JButton("Add");
		JButton subtract = new JButton("Subtract");
		
		JLabel res = new JLabel();

		
		jpanel.add(num1);
		jpanel.add(num1txt);
		jpanel.add(num2);
		jpanel.add(num2txt);
		jpanel.add(add);
		jpanel.add(subtract);
		jpanel.add(res);
		
		
		setVisible(true);
		setTitle("Calculator");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				String ad = num1txt.getText().toString();
				String sub = num2txt.getText().toString();
				
				int a,b,c;
				a = Integer.parseInt(ad);
				b= Integer.parseInt(sub);
				c= a+b;
				res.setText("result "+c);
				
			}
		});
		
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				String ad = num1txt.getText().toString();
				String sub = num2txt.getText().toString();
				
				int a,b,c;
				a = Integer.parseInt(ad);
				b= Integer.parseInt(sub);
				c= a-b;
				res.setText("result "+c);
				
			}
		});
		
	}

	public static void main(String[] args) {
		new JavaCalc();
	}

}
