
package swing;

import javax.swing.*;

public class Jbutton 
{
    public static void main(String[] args) 
    {
        JFrame f=new JFrame();
         f.setLayout(null);
        JButton btn=new JButton("Click");
        btn.setBounds(150,150,120,60);
        f.add(btn);
        
        f.setBounds(150,150,500,500);
        f.setVisible(true);
       
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
