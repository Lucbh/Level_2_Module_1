package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener, Comparable{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JButton a;
	JButton b;
	JFrame c;
	JPanel d;
	
	ArrayList<String> y = new ArrayList<String>();
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	public static void main(String[] args) {
		
		GuestBook bob = new GuestBook();
		
		bob.createUI();
		
	}
	
	public void createUI() {
		
		a = new JButton("Add name");
		
	
		b = new JButton("View name");
		c = new JFrame();
		d = new JPanel();
		
		d.add(a);
		d.add(b);
		c.add(d);
		
		c.pack();
		c.setVisible(true);
		
		a.addActionListener(this);
		
		b.addActionListener(this);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if(e.getSource().equals(a)) {
			
			String bill = JOptionPane.showInputDialog("Type a name");
			y.add(bill);
			System.out.println(bill);
		}
		
		if(e.getSource().equals(b)) {
			
			System.out.println("viewNamesClicked");
			String listName = "";
			for (int jill = 0; jill < y.size();jill++) {
				listName += y.get(jill) + "\n";
				
			}
				JOptionPane.showMessageDialog(null, listName);
		}
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
