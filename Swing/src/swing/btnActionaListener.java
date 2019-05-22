
package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class btnActionaListener 
{
    public static void main(String[] args) 
    {
       JFrame frame=new JFrame("My1stGUI");
       frame.setLayout(null);
       frame.setBounds(150,150,400,500);
       
      final JTextField field=new JTextField();
       field.setBounds(100, 100,150, 30);
       
       JButton btn=new JButton("Click at me");
       btn.setBounds(150, 150,120, 50);
       btn.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) 
           {
           field.setText("Congrajulation mr badal");
           }
       });
       frame.add(field);
       frame.add(btn);
       frame.setVisible(true);
       
       
       
    }
    
}
