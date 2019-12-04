package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		String input =JOptionPane.showInputDialog(null, "What would happen to a WHITE stone if you threw it in the Dead Sea?");
		if (input.equals("It would get wet.")) {
			JOptionPane.showMessageDialog(null, "Congradulations! You got it right!");
			
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Nope! The answer is that it would get wet! And perhaps salty!");
		}
	

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

