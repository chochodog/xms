package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ClientAdder extends JPanel {
	WindowFrame frame;
	
	public ClientAdder(WindowFrame frame) {
		this.frame = frame;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		// 위 두줄 대신에 JPanel panel = new JPanel(new SpringLayout()); 으로 대체해도 가능함

		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);

		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);

		JLabel labelAccount = new JLabel("Account: ", JLabel.TRAILING);
		JTextField fieldAccount = new JTextField(10);
		labelAccount.setLabelFor(fieldAccount);
		panel.add(labelAccount);
		panel.add(fieldAccount);



		JButton buttonSave = new JButton("Save");
		JButton buttonCancel = new JButton("Cancel");
		panel.add(buttonSave);
		panel.add(buttonCancel);

		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);

		this.add(panel);

		this.setVisible(true);

	}
}
