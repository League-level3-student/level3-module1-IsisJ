package _06_Intro_To_Hash_Maps;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class _02_LogSearch implements ActionListener {
	

	private JPanel panel = new JPanel();
	private JPanel listingPanel = new JPanel();
	private JFrame listingFrame = new JFrame();
	private JFrame frame = new JFrame();
	private JButton addButton = new JButton();
	private JButton searchButton = new JButton();
	private JButton listAllButton = new JButton();
	private JButton returnButton = new JButton("Return");
	private JTextArea textArea = new JTextArea();
	private HashMap<String, String> students = new HashMap<>();

	private void createUI() {
		frame.add(panel);
		panel.add(addButton);
		panel.setBackground(Color.pink);
		addButton.addActionListener(this);
		panel.add(searchButton);
		searchButton.addActionListener(this);
		panel.add(listAllButton);
		listAllButton.addActionListener(this);
		addButton.setText("Add");
		searchButton.setText("Search");
		returnButton.addActionListener(this);
		listAllButton.setText("Student Listing");
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
				JOptionPane.showMessageDialog(null, students.get(searchedID)+ " is the student with ID number: "+searchedID);
			}	
		}
		else if (buttonPressed == listAllButton){
			listingPanel.add(returnButton);
			listingPanel.setBackground(Color.pink);
			listingFrame.add(listingPanel);
			for(String i : students.keySet()) {
				textArea.setText(textArea.getText() + "\nID: "+i+" Name: "+ students.get(i));
			}
			textArea.setBackground(Color.pink);
			textArea.setEditable(false);
			listingPanel.add(textArea);
			listingFrame.setVisible(true);
			listingFrame.pack();
		}
		else if(buttonPressed == returnButton) {
			listingFrame.setVisible(false);
			textArea.setText(null);
		}
	}
	
	
	public static void main(String[] args) {
		_02_LogSearch principle = new _02_LogSearch();
		principle.createUI();
	}	

}
