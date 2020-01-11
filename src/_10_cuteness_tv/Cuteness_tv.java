package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_tv implements ActionListener {

	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	JButton jb3 = new JButton();
	
	public void showButton()
	{
		jf.add(jp);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jf.setVisible(true);
		jf.pack();
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	public void actionPerformed(ActionEvent e) 
	{
		JButton buttonPressed = (JButton) e.getSource();
	
		if(buttonPressed.equals(jb1))
		{
			showDucks();
			System.out.print("1");
		}
		
		if(buttonPressed.equals(jb2))
		{
			showFrog();
			System.out.print("2");
		}
		
		if(buttonPressed.equals(jb3))
		{
			showFluffyUnicorns();
			System.out.print("3");
		}

	
	
	
	}
}
