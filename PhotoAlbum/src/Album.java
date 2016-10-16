import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;


public class Album {
	
	
	public static void main (String [] args) {
		
		Window myWindow = new Window();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JButton[] mas = new JButton[myWindow.getPictures().length];
		panel1.setPreferredSize(new Dimension(700, 600));
		panel2.setPreferredSize(new Dimension(200, 600));
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		myWindow.add(panel1, BorderLayout.WEST);
		myWindow.add(panel2, BorderLayout.EAST);
		
		ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            	    panel1.removeAll();
            	    JLabel pic;
            	    int num = Integer.parseInt(e.getActionCommand());
            		pic = new JLabel(myWindow.loadImage("pic\\"+ myWindow.getPictures()[num]));
            		pic.setHorizontalAlignment(SwingConstants.LEFT);
            		panel1.add(pic);
            		panel1.revalidate();
            		panel1.repaint();
            		
            		}
       };
		
		for(int i=0; i< myWindow.getPictures().length; i++)
		{
			mas[i] = new JButton("Photo"+ i);
			mas[i].setMaximumSize(new Dimension(100, 60));
			mas[i].setActionCommand(Integer.toString(i));
			mas[i].addActionListener(action);
			panel2.add(mas[i]);
		}
		
		myWindow.pack();
		myWindow.setVisible(true);
		
	}
	
	
	
	
}
