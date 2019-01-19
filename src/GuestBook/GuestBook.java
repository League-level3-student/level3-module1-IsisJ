package GuestBook;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook {

	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton add = new JButton();
	JButton vip = new JButton();
	JButton seeAll = new JButton();
	JTextField nameTextField = new JTextField(10);
	
	public void createUI() {
		frame.add(panel);
		panel.add(nameTextField);
		panel.add(add);
		panel.add(vip);
		panel.add(seeAll);
		add.setText("Add");
		vip.setText("VIP Add");
		seeAll.setText("See All");
		frame.setVisible(true);
		frame.setSize(500, 500);
	}
	
	public static void main(String[] args) {
		GuestBook guestBook = new GuestBook();
		guestBook.createUI();
	}
}
