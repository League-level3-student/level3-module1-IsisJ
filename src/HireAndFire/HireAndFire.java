package HireAndFire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HireAndFire implements ActionListener {

	private JPanel panel = new JPanel();
	private JButton hireButton = new JButton();
	private JButton fireButton = new JButton();
	private JFrame frame = new JFrame();
	private JTextField hireTextField = new JTextField(10);
	private JTextField fireTextField = new JTextField(10);
	private Stack<String> employees = new Stack<String>();
	
	private void createUI() {
	
		frame.add(panel);
		panel.add(hireTextField);
		panel.add(hireButton);
		panel.add(fireTextField);
		panel.add(fireButton);
		
		hireButton.addActionListener(this);
		hireButton.setText("HIRE");
		fireButton.addActionListener(this);
		fireButton.setText("FIRE");
		frame.setVisible(true);
		frame.setSize(300,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton)e.getSource();
		if(buttonPressed == hireButton) {
			
			String theHiree = hireTextField.getText();
			employees.push(theHiree);
			hireTextField.setText(null);
		}
		else if(buttonPressed == fireButton){
			
			String theFireList = "";
			int howManyToFire = Integer.parseInt(fireTextField.getText());
			if(howManyToFire > employees.size()) {
				JOptionPane.showMessageDialog(frame, "You only have "+employees.size()+" employees.");
			}
			else {
				for(int i = 0; i<howManyToFire; i++) {
					theFireList = theFireList +"\n"+employees.pop();
				}
				JOptionPane.showMessageDialog(frame, theFireList);
			}
			fireTextField.setText(null);
		}
		
	}
	
	public static void main(String[] args) {
	
		HireAndFire manager = new HireAndFire();
		manager.createUI();
	}

	
}
