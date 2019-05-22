/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtable;

import javax.swing.*;
import java.awt.*;
//import javax.swing.border.TitledBorder;
class tab extends  JFrame
        {
          JTable tb;
          JScrollPane sp;
          tab()
          {
              Container c=getContentPane();
              setLayout(new FlowLayout());
              
              Font f=new Font("arial",Font.BOLD,20);
              
             String col[]={"Roll_No","Name","Address","Boolean"};
              Object[][] data={{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE},{"120","Mateen","Chitral",Boolean.TRUE}};
            
             
              JLabel lbl2=new JLabel("Student address table");
              lbl2.setBounds(90,40,150,40);
              lbl2.setFont(f);
              
              tb=new JTable(data,col);
                ///Table charecteristics/////
              
             
              tb.setFont(f);
             // tb.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.RED));
             // tb.setBorder(BorderFactory.createDashedBorder(Color.RED));
             //tb.setBorder(BorderFactory.createMatteBorder(1,5,1,1,icon));
            // tb.setBorder(BorderFactory.createTitledBorder("title",TitledBorder.BELOW_BOTTOM));
              tb.setFillsViewportHeight(true);
             
              
              sp=new JScrollPane(tb);   //Container for table
              
               tb.setBounds(30,120,200,300);
              tb.setBackground(Color.pink);
              c.setBackground(Color.GRAY);
              add(lbl2);
              add(sp);
              setVisible(true);
              setBounds(150,150,300,400);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              
              
              
          }
        }
public class Table {
    public static void main(String[] args) 
    {
        tab t=new tab();
    }
}
