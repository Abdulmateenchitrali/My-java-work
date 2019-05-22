


package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class text extends JFrame implements ActionListener
        {
          JTextField f1,f2,f3;
          JButton btn1,btn2;
          text()
            {
                setBounds(150, 150,800,800);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(null);
                 setVisible(true);
                 
                f1=new JTextField();
                f1.setBounds(50,100,300,50);
                f2=new JTextField();
                f2.setBounds(50,200,300,50);
                f3=new JTextField();
                f3.setBounds(50,300,300,50);
                
                 btn1=new JButton("Add");
                 btn1.setBounds(50,400,100,50);
                 
                 btn2=new JButton("Cancel");
                 btn2.setBounds(200,400,100,50);
                
                 
                add(f1);
                add(f2);
                add(f3);
                add(btn1);
                add(btn2);
                
               btn1.addActionListener(this);
               btn2.addActionListener(this);
               
                        
                        
            }
           public void actionPerformed(ActionEvent e)
           {
             String p=f1.getText();
             String p2=f2.getText();
             int num1=Integer.parseInt(p);
             int num2=Integer.parseInt(p2);
             int c=0;
             if(e.getSource()==btn1)
                {
                c=num1+num2;
                }
             else
             {
             c=num1-num2;
             }
             String result=String.valueOf(c);
             f3.setText(result);
}
        }

public class TextfieldActionlistener
{
    public static void main(String[] args) 
    {
      text t=new text();  
    }
    
}
