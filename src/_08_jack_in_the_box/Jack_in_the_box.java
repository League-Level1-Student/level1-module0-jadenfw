package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Jack_in_the_box implements ActionListener {

public static void main(String[] args) {
	


}

			 public void showButton() {
				 System.out.println("Button Clicked");
				 JFrame jf = new JFrame();
				 jf.setVisible(true);
				 JButton jb = new JButton();
				 jf.add(jb);
				 jf.pack();
				 jb.addActionListener(this);
			
			 
	}

@Override
public void actionPerformed(ActionEvent e) {
			
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Woohoo!");
	
}			
}