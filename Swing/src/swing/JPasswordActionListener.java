
package swing;
import java.awt.*;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class pass extends JFrame implements ActionListener
        {
  JLabel lbl;
  JLabel lbl2,lbl3,lbl4;
  JTextField txt;
  JButton btn;
  JButton btn2;
JPasswordField passw;

    public pass() 
    {
        Container c=getContentPane();
        setLayout(null);
        //lable for name and password////
       lbl=new JLabel("Name: ");
       lbl2=new JLabel("Password");
       lbl3=new JLabel(new ImageIcon("C:\\Users\\hp2\\Desktop\\Icons\\fb.png"));
       lbl4=new JLabel("password match: ");
       /// login logout button//////////
          btn=new JButton("Login");
         btn2=new JButton("Logout");
        //textfield for name/////
         txt=new JTextField();
        //password///////////////////
        
        passw=new JPasswordField();
        ///Set component orientation/////
        
        
        lbl.setBounds(50,50, 120, 30);
        lbl2.setBounds(50,100, 120, 30);
        lbl3.setBounds(0,250, 100, 90);
        lbl4.setBounds(50, 190, 130, 30);
        
        btn.setBounds(130, 150, 90, 30);
        btn2.setBounds(230, 150, 90, 30);
        txt.setBounds(130, 50, 200, 30);
        passw.setBounds(130, 100, 200, 30);
        passw.setBounds(130, 100, 200, 30);
        
        add(lbl4);
        add(lbl3);
        add(lbl);
        add(txt);
        add(lbl2);
        add(passw);
        add(btn);
        add(btn2);
        
        btn.addActionListener(this);
        btn2.addActionListener(this);
        
        c.setBackground(Color.cyan);
        setTitle("Login Form by Ma3");
        setVisible(true);
        setBounds(150,150,400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  @Override
  public void actionPerformed(ActionEvent e)
  {
      String str=txt.getText();
      String pass=new String(passw.getPassword());
      
      if("1234".equals(pass))
      {
          lbl4.setText("yes you can login.");
      }
      
     if(btn2==e.getSource())
      {
      System.exit(0);     
      }
   }


    

    
         }

public class JPasswordActionListener 
{
    public static void main(String[] args) {
        pass p=new pass();
                
    }
}
