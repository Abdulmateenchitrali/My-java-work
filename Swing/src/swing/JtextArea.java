
package swing;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class JtextArea
{
    public static void main(String[] args)
    {
    JFrame f=new JFrame();
    f.setLayout(null);
    JTextArea tx=new JTextArea("helloooo how are you!!!!");
    
    tx.setBounds(50, 30, 300, 300);
    
    tx.setBackground(Color.blue);
   
    JTextArea tx2=new JTextArea("helloooo how are you!!!!");
    
    tx2.setBounds(400, 30, 300, 300);
    
    tx2.setBackground(Color.white);
    
    f.add(tx);
    f.add(tx2);
    
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setBounds(150,150,700,700);
    
    }
    
}
