package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

class jscroll extends JFrame
	{
jscroll()
		{
	Container c = getContentPane();
	
	setLayout(null);
	JLabel lbl=new JLabel();
	lbl.setHorizontalAlignment(JLabel.CENTER);
	lbl.setBounds(50,50,400,100);
	final JScrollBar s=new JScrollBar();  
    s.setBounds(100,100, 50,100);  
    
    
    add(s);
    add(lbl);  
	s.addAdjustmentListener(new AdjustmentListener() {
		
		@Override
		public void adjustmentValueChanged(AdjustmentEvent arg0) 
		{
		lbl.setText("vertical scrollbar is: "+s.getValue());	
			
		}
	});
	
	
	
	setBounds(150, 150, 400, 400);
	setTitle("JList");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	c.setBackground(Color.BLUE);

		}

	
	}
public class Scrolling
{
public static void main(String[] args)
{
	jscroll sc=new jscroll();
}
}
