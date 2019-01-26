package GuestBook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook implements ActionListener{

	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton add = new JButton();
	JButton vip = new JButton();
	JButton seeAll = new JButton();
	JTextField nameTextField = new JTextField(10);
	JLabel nameLabel = new JLabel();
	ArrayList<Guest> guestList = new ArrayList<>();
	
	public void createUI() {
		frame.add(panel);
		panel.add(nameLabel);
		panel.add(nameTextField);
		panel.add(add);
		panel.add(vip);
		panel.add(seeAll);
		add.setText("Add");
		vip.setText("VIP Add");
		seeAll.setText("See All");
		nameLabel.setText("Name:");
		frame.setVisible(true);
		frame.setSize(500, 500);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed==seeAll) {
			JOptionPane.showMessageDialog(null, guestList);
		}
		else if(buttonPressed==add) {
			guestList.add(new RegularGuest(nameTextField.getText()));
		}
		else if(buttonPressed==vip){
			guestList.add(new VIPGuest(nameTextField.getText()));
		}
		
	}
	
	public static void main(String[] args) {
		GuestBook guestBook = new GuestBook();
		guestBook.createUI();
	}




}
