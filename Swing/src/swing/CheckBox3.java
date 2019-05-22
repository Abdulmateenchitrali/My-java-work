
package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mateen extends JFrame implements ActionListener
{
JLabel l,l2;
JCheckBox b1,b2,b3;
JButton btn;
mateen()
        {
        Container c=getContentPane();
            setLayout(null);
            Font f=new Font("areal",Font.BOLD,30);
            l=new JLabel("Online Food ordered");
            l.setFont(f);
            l.setBounds(100,40,350,30);
            
            b1=new JCheckBox("  Pepsi Rs: 40");
            b1.setFont(f);
            b1.setBounds(100,90,350,40);
            b2=new JCheckBox("  String Rs: 60");
            b2.setFont(f);
            b2.setBounds(100,150,350,40);
            b3=new JCheckBox("  Dew Rs: 30");
            b3.setFont(f);
            b3.setBounds(100,220,350,40);
            
            btn=new JButton("Order");
            btn.setBounds(100,290,90,40);
            l2=new JLabel("Total:");
            l2.setBounds(100,350,130,40);
            
            add(l);
            add(b1);
            add(b2);
            add(b3);
            add(btn);
            add(l2);
            
            btn.addActionListener(this);
             c.setBackground(Color.yellow);
             setVisible(true);
             setBounds(100,100,600,600);
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        }
public void actionPerformed(ActionEvent e)
{
   float amount=0;
   if(b1.isSelected())
    {
    amount+=40;
    }
    if(b2.isSelected())
    {
    amount+=60;
    }
    if(b3.isSelected())
    {
    amount+=30;
    }
   l2.setText("Total: "+amount);
   
}
        
    
    
}

public class CheckBox3 
{
    public static void main(String[] args)
    {
        mateen m=new mateen();
    }
    
}
