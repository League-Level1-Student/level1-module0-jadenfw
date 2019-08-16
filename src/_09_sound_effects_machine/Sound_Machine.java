package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sound_Machine implements ActionListener{
	
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

	
	public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed.equals(jb1))
		{
			System.out.println(1);
		}
		if(buttonPressed.equals(jb2))
		{
			System.out.println(2);
		}
		if(buttonPressed.equals(jb3))
		{
			System.out.println(3);
		}

	
	}
}
