
package swing;
import javax.swing.*;
class hello
        {
             JFrame frame;
             JButton btn;
             hello()
             {
             frame=new JFrame();
             frame.setLayout(null);
             frame.setBounds(150,150,400,500);
             btn=new JButton("ok");
             btn.setBounds(150,150,120,60);
             frame.add(btn);
             frame.setVisible(true);
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

             }
        }
public class Jbutton2 
{
    
    public static void main(String[] args) 
    {
       hello h=new hello();
    }
    
}
