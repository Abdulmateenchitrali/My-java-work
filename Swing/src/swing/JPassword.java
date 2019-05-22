
package swing;
import javax.swing.*;

public class JPassword 
{
    public static void main(String[] args)
    {
    
    JFrame frame=new JFrame("Frame with JPassword:");
    frame.setLayout(null);
    
    JPasswordField field=new  JPasswordField();
    field.setBounds(150, 158, 120, 50);
    JLabel lbl=new JLabel("Passord: ");
    lbl.setBounds(90, 158, 250, 30);
                   
    frame.add(lbl);
    frame.add(field);
    
    frame.setVisible(true);
    frame.setBounds(150, 150, 600, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
}
