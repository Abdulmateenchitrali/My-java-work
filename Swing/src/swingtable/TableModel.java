package swingtable;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

import java.awt.*;

class model
	{
	public static class abstractModel extends  AbstractTableModel
		{
		String[] col= {"Std_name","Roll_no","Address"};
		Object[][] data= {{"Mateen",184215,"Chitral"},{"Mateen",184215,"Chitral"},{"Mateen",184215,"Chitral"},{"Mateen",184215,"Chitral"}};
		
		public int getRowCount() 
			{
			return data.length;
			}
		
		public int getColCount() 
		{
		return data[0].length;
		}
		public Object geValueAt(int row,int column) 
		{
			return data[row][column];
		}
		public String getColName(int column) 
		{
			return col[column];
		}
	//	@SuppressWarnings("rawtypes")
		
		@SuppressWarnings("unchecked")
		public Class getColumnClass(int column) 
		{
			return data[0][column].getClass();
		}
		}
	
	}

public class TableModel
{
public static void main(String[] args)
{
	
    JFrame frame=new JFrame();
    
    TableModel table=new TableModel();
	JTable tble=new abstractModel(table);
	
    tble.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    
    
    
    frame.getContentPane().add(new JScrollPane(tble));
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setSize(500, 200);
    frame.setVisible(true);
}
}
