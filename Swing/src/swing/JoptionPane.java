package swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.*;
public class JoptionPane extends JFrame
{
	JoptionPane(){	
Container c =getContentPane();
	
	JOptionPane.showMessageDialog("JoptionPane","Hii Abdul Mateen","Alert", JOptionPane.WARNING_MESSAGE);
	
	
	
	setLayout(null);
	setBounds(150, 150, 400, 400);
	setTitle("JOptionPane");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	}

public static void main(String[] args) 
  {
	JoptionPane f=new JoptionPane();
	
   }
}
