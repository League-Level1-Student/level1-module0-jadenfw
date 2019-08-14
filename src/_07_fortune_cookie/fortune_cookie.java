package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune_cookie implements ActionListener {

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
			 int r = new Random().nextInt(5);
			 if(r == 1)
			 {
				 JOptionPane.showMessageDialog(null, "You will breath again");
			 }
			 else if(r == 2)
			 {
				 JOptionPane.showMessageDialog(null, "you wil see a animal sometime in the next year");
			 }
			 else if(r == 3)
			 {
				 JOptionPane.showMessageDialog(null, "you will drink water sometime in the next three days");
			 }
			 else if(r == 4)
			 {
				 JOptionPane.showMessageDialog(null, "if you check vending machines you will get a quarter sometime in the next month");
			 }
			 else
			 {
				 JOptionPane.showMessageDialog(null, "you will die someday");
			 }
		}
}
