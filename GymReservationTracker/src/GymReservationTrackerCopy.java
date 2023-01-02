import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.DefaultConfiguration;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Flow;

public class GymReservationTrackerCopy {

    private static final Logger log = LogManager.getLogger(GymReservationTrackerCopy.class);

    private final static int defaultWidth = 990;
    private final static int defaultHeight = 650;



    private static void createAndShowGUI() {

        Configurator.initialize(new DefaultConfiguration());
        Configurator.setRootLevel(Level.TRACE);

        JFrame mainAppWindow = new JFrame("Gym Reservation Tracker");

        final JPanel appBar = new JPanel();


        final JButton jbuttonNext = new JButton();
        final JButton jbuttonPrevious = new JButton();

        final ImageIcon iiPrevious = new ImageIcon("src/ICON/information.png");
        final ImageIcon iiNext = new ImageIcon("src/ICON/stats.png");

        final JLabel title = new JLabel("Stokrotka Gym Reservation");
        title.setFont(new Font("Arial Black", Font.BOLD, 35));
        title.setForeground(new Color(0,0,0));
        Map<TextAttribute, Object> attributes = new HashMap<TextAttribute, Object>();
        attributes.put(TextAttribute.TRACKING, 0.04);
        title.setFont(title.getFont().deriveFont(attributes));


        final JPanel mainScreen = new JPanel() {
            final ImageIcon backgroundImage = new ImageIcon("src/ICON/gym.jpg");
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                int w = getWidth(), h = getHeight();
                g2d.drawImage(backgroundImage.getImage(), 0, 0, this);
                g2d.setComposite(AlphaComposite.SrcOver.derive(0.5f));
                g2d.setColor(new Color(70,194,218,180));
                g2d.fillRect(0, 0, w, h);
                g2d.dispose();
            }
        };



        ActionListener myActionListener = new ActionListener() {

            public void actionPerformed(ActionEvent e) {

            }
        };

        MouseListener myMouseListener = new MouseListener() {

            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
                log.trace("[MouseListener]: Pressed on an object. (NEXT CARD)");
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

        };

        jbuttonNext.setIcon(iiNext);
        jbuttonNext.setBorderPainted(false);
        jbuttonNext.setContentAreaFilled(false);
        jbuttonNext.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 0));
        jbuttonNext.setFocusPainted(false);
        jbuttonNext.setMargin(new Insets(0, 0, 0, 0));
        jbuttonNext.addActionListener(myActionListener);

        jbuttonPrevious.setIcon(iiPrevious);
        jbuttonPrevious.setBorderPainted(false);
        jbuttonPrevious.setContentAreaFilled(false);
        jbuttonPrevious.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 100));
        jbuttonPrevious.setFocusPainted(false);
        jbuttonPrevious.setMargin(new Insets(0, 0, 0, 0));
        jbuttonPrevious.addActionListener(myActionListener);


        // JPanel - sterujący
        appBar.setBackground(new Color(34,96,137));

        appBar.add(jbuttonPrevious);
        appBar.add(title);
        appBar.add(jbuttonNext);

        // JPanel - składniki głównego okienko
        mainScreen.setPreferredSize(new Dimension(defaultWidth, defaultHeight));
        //mainScreen.setIcon(backgroundImage);
        mainScreen.setOpaque(false);
        mainScreen.setBackground(new Color(255,194,218,200));
        mainScreen.addMouseListener(myMouseListener);




        mainAppWindow.add(mainScreen, BorderLayout.CENTER);
        mainAppWindow.add(appBar, BorderLayout.NORTH);


        mainAppWindow.pack();
        mainAppWindow.setLocationRelativeTo(null);
        mainAppWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainAppWindow.setVisible(true);
    }


    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}