package edabalaban;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		
		Pencere pencere = new Pencere();
		
		
		pencere.setSize(300,300);	
		pencere.setTitle("Yilan Oyunu");
		pencere.setLocationRelativeTo(null);
		pencere.setResizable(false);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}
}
