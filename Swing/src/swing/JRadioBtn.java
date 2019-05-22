
package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class radio extends JFrame implements ActionListener
            {
                JRadioButton btn1, btn2;
                JLabel l;
                radio()
                {
                    Container c=getContentPane();
                    setLayout(null);
                   
                    
                    btn1=new JRadioButton(" Male");
                    btn1.setBounds(150,150,300,50);
                    btn2=new JRadioButton(" female");
                    btn2.setBounds(150, 200, 300, 50);
                    l=new JLabel("Gender:");
                    l.setBounds(150, 250, 300, 40);
                    
                    ButtonGroup b=new ButtonGroup();
                    b.add(btn1);
                    b.add(btn2);
                           
                    
                     
                    add(btn1);
                    add(btn2);
                    add(l);
                    
                    btn1.addActionListener(this);
                    btn2.addActionListener(this);
                    
                    
                    setVisible(true);
                    setBounds(150,150,500,500);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                }
                  public void actionPerformed(ActionEvent e)
                  {
                      if(btn1.isSelected())
                      {
                      l.setText("You were male");
                      }
                      else if(btn2.isSelected())
                      {
                      l.setText("You were female");
                      }

}

                
            }
public class JRadioBtn 
{
    public static void main(String[] args) 
    {
        radio r=new radio();
        
    }
    
}
