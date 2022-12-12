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

	static String s0 = "0";
	static String s1 = "";
	static String s2 = "";
    static String lastButton = "";

    static boolean lastResult = false;

    public static void equalFunction(JTextField resultTextField, boolean nextElem){
        int te = 0;

        // store the value in 1st
        if (s1.equals("+"))
            te = (Integer.parseInt(s0) + Integer.parseInt(s2));
        else if (s1.equals("-"))
            te = (Integer.parseInt(s0) - Integer.parseInt(s2));
        else if (s1.equals("/"))
            te = (Integer.parseInt(s0) / Integer.parseInt(s2));
        else if (s1.equals("*"))
            te = (Integer.parseInt(s0) * Integer.parseInt(s2));

        if (nextElem)
            s2 = "";

        s0 = Integer.toString(te);
        resultTextField.setText(s0);
        lastResult = true;

    }

	

    public static void createAndShowGUI() {

    	JTextField resultTextField = new JTextField("0", 24);
    	
    	ActionListener myActionListener = new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			String s = e.getActionCommand();
    			System.out.println("Button = "+s);
    			if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
                    resultTextField.setForeground(new Color(0, 0, 0));
    	            // if operand is present then add to second no

                    if (lastResult || lastButton.equals("=")) {
                        s0 = "";
                        lastResult = false;
                        s0 = s0 + s;
                        resultTextField.setText(s0);
                        s1 = s2 = "";
                    }
    	            else if (!s1.equals("")) {
                        s2 = s2 + s;
                        resultTextField.setText(s2);
                    }
    	            else {
                        if (s0.equals("0"))
                            s0 = "";
                        s0 = s0 + s;
                        resultTextField.setText(s0);
                    }
                }
    	        else if (s.charAt(0) == 'C') {
    	            // clear the one letter
                    s0 = "0";
    	            s1 = s2 = "";
                    lastResult = false;
    	 
    	            // set the value of text
    	            resultTextField.setText(s0 + s1 + s2);
    	        }
    	        else if (s.charAt(0) == '=') {
                    if (s1.equals("/") && s2.equals("0")) {
                        resultTextField.setForeground(new Color(255, 0, 0));
                        resultTextField.setText("ERROR: Division by zero");
                        s0 = s1 = s2 = "";
                    }
                    else if (!s1.equals(""))  {
                        if (s2.equals(""))
                            s2 = s0;
                        equalFunction(resultTextField, false);
                    }
    	        }
    	        else if (s.charAt(0) != '=')  {
                    //If there was operand

                    if (lastResult){
                        s1 = "";
                        s2 = "";
                        lastResult = false;
                    }

                    if (!s2.equals("")) {
                        equalFunction(resultTextField, true);
                    }

                    if (!s1.equals("")){
                        s2 = "";
                        lastResult = false;
                    }
                    if (!s0.equals(""))
                        s1 = s;
                }
                lastButton = s;
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