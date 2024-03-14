import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
public class test { 
    public static void main(String[] args) {
        //JPanel = gui component that functions as a cointainer to hold other components
        ImageIcon image = new ImageIcon("pochi.jpg");
        JLabel label = new JLabel();
        label.setText("HELLO?");
        label.setIcon(image);
        // label.setVerticalAlignment(JLabel.TOP);
        // label.setHorizontalAlignment(JLabel.RIGHT); //necessary if using BorderLayout
        label.setBounds(100, 100, 75, 120);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        //greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);


        JFrame frame = new JFrame(); //create a new frame
        frame.setTitle("JFrame title goes here"); //set the title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set the exit option
        frame.setLayout(null); //set layout manager to null (free form)
        frame.setResizable(false); //prevent the window from resizing
        frame.setSize(720, 720); //set x, y, width and height
        frame.setVisible(true); //show the frame
        greenPanel.add(label);
        frame.add(redPanel); // add first before pack()
        frame.add(bluePanel); // add second before pack()
        frame.add(greenPanel); // add third before pack()
        
    }
}   