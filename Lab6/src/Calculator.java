import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator {
	static String s0 = "";
	static String s1 = "";
	static String s2 = "";
	

    public static void createAndShowGUI() {
    	JTextField resultTextField = new JTextField("0", 24);
    	
    	
    	ActionListener myActionListener = new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			String s = e.getActionCommand();
    			System.out.println("Button = "+s);
    			if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
    	            // if operand is present then add to second no
    	            if (!s1.equals(""))
    	                s2 = s2 + s;
    	            else
    	                s0 = s0 + s;
    	 
    	            // set the value of text
    	            resultTextField.setText(s0 + s1 + s2);
    	        }
    	        else if (s.charAt(0) == 'C') {
    	            // clear the one letter
    	            s0 = s1 = s2 = "";
    	 
    	            // set the value of text
    	            resultTextField.setText(s0 + s1 + s2);
    	        }
    	        else if (s.charAt(0) == '=') {
    	 
    	            double te;
    	 
    	            // store the value in 1st
    	            if (s1.equals("+"))
    	                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
    	            else if (s1.equals("-"))
    	                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
    	            else if (s1.equals("/"))
    	                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
    	            else
    	                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
    	 
    	            // set the value of text
    	            resultTextField.setText(s0 + s1 + s2 + "=" + te);
    	 
    	            // convert it to string
    	            s0 = Double.toString(te);
    	 
    	            s1 = s2 = "";
    	        }
    	        else {
    	            // if there was no operand
    	            if (s1.equals("") || s2.equals(""))
    	                s1 = s;
    	            // else evaluate
    	            else {
    	                double te;
    	 
    	                // store the value in 1st
    	                if (s1.equals("+"))
    	                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
    	                else if (s1.equals("-"))
    	                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
    	                else if (s1.equals("/"))
    	                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
    	                else
    	                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
    	 
    	                // convert it to string
    	                s0 = Double.toString(te);
    	 
    	                // place the operator
    	                s1 = s;
    	 
    	                // make the operand blank
    	                s2 = "";
    	            }
    	 
    	            // set the value of text
    	            resultTextField.setText(s0 + s1 + s2);
    	        }
    			//resultTextField.setText(e.getActionCommand());
    		}    		
    	};
    	
    	
    	
        JFrame jf = new JFrame("My First Calculator - v.0.1");
        jf.setLayout(new BoxLayout(jf.getContentPane(), BoxLayout.Y_AXIS));
        jf.setPreferredSize(new Dimension(450, 230));
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel resultJp = new JPanel();
        jf.getContentPane().add(resultJp, BorderLayout.CENTER);

        
        resultTextField.setEditable(false);
        resultTextField.setHorizontalAlignment(JTextField.RIGHT);
        resultTextField.setFont(new Font("Arial", Font.BOLD, 20));
        resultTextField.setBackground(Color.white);
        resultJp.add(resultTextField,BorderLayout.NORTH);

        JPanel buttonsJp = new JPanel(new GridLayout(4,4,10,10));
        jf.getContentPane().add(buttonsJp);

        
        JButton b1 = new JButton("1");
        b1.addActionListener(myActionListener);
        JButton b2 = new JButton("2");
        b2.addActionListener(myActionListener);
        JButton b3 = new JButton("3");
        b3.addActionListener(myActionListener);
        JButton bA = new JButton("+");
        bA.addActionListener(myActionListener);
        JButton b4 = new JButton("4");
        b4.addActionListener(myActionListener);
        JButton b5 = new JButton("5");
        b5.addActionListener(myActionListener);
        JButton b6 = new JButton("6");
        b6.addActionListener(myActionListener);
        JButton bS = new JButton("-");
        bS.addActionListener(myActionListener);
        JButton b7 = new JButton("7");
        b7.addActionListener(myActionListener);
        JButton b8 = new JButton("8");
        b8.addActionListener(myActionListener);
        JButton b9 = new JButton("9");
        b9.addActionListener(myActionListener);
        JButton bM = new JButton("*");
        bM.addActionListener(myActionListener);
        JButton b0 = new JButton("0");
        b0.addActionListener(myActionListener);
        JButton bE = new JButton("=");
        bE.addActionListener(myActionListener);
        JButton bC = new JButton("C");
        bC.addActionListener(myActionListener);
        JButton bD = new JButton("/");
        bD.addActionListener(myActionListener);
        
        
        buttonsJp.add(b1);
        buttonsJp.add(b2);
        buttonsJp.add(b3);
        buttonsJp.add(bA);
        buttonsJp.add(b4);
        buttonsJp.add(b5);
        buttonsJp.add(b6);
        buttonsJp.add(bS);
        buttonsJp.add(b7);
        buttonsJp.add(b8);
        buttonsJp.add(b9);
        buttonsJp.add(bM);
        buttonsJp.add(b0);
        buttonsJp.add(bE);
        buttonsJp.add(bC);
        buttonsJp.add(bD);

        jf.pack();
        jf.setVisible(true);
    }



    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { createAndShowGUI(); }
        });

    }
}