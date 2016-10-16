import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Window extends JFrame {
	
	private String[] names;
	
	
	Window() {
			super("װמעמאכüבמל");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(900, 900);
			}
	
	public Icon loadImage(String src) {
		Icon img = new ImageIcon(src);
	    return img;
	}
	
	public String[] getPictures()
	{
		File f = new File("pic");
		names = f.list();
		return names;
	}
	
}