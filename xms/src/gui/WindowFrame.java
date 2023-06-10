package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import xms.ClientManager;

public class WindowFrame extends JFrame {
	ClientManager clientManager;
	MenuSelection menuselection;
	ClientAdder clientAdder;
	ClientViewer clientview;


	public WindowFrame(ClientManager clientManager) {
		this.clientManager = clientManager;
		menuselection = new MenuSelection(this);
		clientAdder = new ClientAdder(this);
		clientview = new ClientViewer(this, this.clientManager);


		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setupPanel(menuselection);

		this.setVisible(true);
	}

	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public ClientAdder getClientAdder() {
		return clientAdder;
	}

	public void setClientAdder(ClientAdder clientAdder) {
		this.clientAdder = clientAdder;
	}

	public ClientViewer getClientview() {
		return clientview;
	}

	public void setClientview(ClientViewer clientview) {
		this.clientview = clientview;
	}


	public void setupPanel(JPanel panel){
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

}
