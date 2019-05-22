
package swing;

import java.awt.Font;
import javax.swing.*;

public class Jlable 
{
    public static void main(String[] args) 
    {
      JFrame frame=new JFrame("JLabel");
      frame.setLayout(null);
       Font f=new Font("arial",Font.BOLD,20);
       
      JLabel lbl1=new JLabel("Name");
      lbl1.setBounds(120, 120, 130, 60);
      lbl1.setFont(f);
      JLabel lbl2=new JLabel("Name");
      lbl2.setBounds(120, 200, 130, 60);
      lbl2.setFont(f);
      
      
      
      
              
      frame.add(lbl1);
      frame.add(lbl2);
      
      frame.setVisible(true);
      frame.setBounds(150,150,400,500);
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
      
      
    }
    
}
