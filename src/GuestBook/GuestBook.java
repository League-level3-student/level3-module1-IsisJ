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

public class GuestBook implements ActionListener {

	private JPanel panel = new JPanel();
	private JFrame frame = new JFrame();
	private JButton addButton = new JButton();
	private JButton vipButton = new JButton();
	private JButton seeAll = new JButton();
	private JTextField nameTextField = new JTextField(10);
	private JLabel nameLabel = new JLabel();
	private ArrayList<Guest> guestList = new ArrayList<>();

	public void createUI() {
		frame.add(panel);
		panel.add(nameLabel);
		panel.add(nameTextField);
		panel.add(addButton);
		addButton.addActionListener(this);
		panel.add(vipButton);
		vipButton.addActionListener(this);
		panel.add(seeAll);
		seeAll.addActionListener(this);
		addButton.setText("Add");
		vipButton.setText("VIP Add");
		seeAll.setText("See All");
		nameLabel.setText("Name:");
		frame.setVisible(true);
		frame.setSize(300,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private String styleGuestListPrinting(ArrayList<Guest> guestList) {
		String listOfGuests = "";
		for (int i = 0; i < guestList.size(); i++) {
			Guest guest = guestList.get(i);
			guest.getListing();
			listOfGuests = listOfGuests + "\n " + guest.getListing();

		}
		return listOfGuests;

	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed == seeAll) {
			JOptionPane.showMessageDialog(null, styleGuestListPrinting(guestList));
		} else if (buttonPressed == addButton) {
			guestList.add(new RegularGuest(nameTextField.getText()));
			nameTextField.setText(null);
		} else if (buttonPressed == vipButton) {
			guestList.add(new VIPGuest(nameTextField.getText()));
			nameTextField.setText(null);
		}

	}

	public static void main(String[] args) {
		GuestBook guestBook = new GuestBook();
		guestBook.createUI();
	}

}
