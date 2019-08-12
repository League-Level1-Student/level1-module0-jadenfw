package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {
		int score = 0;
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String pic = "https://www.guidedogs.org/wp-content/uploads/2018/01/Mobile.jpg";
		// 2. create a variable of type "Component" that will hold your image
		
		// 3. use the "createImage()" method below to initialize your Component
		Component pik = createImage(pic);
		// 4. add the image to the quiz window
		quizWindow.add(pik);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("What is the animal on the picture?");
		// 7. print "CORRECT" if the user gave the right answer
		if(question.equals("dog"))
		{
			JOptionPane.showMessageDialog(null, "CORRECT");
			score++;
		}
		// 8. print "INCORRECT" if the answer is wrong
		else
		{
			JOptionPane.showMessageDialog(null, "INCOPRRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(pik);
		// 10. find another image and create it (might take more than one line
		// of code)
		String pic2 = "https://theprettybee.com/wp-content/uploads/2013/09/vegan-spelt-waffles.jpg";
		Component pik2 = createImage(pic2);
		// 11. add the second image to the quiz window
		quizWindow.add(pik2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String ans = JOptionPane.showInputDialog("What food is on this picture?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(ans.equals("waffles"))
		{
			JOptionPane.showMessageDialog(null, "CORRECT");
			score++;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		JOptionPane.showMessageDialog(null, "You got " + score + " out of 2");
	}

	private void pack() {
		// TODO Auto-generated method stub
		
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
	
	/* OPTIONAL */
	// *14. add scoring to your quiz
	
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
