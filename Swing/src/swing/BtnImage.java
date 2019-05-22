
package swing;
import java.awt.FlowLayout;
import javax.swing.*;

public class BtnImage 
{
    JFrame frame;
    JButton btn,btn2,btn3,btn4;
BtnImage()
        {
        frame =new JFrame();
       
        
        btn=new JButton("Explorar",new ImageIcon("C:\\Users\\hp2\\Documents\\NetBeansProjects\\Swing\\src\\swing\\mj.png"));
        btn.setBounds(0, 0, 100, 80);
        btn2=new JButton("Twitter",new ImageIcon("C:\\Users\\hp2\\Documents\\NetBeansProjects\\Swing\\src\\swing\\tw.png"));
        btn2.setBounds(30, 0, 100, 80);
        btn3=new JButton("Facebook",new ImageIcon("C:\\Users\\hp2\\Documents\\NetBeansProjects\\Swing\\src\\swing\\fb.png"));
        btn3.setBounds(60, 0, 70, 80);
        btn4=new JButton("Watsapp",new ImageIcon("C:\\Users\\hp2\\Documents\\NetBeansProjects\\Swing\\src\\swing\\watsap.png"));
        btn4.setBounds(90, 0, 100, 80);
        
        frame.add(btn);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.setVisible(true);
         frame.setLayout(new FlowLayout(0, 120, 50));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(150, 150, 400, 500);
        frame.setTitle("myGui");
        }
   
    
    public static void main(String[] args) 
    {
        BtnImage i=new BtnImage();
    }
    
}
