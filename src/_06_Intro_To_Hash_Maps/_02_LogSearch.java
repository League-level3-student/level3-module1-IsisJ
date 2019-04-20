package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _02_LogSearch implements ActionListener {
	

	private JPanel panel = new JPanel();
	private JPanel listingPanel = new JPanel();
	private JFrame listingFrame = new JFrame();
	private JFrame frame = new JFrame();
	private JButton addButton = new JButton();
	private JButton searchButton = new JButton();
	private JButton listAll = new JButton();
	private HashMap<String, String> students = new HashMap<>();

	private void createUI() {
		frame.add(panel);
		panel.add(addButton);
		addButton.addActionListener(this);
		panel.add(searchButton);
		searchButton.addActionListener(this);
		panel.add(listAll);
		listAll.addActionListener(this);
		addButton.setText("Add");
		searchButton.setText("Search");
		listAll.setText("Student Listing");
		frame.setVisible(true);
		frame.setSize(300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		_02_LogSearch principle = new _02_LogSearch();
		principle.createUI();
	}	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == addButton) {
			String studentID = JOptionPane.showInputDialog("Enter an ID number");
			String studentName = JOptionPane.showInputDialog("Enter the student's name");
			students.put(studentID, studentName);
		}
		else if(buttonPressed == searchButton) {
			String searchedID = JOptionPane.showInputDialog("Enter an ID number");
			if(!students.containsKey(searchedID)) {
				JOptionPane.showMessageDialog(null,"There is no student under this ID number: "+searchedID);
			}else {
				JOptionPane.showMessageDialog(null, students.get(searchedID));
			}	
		}
		else if (buttonPressed == listAll){
			listingFrame.setSize(300, 100);
			listingFrame.add(listingPanel);
			for(String i : students.keySet()) {
				JLabel iLabel = new JLabel("\nID: "+i+" Name: "+ students.get(i));
				listingPanel.add(iLabel);
				//JOptionPane.showMessageDialog(null, "ID: "+i+" Name: "+ students.get(i));
			}
			listingFrame.setVisible(true);
		}
	}
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */


	
}
