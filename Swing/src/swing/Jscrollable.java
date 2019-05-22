package swing;
import javax.swing.*;
import java.awt.*;

class scroll extends JFrame
	{
	scroll(){
	Container c = getContentPane();
	JScrollBar s=new JScrollBar(); 
	s.setBounds(0,0,50,400);
	
	add(s);
	
	setLayout(null);
	setBounds(150, 150, 400, 400);
	setTitle("JScrollBar");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	c.setBackground(Color.BLUE);
	  }
	
	}
public class Jscrollable
{
public static void main(String[] args) 
	{
	scroll sc=new scroll();
	}

}


