package utilidades;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MiniCalculadora extends JFrame {
	
	private JPanel panel1;
	private JTextField txtNumA;
	private JTextField txtNumB;
	private JButton btnSuma;
	private JButton btnResta;
	private JButton btnMult;
	private JButton btnDiv;
	private JLabel lblRes;
	
	public  MiniCalculadora(){
		        
        initComponents();
        
	}
    	
    private void initComponents() {   
    	
    	setTitle("Calculadora Bàsica");
        setResizable(false);
        setBounds(300, 300, 300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
        JPanel panel1 = new JPanel();    	
    	panel1.setLayout(null);
    	setContentPane(panel1);
    	panel1.setVisible(true);
    	
    	
    	// Creem tantes fonts com tipus vullguem utilitzar
    	
    	Font lletra1 = new Font("Verdana", Font.BOLD, 16);
    	Font lletra2 = new Font("Times new roman", Font.ITALIC, 12);
    	Font lletra3 = new Font("Arial", Font.BOLD, 18);

    	
	    JTextField txtNumA = new JTextField();
	    txtNumA.setBounds(30,60,100,30);
	    
	    // Alineació de les FONTS dins de l'etiqueta
	    
	    txtNumA.setHorizontalAlignment(JTextField.CENTER);
	    txtNumA.setFont(lletra3);
	    panel1.add(txtNumA);
	    
	    
	    JTextField txtNumB = new JTextField();
	    txtNumB.setBounds(160,60,100,30);
	    txtNumB.setHorizontalAlignment(JTextField.CENTER);
	    txtNumB.setFont(lletra3);
	    panel1.add(txtNumB);	    
	    
	    
	    JButton btnSuma = new JButton();
	    btnSuma.setBounds(30, 115, 50, 30);
	    btnSuma.setText("+");
	    panel1.add(btnSuma);
	    
	    
	    JButton btnResta = new JButton();
	    btnResta.setBounds(90, 115, 50, 30);
	    btnResta.setText("-");
	    panel1.add(btnResta);
	    
	    
	    JButton btnMult = new JButton();
	    btnMult.setBounds(150, 115, 50, 30);
	    btnMult.setText("x");
	    panel1.add(btnMult);
	    
	    JButton btnDiv = new JButton();
	    btnDiv.setBounds(210, 115, 50, 30);
	    btnDiv.setText("/");
	    panel1.add(btnDiv);
	    
	    	  
	    JLabel lblRes = new JLabel();
	    lblRes.setText("Resultat...");
	    lblRes.setHorizontalAlignment(JLabel.CENTER);
	    lblRes.setBounds(30, 160, 230, 40);	
	   
	    
	    lblRes.setForeground(Color.red);
	    lblRes.setFont(lletra1);
	    
	    // ETIQUETA amb vora de color i tamany
	    
	    lblRes.setBorder(BorderFactory.createLineBorder(Color.blue,2));	    
	    panel1.add(lblRes);
	    
	    
	    JLabel lblTitol = new JLabel();
	    lblTitol.setText("Calculadora Bàsica...");
	    lblTitol.setHorizontalAlignment(JLabel.CENTER);
	    lblTitol.setBounds(30, 20, 230, 20);	
	   
	    
	    lblTitol.setForeground(Color.blue);
	    lblTitol.setFont(lletra2);
	    lblTitol.setBorder(BorderFactory.createLineBorder(Color.red,2));	    
	    panel1.add(lblTitol);
		
	    
	    
	    btnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent espereEvent) {
            	String strA = txtNumA.getText();
 	            String strB = txtNumB.getText();
 	            double numA = Double.parseDouble(strA);
 	            double numB = Double.parseDouble(strB);
 	            double res = numA + numB;
 	            lblRes.setText("" + res);
            }
        });
	    
	    
	    btnResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent espereEvent) {
            	 
            	 String strA = txtNumA.getText();
 	            String strB = txtNumB.getText();
 	            double numA = Double.parseDouble(strA);
 	            double numB = Double.parseDouble(strB);
 	            double res = numA - numB;
 	            lblRes.setText("" + res);
            }
        });
	    
	    
	    btnMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent espereEvent) {
            	 String strA = txtNumA.getText();
 	            String strB = txtNumB.getText();
 	            double numA = Double.parseDouble(strA);
 	            double numB = Double.parseDouble(strB);
 	            double res = numA * numB;
 	            lblRes.setText("" + res);
            }
        });
	    
	    
	    btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent espereEvent) {
            	 String strA = txtNumA.getText();
 	            String strB = txtNumB.getText();
 	            double numA = Double.parseDouble(strA);
 	            double numB = Double.parseDouble(strB);
 	            double res = numA / numB;
 	            lblRes.setText("" + res);
            }
        });
	    
	    
    }   // de iniComponent 
	    
	
	
	public static void main(String[] args) {

		 SwingUtilities.invokeLater(new Runnable() {
		 @Override
		 public void run() {
		 new MiniCalculadora();
		 }
	});
	}
	
} // de la Classe
