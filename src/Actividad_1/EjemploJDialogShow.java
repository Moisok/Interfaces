package Actividad_1;

import javax.swing.*;
import javax.swing.JOptionPane;

public class EjemploJDialogShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String user = JOptionPane.showInputDialog(null, "user");
		String password = JOptionPane.showInputDialog(null, "password");
			
	if (user.equals("admin") && password.contentEquals("12342")) {
			JOptionPane.showMessageDialog(null, "login ok");
				
	}else { 
		JOptionPane.showMessageDialog(null, "Login failed!");
	}

	}
}
