
package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.*;

class lable extends JFrame
        {
          JTextField tf;
          JLabel lbl;
          JButton btn;
          lable()
            {
            setLayout(null);
            tf=new JTextField(50);
            tf.setBounds(50,100,300,50);
            
            Font f=new Font("arial",Font.BOLD,30);
            
            lbl=new JLabel("Internet Protocol:");
            lbl.setFont(f);
            lbl.setBounds(50, 150,460,90);
            
            btn=new JButton(new ImageIcon("C:\\Users\\hp2\\Documents\\NetBeansProjects\\Swing\\src\\swing\\search.png"));
            btn.setBounds(50, 250, 90, 50);
            
                add(tf);
                add(lbl);
                add(btn);
              
                btn.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e)
                {
               try{
                String str= tf.getText();
                String ip=java.net.InetAddress.getByName(str).getHostAddress();
                lbl.setText("Ip Of: "+str+" is "+ip);
               }
               catch(Exception x){System.out.println(x);}
                }
            });
                setBounds(150, 150,700,700);
                setVisible(true);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            }
          
        }
public class JLableActionListener
{
    public static void main(String[] args) 
    {
        lable l=new lable();
    }
    
}
