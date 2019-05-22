
package swing;
import javax.swing.*;
import java.awt.*;

class Check extends  JFrame
  {
   JCheckBox c1,c2;
   
   Check()
        {
        Container c= getContentPane();
        setLayout(null);
        
        c1=new JCheckBox("java");
        c1.setBounds(50, 50, 50, 50);
     
        
        
        c2=new JCheckBox("C++");
        c2.setBounds(50, 80, 50, 50);
        
        
            add(c1);
            add(c2);
            setVisible(true);
            setBounds(150, 150, 300, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("CheckBox");
            //c.setBackground(Color.blue);
        }
  }

public class JcheckBox 
{
    public static void main(String[] args) 
    {
       Check c=new Check();
    }
    
}
