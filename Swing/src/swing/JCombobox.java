
package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class box extends JFrame implements ActionListener
    {
    final JComboBox cb;
    JLabel lbl;
   JButton btn; 

    public box() throws HeadlessException 
    {
        Container c=getContentPane();
        setLayout(null);
        setVisible(true);
        String[] Subject={"Java","C++","Python","Andriod"};
        cb=new JComboBox(Subject);
        cb.setBounds(50, 200, 90, 20);
        lbl=new JLabel();
        lbl.setBounds(50, 50, 300, 40);
        btn=new JButton("Show"); 
        btn.setBounds(250, 200, 90, 40);
        add(cb);
        add(btn);
        add(lbl);
        
       btn.addActionListener(this);
        
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
    String str="Programming language selected is:"+cb.getItemAt(cb.getSelectedIndex());
    lbl.setText(str);
}

    
    }

public class JCombobox 
{
    public static void main(String[] args) 
    {
    box g=new box();
        
        
    }
    
}
