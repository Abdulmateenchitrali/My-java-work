package swing;
import javax.swing.*;
import java.awt.*;

class list extends JFrame
	{
	list()
		{
		Container c = getContentPane();
		setLayout(null);
		DefaultListModel<String>l1=new DefaultListModel<>();
		l1.addElement("menu");
		l1.addElement("Lunch");
		l1.addElement("Dinner");
		l1.addElement("BreakFast");
		l1.addElement("Party");
		JList<String>li=new JList<>(l1);
		li.setBounds(50,50,100,100);
		add(li);
		
		
		
		
		
		
		
		setBounds(150, 150, 400, 400);
		setTitle("JList");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		c.setBackground(Color.BLUE);

		}
	
	}
public class List2
{
public static void main(String[] args)
		{
	list l=new list();
	
	
	
	
	
		}
}
