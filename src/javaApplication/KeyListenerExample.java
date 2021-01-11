package javaApplication;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyListenerExample extends JFrame implements KeyListener {
	JPanel jpanel = new JPanel();
    Label l;
	KeyListenerExample(){
		 l = new Label();
		 Label lbl= new Label("Key Events");
		TextArea area = new TextArea();
		area.addKeyListener(this);
		
		add(jpanel);
		jpanel.add(l);
		jpanel.add(area);
		jpanel.add(lbl);
		
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		setTitle("Key Events");
		
		
	}
	public void KeyPressed(KeyEvent e) {
		l.setText("key Pressed");
	}
	public void KeyReleased(KeyEvent e) {
		l.setText("key Released");
	}
	public void KeyTyped(KeyEvent e) {
		l.setText("key Typed");
	}
	public static void main(String[] args) {
		new KeyListenerExample();

	}

}
