
package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class checkBox extends JFrame 
{
    JCheckBox cb1,cb2;
    JLabel l;

    public checkBox()
    {
     Container c=getContentPane();
        setLayout(null);
         l=new JLabel();
         l.setBounds(150,50,160,50);
         
        cb1=new JCheckBox("c++");
        cb1.setBounds(100,100,50,190);
        
        cb2=new JCheckBox("Java");
        cb2.setBounds(160,100,150,190); 
        
        
        add(l);
        add(cb1);
        add(cb2);
        
       cb1.addItemListener(new ItemListener() 
       {

         @Override
         public void itemStateChanged(ItemEvent e) 
         {
         l.setText("Java CheckBox:"+(e.getStateChange()==1?"checked":"UnChecked"));
         }
     });
       cb2.addItemListener(new ItemListener() {

         @Override
         public void itemStateChanged(ItemEvent e) 
         {
           l.setText("C++ CheckBox:  "+(e.getStateChange()==1?"checked":"UnChecked")); 
         }
     }
       );
        
        setVisible(true);
        setBounds(150, 150, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
public class CheckBoxItemlistener 
{
    public static void main(String[] args) 
    {
        checkBox c=new checkBox();
    }
    
}
