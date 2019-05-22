
package swing;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.awt.event.ActionListener;

class jText extends JFrame //implements ActionListener
  {
   JTextArea area;
   JButton btn1;
   JLabel lbl1,lbl2;

 jText() 
 {
     setLayout(null);
     
     area=new JTextArea();
     area.setBounds(50, 120, 300, 300);
     
    final JLabel lbl1=new JLabel("words:");
     lbl1.setBounds(50, 50, 50, 50);
     
     final JLabel lbl2=new JLabel("Character:");
     lbl2.setBounds(200, 50, 150, 50);
     
     JButton btn=new JButton(new ImageIcon("C:\\Users\\hp2\\Desktop\\Icons\\ac.png"));
     btn.setBounds(120, 430, 50, 50);
     btn.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) 
         {
             String str=area.getText();
            String words[]=str.split("\\s");
            lbl1.setText("words:"+words.length);
            lbl2.setText("Characters:"+str.length());
             
              }
           
     });
     
     add(btn);
     add(lbl1);
     add(lbl2);
     add(area);
     
     
     
     setBounds(150, 150, 600, 600);
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
 }
   
  }

public class JtextarewithActionListener 
{
    public static void main(String[] args) 
    {
        jText t=new jText();
    }
    
}
