package swingtable;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

class table extends JFrame
	{
      JLabel l;
      JTable tab;
      table()
      	{
    	  Container c=getContentPane();
    	  setLayout(new FlowLayout());
    	  String col[]= {"St_Name","St_Address,St_Roll","St_Contact"};
    	  Object data[][]= {{"Ali","Peshawer",201,0345},{"Ali","Peshawer",201,0345},{"Ali","Peshawer",201,0345},{"Ali","Peshawer",201,0345},{"Ali","Peshawer",201,0345},{"Ali","Peshawer",201,0345},{"Ali","Peshawer",201,0345},{"Ali","Peshawer",201,0345},{"Ali","Peshawer",201,0345},{"Ali","Peshawer",201,0345}};
    	  tab=new JTable(data,col);
    	  tab.setCellSelectionEnabled(true); 
    	  //to select the row,column,or entire row and column 
    	  //setColumnSelectionAllowed(); 
    	  //setRowSelectionAllowed();.
    	  
    	  ListSelectionModel list=tab.getSelectionModel();
    	  list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    	  list.addListSelectionListener(new ListSelectionListener() 
    	  {
			
			@Override
			public void valueChanged(ListSelectionEvent arg0)
			{
			String data=null;
			int[] row=tab.getSelectedRows();
			int[] col=tab.getSelectedColumns();
			for(int i=0;i<row.length;i++) 
			{
				for(int j=0;j<col.length;j++) 
				{
					data=(String)tab.getValueAt(row[i], col[j]);
				    	
				}
				
			}
			System.out.println("Table element selected: "+data);
				
			}
			
		});
    	  JScrollPane sp=new JScrollPane(tab);
    	  
    	  
    	  
    	  
    	  
    	  add(sp);
    	  c.setBackground(Color.gray);
    	  setVisible(true);
    	  setBounds(150,150,500,500);
    	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  setResizable(true);
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      	}
	}

public class JtableActionListener 
{
	
public static void main(String[] args) 
{
	table t=new table();
}
}
