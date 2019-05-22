
package swing;

import javax.swing.*;
import java.awt.*;

public class JTextfield 
{
    public static void main(String[] args) 
    {
      JFrame frame=new JFrame("Text area");
      frame.setBounds(150, 150, 800, 800);
      frame.setVisible(true);
      frame.setLayout(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JTextField f=new JTextField("whrite code here");
      f.setBounds(100,100, 250,30);
      
      JTextField f2=new JTextField("whrite code here");
      f2.setBounds(100,200, 250,30);
      
      frame.add(f);
      frame.add(f2);
      
      
      
      
    }
    
}
