package swingtable;
import javax.swing.*;

public class Std_details 
{
	
public static void main(String[] args) 
{
	String[] headings =
	          new String[] {"Roll_No", "Pass?", "Origin",
	                        "Destination", "D_O_B", "Weight" };
	        Object[][] data = new Object[][] {
	          { "100420", Boolean.FALSE, "mateen", "Peshawer",
	              "02/06/2000", new Float(450) },
	          { "202174", Boolean.TRUE, "mateen", "Chitral",
	              "05/20/2000", new Float(1250) },
	          { "450877", Boolean.TRUE, "mateen", "Karachi",
	              "03/20/2000", new Float(1745) },
	          { "101891", Boolean.FALSE, "mateen", "Rawal pin",
	              "04/04/2000", new Float(88) }
	        };

	        // create the data model and the JTable
	        JTable table = new JTable(data, headings);

	        JFrame frame = new JFrame("Student Detail");
	        frame.add(new JScrollPane(table));

	        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	        frame.setSize(500, 200);
	        frame.setVisible(true);
}
}
