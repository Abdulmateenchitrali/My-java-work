
package swing;

import javax.swing.*;
import java.awt.*;

public class Japassword 
{
    public static void main(String[] args)
    {
         JFrame frame=new JFrame("Frame with JPassword");
         frame.setLayout(null);
         
         JPasswordField fiel=new JPasswordField();
         fiel.setBounds(150, 150, 150,30);
         JLabel l=new JLabel("password");
         l.setBounds(80, 150, 150,30);
         
         frame.add(l);
         frame.add(fiel);
         
         frame.setVisible(true);
         frame.setBounds(100, 100, 500, 500);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }
    
}
