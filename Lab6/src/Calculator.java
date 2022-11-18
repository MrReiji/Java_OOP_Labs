import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Calculator {

    public static void createAndShowGUI() {
        JFrame jf = new JFrame("My First Calculator - v.0.1");
        jf.setLayout(new BoxLayout(jf.getContentPane(), BoxLayout.Y_AXIS));
        jf.setPreferredSize(new Dimension(450, 230));
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel resultJp = new JPanel();
        jf.getContentPane().add(resultJp, BorderLayout.CENTER);

        JTextField resultTextField = new JTextField("0", 16);
        resultTextField.setEditable(false);
        resultTextField.setHorizontalAlignment(JTextField.RIGHT);
        resultTextField.setFont(new Font("Arial", Font.BOLD, 20));
        resultTextField.setBackground(Color.white);
        resultJp.add(resultTextField,BorderLayout.NORTH);

        JPanel buttonsJp = new JPanel(new GridLayout(4,4,10,10));
        jf.getContentPane().add(buttonsJp);

        buttonsJp.add(new JButton("1"));
        buttonsJp.add(new JButton("2"));
        buttonsJp.add(new JButton("3"));
        buttonsJp.add(new JButton("+"));
        buttonsJp.add(new JButton("4"));
        buttonsJp.add(new JButton("5"));
        buttonsJp.add(new JButton("6"));
        buttonsJp.add(new JButton("-"));
        buttonsJp.add(new JButton("7"));
        buttonsJp.add(new JButton("8"));
        buttonsJp.add(new JButton("9"));
        buttonsJp.add(new JButton("*"));
        buttonsJp.add(new JButton("0"));
        buttonsJp.add(new JButton("="));
        buttonsJp.add(new JButton("C"));
        buttonsJp.add(new JButton("/"));






        jf.pack();
        jf.setVisible(true);
    }



    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { createAndShowGUI(); }
        });

    }
}
