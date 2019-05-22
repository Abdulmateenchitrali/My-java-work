package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class subList extends JFrame
	{
	JLabel l;
	JButton btn;
	JList<String> lis1, lis2;

	public subList() 
	{
	Container c = getContentPane();
	setLayout(null);
	l=new JLabel();
	l.setBounds(50,20,300,20);
	
	btn=new JButton("Select");
	btn.setBounds(50,190,70,30);
	
    DefaultListModel< String > listModel=new DefaultListModel<>();
    listModel.addElement("Course");
    listModel.addElement("C++");
    listModel.addElement("Java");
    listModel.addElement("Python");
    
    DefaultListModel< String > listModel2=new DefaultListModel<>();
    listModel2.addElement("Room1");
    listModel2.addElement("Room2");
    listModel2.addElement("Room3");
    listModel2.addElement("Room4");
    
    JList<String> list=new JList<>(listModel);
    list.setBounds(50,80,100,100);
	
    JList<String> list2=new JList<>(listModel2);
    list2.setBounds(50,250,100,100);
	
	
	
	
	
	
	add(l);
	add(list);
	add(btn);
	add(list2);
	
	btn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			String data="";
			if(list.getSelectedIndex()!=-1) 
			{
				 data+="You selected "+list.getSelectedValue();
				 
					l.setText(data);
			}
			if(list2.getSelectedIndex()!=-1)
			{
				data+="  And selected class: ";
				
				data+=frame+"";
				l.setText(data);
			}
		
		}
	});
	
	
	
	setBounds(150, 150, 400, 400);
	setTitle("Subjec_JList");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	c.setBackground(Color.PINK);

		
		
		
	}
	}
public class JlistActionlistener2
{
	
public static void main(String[] args) 
{
	subList l=new subList();
}
}
